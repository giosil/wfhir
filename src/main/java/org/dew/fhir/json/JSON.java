package org.dew.fhir.json;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.dew.fhir.util.FUtil;

/**
 * Utility class to parse JSON text and/or to convert in JSON text.
 */
@SuppressWarnings({"unchecked"})
public
class JSON
{
  public static String BYTEARRAY_PREFIX = "";
  public static DateFormat DATE_FORMAT  = null;
  
  public static
  void setDefaultTimeZone(TimeZone timeZone)
  {
    if(timeZone == null) return;
    JSONObject.timeZone = timeZone;
  }
  
  public static
  Object parse(String sText)
  {
    if(sText == null) return null;
    sText = sText.trim();
    if(sText.length() == 0) return "";
    char c0 = sText.charAt(0);
    if(c0 == '{') {
      JSONObject jsonObject = new JSONObject(sText);
      return jsonObject.toHashMap();
    }
    if(c0 == '[') {
      JSONArray jsonArray = new JSONArray(sText);
      return jsonArray.toArrayList();
    }
    if(c0 != '\'' && c0 != '"') {
      return JSONObject.stringToValue(sText);
    }
    if(c0 == '\'' || c0 == '"') {
      int iEndString = -1;
      if(c0 == '\'') {
        iEndString = sText.lastIndexOf('\'');
      }
      if(c0 == '"') {
        iEndString = sText.lastIndexOf('"');
      }
      if(iEndString < 0) iEndString = sText.length();
      String s = sText.substring(1, iEndString);
      return JSONTokener.stringToObject(s);
    }
    return sText;
  }
  
  public static
  Object parseLegacy(String sText)
  {
    if(sText == null) return null;
    sText = sText.trim();
    if(sText.length() == 0) return "";
    char c0 = sText.charAt(0);
    if(c0 == '{') {
      JSONObject jsonObject = new JSONObject(sText);
      return jsonObject.toHashtable();
    }
    if(c0 == '[') {
      JSONArray jsonArray = new JSONArray(sText);
      return jsonArray.toVector();
    }
    if(c0 != '\'' && c0 != '"') {
      return JSONObject.stringToValue(sText);
    }
    if(c0 == '\'' || c0 == '"') {
      int iEndString = -1;
      if(c0 == '\'') {
        iEndString = sText.lastIndexOf('\'');
      }
      if(c0 == '"') {
        iEndString = sText.lastIndexOf('"');
      }
      if(iEndString < 0) iEndString = sText.length();
      String s = sText.substring(1, iEndString);
      return JSONTokener.stringToObject(s);
    }
    return sText;
  }
  
  public static
  Map<String,Object> parseObj(String sText)
  {
    Object result = parse(sText);
    if(result instanceof Map) {
      return (Map<String,Object>) result;
    }
    return null;
  }
  
  public static
  <T> T parseBean(String sText, Class<T> beanClass)
  {
    Object result = parse(sText);
    if(result instanceof Map) {
      return FUtil.populateBean(beanClass, (Map<String,Object>) result);
    }
    return null;
  }
  
  public static
  <T> T parseBean(String sText, Class<T> beanClass, ClassLoader classLoader)
  {
    Object result = parse(sText);
    if(result instanceof Map) {
      return FUtil.populateBean(beanClass, (Map<String,Object>) result, classLoader);
    }
    return null;
  }
  
  public static
  List<Object> parseArray(String sText)
  {
    if(sText == null) return null;
    sText = sText.trim();
    if(sText.length() == 0) {
      return new ArrayList<Object>();
    }
    Object result = parse(sText);
    if(result instanceof List) {
      return (List<Object>) result;
    }
    if(result != null) {
      List<Object> listResult = new ArrayList<Object>();
      listResult.add(result);
      return listResult;
    }
    return null;
  }
  
  public static
  List<Map<String,Object>> parseArrayObj(String sText)
  {
    List<?> listResult = parseArray(sText);
    if(listResult == null) {
      return null;
    }
    if(listResult.size() == 0) {
      return (List<Map<String,Object>>) listResult;
    }
    Object first = listResult.get(0);
    if(first == null || first instanceof Map) {
      return (List<Map<String,Object>>) listResult;
    }
    return new ArrayList<Map<String,Object>>();
  }
  
  public static
  <T> List<T> parseArrayBean(String sText, Class<T> beanClass, ClassLoader classLoader)
  {
    List<?> listResult = parseArray(sText);
    if(listResult == null) {
      return null;
    }
    if(listResult.size() == 0) {
      return (List<T>) listResult;
    }
    Object first = listResult.get(0);
    if(first == null || first instanceof Map) {
      List<Map<String,Object>> listOfMap = (List<Map<String,Object>>) listResult;
      List<T> listOfBean = new ArrayList<T>(listOfMap.size());
      for(int i = 0; i < listOfMap.size(); i++) {
        listOfBean.add(FUtil.populateBean(beanClass, listOfMap.get(i), classLoader));
      }
      return listOfBean;
    }
    return new ArrayList<T>();
  }
  
  public static
  <T> List<T> parseArrayBean(String sText, Class<T> beanClass)
  {
    List<?> listResult = parseArray(sText);
    if(listResult == null) {
      return null;
    }
    if(listResult.size() == 0) {
      return (List<T>) listResult;
    }
    Object first = listResult.get(0);
    if(first == null || first instanceof Map) {
      List<Map<String,Object>> listOfMap = (List<Map<String,Object>>) listResult;
      List<T> listOfBean = new ArrayList<T>(listOfMap.size());
      for(int i = 0; i < listOfMap.size(); i++) {
        listOfBean.add(FUtil.populateBean(beanClass, listOfMap.get(i)));
      }
      return listOfBean;
    }
    return new ArrayList<T>();
  }
  
  public static
  String stringify(Object object)
  {
    return JSONObject.valueToString(object);
  }
}
