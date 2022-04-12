package org.dew.fhir.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.dew.fhir.json.JSON;
import org.dew.fhir.json.JSONObject;

@SuppressWarnings({"rawtypes","unchecked"})
public
class FUtil
{
  private static DecimalFormat dfIT;
  private static DecimalFormat dfEN;
  private static DecimalFormat dfXX;
  
  public static
  int toInt(Object object, int iDefault)
  {
    if(object == null) return iDefault;
    if(object instanceof Number) {
      return ((Number) object).intValue();
    }
    if(object instanceof java.util.Date) {
      return longDateToInt(((java.util.Date) object).getTime());
    }
    if(object instanceof java.util.Calendar) {
      return longDateToInt(((java.util.Calendar) object).getTimeInMillis());
    }
    if(object instanceof java.lang.Boolean) {
      return ((java.lang.Boolean) object).booleanValue() ? 1 : 0;
    }
    if(object instanceof Collection) {
      return toInt(getFirst(object), iDefault);
    }
    if(object.getClass().isArray()) {
      return toInt(getFirst(object), iDefault);
    }
    if(object instanceof Map) {
      return toInt(((Map) object).get("value"), iDefault);
    }
    if(object instanceof Map.Entry) {
      return toInt(((Map.Entry) object).getValue(), iDefault);
    }
    String sValue = object.toString().trim();
    if(sValue.length() == 0) return iDefault;
    int iSep = sValue.indexOf(' ');
    if(iSep > 0) {
      sValue = sValue.substring(0, iSep);
    }
    if(sValue.indexOf('.') >= 0 || sValue.indexOf(',') >= 0) {
      Double oValue = toDoubleObj(object, null);
      if(oValue == null) return iDefault;
      return oValue.intValue();
    }
    try{ return Integer.parseInt(sValue); } catch(Throwable th) {}
    return iDefault;
  }
  
  public static
  Integer toInteger(Object object, Integer oDefault)
  {
    if(object == null) return oDefault;
    if(object instanceof Integer) {
      return (Integer) object;
    }
    if(object instanceof String) {
      String sValue = ((String) object).trim();
      if(sValue.length() == 0) return oDefault;
      int iSep = sValue.indexOf(' ');
      if(iSep > 0) {
        sValue = sValue.substring(0, iSep);
      }
      if(sValue.indexOf('.') >= 0 || sValue.indexOf(',') >= 0) {
        Double oValue = toDoubleObj(object, null);
        if(oValue == null) return oDefault;
        return new Integer(oValue.intValue());
      }
      try{
        Integer oResult = new Integer(sValue);
        if(sValue.endsWith(oResult.toString())) {
          return oResult;
        }
        else {
          return oDefault;
        }
      }
      catch(Throwable th) {
      }
      return oDefault;
    }
    return new Integer(toInt(object, oDefault != null ? oDefault.intValue() : 0));
  }
  
