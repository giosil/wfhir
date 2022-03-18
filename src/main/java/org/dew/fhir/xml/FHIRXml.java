package org.dew.fhir.xml;

import java.util.Map;

import org.dew.fhir.util.FUtil;

public 
class FHIRXml 
{
  public static
  String serialize(Object object)
  {
    return XmlSerializer.serialize(object);
  }
  
  public static
  Map<String, Object> deserialize(String xml) 
  {
    if(xml == null || xml.length() == 0) {
      return null;
    }
    
    try {
      XmlDeserializer xmlDeserializer = new XmlDeserializer();
      xmlDeserializer.load(xml);
      return xmlDeserializer.getRoot();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    
    return null;
  }
  
  public static
  Map<String, Object> deserialize(byte[] xml) 
  {
    if(xml == null || xml.length == 0) {
      return null;
    }
    
    try {
      XmlDeserializer xmlDeserializer = new XmlDeserializer();
      xmlDeserializer.load(xml);
      return xmlDeserializer.getRoot();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    
    return null;
  }
  
  public static
  <T> T deserialize(byte[] xml, Class<T> beanClass)
  {
    if(xml == null || xml.length == 0) {
      return null;
    }
    if(beanClass == null) {
      return null;
    }
    
    Map<String, Object> map = null;
    try {
      XmlDeserializer xmlDeserializer = new XmlDeserializer();
      xmlDeserializer.load(xml);
      map = xmlDeserializer.getRoot();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    
    return FUtil.populateBean(beanClass, map);
  }
}
