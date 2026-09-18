package org.dew.fhir.xml;

import java.io.ByteArrayInputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public
class XmlDeserializer implements ContentHandler
{
  protected String currentValue;
  protected Stack<String> stackElements;
  
  protected Map<String, Object> root;
  protected Map<String, Object> curr;
  protected String path;
  protected List<String> divs;
  
  protected List<String> listObjectId = new ArrayList<String>();
  protected Map<String, Map<String, Object>> objects = new HashMap<String, Map<String,Object>>();
  
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
    
    if(content == null || content.length < 7) return;
    
    String xml = new String(content);
    List<IndexRange> listOfIndexRange = getDivSectionsIndexRanges(xml);
    for(int i = 0; i < listOfIndexRange.size(); i++) {
      IndexRange indexRange = listOfIndexRange.get(i);
      if(indexRange.start < 0 || indexRange.end < 0) continue;
      divs.add(xml.substring(indexRange.start, indexRange.end + 1));
    }
    
    InputSource inputSource = new InputSource(new ByteArrayInputStream(content));
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    XMLReader xmlReader = factory.newSAXParser().getXMLReader();
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
    divs   = new ArrayList<String> ();
    
    if(xml == null || xml.length() < 7) return;
    
    List<IndexRange> listOfIndexRange = getDivSectionsIndexRanges(xml);
    for(int i = 0; i < listOfIndexRange.size(); i++) {
      IndexRange indexRange = listOfIndexRange.get(i);
      if(indexRange.start < 0 || indexRange.end < 0) continue;
      divs.add(xml.substring(indexRange.start, indexRange.end + 1));
    }
    
    InputSource inputSource = new InputSource(new ByteArrayInputStream(xml.getBytes()));
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    XMLReader xmlReader = factory.newSAXParser().getXMLReader();
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
    String url   = null;
    for(int i = 0; i < attributes.getLength(); i++) {
      String attrLocalName = attributes.getLocalName(i);
      if(attrLocalName.equals("value")) {
        value = attributes.getValue(i);
      }
      else if(attrLocalName.equals("url")) {
        url = attributes.getValue(i);
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
      else {
        curr.put(localName, value);
      }
    }
    else {
      Map<String, Object> map = null;
      Object prev = curr.get(localName);
      if(prev instanceof Map) {
        map = createObject(localName, stackSize, url);
        
        List<Object> list = new ArrayList<Object>();
        list.add(normalize((Map<String, Object>) prev));
        list.add(map);
        
        curr.put(localName, list);
      }
      else if(prev instanceof List) {
        List<Object> list = (List<Object>) prev;
        map = createObject(localName, stackSize, url);
        list.add(map);
      }
      else {
        map = createObject(localName, stackSize, url);
        curr.put(localName, map);
      }
      curr = map;
    }
  }
  
  protected
  Map<String, Object> createObject(String localName, int stackSize, String url)
  {
    Map<String, Object> map = new HashMap<String, Object>();
    if(url != null && url.length() > 0) {
      map.put("url", url);
    }
    objects.put(localName + "#" + stackSize, map);
    listObjectId.add(localName + "#" + stackSize);
    return map;
  }
  
