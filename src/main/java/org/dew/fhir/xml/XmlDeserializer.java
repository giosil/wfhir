package org.dew.fhir.xml;

import java.io.ByteArrayInputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public
class XmlDeserializer implements ContentHandler
{
  protected String currentValue;
  protected Stack<String> stackElements;
  
  protected Map<String, Object> root;
  protected Map<String, Object> curr;
  protected String path;
  protected List<String> divs;
  protected Set<String> closed;
  
  public XmlDeserializer()
  {
  }
  
  public 
  Map<String, Object> getRoot()
  {
    return root;
  }
  
  public
  void load(byte[] content)
    throws Exception
  {
    root   = null;
    curr   = null;
    path   = null;
    divs   = new ArrayList<String>();
    closed = null;
    
    if(content == null || content.length < 7) return;
    
    String xml = new String(content);
    List<IndexRange> listOfIndexRange = getDivSectionsIndexRanges(xml);
    for(int i = 0; i < listOfIndexRange.size() ; i++) {
      IndexRange indexRange = listOfIndexRange.get(i);
      if(indexRange.start < 0 || indexRange.end < 0) continue;
      divs.add(xml.substring(indexRange.start, indexRange.end + 1));
    }
    
    InputSource inputSource = new InputSource(new ByteArrayInputStream(content));
    XMLReader xmlReader = XMLReaderFactory.createXMLReader();
    xmlReader.setContentHandler(this);
    xmlReader.parse(inputSource);
  }
  
  public
  void load(String xml)
    throws Exception
  {
    root   = null;
    curr   = null;
    path   = null;
    divs   = new ArrayList<String>();
    closed = null;
    
    if(xml == null || xml.length() < 7) return;
    
    List<IndexRange> listOfIndexRange = getDivSectionsIndexRanges(xml);
    for(int i = 0; i < listOfIndexRange.size() ; i++) {
      IndexRange indexRange = listOfIndexRange.get(i);
      if(indexRange.start < 0 || indexRange.end < 0) continue;
      divs.add(xml.substring(indexRange.start, indexRange.end + 1));
    }
    
    InputSource inputSource = new InputSource(new ByteArrayInputStream(xml.getBytes()));
    XMLReader xmlReader = XMLReaderFactory.createXMLReader();
    xmlReader.setContentHandler(this);
    xmlReader.parse(inputSource);
  }
  
  public
  void startDocument()
    throws SAXException
  {
    stackElements = new Stack<String>();
    
    root   = new HashMap<String, Object>();
    curr   = root;
    closed = new HashSet<String>();
  }
  
  public
  void endDocument()
    throws SAXException
  {
  }
  
  @SuppressWarnings("unchecked")
  public
  void startElement(String uri, String localName, String qName, Attributes attributes)
    throws SAXException
  {
    currentValue = "";
    
    stackElements.push(localName);
    int stackSize = stackElements.size();
    path = "";
    for(int i = 0; i < stackSize; i++) {
      path += "|" + stackElements.get(i);
    }
    path = path.substring(1);
    
    if(stackSize == 1) {
      root.put("resourceType", localName);
      curr = root;
      return;
    }
    if(stackSize == 2) {
      curr = root;
    }
    
    String value = null;
    for(int i = 0; i < attributes.getLength(); i++) {
      String attrLocalName = attributes.getLocalName(i);
      if(attrLocalName.equals("value")) {
        value = attributes.getValue(i);
      }
    }
    
    if(path.contains("|div|")) {
      return;
    }
    if(localName.equals("div")) {
      String divContent = "";
      if(divs != null && divs.size() > 0) {
        divContent = divs.remove(0);
      }
      curr.put(localName, divContent);
      return;
    }
    
    if(value != null) {
      Object prev = curr.get(localName);
      if(prev instanceof List) {
        List<Object> list = (List<Object>) prev;
        list.add(value);
      }
      else if(closed.contains(path)) {
        List<Object> list = new ArrayList<>();
        list.add(prev);
        list.add(value);
        curr.put(localName, list);
      }
      else {
        curr.put(localName, value);
      }
    }
    else {
      Map<String, Object> map = null;
      Object prev = curr.get(localName);
      if(prev instanceof Map) {
        map = (Map<String, Object>) prev;
      }
      else if(prev instanceof List) {
        List<Object> list = (List<Object>) prev;
        Object last = list.size() > 0 ? list.get(list.size() - 1) : null;
        if(last instanceof Map) {
          map = (Map<String, Object>) last;
        }
        else {
          map = new HashMap<String, Object>();
          list.add(map);
        }
      }
      else {
        map = new HashMap<String, Object>();
        curr.put(localName, map);
      }
      curr = map;
    }
  }
  