  public static
  BigInteger toBigInteger(Object object, BigInteger oDefault)
  {
    if(object == null) return oDefault;
    if(object instanceof BigInteger) {
      return (BigInteger) object;
    }
    if(object instanceof Number) {
      return new BigInteger(object.toString());
    }
    if(object instanceof String) {
      String sValue = ((String) object).trim();
      if(sValue.length() == 0) return oDefault;
      int iSep = sValue.indexOf(' ');
      if(iSep > 0) {
        sValue = sValue.substring(0, iSep);
      }
      if(sValue.indexOf('.') >= 0 || sValue.indexOf(',') >= 0) {
        Double oValue = toDoubleObj(object, null);
        if(oValue == null) return oDefault;
        return new BigInteger(String.valueOf(oValue.intValue()));
      }
      try{
        return new BigInteger(sValue);
      }
      catch(Throwable th) {
      }
      return oDefault;
    }
    if(object instanceof Collection) {
      return toBigInteger(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toBigInteger(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toBigInteger(((Map) object).get("value"), oDefault);
    }
    if(object instanceof Map.Entry) {
      return toBigInteger(((Map.Entry) object).getValue(), oDefault);
    }
    return oDefault;
  }
  
  public static
  BigDecimal toBigDecimal(Object object, BigDecimal oDefault)
  {
    if(object == null) return oDefault;
    if(object instanceof BigDecimal) {
      return (BigDecimal) object;
    }
    if(object instanceof Number) {
      // Utilizzando costruttore con double potrebbe verificarsi questo:
      // new BigDecimal(1236.27) -> 1236.26999999999998181010596454143524169921875
      return new BigDecimal(object.toString());
    }
    if(object instanceof String) {
      String sValue = ((String) object).trim();
      if(sValue.length() == 0) return oDefault;
      int iSep = sValue.indexOf(' ');
      if(iSep > 0) {
        sValue = sValue.substring(0, iSep);
      }
      if(sValue.indexOf('.') >= 0 && sValue.indexOf(',') >= 0) {
        // 1.5+
        sValue = sValue.replace(".", "");
        // 1.4
//        StringBuffer sb = new StringBuffer(sValue.length());
//        for(int i = 0; i < sValue.length(); i++) {
//          char c = sValue.charAt(i);
//          if(c != '.') sb.append(c);
//        }
//        sValue = sb.toString();
      }
      try{ return new BigDecimal(sValue.replace(',', '.')); } catch(Throwable th) {}
      return oDefault;
    }
    if(object instanceof Collection) {
      return toBigDecimal(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toBigDecimal(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toBigDecimal(((Map) object).get("value"), oDefault);
    }
    if(object instanceof Map.Entry) {
      return toBigDecimal(((Map.Entry) object).getValue(), oDefault);
    }
    return oDefault;
  }
  
  public static
  double toDouble(Object object, double dDefault)
  {
    if(object == null) return dDefault;
    if(object instanceof Number) {
      return ((Number) object).doubleValue();
    }
    if(object instanceof Collection) {
      return toDouble(getFirst(object), dDefault);
    }
    if(object.getClass().isArray()) {
      return toDouble(getFirst(object), dDefault);
    }
    if(object instanceof java.lang.Boolean) {
      return ((java.lang.Boolean) object).booleanValue() ? 1.0d : 0.0d;
    }
    if(object instanceof Map) {
      return toDouble(((Map) object).get("value"), dDefault);
    }
    if(object instanceof Map.Entry) {
      return toDouble(((Map.Entry) object).getValue(), dDefault);
    }
    String sValue = object.toString().trim();
    if(sValue.length() == 0) return dDefault;
    int iSep = sValue.indexOf(' ');
    if(iSep > 0) {
      sValue = sValue.substring(0, iSep);
    }
    if(sValue.indexOf('.') >= 0 && sValue.indexOf(',') >= 0) {
      // 1.5+
      sValue = sValue.replace(".", "");
      // 1.4
//      StringBuffer sb = new StringBuffer(sValue.length());
//      for(int i = 0; i < sValue.length(); i++) {
//        char c = sValue.charAt(i);
//        if(c != '.') sb.append(c);
//      }
//      sValue = sb.toString();
    }
    try{ return Double.parseDouble(sValue.replace(',', '.')); } catch(Throwable th) {}
    return dDefault;
  }
  
  public static
  Double toDoubleObj(Object object, Double oDefault)
  {
    if(object == null) return oDefault;
    if(object instanceof Double) {
      return (Double) object;
    }
    if(object instanceof String) {
      String sValue = ((String) object).trim();
      if(sValue.length() == 0) return oDefault;
      int iSep = sValue.indexOf(' ');
      if(iSep > 0) {
        sValue = sValue.substring(0, iSep);
      }
      if(sValue.indexOf('.') >= 0 && sValue.indexOf(',') >= 0) {
        // 1.5+
        sValue = sValue.replace(".", "");
        // 1.4
//        StringBuffer sb = new StringBuffer(sValue.length());
//        for(int i = 0; i < sValue.length(); i++) {
//          char c = sValue.charAt(i);
//          if(c != '.') sb.append(c);
//        }
//        sValue = sb.toString();
      }
      try{ return new Double(sValue.replace(',', '.')); } catch(Throwable th) {}
      return oDefault;
    }
    return new Double(toDouble(object, oDefault != null ? oDefault.doubleValue() : 0.0d));
  }
  
  public static
  long toLong(Object object, long lDefault)
  {
    if(object == null) return lDefault;
    if(object instanceof Number) {
      return ((Number) object).longValue();
    }
    if(object instanceof java.util.Date) {
      return ((java.util.Date) object).getTime();
    }
    if(object instanceof java.util.Calendar) {
      return ((java.util.Calendar) object).getTimeInMillis();
    }
    if(object instanceof Collection) {
      return toLong(getFirst(object), lDefault);
    }
    if(object.getClass().isArray()) {
      return toLong(getFirst(object), lDefault);
    }
    if(object instanceof java.lang.Boolean) {
      return ((java.lang.Boolean) object).booleanValue() ? 1l : 0l;
    }
    if(object instanceof Map) {
      return toLong(((Map) object).get("value"), lDefault);
    }
    if(object instanceof Map.Entry) {
      return toLong(((Map.Entry) object).getValue(), lDefault);
    }
    String sValue = object.toString().trim();
    if(sValue.length() == 0) return lDefault;
    int iSep = sValue.indexOf(' ');
    if(iSep > 0) {
      sValue = sValue.substring(0, iSep);
    }
    if(sValue.indexOf('.') >= 0 || sValue.indexOf(',') >= 0) {
      Double oValue = toDoubleObj(object, null);
      if(oValue == null) return lDefault;
      return oValue.longValue();
    }
    try{ return Long.parseLong(sValue); } catch(Throwable th) {}
    return lDefault;
  }
  
  public static
  Long toLongObj(Object object, Long oDefault)
  {
    if(object == null) return oDefault;
    if(object instanceof String) {
      String sValue = ((String) object).trim();
      if(sValue.length() == 0) return oDefault;
      int iSep = sValue.indexOf(' ');
      if(iSep > 0) {
        sValue = sValue.substring(0, iSep);
      }
      if(sValue.indexOf('.') >= 0 || sValue.indexOf(',') >= 0) {
        Double oValue = toDoubleObj(object, null);
        if(oValue == null) return oDefault;
        return new Long(oValue.longValue());
      }
      try{
        Long oResult = new Long(sValue);
        if(sValue.endsWith(oResult.toString())) {
          return oResult;
        }
        else {
          return oDefault;
        }
      }
      catch(Throwable th) {
      }
    }
    return new Long(toLong(object, oDefault != null ? oDefault.longValue() : 0l));
  }
  
  public static
  Number toNumber(Object object, int iDefault)
  {
    Number result = toNumber(object, null);
    if(result == null) return new Integer(iDefault);
    return result;
  }
  
  public static
  Number toNumber(Object object, double dDefault)
  {
    Number result = toNumber(object, null);
    if(result == null) return new Double(dDefault);
    return result;
  }
  
  public static
  Number toNumber(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toNumber(oDefault, null);
    }
    if(object instanceof Number) {
      return (Number) object;
    }
    if(object instanceof Date) {
      return new Integer(toIntDate(object, 0));
    }
    if(object instanceof Calendar) {
      return new Integer(toIntDate(object, 0));
    }
    if(object instanceof java.lang.Boolean) {
      return new Integer(((java.lang.Boolean) object).booleanValue() ? 1 : 0);
    }
    if(object instanceof Collection) {
      return toNumber(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toNumber(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toNumber(((Map) object).get("value"), oDefault);
    }
    if(object instanceof Map.Entry) {
      return toNumber(((Map.Entry) object).getValue(), oDefault);
    }
    String sValue = object.toString().trim();
    if(sValue.length() == 0) {
      return toNumber(oDefault, null);
    }
    char c0 = sValue.charAt(0);
    if((c0 >= '0' && c0 <= '9') || c0 == '-') {
      try {
        int iSep = sValue.indexOf(' ');
        if(iSep > 0) {
          sValue = sValue.substring(0, iSep);
        }
        if(sValue.indexOf(',') > -1 || sValue.indexOf('.') > -1 || sValue.indexOf('e') > -1 || sValue.indexOf('E') > -1 || sValue.endsWith("d") || sValue.endsWith("f")) {
          Double oResult = toDoubleObj(sValue, null);
          if(oResult == null) {
            return toNumber(oDefault, null);
          }
          return oResult;
        }
        else {
          Long longValue = new Long(sValue);
          if(longValue.longValue() == longValue.intValue()) {
            return new Integer(longValue.intValue());
          }
          else {
            return longValue;
          }
        }
      }
      catch(Exception ignore) {
      }
    }
    return toNumber(oDefault, null);
  }
  
  public static
  double round2(double value) 
  {
    return (double) Math.round(value * 100) / 100;
  }
  
  public static
  double round2(Object oValue) 
  {
    double value = toDouble(oValue, 0.0d);
    return (double) Math.round(value * 100) / 100;
  }
  
  public static
  double round(double value, int decimal) 
  {
    double x = Math.pow(10, decimal);
    return (double) Math.round(value * x) / x;
  }
  
  public static
  double round(Object oValue, int decimal) 
  {
    double value = toDouble(oValue, 0.0d);
    double x = Math.pow(10, decimal);
    return (double) Math.round(value * x) / x;
  }
  
  public static
  int compare2(double d1, double d2)
  {
    double diff = round2(d1 - d2);
    if(diff > -0.01d && diff < 0.01d) return 0;
    if(diff < 0) return -1;
    return 1;
  }
  
  public static
  int compare2(Object o1, Object o2)
  {
    if(o1 instanceof Date && o2 instanceof Date) {
      return ((Date) o1).compareTo((Date) o2);
    }
    // 1.5+
    if(o1 instanceof Calendar && o2 instanceof Calendar) {
      return ((Calendar) o1).compareTo((Calendar) o2);
    }
    Number n1 = toNumber(o1, null);
    Number n2 = toNumber(o2, null);
    if(n1 == null && n2 == null) {
      if(o1 instanceof Comparable && o2 instanceof Comparable) {
        return ((Comparable) o1).compareTo(o2);
      }
      return  0;
    }
    if(n1 != null && n2 == null) return  1;
    if(n1 == null && n2 != null) return -1;
    if(n1 instanceof Integer && n2 instanceof Integer) {
       return ((Integer) n1).compareTo((Integer) n2);
    }
    if(n1 instanceof Long && n2 instanceof Long) {
       return ((Long) n1).compareTo((Long) n2);
    }
    if(n1 instanceof BigInteger && n2 instanceof BigInteger) {
       return ((BigInteger) n1).compareTo((BigInteger) n2);
    }
    if(n1 instanceof BigDecimal && n2 instanceof BigDecimal) {
       return ((BigDecimal) n1).compareTo((BigDecimal) n2);
    }
    double d1 = n1.doubleValue();
    double d2 = n2.doubleValue();
    double diff = round2(d1 - d2);
    if(diff > -0.01d && diff < 0.01d) return 0;
    if(diff < 0) return -1;
    return 1;
  }
  
  public static
  int compare(double d1, double d2, int decimal)
  {
    double diff = round(d1 - d2, decimal);
    double x = round(1.0d / Math.pow(10, decimal), decimal);
    if(diff > -x && diff < x) return 0;
    if(diff < 0) return -1;
    return 1;
  }
  
  public static
  int compare(Object o1, Object o2, int decimal)
  {
    if(o1 instanceof Date && o2 instanceof Date) {
      return ((Date) o1).compareTo((Date) o2);
    }
    // 1.5+
    if(o1 instanceof Calendar && o2 instanceof Calendar) {
      return ((Calendar) o1).compareTo((Calendar) o2);
    }
    Number n1 = toNumber(o1, null);
    Number n2 = toNumber(o2, null);
    if(n1 == null && n2 == null) {
      if(o1 instanceof Comparable && o2 instanceof Comparable) {
        return ((Comparable) o1).compareTo(o2);
      }
      return  0;
    }
    if(n1 != null && n2 == null) return  1;
    if(n1 == null && n2 != null) return -1;
    if(n1 instanceof Integer && n2 instanceof Integer) {
       return ((Integer) n1).compareTo((Integer) n2);
    }
    if(n1 instanceof Long && n2 instanceof Long) {
       return ((Long) n1).compareTo((Long) n2);
    }
    if(n1 instanceof BigInteger && n2 instanceof BigInteger) {
       return ((BigInteger) n1).compareTo((BigInteger) n2);
    }
    if(n1 instanceof BigDecimal && n2 instanceof BigDecimal) {
       return ((BigDecimal) n1).compareTo((BigDecimal) n2);
    }
    double d1 = n1.doubleValue();
    double d2 = n2.doubleValue();
    double diff = round(d1 - d2, decimal);
    double x = round(1.0d / Math.pow(10, decimal), decimal);
    if(diff > -x && diff < x) return 0;
    if(diff < 0) return -1;
    return 1;
  }
  
  public static
  boolean toBoolean(Object object, boolean bDefault)
  {
    if(object == null) return bDefault;
    if(object instanceof Boolean) {
      return ((Boolean) object).booleanValue();
    }
    if(object instanceof Number) {
      return ((Number) object).intValue() != 0;
    }
    if(object instanceof Collection) {
      return toBoolean(getFirst(object), bDefault);
    }
    if(object.getClass().isArray()) {
      return toBoolean(getFirst(object), bDefault);
    }
    if(object instanceof Map) {
      return toBoolean(((Map) object).get("value"), bDefault);
    }
    if(object instanceof Map.Entry) {
      return toBoolean(((Map.Entry) object).getValue(), bDefault);
    }
    String sValue = object.toString().trim();
    if(sValue.length() == 0) return bDefault;
    char c0 = sValue.charAt(0);
    return "YySsTt1Jj".indexOf(c0) >= 0;
  }
  
  public static
  Boolean toBooleanObj(Object object, Boolean oDefault)
  {
    if(object == null) return oDefault;
    if(object instanceof String) {
      String sValue = ((String) object).trim();
      if(sValue.length() == 0 || sValue.equalsIgnoreCase("null")) return oDefault;
    }
    return new Boolean(toBoolean(object, oDefault != null ? oDefault.booleanValue() : false));
  }
  
  public static
  String toString(Object object, String sDefault)
  {
    if(object == null) return sDefault;
    if(object instanceof String) {
      return (String) object;
    }
    if(object instanceof java.sql.Time) {
      return formatTime((java.sql.Time) object, true, false);
    }
    if(object instanceof java.sql.Timestamp) {
      return formatDateTime((java.sql.Timestamp) object, null, true);
    }
    if(object instanceof java.util.Date) {
      return formatDate((java.util.Date) object, null);
    }
    if(object instanceof java.util.Calendar) {
      return formatDate((java.util.Calendar) object, null);
    }
    if(object instanceof Collection) {
      return toString(getFirst(object), sDefault);
    }
    if(object instanceof Map) {
      return JSON.stringify(object);
    }
    if(object instanceof Map.Entry) {
      return toString(((Map.Entry) object).getValue(), sDefault);
    }
    if(object instanceof byte[]) {
      return new String((byte[]) object);
    }
    if(object instanceof char[]) {
      return new String((char[]) object);
    }
    if(object.getClass().isArray()) {
      return toString(getFirst(object), sDefault);
    }
    return object.toString();
  }
  
  public static
  String toString(Object object, String sDefault, int iMaxLength)
  {
    String sResult = toString(object, sDefault);
    if(sResult != null && iMaxLength > 0 && sResult.length() > iMaxLength) {
      return sResult.substring(0, iMaxLength);
    }
    return sResult;
  }
  
  public static
  String toUpperString(Object object, String sDefault)
  {
    String sResult = toString(object, sDefault);
    if(sResult != null) return sResult.toUpperCase();
    return null;
  }
  
  public static
  String toUpperString(Object object, String sDefault, int iMaxLength)
  {
    String sResult = toUpperString(object, sDefault);
    if(sResult != null && iMaxLength > 0 && sResult.length() > iMaxLength) {
      return sResult.substring(0, iMaxLength);
    }
    return sResult;
  }
  
  public static
  String toLowerString(Object object, String sDefault)
  {
    String sResult = toString(object, sDefault);
    if(sResult != null) return sResult.toLowerCase();
    return null;
  }
  
  public static
  String toLowerString(Object object, String sDefault, int iMaxLength)
  {
    String sResult = toLowerString(object, sDefault);
    if(sResult != null && iMaxLength > 0 && sResult.length() > iMaxLength) {
      return sResult.substring(0, iMaxLength);
    }
    return sResult;
  }
  
  public static
  String toEscapedText(Object object, String sDefault)
  {
    String sValue = toString(object, sDefault);
    if(sValue == null) return "";
    int iLength = sValue.length();
    if(iLength == 0) return "";
    StringBuffer sb = new StringBuffer(iLength);
    for(int i = 0; i < iLength; i++) {
      char c = sValue.charAt(i);
      if(c == '<')  sb.append("&lt;");   else
      if(c == '>')  sb.append("&gt;");   else
      if(c == '&')  sb.append("&amp;");  else
      if(c == '"')  sb.append("&quot;"); else
      if(c == '\'') sb.append("&apos;"); else
      if(c > 127) {
        int code = (int) c;
        sb.append("&#" + code + ";");
      }
      else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
  
  public static
  String toHTMLText(Object object, String sDefault)
  {
    String sValue = toString(object, sDefault);
    if(sValue == null) return "";
    int iLength = sValue.length();
    if(iLength == 0) return "";
    StringBuffer sb = new StringBuffer(iLength);
    for(int i = 0; i < iLength; i++) {
      char c = sValue.charAt(i);
      switch (c) {
        case    '<':   sb.append("&lt;");     break;
        case    '>':   sb.append("&gt;");     break;
        case    '&':   sb.append("&amp;");    break;
        case '\300':   sb.append("&Agrave;"); break;
        case '\310':   sb.append("&Egrave;"); break;
        case '\314':   sb.append("&Igrave;"); break;
        case '\322':   sb.append("&Ograve;"); break;
        case '\331':   sb.append("&Ugrave;"); break;
        case '\301':   sb.append("&Aacute;"); break;
        case '\311':   sb.append("&Eacute;"); break;
        case '\315':   sb.append("&Iacute;"); break;
        case '\323':   sb.append("&Oacute;"); break;
        case '\332':   sb.append("&Uacute;"); break;
        case '\340':   sb.append("&agrave;"); break;
        case '\350':   sb.append("&egrave;"); break;
        case '\354':   sb.append("&igrave;"); break;
        case '\362':   sb.append("&ograve;"); break;
        case '\371':   sb.append("&ugrave;"); break;
        case '\341':   sb.append("&aacute;"); break;
        case '\351':   sb.append("&eacute;"); break;
        case '\355':   sb.append("&iacute;"); break;
        case '\363':   sb.append("&oacute;"); break;
        case '\372':   sb.append("&uacute;"); break;
        case '\347':   sb.append("&ccedil;"); break;
        case '\307':   sb.append("&Ccedil;"); break;
        case '\361':   sb.append("&ntilde;"); break;
        case '\342':   sb.append("&acirc;");  break;
        case '\352':   sb.append("&ecirc;");  break;
        case '\356':   sb.append("&icirc;");  break;
        case '\364':   sb.append("&ocirc;");  break;
        case '\373':   sb.append("&ucirc;");  break;
        case '\252':   sb.append("&ordf;");   break;
        case '\260':   sb.append("&deg;");    break;
        case '\241':   sb.append("&iexcl;");  break;
        case '\277':   sb.append("&iquest;"); break;
        case '\u20ac': sb.append("&euro;");   break;
        default: {
          if(c < 128) {
            sb.append(c);
          }
          else {
            int code = (int) c;
            sb.append("&#" + code + ";");
          }
        }
      }
    }
    return sb.toString();
  }
  
  public static
  java.util.Date toDate(int iValue, int iDefault)
  {
    if(iValue < 10000) {
      if(iDefault < 10000) return null;
      return toDate(iDefault, 0);
    }
    int iYear  = iValue / 10000;
    int iMonth = (iValue % 10000) / 100;
    int iDay   = (iValue % 10000) % 100;
    return new GregorianCalendar(iYear, iMonth-1, iDay).getTime();
  }
  
  public static
  java.util.Date toDate(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toDate(oDefault, null);
    }
    if(object instanceof java.sql.Date) {
      return new java.util.Date(((java.sql.Date) object).getTime());
    }
    if(object instanceof java.sql.Timestamp) {
      return new java.util.Date(((java.sql.Timestamp) object).getTime());
    }
    if(object instanceof java.util.Date) {
      return (java.util.Date) object;
    }
    if(object instanceof java.util.Calendar) {
      return new java.util.Date(((java.util.Calendar) object).getTimeInMillis());
    }
    if(object instanceof Long) {
      return new java.util.Date(((Long) object).longValue());
    }
    if(object instanceof Number) {
      int iDate = ((Number) object).intValue();
      if(iDate < 10000) return toDate(oDefault, null);
      int iYear  = iDate / 10000;
      int iMonth = (iDate % 10000) / 100;
      int iDay   = (iDate % 10000) % 100;
      return new GregorianCalendar(iYear, iMonth-1, iDay).getTime();
    }
    if(object instanceof Collection) {
      return toDate(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toDate(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toDate(((Map) object).get("value"), oDefault);
    }
    if(object instanceof Map.Entry) {
      return toDate(((Map.Entry) object).getValue(), oDefault);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toDate(oDefault, null);
    return cal.getTime();
  }
  
  public static
  java.util.Date toTime(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toTime(oDefault, null);
    }
    if(object instanceof java.sql.Date) {
      return new java.util.Date(((java.sql.Date) object).getTime());
    }
    if(object instanceof java.sql.Timestamp) {
      return new java.util.Date(((java.sql.Timestamp) object).getTime());
    }
    if(object instanceof java.util.Date) {
      return (java.util.Date) object;
    }
    if(object instanceof java.util.Calendar) {
      return new java.util.Date(((java.util.Calendar) object).getTimeInMillis());
    }
    if(object instanceof Long) {
      return new java.util.Date(((Long) object).longValue());
    }
    if(object instanceof Number) {
      return intToTime(((Number) object).intValue());
    }
    if(object instanceof Collection) {
      return toTime(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toTime(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toTime(oDefault, null);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toTime(oDefault, null);
    return cal.getTime();
  }
  
  public static
  java.util.Date toTime(Object oDate, Object oTime, Object oDefault)
  {
    Calendar calDate = toCalendar(oDate, oDefault);
    Calendar calTime = toTimeCalendar(oTime, oDefault);
    if(calDate == null) {
      if(calTime == null) return null;
      return calTime.getTime();
    }
    if(calDate != null && calTime != null) {
      calDate.set(Calendar.HOUR_OF_DAY, calTime.get(Calendar.HOUR_OF_DAY));
      calDate.set(Calendar.MINUTE,      calTime.get(Calendar.MINUTE));
      calDate.set(Calendar.SECOND,      calTime.get(Calendar.SECOND));
      calDate.set(Calendar.MILLISECOND, calTime.get(Calendar.MILLISECOND));
    }
    return calDate.getTime();
  }
  
  public static
  java.util.Calendar toTimeCalendar(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toTimeCalendar(oDefault, null);
    }
    if(object instanceof java.util.Date) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(((java.util.Date) object).getTime());
      return calendar;
    }
    if(object instanceof java.util.Calendar) {
      return (java.util.Calendar) object;
    }
    if(object instanceof Long) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(((Long) object).longValue());
      return calendar;
    }
    if(object instanceof Number) {
      Calendar calendar = intToCalendarTime(((Number) object).intValue());
      if(calendar == null) return toTimeCalendar(oDefault, null);
      return calendar;
    }
    if(object instanceof Collection) {
      return toTimeCalendar(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toTimeCalendar(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toTimeCalendar(oDefault, null);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toTimeCalendar(oDefault, null);
    return cal;
  }
  
  public static
  java.util.Calendar toTimeCalendar(Object oDate, Object oTime, Object oDefault)
  {
    Calendar calDate = toCalendar(oDate, oDefault);
    Calendar calTime = toTimeCalendar(oTime, oDefault);
    if(calDate == null) {
      if(calTime == null) return null;
      return calTime;
    }
    if(calDate != null && calTime != null) {
      calDate.set(Calendar.HOUR_OF_DAY, calTime.get(Calendar.HOUR_OF_DAY));
      calDate.set(Calendar.MINUTE,      calTime.get(Calendar.MINUTE));
      calDate.set(Calendar.SECOND,      calTime.get(Calendar.SECOND));
      calDate.set(Calendar.MILLISECOND, calTime.get(Calendar.MILLISECOND));
    }
    return calDate;
  }
  
  public static
  java.util.Calendar toDateTime(Object oDate, Object oTime)
  {
    Calendar calendar = toCalendar(oDate, null);
    if(calendar == null) return null;
    if(oTime instanceof Number) {
      int iTime = ((Number) oTime).intValue();
      if(iTime == 0) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE,      0);
        calendar.set(Calendar.SECOND,      0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
      }
      else
      if(iTime == 2359 || iTime == 235959 || iTime == 2400 || iTime == 240000) {
        calendar.set(Calendar.HOUR_OF_DAY,  23);
        calendar.set(Calendar.MINUTE,       59);
        calendar.set(Calendar.SECOND,       59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar;
      }
    }
    Calendar calTime = toTimeCalendar(oTime, null);
    if(calTime == null) return calendar;
    calendar.set(Calendar.HOUR_OF_DAY, calTime.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.MINUTE,      calTime.get(Calendar.MINUTE));
    calendar.set(Calendar.SECOND,      calTime.get(Calendar.SECOND));
    calendar.set(Calendar.MILLISECOND, calTime.get(Calendar.MILLISECOND));
    return calendar;
  }
  
  public static
  java.util.Date setTime(java.util.Date date, Object oTime)
  {
    if(date == null) return date;
    
    if(oTime instanceof Number) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(date.getTime());
      int iTime = ((Number) oTime).intValue();
      if(iTime == 0) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE,      0);
        calendar.set(Calendar.SECOND,      0);
        calendar.set(Calendar.MILLISECOND, 0);
        date.setTime(calendar.getTimeInMillis());
        return date;
      }
      else
      if(iTime == 2359 || iTime == 235959 || iTime == 2400 || iTime == 240000) {
        calendar.set(Calendar.HOUR_OF_DAY,  23);
        calendar.set(Calendar.MINUTE,       59);
        calendar.set(Calendar.SECOND,       59);
        calendar.set(Calendar.MILLISECOND, 999);
        date.setTime(calendar.getTimeInMillis());
        return date;
      }
    }
    
    Calendar calTime = toTimeCalendar(oTime, null);
    if(calTime == null) return date;
    
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(date.getTime());
    calendar.set(Calendar.HOUR_OF_DAY, calTime.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.MINUTE,      calTime.get(Calendar.MINUTE));
    calendar.set(Calendar.SECOND,      calTime.get(Calendar.SECOND));
    calendar.set(Calendar.MILLISECOND, calTime.get(Calendar.MILLISECOND));
    
    date.setTime(calendar.getTimeInMillis());
    return date;
  }
  
  public static
  java.sql.Date setTime(java.sql.Date date, Object oTime)
  {
    if(date == null) return date;
    
    if(oTime instanceof Number) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(date.getTime());
      int iTime = ((Number) oTime).intValue();
      if(iTime == 0) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE,      0);
        calendar.set(Calendar.SECOND,      0);
        calendar.set(Calendar.MILLISECOND, 0);
        date.setTime(calendar.getTimeInMillis());
        return date;
      }
      else
      if(iTime == 2359 || iTime == 235959 || iTime == 2400 || iTime == 240000) {
        calendar.set(Calendar.HOUR_OF_DAY,  23);
        calendar.set(Calendar.MINUTE,       59);
        calendar.set(Calendar.SECOND,       59);
        calendar.set(Calendar.MILLISECOND, 999);
        date.setTime(calendar.getTimeInMillis());
        return date;
      }
    }
    
    Calendar calTime = toTimeCalendar(oTime, null);
    if(calTime == null) return date;
    
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(date.getTime());
    calendar.set(Calendar.HOUR_OF_DAY, calTime.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.MINUTE,      calTime.get(Calendar.MINUTE));
    calendar.set(Calendar.SECOND,      calTime.get(Calendar.SECOND));
    calendar.set(Calendar.MILLISECOND, calTime.get(Calendar.MILLISECOND));
    
    date.setTime(calendar.getTimeInMillis());
    return date;
  }
  
  public static
  java.util.Calendar setTime(java.util.Calendar calendar, Object oTime)
  {
    if(calendar == null) return calendar;
    
    if(oTime instanceof Number) {
      int iTime = ((Number) oTime).intValue();
      if(iTime == 0) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE,      0);
        calendar.set(Calendar.SECOND,      0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
      }
      else
      if(iTime == 2359 || iTime == 235959 || iTime == 2400 || iTime == 240000) {
        calendar.set(Calendar.HOUR_OF_DAY,  23);
        calendar.set(Calendar.MINUTE,       59);
        calendar.set(Calendar.SECOND,       59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar;
      }
    }
    
    Calendar calTime = toTimeCalendar(oTime, null);
    if(calTime == null) return calendar;
    
    calendar.set(Calendar.HOUR_OF_DAY, calTime.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.MINUTE,      calTime.get(Calendar.MINUTE));
    calendar.set(Calendar.SECOND,      calTime.get(Calendar.SECOND));
    calendar.set(Calendar.MILLISECOND, calTime.get(Calendar.MILLISECOND));
    
    return calendar;
  }
  
  public static
  java.sql.Date toSQLDate(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toSQLDate(oDefault, null);
    }
    if(object instanceof java.sql.Date) {
      return (java.sql.Date) object;
    }
    if(object instanceof java.util.Date) {
      return new java.sql.Date(((java.util.Date) object).getTime());
    }
    if(object instanceof java.util.Calendar) {
      return new java.sql.Date(((java.util.Calendar) object).getTimeInMillis());
    }
    if(object instanceof Long) {
      return new java.sql.Date(((Long) object).longValue());
    }
    if(object instanceof Number) {
      int iDate = ((Number) object).intValue();
      if(iDate < 10000) return toSQLDate(oDefault, null);
      int iYear  = iDate / 10000;
      int iMonth = (iDate % 10000) / 100;
      int iDay   = (iDate % 10000) % 100;
      return new java.sql.Date(new GregorianCalendar(iYear, iMonth-1, iDay).getTimeInMillis());
    }
    if(object instanceof Collection) {
      return toSQLDate(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toSQLDate(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toSQLDate(oDefault, null);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toSQLDate(oDefault, null);
    return new java.sql.Date(cal.getTimeInMillis());
  }
  
  public static
  java.sql.Time toSQLTime(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toSQLTime(oDefault, null);
    }
    if(object instanceof java.sql.Time) {
      return (java.sql.Time) object;
    }
    if(object instanceof java.util.Date) {
      return new java.sql.Time(((java.util.Date) object).getTime());
    }
    if(object instanceof java.util.Calendar) {
      return new java.sql.Time(((java.util.Calendar) object).getTimeInMillis());
    }
    if(object instanceof Long) {
      return new java.sql.Time(((Long) object).longValue());
    }
    if(object instanceof Number) {
      Calendar cal = intToCalendarTime(((Number) object).intValue());
      if(cal == null) return toSQLTime(oDefault, null);
      return new java.sql.Time(cal.getTimeInMillis());
    }
    if(object instanceof Collection) {
      return toSQLTime(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toSQLTime(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toSQLTime(oDefault, null);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toSQLTime(oDefault, null);
    return new java.sql.Time(cal.getTimeInMillis());
  }
  
  public static
  java.sql.Timestamp toSQLTimestamp(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toSQLTimestamp(oDefault, null);
    }
    if(object instanceof java.sql.Timestamp) {
      return (java.sql.Timestamp) object;
    }
    if(object instanceof java.util.Date) {
      return new java.sql.Timestamp(((java.util.Date) object).getTime());
    }
    if(object instanceof java.util.Calendar) {
      return new java.sql.Timestamp(((java.util.Calendar) object).getTimeInMillis());
    }
    if(object instanceof Long) {
      return new java.sql.Timestamp(((Long) object).longValue());
    }
    if(object instanceof Number) {
      int iDate = ((Number) object).intValue();
      if(iDate < 10000) return toSQLTimestamp(oDefault, null);
      int iYear  = iDate / 10000;
      int iMonth = (iDate % 10000) / 100;
      int iDay   = (iDate % 10000) % 100;
      return new java.sql.Timestamp(new GregorianCalendar(iYear, iMonth-1, iDay).getTimeInMillis());
    }
    if(object instanceof Collection) {
      return toSQLTimestamp(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toSQLTimestamp(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toSQLTimestamp(oDefault, null);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toSQLTimestamp(oDefault, null);
    return new java.sql.Timestamp(cal.getTimeInMillis());
  }
  
  public static
  java.util.Calendar toCalendar(int iValue, int iDefault)
  {
    if(iValue < 10000) {
      if(iDefault < 10000) return null;
      return toCalendar(iDefault, 0);
    }
    int iYear  = iValue / 10000;
    int iMonth = (iValue % 10000) / 100;
    int iDay   = (iValue % 10000) % 100;
    return new GregorianCalendar(iYear, iMonth-1, iDay);
  }
  
  public static
  java.util.Calendar toCalendar(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toCalendar(oDefault, null);
    }
    if(object instanceof java.util.Date) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(((java.util.Date) object).getTime());
      return calendar;
    }
    if(object instanceof java.util.Calendar) {
      return (java.util.Calendar) object;
    }
    if(object instanceof Long) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(((Long) object).longValue());
      return calendar;
    }
    if(object instanceof Number) {
      int iDate = ((Number) object).intValue();
      if(iDate < 10000) return toCalendar(oDefault, null);
      int iYear  = iDate / 10000;
      int iMonth = (iDate % 10000) / 100;
      int iDay   = (iDate % 10000) % 100;
      return new GregorianCalendar(iYear, iMonth-1, iDay);
    }
    if(object instanceof Collection) {
      return toCalendar(getFirst(object), oDefault);
    }
    if(object.getClass().isArray()) {
      return toCalendar(getFirst(object), oDefault);
    }
    if(object instanceof Map) {
      return toCalendar(((Map) object).get("value"), oDefault);
    }
    if(object instanceof Map.Entry) {
      return toCalendar(((Map.Entry) object).getValue(), oDefault);
    }
    Calendar cal = stringToCalendar(object.toString());
    if(cal == null) return toCalendar(oDefault, null);
    return cal;
  }
  
  // 1.8+
  public static
  java.time.LocalDate toLocalDate(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toLocalDate(oDefault, null);
    }
    if(object instanceof java.time.LocalDate) {
      return (java.time.LocalDate) object;
    }
    Calendar cal = toCalendar(object, oDefault);
    if(cal == null) return null;
    return LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
  }
  
  // 1.8+
  public static
  java.time.LocalDateTime toLocalDateTime(Object object, Object oDefault)
  {
    if(object == null) {
      if(oDefault == null) return null;
      return toLocalDateTime(oDefault, null);
    }
    if(object instanceof java.time.LocalDateTime) {
      return (java.time.LocalDateTime) object;
    }
    if(object instanceof java.time.LocalDate) {
      return ((java.time.LocalDate) object).atStartOfDay();
    }
    Calendar cal = toCalendar(object, oDefault);
    if(cal == null) return null;
    return LocalDateTime.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), 
        cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND), 
        cal.get(Calendar.MILLISECOND) * 1000 * 1000);
  }
  
  public static
  String toISO8601Timestamp(Object dateTime)
  {
    return toISO8601Timestamp(dateTime, false);
  }
  
  public static
  String toISO8601Timestamp(Object dateTime, boolean milliseconds)
  {
    Calendar cal = toTimeCalendar(dateTime, null);
    if(cal == null) return null;
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    int iHour  = cal.get(Calendar.HOUR_OF_DAY);
    int iMin   = cal.get(Calendar.MINUTE);
    int iSec   = cal.get(Calendar.SECOND);
    int iMill  = cal.get(Calendar.MILLISECOND);
    String sYear   = String.valueOf(iYear);
    String sMonth  = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay    = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    String sHour   = iHour  < 10 ? "0" + iHour  : String.valueOf(iHour);
    String sMin    = iMin   < 10 ? "0" + iMin   : String.valueOf(iMin);
    String sSec    = iSec   < 10 ? "0" + iSec   : String.valueOf(iSec);
    if(iYear < 10) {
      sYear = "000" + sYear;
    }
    else
    if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else
    if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    if(milliseconds) {
      String sMill = String.valueOf(iMill);
      if(iMill < 10) {
        sMill = "00" + sMill;
      }
      else
      if(iMill < 100) {
        sMill = "0" + sMill;
      }
      return sYear + "-" + sMonth + "-" + sDay + "T" + sHour + ":" + sMin + ":" + sSec + "." + sMill;
    }
    return sYear + "-" + sMonth + "-" + sDay + "T" + sHour + ":" + sMin + ":" + sSec;
  }
  
  public static
  String toISO8601Timestamp_Z(Object dateTime)
  {
    Calendar c = toTimeCalendar(dateTime, null);
    if(c == null) return null;
    
    Calendar cal = Calendar.getInstance(JSONObject.timeZone);
    cal.set(Calendar.YEAR,        c.get(Calendar.YEAR));
    cal.set(Calendar.MONTH,       c.get(Calendar.MONTH));
    cal.set(Calendar.DATE,        c.get(Calendar.DATE));
    cal.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY));
    cal.set(Calendar.MINUTE,      c.get(Calendar.MINUTE));
    cal.set(Calendar.SECOND,      c.get(Calendar.SECOND));
    
    int iZoneOffset = cal.get(Calendar.ZONE_OFFSET);
    cal.add(Calendar.MILLISECOND, -iZoneOffset);
    int iDST_Offset = cal.get(Calendar.DST_OFFSET);
    cal.add(Calendar.MILLISECOND, -iDST_Offset);
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    int iHour  = cal.get(Calendar.HOUR_OF_DAY);
    int iMin   = cal.get(Calendar.MINUTE);
    int iSec   = cal.get(Calendar.SECOND);
    String sYear   = String.valueOf(iYear);
    String sMonth  = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay    = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    String sHour   = iHour  < 10 ? "0" + iHour  : String.valueOf(iHour);
    String sMin    = iMin   < 10 ? "0" + iMin   : String.valueOf(iMin);
    String sSec    = iSec   < 10 ? "0" + iSec   : String.valueOf(iSec);
    if(iYear < 10) {
      sYear = "000" + sYear;
    }
    else
    if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else
    if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    return sYear + "-" + sMonth + "-" + sDay + "T" + sHour + ":" + sMin + ":" + sSec + "Z";
  }
  
  public static
  String toISO8601Timestamp_Offset(Object dateTime)
  {
    return toISO8601Timestamp_Offset(dateTime, "");
  }
  
  public static
  String toISO8601Timestamp_Offset(Object dateTime, String sepOffset)
  {
    Calendar c = toTimeCalendar(dateTime, null);
    if(c == null) return null;
    if(sepOffset == null) sepOffset = "";
    
    Calendar cal = Calendar.getInstance(JSONObject.timeZone);
    cal.set(Calendar.YEAR,        c.get(Calendar.YEAR));
    cal.set(Calendar.MONTH,       c.get(Calendar.MONTH));
    cal.set(Calendar.DATE,        c.get(Calendar.DATE));
    cal.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY));
    cal.set(Calendar.MINUTE,      c.get(Calendar.MINUTE));
    cal.set(Calendar.SECOND,      c.get(Calendar.SECOND));
    
    int iZoneOffset = cal.get(Calendar.ZONE_OFFSET);
    int iDST_Offset = cal.get(Calendar.DST_OFFSET);
    int iTot_Offset = iZoneOffset + iDST_Offset;
    String sOSSign  = "+";
    if(iTot_Offset < 0) {
       iTot_Offset = iTot_Offset * -1;
      sOSSign = "-";
    }
    int iOffset_HH = iTot_Offset / 3600000;
    int iOffset_MM = iTot_Offset % 3600000;
    String sOSHH   = iOffset_HH < 10 ? "0" + iOffset_HH : String.valueOf(iOffset_HH);
    String sOSMM   = iOffset_MM < 10 ? "0" + iOffset_MM : String.valueOf(iOffset_MM);
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    int iHour  = cal.get(Calendar.HOUR_OF_DAY);
    int iMin   = cal.get(Calendar.MINUTE);
    int iSec   = cal.get(Calendar.SECOND);
    String sYear   = String.valueOf(iYear);
    String sMonth  = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay    = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    String sHour   = iHour  < 10 ? "0" + iHour  : String.valueOf(iHour);
    String sMin    = iMin   < 10 ? "0" + iMin   : String.valueOf(iMin);
    String sSec    = iSec   < 10 ? "0" + iSec   : String.valueOf(iSec);
    if(iYear < 10) {
      sYear = "000" + sYear;
    }
    else
    if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else
    if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    return sYear + "-" + sMonth + "-" + sDay + "T" + sHour + ":" + sMin + ":" + sSec + sOSSign + sOSHH + sepOffset + sOSMM;
  }
  
