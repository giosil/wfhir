package org.dew.fhir.xml;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.time.ZoneId;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public
class XmlSerializer
{
  public static
  String serialize(Object value)
  {
    if(value == null) return "";
    
    Class<?> klass = value.getClass();
    String className = klass.getName();
    if(className.startsWith("java.")) {
      return "";
    }
    String tagName = klass.getSimpleName();
    
    StringBuilder result = new StringBuilder();
    result.append("<" + tagName + " xmlns=\"http://hl7.org/fhir\">");
    // If klass is a System class then set includeSuperClass to false.
    boolean includeSuperClass = klass.getClassLoader() != null;
    Method[] methods = includeSuperClass ? klass.getMethods() : klass.getDeclaredMethods();
    for(int i = 0; i < methods.length; i++) {
      try {
        Method method = methods[i];
        if(Modifier.isPublic(method.getModifiers())) {
          String name = method.getName();
          String key  = "";
          if(name.startsWith("get")) {
            if("getClass".equals(name) || "getDeclaringClass".equals(name)) {
              key = "";
            }
            else {
              key = name.substring(3);
            }
          }
          else if(name.startsWith("is")) {
            key = name.substring(2);
          }
          if(key.length() > 0 && key.charAt(0) < 97 && method.getParameterTypes().length == 0) {
            // FHIR
            if(key.endsWith("_")) {
              key = key.substring(0, key.length()-1);
            }
            if(key.length() == 1) {
              key = key.toLowerCase();
            }
            else if(!Character.isUpperCase(key.charAt(1))) {
              key = key.substring(0, 1).toLowerCase() + key.substring(1);
            }
            Object oValue = method.invoke(value, (Object[]) null);
            if(oValue != null) {
              result.append(value(key, oValue));
            }
          }
        }
      }
      catch(Exception ex) {
      }
    }
    result.append("</" + tagName + ">");
    return result.toString();
  }
  