  public
  void endElement(String uri, String localName, String qName)
    throws SAXException
  {
    closed.add(path);
    
    if(!stackElements.isEmpty()) stackElements.pop();
    path = "";
    for(int i = 0; i < stackElements.size(); i++) {
      path += "|" + stackElements.get(i);
    }
    path = path.length() > 0 ? path.substring(1) : "";
  }
  
  public
  void characters(char[] ch, int start, int length)
    throws SAXException
  {
    currentValue += new String(ch, start, length);
  }
  
  public void setDocumentLocator(Locator locator) {}
  public void startPrefixMapping(String prefix, String uri) throws SAXException {}
  public void endPrefixMapping(String prefix) throws SAXException {}
  public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {}
  public void processingInstruction(String target, String data) throws SAXException {}
  public void skippedEntity(String name) throws SAXException {}
  
  protected
  List<IndexRange> getDivSectionsIndexRanges(String xml)
  {
    List<IndexRange> listResult = new ArrayList<IndexRange>();
    
    if(xml == null || xml.length() == 0) return listResult;
    int length = xml.length();
    
    boolean isTag     = false;
    boolean isComment = false;
    int     startTag  = -1;
    IndexRange range  = null;
    StringBuilder sbTag = new StringBuilder();
    for(int i = 0; i < length; i++) {
      char c = xml.charAt(i);
      
      if(isComment) {
        if(c == '>' && xml.substring(i-2, i).equals("--")) {
          isComment = false;
        }
        continue;
      }
      else if(c == '-') {
        if(i > 2 && xml.substring(i-3, i).equals("<!-")) {
          isComment = true;
        }
      }
      
      if(c == '<') {
        isTag = true;
        sbTag.setLength(0);
        startTag = i;
      }
      else if(c == '>') {
        isTag = false;
        
        String  tagName  = sbTag.toString().toLowerCase().trim();
        boolean closeTag = tagName.startsWith("/");
        if(closeTag) {
          tagName = tagName.substring(1);
        }
        int sepAttribs = tagName.indexOf(' ');
        if(sepAttribs > 0) {
          tagName = tagName.substring(0, sepAttribs);
        }
        int sepNamespace = tagName.indexOf(':');
        if(sepNamespace >= 0) {
          tagName = tagName.substring(sepNamespace + 1);
        }
        
        if(tagName.equals("div")) {
          if(closeTag) {
            if(range != null) {
              range.end = (startTag - 1);
              listResult.add(range);
            }
          }
          else {
            range = new IndexRange(i + 1);
          }
        }
      }
      else if(isTag) {
        sbTag.append(c);
      }
    }
    
    return listResult;
  }
  
  static class IndexRange
  {
    public int start = -1;
    public int end   = -1;
    
    public IndexRange()
    {
    }
    
    public IndexRange(int start)
    {
      this.start = start;
    }
    
    public IndexRange(int start, int end)
    {
      this.start = start;
      this.end   = end;
    }
    
    @Override
    public boolean equals(Object object) {
      if (object instanceof IndexRange) {
        return toString().equals(object.toString());
      }
      return false;
    }
    
    @Override
    public int hashCode() {
      return toString().hashCode();
    }
    
    @Override
    public String toString() {
      return "IndexRange(" + start + "," + end + ")";
    }
  }
}