  public static
  String toISO8601Date(Object dateTime)
  {
    Calendar cal = toCalendar(dateTime, null);
    if(cal == null) return null;
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    String sYear   = String.valueOf(iYear);
    String sMonth  = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay    = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    if(iYear < 10) {
      sYear = "000" + sYear;
    }
    else
    if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else
    if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    return sYear + "-" + sMonth + "-" + sDay;
  }
  
  public static
  int toIntDate(Object object, int iDefault)
  {
    Date date = toDate(object, null);
    if(date == null) return iDefault;
    return longDateToInt(date.getTime());
  }
  
  public static
  int toIntTime(Object object, int iDefault)
  {
    java.util.Date time = toTime(object, null);
    if(time == null) return iDefault;
    return timeToInt(time);
  }
  
  public static
  String toStringTime(Object object, String sDefault)
  {
    java.util.Date time = toTime(object, null);
    if(time == null) return sDefault;
    return timeToString(time);
  }
  
  public static
  Vector toVector(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new Vector(0) : null;
    if(object instanceof Vector) {
      return (Vector) object;
    }
    if(object instanceof Collection) {
      Collection collection = (Collection) object;
      Vector vector = new Vector(collection.size());
      Iterator iterator = collection.iterator();
      while(iterator.hasNext()) {
        vector.add(iterator.next());
      }
      return vector;
    }
    if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      Vector vector = new Vector(length);
      for(int i = 0; i < length; i++) {
        vector.add(Array.get(object, i));
      }
      return vector;
    }
    if(object instanceof String) {
      return stringToVector((String) object);
    }
    Vector vector = new Vector(1);
    vector.add(object);
    return vector;
  }
  
  public static
  Vector toVector(Object object, Object oDefault)
  {
    Vector vector = toVector(object, false);
    if(vector == null) {
      if(oDefault == null) return null;
      return toVector(oDefault, false);
    }
    return vector;
  }
  
  public static
  Hashtable toHashtable(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new Hashtable(0) : null;
    if(object instanceof Hashtable) {
      return (Hashtable) object;
    }
    if(object instanceof Map) {
      Map map = (Map) object;
      Hashtable hashtable = new Hashtable(map.size());
      Iterator iterator = map.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        Object oKey = entry.getKey();
        Object oVal = entry.getValue();
        if(oVal != null) hashtable.put(oKey, oVal);
      }
      return hashtable;
    }
    if(object instanceof String) {
      return stringToHashtable((String) object);
    }
    if(object instanceof Collection) {
      return toHashtable(getFirst(object), notNull);
    }
    if(object.getClass().isArray()) {
      return toHashtable(getFirst(object), notNull);
    }
    return toHashtable(beanToMap(object), notNull);
  }
  
  public static
  Hashtable toHashtable(Object object, Object oDefault)
  {
    Hashtable hashtable = toHashtable(object, false);
    if(hashtable == null) {
      if(oDefault == null) return null;
      return toHashtable(oDefault, false);
    }
    return hashtable;
  }
  
  public static
  List toList(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new ArrayList(0) : null;
    if(object instanceof List) {
      return (List) object;
    }
    if(object instanceof Collection) {
      Collection collection = (Collection) object;
      ArrayList arrayList = new ArrayList(collection.size());
      Iterator iterator = collection.iterator();
      while(iterator.hasNext()) {
        arrayList.add(iterator.next());
      }
      return arrayList;
    }
    if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      ArrayList arrayList = new ArrayList(length);
      for(int i = 0; i < length; i++) {
        arrayList.add(Array.get(object, i));
      }
      return arrayList;
    }
    if(object instanceof String) {
      return stringToList((String) object);
    }
    ArrayList arrayList = new ArrayList(1);
    arrayList.add(object);
    return arrayList;
  }
  
  public static
  List toList(Object object, Object oDefault)
  {
    List list = toList(object, false);
    if(list == null) {
      if(oDefault == null) return null;
      return toList(oDefault, false);
    }
    return list;
  }
  
  // 1.5+
  public static <T> List<T> toList(Object object, Class<T> itemsClass, Object oDefault) {
    List list = toList(object, false);
    if(list != null) {
      String g1 = null;
      if(itemsClass == null) {
        return list;
      }
      else {
        g1 = itemsClass.getCanonicalName();
      }
      if(list.size() > 0) {
        Object item0 = list.get(0);
        if(item0 != null && itemsClass.isInstance(item0)) {
          return list;
        }
      }
      List arrayList = new ArrayList(list.size());
      for(int i = 0; i < list.size(); i++) {
        arrayList.add(toObject(list.get(i), g1, null));
      }
      return arrayList;
    }
    list = toList(oDefault, false);
    if(list != null) {
      String g1 = null;
      if(itemsClass == null) {
        return list;
      }
      else {
        g1 = itemsClass.getCanonicalName();
      }
      if(list.size() > 0) {
        Object item0 = list.get(0);
        if(item0 != null && itemsClass.isInstance(item0)) {
          return list;
        }
      }
      List arrayList = new ArrayList(list.size());
      for(int i = 0; i < list.size(); i++) {
        arrayList.add(toObject(list.get(i), g1, null));
      }
      return arrayList;
    }
    return null;
  }
  
  public static
  Map toMap(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new HashMap(0) : null;
    if(object instanceof Map) {
      return (Map) object;
    }
    if(object instanceof String) {
      return stringToMap((String) object);
    }
    if(object instanceof Collection) {
      return toMap(getFirst(object), notNull);
    }
    if(object.getClass().isArray()) {
      return toMap(getFirst(object), notNull);
    }
    return beanToMap(object);
  }
  
  public static
  Map toMap(Object object, Object oDefault)
  {
    Map map = toMap(object, false);
    if(map == null) {
      if(oDefault == null) return null;
      return toMap(oDefault, false);
    }
    return map;
  }
  
  // 1.5+
  public static
  Map<String,Object> toMapObject(Object object)
  {
    Map map = null;
    if(object instanceof Map) {
      map = (Map) object;
    }
    else {
      map = toMap(object, true);
    }
    return map;
  }
  
  // 1.5+
  public static
  Map<String,Object> toMapObject(Map<?,?> map)
  {
    return (Map<String,Object>) map;
  }
  
  // 1.5+
  public static
  Map<String,Object> toMapObject(Object object, boolean replaceNonStringKeys)
  {
    Map map = null;
    if(object instanceof Map) {
      map = (Map) object;
    }
    else {
      map = toMap(object, true);
    }
    if(!replaceNonStringKeys) {
      return map;
    }
    Set setOfNonStringKeys = null;
    Iterator iterator = map.entrySet().iterator();
    while(iterator.hasNext()) {
      Map.Entry entry = (Map.Entry) iterator.next();
      Object oKey = entry.getKey();
      if(!(oKey instanceof String)) {
        if(setOfNonStringKeys == null) setOfNonStringKeys = new HashSet();
        setOfNonStringKeys.add(oKey);
      }
    }
    if(setOfNonStringKeys != null) {
      Iterator itKeys = setOfNonStringKeys.iterator();
      while(itKeys.hasNext()) {
        Object key  = itKeys.next();
        String sKey = null;
        if(key instanceof java.sql.Timestamp) {
          sKey = "t" + formatDateTime(key, "#", true);
        }
        else
        if(key instanceof java.util.Date) {
          sKey = "d" + formatDate(key, "#");
        }
        else
        if(key instanceof java.util.Calendar) {
          sKey = "t" + formatDateTime(key, "#", true);
        }
        else
        if(key instanceof Number) {
          sKey = "n" + key.toString().replace('-', '_').replace('.', '_');
        }
        else {
          sKey = "o" + String.valueOf(key.hashCode()).replace('-', '_');
        }
        map.put(sKey, map.remove(key));
      }
    }
    return map;
  }
  
  // 1.5+
  public static
  List<Map<String,Object>> toListOfMapObject(Object object) 
  {
    List list = toList(object, true);
    if(list.size() > 0) {
      Object item0 = list.get(0);
      if(item0 instanceof Map) {
        return list;
      }
      else {
        for(int i = 0; i < list.size(); i++) {
          list.set(i, toMapObject(list.get(i)));
        }
        return list;
      }
    }
    return list;
  }
  
  // 1.5+
  public static
  List<Map<String,Object>> toListOfMapObject(Object object, boolean replaceNonStringKeys)
  {
    List list = toList(object, true);
    if(list.size() > 0) {
      Object item0 = list.get(0);
      if(item0 instanceof Map) {
        return list;
      }
      else {
        for(int i = 0; i < list.size(); i++) {
          list.set(i, toMapObject(list.get(i), replaceNonStringKeys));
        }
        return list;
      }
    }
    return list;
  }
  
  // 1.5+
  public static
  List<List<Object>> toListOfListObject(Object object)
  {
    List list = toList(object, true);
    if(list.size() > 0) {
      Object item0 = list.get(0);
      if(item0 instanceof List) {
        return list;
      }
      else {
        for(int i = 0; i < list.size(); i++) {
          list.set(i, toList(list.get(i), true));
        }
        return list;
      }
    }
    return list;
  }
  
  // 1.5+
  public static
  List<String> toListOfString(Object object)
  {
    List list = toList(object, true);
    if(list.size() > 0) {
      Object item0 = list.get(0);
      if(item0 instanceof String) {
        return list;
      }
      else {
        for(int i = 0; i < list.size(); i++) {
          list.set(i, toString(list.get(i), ""));
        }
        return list;
      }
    }
    return list;
  }
  
  // 1.5+
  public static
  List<Number> toListOfNumber(Object object)
  {
    List list = toList(object, true);
    if(list.size() > 0) {
      Object item0 = list.get(0);
      if(item0 instanceof Number) {
        return list;
      }
      else {
        for(int i = 0; i < list.size(); i++) {
          Number number = toNumber(list.get(i), null);
          if(number == null) number = new Integer(0);
          list.set(i, number);
        }
        return list;
      }
    }
    return list;
  }
  
  public static
  List collectionToNormalizedList(Collection collection)
  {
    if(collection == null) {
      return new ArrayList(0);
    }
    List listResult = new ArrayList(collection.size());
    Iterator iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object item = iterator.next();
      if(item == null) {
        listResult.add(item);
      }
      else
      if(item instanceof Collection) {
        listResult.add(collectionToNormalizedList((Collection) item));
      }
      else {
        Class klass = item.getClass();
        if(klass.isArray()) {
          listResult.add(arrayToNormalizedList(item));
        }
        else {
          String className = klass.getName();
          if(!className.startsWith("java.")) {
            listResult.add(beanToMap(item));
          }
          else {
            listResult.add(item);
          }
        }
      }
    }
    return listResult;
  }
  
  public static 
  List arrayToNormalizedList(Object array) 
  {
    if(array == null) {
      return new ArrayList(0);
    }
    if(!array.getClass().isArray()) {
      return new ArrayList(0);
    }
    int length = Array.getLength(array);
    if(length == 0) {
      return new ArrayList(0);
    }
    List listResult = new ArrayList(length);
    for(int i = 0; i < length; i++) {
      Object item = Array.get(array, i);
      if(item == null) {
        listResult.add(item);
      }
      else
      if(item instanceof Collection) {
        listResult.add(collectionToNormalizedList((Collection) item));
      }
      else {
        Class klass = item.getClass();
        if(klass.isArray()) {
          listResult.add(arrayToNormalizedList(item));
        }
        else {
          String className = klass.getName();
          if(!className.startsWith("java.")) {
            listResult.add(beanToMap(item));
          }
          else {
            listResult.add(item);
          }
        }
      }
    }
    return listResult;
  }
  
  // 1.5+
  public static 
  Map<String,Object> beanToMap(Object bean) 
  {
    Map<String,Object> mapResult = new HashMap<String,Object>();
    
    if(bean == null) return mapResult;
    
    Class klass = bean.getClass();
    String className = klass.getName();
    if(className .startsWith("java.")) {
      mapResult.put("value", bean);
      return mapResult;
    }
    
    // If klass is a System class then set includeSuperClass to false.
    boolean includeSuperClass = klass.getClassLoader() != null;
    Method[] methods  = includeSuperClass ? klass.getMethods() : klass.getDeclaredMethods();
    String methodName = null;
    for(int i = 0; i < methods.length; i++) {
      try {
        Method method = methods[i];
        if(Modifier.isPublic(method.getModifiers())) {
          methodName = method.getName();
          String key = "";
          if(methodName.startsWith("get")) {
            if("getClass".equals(methodName) || "getDeclaringClass".equals(methodName)) {
              key = "";
            } 
            else {
              key = methodName.substring(3);
            }
          } 
          else if(methodName.startsWith("is")) {
            key = methodName.substring(2);
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
            Object result = method.invoke(bean,(Object[]) null);
            if(result instanceof Collection) {
              mapResult.put(key, collectionToNormalizedList((Collection) result));
            }
            else if(result != null) {
              Class klassResult = result.getClass();
              // 1.5+
              if(klassResult.isEnum()) {
                mapResult.put(key, result.toString());
              }
              else if(klassResult.isArray()) {
                mapResult.put(key, arrayToNormalizedList(result));
              }
              else {
                String classNameResult = klassResult.getName();
                if(!classNameResult.startsWith("java.")) {
                  mapResult.put(key, beanToMap(result));
                }
                else {
                  mapResult.put(key, result);
                }
              }
            }
          }
        }
      } 
      catch(Exception ex) {
        System.err.println("FUtil.beanToMap(bean=" + bean.getClass() + ",methodName=" + methodName + "): " + ex);
      }
    }
    return mapResult;
  }
  
  // 1.5+
  public static
  Object populateBean(String beanClassName, Map mapValues) 
  {
    if(beanClassName == null || beanClassName.length() == 0) return null;
    Object bean = null;
    try {
      Class beanClass = Class.forName(beanClassName);
      bean = beanClass.newInstance();
    }
    catch(Exception ex) {
      System.err.println("FUtil.populateBean(beanClassName=" + beanClassName + "): " + ex);
    }
    return populateBean(bean, mapValues);
  }
  
  // 1.5+
  public static
  Object populateBean(String beanClassName, Map mapValues, ClassLoader classLoader) 
  {
    if(beanClassName == null || beanClassName.length() == 0) return null;
    Object bean = null;
    try {
      Class beanClass = Class.forName(beanClassName);
      bean = beanClass.newInstance();
    }
    catch(Exception ex) {
      System.err.println("FUtil.populateBean(beanClassName=" + beanClassName + "): " + ex);
    }
    return populateBean(bean, mapValues, classLoader);
  }
  
  // 1.5+
  public static <T> T populateBean(Class<T> beanClass, Map mapValues) {
    if(beanClass == null) return null;
    T bean = null;
    try { 
      bean = beanClass.newInstance(); 
    } 
    catch(Exception ex) {
      System.err.println("FUtil.populateBean(beanClass=" + beanClass + "): " + ex);
    }
    return populateBean(bean, mapValues);
  }
  
  // 1.5+
  public static <T> T populateBean(Class<T> beanClass, Map mapValues, ClassLoader classLoader) {
    if(beanClass == null) return null;
    T bean = null;
    try { 
      bean = beanClass.newInstance(); 
    } 
    catch(Exception ex) {
      System.err.println("FUtil.populateBean(beanClass=" + beanClass + ",classLoader=" + classLoader + "): " + ex);
    }
    return populateBean(bean, mapValues, classLoader);
  }
  
  // 1.5+
  public static <T> T populateBean(T bean, Map mapValues) {
    return populateBean(bean, mapValues, null);
  }
  
  // 1.5+
  public static <T> T populateBean(T bean, Map mapValues, ClassLoader classLoader) {
    if(bean == null || mapValues == null || mapValues.isEmpty()) return bean;
    
    Class klass = bean.getClass();
    String className = klass.getName();
    if(className .startsWith("java.")) return bean;
    
    List params = new ArrayList(1);
    params.add(null);
    
    // If klass is a System class then set includeSuperClass to false.
    boolean includeSuperClass = klass.getClassLoader() != null;
    Method[] methods  = includeSuperClass ? klass.getMethods() : klass.getDeclaredMethods();
    String methodName = null;
    for(int i = 0; i < methods.length; i++) {
      try {
        Method method = methods[i];
        if(Modifier.isPublic(method.getModifiers())) {
          methodName = method.getName();
          String key = "";
          if(methodName.startsWith("set")) {
            key = methodName.substring(3);
          }
          if(key.length() > 0 && key.charAt(0) < 97 && method.getParameterTypes().length == 1) {
            if(key.length() == 1) {
              key = key.toLowerCase();
            } 
            else if(!Character.isUpperCase(key.charAt(1))) {
              key = key.substring(0, 1).toLowerCase() + key.substring(1);
            }
            String genericParameterType  = null;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            if(genericParameterTypes != null && genericParameterTypes.length > 0) {
              for(int t = 0; t < genericParameterTypes.length; t++) {
                Type type = genericParameterTypes[t];
                if(type instanceof ParameterizedType) {
                  genericParameterType = type.toString();
                }
              }
            }
            if(genericParameterType != null) {
              Object[] parameters = new Object[1];
              parameters[0] = toObject(mapValues.get(key), genericParameterType, classLoader);
              method.invoke(bean, parameters);
            }
            else {
              params.set(0, mapValues.get(key));
              Object[] parameters = FReflection.getParametersExt(method, params);
              if(parameters == null) continue;
              method.invoke(bean, parameters);
            }
          }
        }
      } 
      catch(Exception ex) {
        System.err.println("FUtil.populateBean(methodName=" + methodName + "): " + ex);
      }
    }
    return bean;
  }
  
  // 1.5+
  public static <T> List<T> toListOfBean(Object object, Class<T> beanClass) {
    return toListOfBean(object, beanClass, null);
  }
  
  // 1.5+
  public static <T> List<T> toListOfBean(Object object, Class<T> beanClass, ClassLoader classLoader) {
    if(object == null) return null;
    List<T> listResult = null;
    if(object instanceof Collection) {
      listResult = new ArrayList<T>(((Collection) object).size());
      Iterator iterator = ((Collection) object).iterator();
      while(iterator.hasNext()) {
        Object item = iterator.next();
        if(item == null) {
          listResult.add(null);
        }
        else
        if(item instanceof Map) {
          listResult.add(populateBean(beanClass, (Map) item, classLoader));
        }
        else
        if(beanClass.isAssignableFrom(item.getClass())) {
          listResult.add((T) item);
        }
      }
    }
    else
    if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      listResult = new ArrayList<T>(length);
      for(int i = 0; i < length; i++) {
        Object item = Array.get(object, i);
        if(item == null) {
          listResult.add(null);
        }
        else
        if(item instanceof Map) {
          listResult.add(populateBean(beanClass, (Map) item, classLoader));
        }
        else
        if(beanClass.isAssignableFrom(item.getClass())) {
          listResult.add((T) item);
        }
      }
    }
    else
    if(object instanceof Map) {
      listResult = new ArrayList<T>(1);
      listResult.add(populateBean(beanClass, (Map) object, classLoader));
    }
    if(listResult == null) {
      return new ArrayList<T>(0); 
    }
    return listResult;
  }
  
  public static
  Set toSet(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new HashSet() : null;
    if(object instanceof Set) {
      return (Set) object;
    }
    List list = toList(object, notNull);
    if(list == null) return notNull ? new HashSet() : null;
    HashSet hashSet = new HashSet(list.size());
    Iterator iterator = list.iterator();
    while(iterator.hasNext()) {
      hashSet.add(iterator.next());
    }
    return hashSet;
  }
  
  public static
  Set toSet(Object object, Object oDefault)
  {
    Set set = toSet(object, false);
    if(set == null) {
      if(oDefault == null) return null;
      return toSet(oDefault, false);
    }
    return set;
  }
  
  public static
  byte[] toArrayOfByte(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new byte[0] : null;
    if(object instanceof byte[]) {
      return (byte[]) object;
    }
    if(object instanceof String) {
      return ((String) object).getBytes();
    }
    if(object instanceof CharSequence) {
      return ((CharSequence) object).toString().getBytes();
    }
    Method mGetData  = null;
    Method[] methods = object.getClass().getMethods();
    for(int i = 0; i < methods.length; i++) {
      Method method = methods[i];
      if(method.getName().equals("getData")) {
        mGetData = method;
      }
    }
    if(mGetData != null) {
      try {
        Object result = mGetData.invoke(object, new Object[0]);
        if(result instanceof byte[]) {
          return (byte[]) result;
        }
        if(result instanceof String) {
          return ((String) result).getBytes();
        }
        if(result instanceof CharSequence) {
          return ((CharSequence) result).toString().getBytes();
        }
      }
      catch(Throwable th) {
      }
    }
    byte[] result = Arrays.toArrayOfByte(toList(object, notNull));
    if(result == null) return notNull ? new byte[0] : null;
    return result;
  }
  
  public static
  int[] toArrayOfInt(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new int[0] : null;
    if(object instanceof int[]) return (int[]) object;
    int[] result = Arrays.toArrayOfInt(toList(object, notNull), false);
    if(result == null) return notNull ? new int[0] : null;
    return result;
  }
  
  public static
  double[] toArrayOfDouble(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new double[0] : null;
    if(object instanceof double[]) return (double[]) object;
    double[] result = Arrays.toArrayOfDouble(toList(object, notNull), false);
    if(result == null) return notNull ? new double[0] : null;
    return result;
  }
  
  public static
  String[] toArrayOfString(Object object, boolean notNull)
  {
    if(object == null) return notNull ? new String[0] : null;
    if(object instanceof String[]) return (String[]) object;
    String[] result = Arrays.toArrayOfString(toList(object, notNull));
    if(result == null) return notNull ? new String[0] : null;
    return result;
  }
  
  public static
  Object getFirst(Object object)
  {
    if(object == null) return null;
    if(object instanceof Collection) {
      Iterator iterator = ((Collection) object).iterator();
      if(iterator.hasNext()) return iterator.next();
      return null;
    }
    else
    if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      if(length == 0) return null;
      return Array.get(object, 0);
    }
    else
    if(object instanceof Map) {
      Iterator iterator = ((Map) object).values().iterator();
      if(iterator.hasNext()) return iterator.next();
      return null;
    }
    else
    if(object instanceof Map.Entry) {
      return ((Map.Entry) object).getValue();
    }
    return object;
  }
  
  public static
  Object getLast(Object object)
  {
    if(object == null) return null;
    if(object instanceof List) {
      List list = (List) object;
      if(list.size() == 0) return null;
      return list.get(list.size()-1);
    }
    else
    if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      if(length == 0) return null;
      return Array.get(object, length-1);
    }
    else
    if(object instanceof Collection) {
      Iterator iterator = ((Collection) object).iterator();
      Object oLast = null;
      while(iterator.hasNext()) oLast = iterator.next();
      return oLast;
    }
    else
    if(object instanceof Map) {
      Iterator iterator = ((Map) object).values().iterator();
      Object oLast = null;
      while(iterator.hasNext()) oLast = iterator.next();
      return oLast;
    }
    else
    if(object instanceof Map.Entry) {
      return ((Map.Entry) object).getKey();
    }
    return object;
  }
  
  public static
  int size(Object object)
  {
    if(object == null) return 0;
    if(object instanceof Collection) {
      return ((Collection) object).size();
    }
    else
    if(object.getClass().isArray()) {
      return Array.getLength(object);
    }
    else
    if(object instanceof Map) {
      return ((Map) object).size();
    }
    else
    if(object instanceof Map.Entry) {
      return 2;
    }
    return 1;
  }
  
  public static
  Object getValueAt(Object object, int index)
  {
    if(object == null) return null;
    if(index < 0) return null;
    if(object instanceof List) {
      List list = (List) object;
      if(index >= list.size()) return null;
      Object oResult = list.get(index);
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else
    if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      if(index >= length) return null;
      Object oResult = Array.get(object, index);
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else
    if(object instanceof Collection) {
      Object oResult = null;
      int currIndex = -1;
      Iterator iterator = ((Collection) object).iterator();
      while(iterator.hasNext()) {
        Object item = iterator.next();
        if(++currIndex == index) {
          oResult = item;
          break;
        }
      }
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else
    if(object instanceof Map) {
      Object oResult = null;
      int currIndex = -1;
      Iterator iterator = ((Map) object).values().iterator();
      while(iterator.hasNext()) {
        Object item = iterator.next();
        if(++currIndex == index) {
          oResult = item;
          break;
        }
      }
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else
    if(object instanceof Map.Entry) {
      if(index == 0) return ((Map.Entry) object).getValue();
      if(index == 1) return ((Map.Entry) object).getKey();
      return null;
    }
    return object;
  }
  
  public static
  Object getValueAt(Object object, int index, Object oDefault)
  {
    Object result = getValueAt(object, index);
    if(result == null) return oDefault;
    return result;
  }
  
  public static
  Object getValue(Object object, Object key)
  {
    if(object == null) return null;
    if(object instanceof Map) {
      if(key == null) return object;
      Object oResult = ((Map) object).get(key);
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else if(object instanceof Collection) {
      Object oResult = null;
      Collection collection = (Collection) object;
      Iterator iterator = collection.iterator();
      if(iterator.hasNext()) oResult = iterator.next();
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else if(object.getClass().isArray()) {
      int length = Array.getLength(object);
      if(length == 0) return null;
      Object oResult = Array.get(object, 0);
      if(oResult instanceof Map.Entry) return ((Map.Entry) oResult).getValue();
      return oResult;
    }
    else if(object instanceof Map.Entry) {
      return ((Map.Entry) object).getValue();
    }
    return object;
  }
  
  public static
  Object getValue(Object object, Object key, Object oDefault)
  {
    Object result = getValue(object, key);
    if(result == null) return oDefault;
    return result;
  }
  
  public static
  int longDateToInt(long lDate)
  {
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(lDate);
    return cal.get(Calendar.YEAR)*10000 +(cal.get(Calendar.MONTH)+1)*100 + cal.get(Calendar.DAY_OF_MONTH);
  }
  
  public static
  int timeToInt(java.util.Date time)
  {
    if(time == null) return 0;
    Calendar cal = Calendar.getInstance();
    cal.setTime(time);
    return cal.get(Calendar.HOUR_OF_DAY)*100 + cal.get(Calendar.MINUTE);
  }
  
  public static
  String timeToString(java.util.Date time)
  {
    if(time == null) return null;
    Calendar cal = Calendar.getInstance();
    cal.setTime(time);
    int iHH = cal.get(Calendar.HOUR_OF_DAY);
    int iMM = cal.get(Calendar.MINUTE);
    String sHH = iHH < 10 ? "0" + iHH : String.valueOf(iHH);
    String sMM = iMM < 10 ? "0" + iMM : String.valueOf(iMM);
    return sHH + ":" + sMM;
  }
  
  public static
  String formatDate(Object date, Object locale)
  {
    Calendar cal = toCalendar(date, null);
    if(cal == null) return "";
    
    String sLocale = locale != null ? locale.toString() : "-";
    char c0 = sLocale != null && sLocale.length() > 0 ? sLocale.charAt(0) : '-';
    char cL = sLocale != null && sLocale.length() > 0 ? sLocale.charAt(sLocale.length()-1) : '/';
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    String sYear  = String.valueOf(iYear);
    String sMonth = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay   = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    if(iYear < 10) {
      sYear = "000" + sYear;
    }
    else
    if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else
    if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    if(c0 == '#') {
      return sYear + sMonth + sDay;
    }
    else
    if(c0 == '-' || c0 == 'j' || c0 == 'J') { // JAPAN
      return sYear + "-" + sMonth + "-" + sDay;
    }
    else
    if(c0 == 'e' || c0 == 'E' || c0 == 'u' || c0 == 'U' || c0 == '1') {
      if(cL == 'K') return sDay + "/" + sMonth + "/" + sYear; // UK
      return sMonth + "/" + sDay + "/" + sYear;
    }
    else
    if(c0 == '.' || c0 == 'g' || c0 == 'G') { // GERMAN
      return sDay + "." + sMonth + "." + sYear;
    }
    if(cL == '-') {
      return sDay + "-" + sMonth + "-" + sYear;
    }
    return sDay + "/" + sMonth + "/" + sYear;
  }
  
  public static
  String formatTime(Object time, boolean second, boolean millis)
  {
    Calendar cal = toTimeCalendar(time, null);
    if(cal == null) return "";
    
    int iHour = cal.get(Calendar.HOUR_OF_DAY);
    int iMin  = cal.get(Calendar.MINUTE);
    String sHour = iHour  < 10 ? "0" + iHour  : String.valueOf(iHour);
    String sMin  = iMin   < 10 ? "0" + iMin   : String.valueOf(iMin);
    if(millis) second = true;
    if(second) {
      int iSec = cal.get(Calendar.SECOND);
      String sSec = iSec < 10 ? "0" + iSec   : String.valueOf(iSec);
      if(millis) {
        int iMillis = cal.get(Calendar.MILLISECOND);
        String sMillis = String.valueOf(iMillis);
        if(iMillis < 10) {
          sMillis = "00" + sMillis;
        }
        else
        if(iMillis < 100) {
          sMillis = "0" + sMillis;
        }
        return sHour + ":" + sMin + ":" + sSec + "." + sMillis;
      }
      return sHour + ":" + sMin + ":" + sSec;
    }
    return sHour + ":" + sMin;
  }
  
  /**
   * Format an object in a datetime representation.
   *
   * @param dateTime Object
   * @param locale "!"=YYYY-MM-DD HH:mm:SS.SSS,"#"=YYYYMMDDHHmmSS, "+"=YYYYMMDDHHmmSS+Offs, "-"=YYYY-MM-DD HH:mm:SS, "E"=MM/DD/YYYY HH:mm:SS, "I"=DD/MM/YYYY HH:mm:SS, "."=DD.MM.YYYY HH:mm:SS, "X"=ISO 8601, "Z"=ISO 8601 Z, "*"=ISO 8601+Of:fs
   * @param second flag
   * @return String
   */
  public static
  String formatDateTime(Object dateTime, Object locale, boolean second)
  {
    Calendar cal = toTimeCalendar(dateTime, null);
    if(cal == null) return "";
    
    String sLocale = locale != null ? locale.toString() : "-";
    char c0 = sLocale != null && sLocale.length() > 0 ? sLocale.charAt(0) : '-';
    char cL = sLocale != null && sLocale.length() > 0 ? sLocale.charAt(sLocale.length()-1) : '/';
    if(sLocale.startsWith("ISO")) c0 = 'x';
    
    if(c0 == 'x' || c0 == 'X') {
      return toISO8601Timestamp(cal);
    }
    else
    if(c0 == 'Z') {
      return toISO8601Timestamp_Z(cal);
    }
    else
    if(c0 == '*') {
      return toISO8601Timestamp_Offset(cal, ":");
    }
    
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
    else
    if(iYear < 100) {
      sYear = "00" + sYear;
    }
    else
    if(iYear < 1000) {
      sYear = "0" + sYear;
    }
    if(c0 == '!') {
      if(!second) {
        return sYear + "-" + sMonth + "-" + sDay + " " + sHour + ":" + sMin;
      }
      int iMill = cal.get(Calendar.MILLISECOND);
      String sMill = String.valueOf(iMill);
      if(iMill < 10) {
        sMill = "00" + sMill;
      }
      else
      if(iMill < 100) {
        sMill = "0" + sMill;
      }
      return sYear + "-" + sMonth + "-" + sDay + " " + sHour + ":" + sMin + ":" + sSec + "." + sMill;
    }
    else
    if(c0 == '#') {
      if(!second) return sYear + sMonth + sDay + sHour + sMin;
      return sYear + sMonth + sDay + sHour + sMin + sSec;
    }
    else
    if(c0 == '+') {
      int iZoneOffset  = cal.get(Calendar.ZONE_OFFSET);
      int iDST_Offset  = cal.get(Calendar.DST_OFFSET);
      int iTot_Offset  = iZoneOffset + iDST_Offset;
      String sOSSign   = "+";
      if(iTot_Offset < 0) {
        iTot_Offset = iTot_Offset * -1;
        sOSSign = "-";
      }
      int iOffset_HH = iTot_Offset / 3600000;
      int iOffset_MM = iTot_Offset % 3600000;
      String sOSHH   = iOffset_HH < 10 ? "0" + iOffset_HH : String.valueOf(iOffset_HH);
      String sOSMM   = iOffset_MM < 10 ? "0" + iOffset_MM : String.valueOf(iOffset_MM);
      if(!second) return sYear + sMonth + sDay + sHour + sMin + sOSSign + sOSHH + sOSMM;
      return sYear + sMonth + sDay + sHour + sMin + sSec + sOSSign + sOSHH + sOSMM;
    }
    else
    if(c0 == '-' || c0 == 'j' || c0 == 'J') { // JAPAN
      if(!second) return sYear + "-" + sMonth + "-" + sDay + " " + sHour + ":" + sMin;
      return sYear + "-" + sMonth + "-" + sDay + " " + sHour + ":" + sMin + ":" + sSec;
    }
    else
    if(c0 == '.' || c0 == 'g' || c0 == 'G') { // GERMAN
      if(!second) return sDay + "." + sMonth + "." + sYear + " " + sHour + ":" + sMin;
      return sDay + "." + sMonth + "." + sYear + " " + sHour + ":" + sMin + ":" + sSec;
    }
    else
    if(c0 == 'e' || c0 == 'E' || c0 == 'u' || c0 == 'U' || c0 == '1') {
      if(cL == 'K') { // UK
        if(!second) return sDay + "/" + sMonth + "/" + sYear + " " + sHour + ":" + sMin;
        return sDay + "/" + sMonth + "/" + sYear + " " + sHour + ":" + sMin + ":" + sSec;
      }
      if(!second) return sMonth + "/" + sDay + "/" + sYear + " " + sHour + ":" + sMin;
      return sMonth + "/" + sDay + "/" + sYear + " " + sHour + ":" + sMin + ":" + sSec;
    }
    if(cL == '-') {
      if(!second) return sDay + "-" + sMonth + "-" + sYear + " " + sHour + ":" + sMin;
      return sDay + "-" + sMonth + "-" + sYear + " " + sHour + ":" + sMin + ":" + sSec;
    }
    if(!second) return sDay + "/" + sMonth + "/" + sYear + " " + sHour + ":" + sMin;
    return sDay + "/" + sMonth + "/" + sYear + " " + sHour + ":" + sMin + ":" + sSec;
  }
  
  public static
  String formatCurrency(Object value, Object locale, String left, String right)
  {
    Double dValue = toDoubleObj(value, null);
    if(dValue == null) return "";
    
    if(left  == null) left  = "";
    if(right == null) right = "";
    String sLocale = locale != null ? locale.toString() : "-";
    char c0 = sLocale != null && sLocale.length() > 0 ? sLocale.charAt(0) : '-';
    if(c0 == 'e' || c0 == 'E' || c0 == 'u' || c0 == 'U' || c0 == '1') {
      if(dfEN  == null) dfEN  = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
      return left + dfEN.format(dValue.doubleValue()) + right;
    }
    else
    if(c0 == 'i' || c0 == 'I' || c0 == '0') {
      if(dfIT  == null) dfIT  = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.ITALY));
      return left + dfIT.format(dValue.doubleValue()) + right;
    }
    if(dfXX  == null) dfXX  = new DecimalFormat("#,##0.00");
    return left + dfXX.format(dValue.doubleValue()) + right;
  }
  
  public static
  java.util.Date intToTime(int iTime)
  {
    Calendar cal = intToCalendarTime(iTime);
    if(cal == null) return null;
    return cal.getTime();
  }
  
  public static
  java.util.Calendar intToCalendarTime(int iTime)
  {
    if(iTime < 0) return null;
    int iHH = 0;
    int iMM = 0;
    int iSS = 0;
    if(iTime < 10000) {
      // HHMM
      iHH = iTime / 100;
      iMM = (iTime % 100);
    }
    else {
      iHH = iTime / 10000;
      iMM = (iTime % 10000) / 100;
      iSS = (iTime % 10000) % 100;
      if(iHH > 999) {
        // YYYYMMDD, no HHMMSS
        return new GregorianCalendar(iHH, iMM-1, iSS);
      }
    }
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, iHH);
    cal.set(Calendar.MINUTE,      iMM);
    cal.set(Calendar.SECOND,      iSS);
    cal.set(Calendar.MILLISECOND, 0);
    return cal;
  }
  
  public static
  java.util.Calendar stringToCalendar(String sTime)
  {
    if(sTime == null) return null;
    int iLength = sTime.length();
    if(iLength ==  0) return null;
    if(iLength > 19 && sTime.endsWith("Z")) {
      int iYear  = Integer.parseInt(sTime.substring( 0,  4));
      int iMonth = Integer.parseInt(sTime.substring( 5,  7));
      int iDay   = Integer.parseInt(sTime.substring( 8, 10));
      int iHour  = Integer.parseInt(sTime.substring(11, 13));
      int iMin   = Integer.parseInt(sTime.substring(14, 16));
      int iSec   = Integer.parseInt(sTime.substring(17, 19));
      int iMill  = 0;
      if(sTime.length() > 23) {
        iMill  = Integer.parseInt(sTime.substring(20, 23));
      }
      Calendar c = Calendar.getInstance(JSONObject.timeZone);
      c.set(Calendar.YEAR,        iYear);
      c.set(Calendar.MONTH,       iMonth-1);
      c.set(Calendar.DATE,        iDay);
      c.set(Calendar.HOUR_OF_DAY, iHour);
      c.set(Calendar.MINUTE,      iMin);
      c.set(Calendar.SECOND,      iSec);
      c.set(Calendar.MILLISECOND, iMill);
      int iZoneOffset = c.get(Calendar.ZONE_OFFSET);
      c.add(Calendar.MILLISECOND, iZoneOffset);
      int iDST_Offset = c.get(Calendar.DST_OFFSET);
      c.add(Calendar.MILLISECOND, iDST_Offset);
      
      Calendar r = new GregorianCalendar(c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DATE),c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
      r.set(Calendar.MILLISECOND,c.get(Calendar.MILLISECOND));
      return r;
    }
    String sDate = null;
    if(iLength > 7) {
      sDate = normalizeStringDate(sTime);
      if(sDate != null) {
        int c = sTime.indexOf(',');
        if(c == 3) {
          sTime = sTime.substring(4).trim();
          iLength = sTime.length();
        }
      }
    }
    String sNorm = normalizeStringTime(sTime, sDate != null);
    if(sNorm == null || sNorm.length() < 4) return null;
    if(sNorm.equals("000000") && sTime.length() < 5 && !Character.isDigit(sTime.charAt(0))) {
      return null;
    }
    int iHH = 0;
    int iMM = 0;
    int iSS = 0;
    int iMS = 0;
    try { iHH = Integer.parseInt(sNorm.substring(0, 2)); } catch(Throwable th) {}
    try { iMM = Integer.parseInt(sNorm.substring(2, 4)); } catch(Throwable th) {}
    if(sNorm.length() > 5) {
      try { iSS = Integer.parseInt(sNorm.substring(4, 6)); } catch(Throwable th) {}
    }
    if(sNorm.length() > 8) {
      try { iMS = Integer.parseInt(sNorm.substring(6, 9)); } catch(Throwable th) {}
    }
    Calendar calendar = Calendar.getInstance();
    if(iLength > 10 || sNorm.equals("000000")) {
      if(sDate != null && sDate.length() > 0) {
        int iDate  = 0;
        try {
          iDate = Integer.parseInt(sDate);
          int iYear  = iDate / 10000;
          int iMonth = (iDate % 10000) / 100;
          int iDay   = (iDate % 10000) % 100;
          calendar.set(Calendar.YEAR,  iYear);
          calendar.set(Calendar.MONTH, iMonth-1);
          calendar.set(Calendar.DATE,  iDay);
        }
        catch(Throwable th) {
        }
      }
    }
    calendar.set(Calendar.HOUR_OF_DAY, iHH);
    calendar.set(Calendar.MINUTE,      iMM);
    calendar.set(Calendar.SECOND,      iSS);
    calendar.set(Calendar.MILLISECOND, iMS);
    return calendar;
  }
  
  public static
  String normalizeStringDate(String sValue)
  {
    if(sValue == null) return null;
    int c = sValue.indexOf(',');
    if(c == 3 && sValue.length() > 10) {
      // Sab, 15/12/2018
      return normalizeStringDate(sValue.substring(4));
    }
    sValue = sValue.trim();
    int iLength = sValue.length();
    if(iLength == 0) return null;
    if(iLength >= 28 && Character.isLetter(sValue.charAt(0)) && sValue.charAt(3) == ' ') {
      // Ad es. Tue Jan 01 00:00:00 CET 2013
      // oppure Wed Aug 09 2017 16:49:16 GMT+0200 (ora legale Europa occidentale)
      if(sValue.indexOf(" GMT") > 0 && sValue.endsWith(")")) {
        String sYear = sValue.substring(11, 15);
        try { Integer.parseInt(sYear); } catch(Throwable th) { return null; }
        String sMonth = getMonth(sValue.substring(4, 7));
        if(sMonth == null || sMonth.length() < 2) return null;
        String sDay = sValue.substring(8, 10);
        int iDay = 0;
        try { iDay = Integer.parseInt(sDay); } catch(Throwable th) { return null; }
        if(iDay < 1 || iDay > 31) return null;
        return sYear + sMonth + sDay;
      }
      else {
        String sYear = sValue.substring(sValue.length() - 4);
        try { Integer.parseInt(sYear); } catch(Throwable th) { return null; }
        String sMonth = getMonth(sValue.substring(4, 7));
        if(sMonth == null || sMonth.length() < 2) return null;
        String sDay = sValue.substring(8, 10);
        int iDay = 0;
        try { iDay = Integer.parseInt(sDay); } catch(Throwable th) { return null; }
        if(iDay < 1 || iDay > 31) return null;
        return sYear + sMonth + sDay;
      }
    }
    int iFirstNumber = -1;
    for(int i = 0; i < iLength; i++) {
      if(Character.isDigit(sValue.charAt(i))) {
        iFirstNumber = i;
        break;
      }
    }
    if(iFirstNumber < 0) return null;
    if(iFirstNumber > 0) {
      sValue = sValue.substring(iFirstNumber);
    }
    int iFirstSep = sValue.indexOf('/');
    if(iFirstSep < 0) {
      iFirstSep = sValue.indexOf('-');
      if(iFirstSep <= 0 || iFirstSep > 13) {
        iFirstSep = sValue.indexOf('.');
        if(iFirstSep <= 0) {
          // YYYYMMDDHHMMSS[+/-OFFS]
          if(sValue.length() >= 14) {
            try {
              int iDate = Integer.parseInt(sValue.substring(0, 8));
              if(iDate >= 10000101 && iDate <= 99991231) {
                return sValue.substring(0, 8);
              }
            }
            catch(Throwable th) {
            }
          }
          if(sValue.length() > 8) {
            long lValue = 0;
            try { lValue = Long.parseLong(sValue); } catch(Throwable th) { return null; }
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(lValue);
            int iDate = cal.get(Calendar.YEAR)*10000 +(cal.get(Calendar.MONTH)+1)*100 + cal.get(Calendar.DAY_OF_MONTH);
            return String.valueOf(iDate);
          }
          if(sValue.length() != 8) return null;
          try { Integer.parseInt(sValue); } catch(Throwable th) { return null; }
          return sValue;
        }
      }
    }
    int iSecondSep = sValue.indexOf('/', iFirstSep + 1);
    if(iSecondSep < 0) {
      iSecondSep = sValue.indexOf('-', iFirstSep + 1);
      if(iSecondSep < 0 || iSecondSep > 13) {
        iSecondSep = sValue.indexOf('.', iFirstSep + 1);
        if(iSecondSep < 0) return null;
      }
    }
    String sDay   = null;
    String sMonth = null;
    String sYear  = null;
    if(iFirstSep >= 4) {
      // year - month - day
      sYear  = sValue.substring(0, iFirstSep).trim();
      sMonth = sValue.substring(iFirstSep + 1, iSecondSep).trim();
      sDay   = sValue.substring(iSecondSep + 1).trim();
      if(sDay.length() > 2) sDay = sDay.substring(0, 2);
    }
    else {
      // day - month - year
      sDay   = sValue.substring(0, iFirstSep).trim();
      sMonth = sValue.substring(iFirstSep + 1, iSecondSep).trim();
      sYear  = sValue.substring(iSecondSep + 1).trim();
      if(sYear.length() > 4) sYear = sYear.substring(0, 4);
    }
    // Check Day
    if(sDay.length() == 0) sDay = "01";
    else
    if(sDay.length() == 1) sDay = "0" + sDay;
    int iDay = 0;
    try { iDay = Integer.parseInt(sDay); } catch(Throwable th) { return null; }
    if(iDay < 1 || iDay > 31) return null;
    // Check Month
    if(sMonth.length() > 2 && Character.isLetter(sMonth.charAt(0))) {
      sMonth = getMonth(sMonth);
      if(sMonth == null) return null;
    }
    if(sMonth.length() == 0) sMonth = "01";
    else
    if(sMonth.length() == 1) sMonth = "0" + sMonth;
    int iMonth = 0;
    try { iMonth = Integer.parseInt(sMonth); } catch(Throwable th) { return null; }
    if(iMonth < 1 || iMonth > 12) return null;
    // Check Year
    int iYear = 0;
    try{ iYear = Integer.parseInt(sYear); } catch(Throwable th) { return null; }
    if(iYear >= 0 && iYear < 100 && sValue.length() < 10) {
      Calendar cal = Calendar.getInstance();
      int iCurrCentury = cal.get(Calendar.YEAR) / 100;
      sYear = String.valueOf(iCurrCentury * 100 + iYear);
    }
    else if(iYear < 1000 && sValue.length() < 10) {
      return null;
    }
    if(iYear > 9999) return null;
    return sYear + sMonth + sDay;
  }
  
  public static
  String getMonth(String sMonth)
  {
    String sMonthLC = sMonth.toLowerCase();
    if(sMonthLC.startsWith("jan") || sMonthLC.startsWith("ge"))  return "01";
    if(sMonthLC.startsWith("f"))   return "02";
    if(sMonthLC.startsWith("mar")) return "03";
    if(sMonthLC.startsWith("ap"))  return "04";
    if(sMonthLC.startsWith("may") || sMonthLC.startsWith("mag")) return "05";
    if(sMonthLC.startsWith("jun") || sMonthLC.startsWith("gi"))  return "06";
    if(sMonthLC.startsWith("jul") || sMonthLC.startsWith("lu"))  return "07";
    if(sMonthLC.startsWith("au")  || sMonthLC.startsWith("ag"))  return "08";
    if(sMonthLC.startsWith("s")) return "09";
    if(sMonthLC.startsWith("o")) return "10";
    if(sMonthLC.startsWith("n")) return "11";
    if(sMonthLC.startsWith("d")) return "12";
    return null;
  }
  
  public static
  String normalizeStringTime(String sValue)
  {
    return normalizeStringTime(sValue, false);
  }
  
  public static
  String normalizeStringTime(String sValue, boolean boValueContainsDate)
  {
    if(sValue == null) return null;
    sValue = sValue.trim();
    if(sValue.length() == 0) return null;
    int iFirstSep = sValue.indexOf(':');
    if(iFirstSep < 0) {
      iFirstSep = sValue.indexOf(',');
      if(iFirstSep <= 0) {
        iFirstSep = sValue.indexOf('.');
        if(iFirstSep <= 0) {
          int iCut = -1;
          boolean boAtLeastANumber = false;
          boolean boAllNumbers     = true;
          for(int i = 0; i < sValue.length(); i++) {
            char c = sValue.charAt(i);
            if(!Character.isDigit(c)) {
              if(i > 11 &&(c == '+' || c == '-' || c == '.')) {
                iCut = i;
                break;
              }
              boAllNumbers = false;
            }
            else {
              boAtLeastANumber = true;
            }
          }
          if(!boAtLeastANumber) return null;
          if(!boAllNumbers) {
            if(boValueContainsDate) {
              return "000000";
            }
            return null;
          }
          if(iCut > 0) sValue = sValue.substring(0, iCut);
          // YYYYMMDDHHMMSS
          if(sValue.length() == 14) return sValue.substring(8, 14);
          // YYYYMMDDHHMM
          if(sValue.length() == 12) return sValue.substring(8, 12) + "00";
          // YYYYMMDD
          if(sValue.length() == 8)  return "000000"; // Is a date
          // HHMMSS?
          if(sValue.length() >  6)  return sValue.substring(0, 6);
          // HHMM
          if(sValue.length() == 1) sValue = "000"  + sValue;
          if(sValue.length() == 2) sValue = "00"   + sValue;
          if(sValue.length() == 3) sValue = "0"    + sValue;
          if(sValue.length() == 4) sValue = sValue +   "00";
          // HHMMSS
          if(sValue.length() == 5) sValue = "0"    + sValue;
          return sValue;
        }
      }
    }
    int iSecondSep = sValue.indexOf(':', iFirstSep + 1);
    if(iSecondSep < 0) {
      iSecondSep = sValue.indexOf(',', iFirstSep + 1);
      if(iSecondSep < 0) {
        iSecondSep = sValue.indexOf('.', iFirstSep + 1);
      }
    }
    int iMillis   = 0;
    int iThirdSep = -1;
    if(iSecondSep > 0) {
      iThirdSep = sValue.indexOf('.', iSecondSep + 1);
      if(iThirdSep > 0) {
        try { iMillis = Integer.parseInt(sValue.substring(iThirdSep+1,iThirdSep+4)); } catch(Throwable th) {}
        sValue = sValue.substring(0, iThirdSep);
      }
    }
    String sHH = "";
    String sMM = "";
    String sSS = "";
    if(iFirstSep > 0) {
      int iBegin = 0;
      if(iFirstSep > 5) iBegin = iFirstSep - 2;
      sHH = sValue.substring(iBegin, iFirstSep).trim();
      if(iSecondSep > 0) {
        sMM = sValue.substring(iFirstSep + 1, iSecondSep).trim();
        sSS = sValue.substring(iSecondSep + 1).trim();
        if(sSS.length() == 4) {
          int iSS = 0;
          try{ iSS = Integer.parseInt(sSS); } catch(Throwable ex) {}
          // Is a year
          if(iSS >= 1000) return "000000";
        }
        if(sSS.length() > 2) sSS = sSS.substring(0, 2);
      }
      else {
        sMM = sValue.substring(iFirstSep + 1).trim();
        sSS = "00";
        if(sMM.length() > 2) sMM = sMM.substring(0, 2);
      }
    }
    // Check Hour
    if(sHH.length() > 0) {
      char c0 = sHH.charAt(0);
      if(c0 != ' ' && !Character.isDigit(c0)) return null;
    }
    if(sHH.length() == 0) sHH = "00";
    else
    if(sHH.length() == 1) sHH = "0" + sHH;
    int iHH = 0;
    try { iHH = Integer.parseInt(sHH); } catch(Throwable th) { return "000000"; }
    if(iHH < 0 || iHH > 23) return "000000";
    // Check Minutes
    if(sMM.length() == 0) sMM = "00";
    else
    if(sMM.length() == 1) sMM = "0" + sMM;
    int iMM = 0;
    try { iMM = Integer.parseInt(sMM); } catch(Throwable th) { return "000000"; }
    if(iMM < 0 || iMM > 59) return "000000";
    // Check Seconds
    if(sSS.length() == 0) sSS = "00";
    else
    if(sSS.length() == 1) sSS = "0" + sSS;
    int iSS = 0;
    try { iSS = Integer.parseInt(sSS); } catch(Throwable th) { return "000000"; }
    if(iSS < 0 || iSS > 59) return "000000";
    String sMillis = null;
    if(iMillis < 10) {
      sMillis = "00" + iMillis;
    }
    else
    if(iMillis < 100) {
      sMillis = "0" + iMillis;
    }
    else {
      sMillis = String.valueOf(iMillis);
    }
    if(iMillis > 0) {
      return sHH + sMM + sSS + sMillis;
    }
    return sHH + sMM + sSS;
  }
  
  public static
  List stringToList(String sText)
  {
    if(sText == null || sText.length() == 0) return new ArrayList(0);
    if(sText.startsWith("[") && sText.endsWith("]")) {
      Object oResult = JSON.parse(sText);
      if(oResult instanceof List) {
        return toList(oResult, false);
      }
    }
    ArrayList arrayList = new ArrayList();
    int iIndexOf = 0;
    int iBegin   = 0;
    iIndexOf     = sText.indexOf(',');
    while(iIndexOf >= 0) {
      arrayList.add(sText.substring(iBegin, iIndexOf));
      iBegin = iIndexOf + 1;
      iIndexOf = sText.indexOf(',', iBegin);
    }
    arrayList.add(sText.substring(iBegin));
    return arrayList;
  }
  
  public static
  Vector stringToVector(String sText)
  {
    if(sText == null || sText.length() == 0) return new Vector(0);
    if(sText.startsWith("[") && sText.endsWith("]")) {
      Object oResult = JSON.parse(sText);
      if(oResult instanceof List) {
        return toVector(oResult, false);
      }
    }
    Vector vector = new Vector();
    int iIndexOf  = 0;
    int iBegin    = 0;
    iIndexOf      = sText.indexOf(',');
    while(iIndexOf >= 0) {
      vector.add(sText.substring(iBegin, iIndexOf));
      iBegin = iIndexOf + 1;
      iIndexOf = sText.indexOf(',', iBegin);
    }
    vector.add(sText.substring(iBegin));
    return vector;
  }
  
  public static
  Map stringToMap(String sText)
  {
    if(sText == null || sText.length() == 0) return new HashMap(0);
    if(sText.startsWith("{") && sText.endsWith("}")) {
      if(sText.length() > 2 && sText.indexOf('=') < 2) return new HashMap(0);
      Object oResult = JSON.parse(sText);
      if(oResult instanceof Map) return toMap(oResult, true);
    }
    return new HashMap(0);
  }
  
  public static
  Hashtable stringToHashtable(String sText)
  {
    if(sText == null || sText.length() == 0) return new Hashtable(0);
    if(sText.startsWith("{") && sText.endsWith("}")) {
      if(sText.length() > 2 && sText.indexOf('=') < 2) return new Hashtable(0);
      Object oResult = JSON.parse(sText);
      if(oResult instanceof Map) return toHashtable(oResult, true);
    }
    return new Hashtable(0);
  }
  
  public static
  boolean isBlank(Object oValue)
  {
    if(oValue == null) return true;
    if(oValue instanceof Map) {
      Map map = (Map) oValue;
      return map.isEmpty();
    }
    if(oValue instanceof Collection) {
      Collection col = (Collection) oValue;
      if(col.isEmpty()) return true;
      Object oFirst = getFirst(col);
      if(oFirst == null) return true;
      String sFirst = oFirst.toString();
      if(sFirst == null || sFirst.trim().length() == 0 || sFirst.equals("null")) {
        return true;
      }
      return false;
    }
    String sValue = oValue.toString();
    if(sValue == null || sValue.trim().length() == 0 || sValue.equals("null")) {
      return true;
    }
    return false;
  }
  
  public static
  boolean isBlank(Object oValue, int iBlankValue)
  {
    boolean result = isBlank(oValue);
    if(result) return true;
    int iValue = toInt(oValue, iBlankValue);
    return iValue == iBlankValue;
  }
  
  public static
  boolean isZero(Object oValue)
  {
    Number number = toNumber(oValue, null);
    if(number == null) return true;
    return number.doubleValue() == 0.0;
  }
  
  public static
  Calendar getCurrentDate()
  {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE,      0);
    cal.set(Calendar.SECOND,      0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal;
  }
  
  public static
  Calendar getCurrentDate(int dayOffset, int monthOffset, int yearOffset, boolean firstDayOfMonth, boolean lastDayOfMonth)
  {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE,      0);
    cal.set(Calendar.SECOND,      0);
    cal.set(Calendar.MILLISECOND, 0);
    if(dayOffset != 0) {
      cal.add(Calendar.DATE, dayOffset);
    }
    if(monthOffset != 0) {
      cal.add(Calendar.MONTH, monthOffset);
    }
    if(yearOffset != 0) {
      cal.add(Calendar.YEAR, yearOffset);
    }
    if(firstDayOfMonth) {
      cal.set(Calendar.DATE, 1);
    }
    if(lastDayOfMonth) {
      cal.set(Calendar.DATE,  1);
      cal.add(Calendar.MONTH, 1);
      cal.add(Calendar.DATE, -1);
    }
    return cal;
  }
  
  public static
  Calendar getUndefinedDate()
  {
    return new GregorianCalendar(9999, 11, 31, 0, 0, 0);
  }
  
  public static
  String lpad(String text, char c, int length)
  {
    if(text == null) text = "";
    int iTextLength = text.length();
    if(iTextLength >= length) return text;
    int diff = length - iTextLength;
    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < diff; i++) sb.append(c);
    sb.append(text);
    return sb.toString();
  }
  
  public static
  String rpad(String text, char c, int length)
  {
    if(text == null) text = "";
    int iTextLength = text.length();
    if(iTextLength >= length) return text;
    int diff = length - iTextLength;
    StringBuffer sb = new StringBuffer();
    sb.append(text);
    for(int i = 0; i < diff; i++) sb.append(c);
    return sb.toString();
  }
  
  // 1.5+
  public static
  Object toObject(Object object, String className)
  {
    return toObject(object, className, null);
  }
  
  // 1.5+
  public static
  Object toObject(Object object, String className, ClassLoader classLoader)
  {
    if(object == null) return null;
    if(className == null || className.length() == 0) return object;
    if(className.startsWith("class "))     className = className.substring(6);
    if(className.startsWith("interface ")) className = className.substring(10);
    String g1 = "";
    String g2 = "";
    int iSepG = className.indexOf('<');
    if(iSepG > 0) {
      String generics = className.substring(iSepG + 1, className.length()-1);
      className = className.substring(0, iSepG);
      int iSepT = generics.indexOf(',');
      if(iSepT > 0) {
        g1 = generics.substring(0,iSepT).trim();
        g2 = generics.substring(iSepT+1).trim();
      }
      else {
        g1 = generics;
      }
    }
    int iDot = className.indexOf('.');
    if(iDot < 0) {
      if(!className.startsWith("[")) {
        if("String|Number|Integer|Double|Long|Boolean|Object|".indexOf(className) >= 0) {
          className = "java.lang." + className;
        }
        else
        if("BigDecimal|BigInteger|".indexOf(className) >= 0) {
          className = "java.math." + className;
        }
        else
        if("Date|Calendar|Collection|List|ArrayList|Vector|Map|HashMap|Hashtable|Properties|Set|HashSet|TreeSet|TreeMap|LinkedList|Stack|".indexOf(className) >= 0) {
          className = "java.util." + className;
        }
        else
        if("Time|Timestamp|".indexOf(className) >= 0) {
          className = "java.sql." + className;
        }
        else // 1.8+
        if("LocalDate|LocalDateTime|".indexOf(className) >= 0) {
          className = "java.time." + className;
        }
      }
    }
    if(className.equals("java.util.Collection") || className.equals("java.util.List") || className.equals("java.util.ArrayList")) {
      List list = toList(object, true);
      List arrayList = new ArrayList(list.size());
      for(int i = 0; i < list.size(); i++) {
        arrayList.add(toObject(list.get(i), g1, classLoader));
      }
      return arrayList;
    }
    else
    if(className.equals("java.util.Vector")) {
      List list = toList(object, true);
      Vector vector = new Vector(list.size());
      for(int i = 0; i < list.size(); i++) {
        vector.add(toObject(list.get(i), g1, classLoader));
      }
      return vector;
    }
    else
    if(className.equals("java.util.Stack")) {
      List list = toList(object, true);
      Stack stack = new Stack();
      for(int i = 0; i < list.size(); i++) {
        stack.add(toObject(list.get(i), g1, classLoader));
      }
      return stack;
    }
    else
    if(className.equals("java.util.Map") || className.equals("java.util.HashMap")) {
      Map map = toMap(object, true);
      HashMap hashMap = new HashMap(map.size());
      Iterator iterator = map.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        Object key = toObject(entry.getKey(), g1, classLoader);
        if(key == null) continue;
        hashMap.put(key, toObject(entry.getValue(), g2, classLoader));
      }
      return hashMap;
    }
    else
    if(className.equals("java.util.Hashtable")) {
      Map map = toMap(object, true);
      Hashtable hashtable = new Hashtable(map.size());
      Iterator iterator = map.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        Object key = toObject(entry.getKey(), g1, classLoader);
        if(key == null) continue;
        Object value = toObject(entry.getValue(), g2, classLoader);
        if(value == null) continue;
        hashtable.put(key, value);
      }
      return hashtable;
    }
    else
    if(className.equals("java.util.Properties")) {
      Map map = toMap(object, true);
      Properties properties = new Properties();
      Iterator iterator = map.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        properties.put(toString(entry.getKey(), ""), toString(entry.getValue(), ""));
      }
      return properties;
    }
    else
    if(className.equals("java.util.Set") || className.equals("java.util.HashSet")) {
      List list = toList(object, true);
      HashSet hashSet = new HashSet(list.size());
      for(int i = 0; i < list.size(); i++) {
        Object item = toObject(list.get(i), g1, classLoader);
        if(item == null) continue;
        hashSet.add(item);
      }
      return hashSet;
    }
    else
    if(className.equals("java.util.TreeSet")) {
      List list = toList(object, true);
      TreeSet treeSet = new TreeSet();
      for(int i = 0; i < list.size(); i++) {
        Object item = toObject(list.get(i), g1, classLoader);
        if(item == null) continue;
        treeSet.add(item);
      }
      return treeSet;
    }
    else
    if(className.equals("java.util.TreeMap")) {
      Map map = toMap(object, true);
      TreeMap treeMap = new TreeMap();
      Iterator iterator = map.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        Object key = toObject(entry.getKey(), g1, classLoader);
        if(key == null) continue;
        treeMap.put(key, toObject(entry.getValue(), g2, classLoader));
      }
      return treeMap;
    }
    else
    if(className.equals("java.util.LinkedList")) {
      List list = toList(object, true);
      LinkedList linkedList = new LinkedList();
      for(int i = 0; i < list.size(); i++) {
        linkedList.add(toObject(list.get(i), g1, classLoader));
      }
      return linkedList;
    }
    else
    if(className.equals("java.lang.Object") || className.startsWith("?")) {
      return object;
    }
    else
    if(className.equals("java.lang.String")) {
      return toString(object, null);
    }
    else
    if(className.equals("int")) {
      return toInt(object, 0);
    }
    else
    if(className.equals("java.lang.Number")) {
      return toNumber(object, null);
    }
    else
    if(className.equals("java.lang.Integer")) {
      return toInteger(object, null);
    }
    else
    if(className.equals("long")) {
      return toLong(object, 0);
    }
    else
    if(className.equals("java.lang.Long")) {
      return toLongObj(object, null);
    }
    else
    if(className.equals("double")) {
      return toDouble(object, 0.0d);
    }
    else
    if(className.equals("java.lang.Double")) {
      return toDoubleObj(object, null);
    }
    else
    if(className.equals("boolean")) {
      return toBoolean(object, false);
    }
    else
    if(className.equals("java.lang.Boolean")) {
      return toBooleanObj(object, null);
    }
    else
    if(className.equals("java.util.Date")) {
      return toDate(object, null);
    }
    else
    if(className.equals("java.util.Calendar")) {
      return toCalendar(object, null);
    }
    else // 1.8+
    if(className.equals("java.time.LocalDate")) {
      return toLocalDate(object, null);
    }
    else // 1.8+
    if(className.equals("java.time.LocalDateTime")) {
      return toLocalDateTime(object, null);
    }
    else
    if(className.equals("[B")) { // byte[]
      if(object instanceof byte[]) {
        return object;
      }
      else
      if(object instanceof Collection) {
        return Arrays.toArrayOfByte((Collection) object);
      }
    }
    else
    if(className.equals("[I")) { // int[]
      if(object instanceof int[]) {
        return object;
      }
      else
      if(object instanceof Collection) {
        return Arrays.toArrayOfInt((Collection) object);
      }
    }
    else
    if(className.equals("[C")) { // char[]
      if(object instanceof char[]) {
        return object;
      }
      else
      if(object instanceof Collection) {
        return Arrays.toArrayOfChar((Collection) object);
      }
    }
    else
    if(className.equals("[Z")) { // boolean[]
      if(object instanceof boolean[]) {
        return object;
      }
      else
      if(object instanceof Collection) {
        return Arrays.toArrayOfBoolean((Collection) object);
      }
    }
    else
    if(className.equals("[D")) { // double[]
      if(object instanceof double[]) {
        return object;
      }
      else
      if(object instanceof Collection) {
        return Arrays.toArrayOfDouble((Collection) object);
      }
    }
    else
    if(className.startsWith("[L") && className.endsWith(";")) {
      String sObjectClass = object.getClass().getName();
      if(sObjectClass.equals(className)) {
        return object;
      }
      String sActualClass = className.substring(2, className.length() - 1);
      Class  cActualClass = null;
      try {
        if(classLoader != null) {
          cActualClass = classLoader.loadClass(sActualClass);
        }
        else {
          cActualClass = Class.forName(sActualClass);
        }
      }
      catch(Exception ex) {
        ex.printStackTrace();
        System.err.println("FUtil.toObject(objectClass=" + object.getClass() + ",className=" + className + ",actualClass=" + sActualClass + ",classLoader=" + classLoader + "): " + ex);
      }
      if(cActualClass == null) return null;
      Object oList = toObject(object, "java.util.List<" + sActualClass + ">", classLoader);
      int length = size(oList);
      Object array = java.lang.reflect.Array.newInstance(cActualClass, length);
      if(oList instanceof List) {
        List list = (List) oList;
        for(int index = 0; index < length; index++) {
          java.lang.reflect.Array.set(array, index, list.get(index));
        }
      }
      return array;
    }
    else
    if(className.equals("java.sql.Date")) {
      return toSQLDate(object, null);
    }
    else
    if(className.equals("java.sql.Timestamp")) {
      return toSQLTimestamp(object, null);
    }
    else
    if(className.equals("java.sql.Time")) {
      return toSQLTime(object, null);
    }
    else
    if(className.equals("java.math.BigDecimal")) {
      return toBigDecimal(object, null);
    }
    else
    if(className.equals("java.math.BigInteger")) {
      return toBigInteger(object, null);
    }
    else 
    if(!className.startsWith("java.")) {
      Map mapValues = toMap(object, true);
      Object bean = null;
      try {
        Class beanClass = null;
        if(classLoader != null) {
          beanClass = classLoader.loadClass(className);
        }
        else {
          beanClass = Class.forName(className);
        }
        bean = beanClass.newInstance();
      }
      catch(Exception ex) {
        ex.printStackTrace();
        System.err.println("FUtil.toObject(objectClass=" + object.getClass() + ",className=" + className + ",classLoader=" + classLoader + "): " + ex);
      }
      return populateBean(bean, mapValues, classLoader);
    }
    return object;
  }
}