  private static
  String value(String tagName, Object value)
  {
    if(value == null || tagName.length() == 0 || tagName.equals("resourceType")) return "";
    
    Class<?> klass = value.getClass();
    
    StringBuilder result = new StringBuilder();
    
    if(value instanceof Map) {
      Map<?, ?> map = (Map<?, ?>) value;
      Object urlValue = map.get("url");
      if(urlValue != null) {
        result.append("<" + tagName + " url=\"" + urlValue + "\">");
      }
      else {
        result.append("<" + tagName + ">");
      }
      Iterator<? extends Map.Entry<?, ?>> iterator = map.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry<?, ?> entry = iterator.next();
        String key = entry.getKey().toString();
        if(key.equals("url")) continue;
        result.append(value(key, entry.getValue()));
      }
      result.append("</" + tagName + ">");
    }
    else if(value instanceof Collection) {
      Collection<?> collection = (Collection<?>) value;
      Iterator<?> iterator = collection.iterator();
      while(iterator.hasNext()) {
        result.append(value(tagName, iterator.next()));
      }
    }
    else if(value.getClass().isArray()) {
      int length = Array.getLength(value);
      for(int i = 0; i < length; i++) {
        result.append(value(tagName, Array.get(value, i)));
      }
    }
    else {
      String valueClassName = klass.getName();
      if(valueClassName.startsWith("java.")) {
        if(value instanceof Date) {
          result.append("<" + tagName + " value=\"" + dateTimeToString(value)  + "\"/>");
        }
        else if(value instanceof Calendar) {
          result.append("<" + tagName + " value=\"" + dateTimeToString(value) + "\"/>");
        }
        else if(value instanceof java.time.LocalDate) {
          result.append("<" + tagName + " value=\"" + dateTimeToString(value) + "\"/>");
        }
        else if(value instanceof java.time.LocalDateTime) {
          result.append("<" + tagName + " value=\"" + dateTimeToString(value) + "\"/>");
        }
        else if(tagName.equals("div")) {
          result.append(value);
        }
        else {
          result.append("<" + tagName + " value=\"" + normalizeAttribute(value.toString()) + "\"/>");
        }
      }
      else {
        result.append("<" + tagName + ">");
        // If klass is a System class then set includeSuperClass to false.
        boolean includeSuperClass = klass.getClassLoader() != null;
        Method[] methods = includeSuperClass ? klass.getMethods() : klass.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++) {
          try {
            Method method = methods[i];
            if(Modifier.isPublic(method.getModifiers())) {
              String name = method.getName();
              String key  = "";
              if(name.startsWith("get")) {
                if("getClass".equals(name) || "getDeclaringClass".equals(name)) {
                  key = "";
                }
                else {
                  key = name.substring(3);
                }
              }
              else if(name.startsWith("is")) {
                key = name.substring(2);
              }
              if(key.length() > 0 && key.charAt(0) < 97 && method.getParameterTypes().length == 0) {
                if(key.length() == 1) {
                  key = key.toLowerCase();
                }
                else if(!Character.isUpperCase(key.charAt(1))) {
                  key = key.substring(0, 1).toLowerCase() + key.substring(1);
                }
                Object oValue = method.invoke(value, (Object[]) null);
                if(oValue != null) {
                  result.append(value(key, oValue));
                }
              }
            }
          }
          catch(Exception ex) {
          }
        }
        result.append("</" + tagName + ">");
      }
    }
    return result.toString();
  }
  
  private static
  String normalizeAttribute(String value)
  {
    if(value == null) return "null";
    StringBuilder sbResult = new StringBuilder(value.length());
    int iLength = value.length();
    for(int i = 0; i < iLength; i++) {
      char c = value.charAt(i);
      switch(c) {
        case '<':
          sbResult.append("&lt;");
          break;
        case '>':
          sbResult.append("&gt;");
          break;
        case '"':
          sbResult.append("&quot;");
          break;
        case '&':
          sbResult.append("&amp;");
          break;
        default:
          sbResult.append(c);
      }
    }
    return sbResult.toString();
  }
  
  private static
  String dateTimeToString(Object value)
  {
    if(value == null) return "";
    
    Calendar cal = null;
    if(value instanceof java.util.Date) {
      cal = Calendar.getInstance();
      cal.setTimeInMillis(((java.util.Date) value).getTime());
    }
    else if(value instanceof java.util.Calendar) {
      cal = (Calendar) value;
    }
    else if(value instanceof java.time.LocalDate) {
      cal = Calendar.getInstance();
      cal.setTimeInMillis(((java.time.LocalDate) value).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }
    else if(value instanceof java.time.LocalDateTime) {
      cal = Calendar.getInstance();
      cal.setTimeInMillis(((java.time.LocalDateTime) value).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }
    
    // Get total offset in minutes
    int iZoneOffsetMin = cal.get(Calendar.ZONE_OFFSET) / 60000;
    int iDST_OffsetMin = cal.get(Calendar.DST_OFFSET)  / 60000;
    int iTot_OffsetMin = iZoneOffsetMin + iDST_OffsetMin;
    boolean negOffset  = false;
    if(iTot_OffsetMin < 0) {
      iTot_OffsetMin = iTot_OffsetMin * -1;
      negOffset = true;
    }
    // Format offset
    int iTot_OffsetHH = iTot_OffsetMin / 60;
    int iTot_OffsetMM = iTot_OffsetMin % 60;
    String sOffsetHH  = iTot_OffsetHH < 10 ? "0" + iTot_OffsetHH : String.valueOf(iTot_OffsetHH);
    String sOffsetMM  = iTot_OffsetMM < 10 ? "0" + iTot_OffsetMM : String.valueOf(iTot_OffsetMM);
    String sOffset = negOffset ? "-" + sOffsetHH + ":" + sOffsetMM : "+" + sOffsetHH + ":" + sOffsetMM;
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    int iHour  = cal.get(Calendar.HOUR_OF_DAY);
    int iMin   = cal.get(Calendar.MINUTE);
    int iSec   = cal.get(Calendar.SECOND);
    String sYear  = String.valueOf(iYear);
    String sMonth = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay   = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    String sHour  = iHour  < 10 ? "0" + iHour  : String.valueOf(iHour);
    String sMin   = iMin   < 10 ? "0" + iMin   : String.valueOf(iMin);
    String sSec   = iSec   < 10 ? "0" + iSec   : String.valueOf(iSec);
    if(iYear < 10) {
      sYear = "000" + sYear;
    }
    else if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    return sYear + "-" + sMonth + "-" + sDay + "T" + sHour + ":" + sMin + ":" + sSec + sOffset;
  }
}