  public
  void endElement(String uri, String localName, String qName)
    throws SAXException
  {
    String objectId = localName + "#" + stackElements.size();
    
    Map<String, Object> mapObject = objects.get(objectId);
    if(mapObject != null) normalize(mapObject);
    
    int indexOf = listObjectId.indexOf(objectId);
    if(indexOf > 0) {
      String prevObjectId = listObjectId.get(indexOf - 1);
      curr = objects.get(prevObjectId);
      if(curr == null) curr = root;
    }
    
    listObjectId.remove(objectId);
    
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
    List<IndexRange> listResult = new ArrayList<IndexRange> ();
    
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
  
  protected static
  Map<String, Object> normalize(Map<String, Object> map)
  {
    if(map == null || map.isEmpty()) return map;
    
    // Le mappe che hanno una sola chiave la quale inizia con una lettera maiuscola individuano una risorsa.
    // La mappa contenuta dalla chiave sale di livello e si aggiunge l'attributo resourceType.
    String singleKey = singleKey(map);
    if(singleKey != null && singleKey.length() > 0) {
      char c0 = singleKey.charAt(0);
      if(c0 >= 65 && c0 <= 90) {
        Map<String, Object> value = mapObject(map, singleKey);
        if(value != null) {
          map.clear();
          map.putAll(value);
          map.put("resourceType", singleKey);
        }
      }
    }
    
    boolean isBundle = isBundle(map);
    
    // CodeableConcept[] code
    // {code={coding={... -> {code=[{coding=[...
    replaceListOfList(map, "code", "coding");
    
    // DomainResource
    replaceList(map, "contained");
    replaceList(map, "extension");
    replaceList(map, "modifierExtension");
    
    // Patient / Organization / Practitioner
    if(!isBundle) {
      replaceList(map, "identifier");
    }
    replaceList(map, "telecom");
    replaceList(map, "address");
    replaceList(map, "qualification");
    
    // Bundle
    if(isBundle) {
      replaceList(map, "link");
      replaceList(map, "entry");
    }
    
    // Extension.valueCodeableConcept
    Map<String, Object> valueCodeableConcept = mapObject(map, "valueCodeableConcept");
    if(valueCodeableConcept != null && !valueCodeableConcept.isEmpty()) {
      replaceList(valueCodeableConcept, "coding");
    }
    
    // Consent / DocumentReference / HealthcareService
    replaceList(map, "category");
    
    return map;
  }
  
  protected static
  String singleKey(Map<String, Object> map)
  {
    if(map == null) return null;
    
    Set<String> keySet = map.keySet();
    if(keySet == null || keySet.size() != 1) return null;
    
    String result= null;
    Iterator<String> iterator = keySet.iterator();
    if(iterator.hasNext()) {
      result = iterator.next();
    }
    return result;
  }
  
  protected static
  boolean isBundle(Map<String, Object> map)
  {
    if(map == null) return false;
    String resourceType = string(map, "resourceType");
    if(resourceType != null && resourceType.length() > 0) {
      return resourceType.equalsIgnoreCase("Bundle");
    }
    return map.containsKey("entry");
  }
  
  protected static
  String string(Map<String, Object> map, String key)
  {
    if(map == null || key == null) return null;
    Object value = map.get(key);
    if(value == null) return null;
    return value.toString();
  }
  
  @SuppressWarnings("unchecked")
  protected static
  Map<String, Object> mapObject(Map<String, Object> map, String key)
  {
    if(map == null || key == null) return null;
    Object value = map.get(key);
    if(value instanceof Map) {
      return (Map<String, Object>) value;
    }
    return null;
  }
  
  protected static
  void replaceListOfList(Map<String, Object> map, String key1, String key2)
  {
    if(map == null || key1 == null || key2 == null) {
      return;
    }
    Map<String, Object> mapValue1 = mapObject(map, key1);
    if(mapValue1 == null) return;
    
    Map<String, Object> mapValue2 = mapObject(mapValue1, key2);
    if(mapValue2 == null) return;
    
    List<Object> list2 = new ArrayList<Object>();
    list2.add(mapValue2);
    mapValue1.put(key2, list2);
    
    List<Object> list1 = new ArrayList<Object>();
    list1.add(mapValue1);
    map.put(key1, list1);
  }
  
  protected static
  void replaceList(Map<String, Object> map, String key)
  {
    if(map == null || key == null) {
      return;
    }
    Object value = map.get(key);
    if(value == null) {
      return;
    }
    if(value instanceof Collection) {
      return;
    }
    if(value.getClass().isArray()) {
      return;
    }
    List<Object> list = new ArrayList<Object>();
    list.add(value);
    map.put(key, list);
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
      if(object instanceof IndexRange) {
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