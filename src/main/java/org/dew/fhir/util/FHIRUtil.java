package org.dew.fhir.util;

import java.util.Map;

import org.dew.fhir.json.JSON;

import org.dew.fhir.xml.XmlDeserializer;
import org.dew.fhir.xml.XmlSerializer;

public 
class FHIRUtil 
{
  public static final String CONTENT_TYPE_JSON = "application/fhir+json";
  public static final String CONTENT_TYPE_XML  = "application/fhir+xml";
  
  public static
  String serialize(Object object, String contentType)
  {
    if(contentType == null) {
      return XmlSerializer.serialize(object);
    }
    else if(contentType.contains("json")) {
      return JSON.stringify(object);
    }
    return XmlSerializer.serialize(object);
  }
  
  public static
  Map<String, Object> deserialize(String data)
    throws Exception
  {
    if(data == null || data.length() == 0) {
      return null;
    }
    
    String contentType = detectContentType(data);
    
    if(contentType == null) {
      XmlDeserializer xmlDeserializer = new XmlDeserializer();
      xmlDeserializer.load(data);
      return xmlDeserializer.getRoot();
    }
    else if(contentType.contains("json")) {
      return JSON.parseObj(data);
    }
    
    XmlDeserializer xmlDeserializer = new XmlDeserializer();
    xmlDeserializer.load(data);
    return xmlDeserializer.getRoot();
  }
  
  public static
  Map<String, Object> deserialize(byte[] data)
    throws Exception
  {
    if(data == null || data.length == 0) {
      return null;
    }
    
    String contentType = detectContentType(data);
    
    if(contentType == null) {
      XmlDeserializer xmlDeserializer = new XmlDeserializer();
      xmlDeserializer.load(data);
      return xmlDeserializer.getRoot();
    }
    else if(contentType.contains("json")) {
      return JSON.parseObj(new String(data));
    }
    
    XmlDeserializer xmlDeserializer = new XmlDeserializer();
    xmlDeserializer.load(data);
    return xmlDeserializer.getRoot();
  }
  
  public static
  <T> T deserialize(String data, Class<T> beanClass)
    throws Exception
  {
    Map<String, Object> map = deserialize(data);
    
    if(map == null) return null;
    
    return FUtil.populateBean(beanClass, map);
  }
  
  public static
  <T> T deserialize(byte[] data, Class<T> beanClass)
    throws Exception
  {
    Map<String, Object> map = deserialize(data);
    
    if(map == null) return null;
    
    return FUtil.populateBean(beanClass, map);
  }
  
  public static
  <T> T createInstance(Map<String, Object> map, Class<T> beanClass)
    throws Exception
  {
    if(map == null) return null;
    
    return FUtil.populateBean(beanClass, map);
  }
  
  protected static
  String detectContentType(byte[] data)
  {
    if(data == null || data.length == 0) {
      return null;
    }
    
    byte r = 0;
    for(int i = 0; i < data.length; i++) {
      byte c = data[i];
      if(c < 32) continue;
      r = c;
      break;
    }
    
    if(r == '{') {
      return CONTENT_TYPE_JSON;
    }
    if(r == '<') {
      return CONTENT_TYPE_XML;
    }
    
    return null;
  }
  
  protected static
  String detectContentType(String data)
  {
    if(data == null || data.length() == 0) {
      return null;
    }
    
    char r = '\0';
    for(int i = 0; i < data.length(); i++) {
      char c = data.charAt(i);
      if(c < 32) continue;
      r = c;
      break;
    }
    
    if(r == '{') {
      return CONTENT_TYPE_JSON;
    }
    if(r == '<') {
      return CONTENT_TYPE_XML;
    }
    
    return null;
  }
}