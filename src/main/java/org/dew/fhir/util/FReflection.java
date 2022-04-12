package org.dew.fhir.util;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

@SuppressWarnings({"rawtypes","unchecked"})
public
class FReflection
{
  // Restituisce il tipo con generici SOLO in presenza di bean.
  // 1.5+
  public static
  String getBeanGenericType(Method method, int iIndex)
  {
    Type[] genericTypes = method.getGenericParameterTypes();
    if(genericTypes == null || genericTypes.length <= iIndex) {
      return null;
    }
    Type type = genericTypes[iIndex];
    if(type instanceof ParameterizedType) {
      String sResult = type.toString();
      if(sResult == null) return null;
      int iSepG = sResult.indexOf('<');
      if(iSepG > 0) {
        String g1 = "";
        String g2 = "";
        String generics = sResult.substring(iSepG + 1, sResult.length()-1);
        int iSepT = generics.indexOf(',');
        if(iSepT > 0) {
          g1 = generics.substring(0,iSepT).trim();
          g2 = generics.substring(iSepT+1).trim();
        }
        else {
          g1 = generics;
        }
        if(g1 != null && g1.length() > 0 && !g1.startsWith("java.") && !g1.startsWith("[") && !g1.startsWith("?")) {
          return sResult;
        }
        if(g2 != null && g2.length() > 0 && !g2.startsWith("java.") && !g2.startsWith("[") && !g2.startsWith("?")) {
          return sResult;
        }
      }
    }
    return null;
  }
  
  public static
  Object[] getParameters(Method method, List params)
  {
    Class[] types = method.getParameterTypes();
    if(types.length != params.size()) return null;
    Object[] aoResult = new Object[types.length];
    for(int i = 0; i < types.length; i++) {
      String sTypeName = types[i].getName();
      Object param     = params.get(i);
      
      if(sTypeName.equals("java.lang.String")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof String) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("int")) {
        if(param == null) {
          aoResult[i] = new Integer(0);
        }
        else if(param instanceof Integer) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.lang.Number")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Number) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.lang.Integer")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Integer) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("long")) {
        if(param == null) {
          aoResult[i] = new Long(0);
        }
        else if(param instanceof Number) {
          aoResult[i] = new Long(((Number) param).longValue());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.lang.Long")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Number) {
          aoResult[i] = new Long(((Number) param).longValue());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("double")) {
        if(param == null) {
          aoResult[i] = new Double(0.0d);
        }
        else if(param instanceof Double) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.lang.Double")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Double) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("boolean")) {
        if(param == null) {
          aoResult[i] = Boolean.FALSE;
        }
        else if(param instanceof Boolean) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.lang.Boolean")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Boolean) {
          aoResult[i] = param;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Date")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.util.Date) {
          aoResult[i] = param;
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = ((Calendar) param).getTime();
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = calDate.getTime();
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Calendar")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.util.Date) {
          Calendar cal = Calendar.getInstance();
          cal.setTimeInMillis(((java.util.Date) param).getTime());
          aoResult[i]  = cal;
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = param;
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = calDate;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.time.LocalDate")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.time.LocalDate) {
          aoResult[i] = param;
        }
        else if(param instanceof java.util.Date) {
          aoResult[i] = FUtil.toLocalDate(param, null);
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = FUtil.toLocalDate(param, null);
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = FUtil.toLocalDate(calDate, null);
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.time.LocalDateTime")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.time.LocalDateTime) {
          aoResult[i] = param;
        }
        else if(param instanceof java.util.Date) {
          aoResult[i] = FUtil.toLocalDateTime(param, null);
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = FUtil.toLocalDateTime(param, null);
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = FUtil.toLocalDateTime(calDate, null);
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Vector")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Vector) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (Vector) param;
          }
        }
        else if(param instanceof Collection) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new Vector((Collection) param);
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Stack")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Stack) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (Stack) param;
          }
        }
        else if(param instanceof Collection) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            Stack stack = new Stack();
            stack.addAll((Collection) param);
            aoResult[i] = stack;
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.List") || sTypeName.equals("java.util.ArrayList") || sTypeName.equals("java.util.Collection")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof ArrayList) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (ArrayList) param;
          }
        }
        else if(param instanceof Collection) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new ArrayList((Collection) param);
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.LinkedList")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof LinkedList) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (LinkedList) param;
          }
        }
        else if(param instanceof Collection) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new LinkedList((Collection) param);
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Hashtable")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Hashtable) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (Hashtable) param;
          }
        }
        else if(param instanceof Map) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new Hashtable((Map) param);
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Map") || sTypeName.equals("java.util.HashMap")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof HashMap) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (HashMap) param;
          }
        }
        else if(param instanceof Map) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new HashMap((Map) param);
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Properties")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Properties) {
          aoResult[i] = (Properties) param;
        }
        else if(param instanceof Map) {
          Properties properties = new Properties();
          Iterator iterator = ((Map) param).entrySet().iterator();
          while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object oVal = entry.getValue();
            if(oVal == null) continue;
            properties.setProperty(entry.getKey().toString(), oVal.toString());
          }
          aoResult[i] = properties;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.TreeSet")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof TreeSet) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (TreeSet) param;
          }
        }
        else if(param instanceof Collection) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new TreeSet((Collection) param);
          }
        }
        else {
          return null;
        }
      }
      else
      if(sTypeName.equals("java.util.TreeMap")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof TreeMap) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = (TreeMap) param;
          }
        }
        else if(param instanceof Map) {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new TreeMap((Map) param);
          }
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[B")) { // byte[]
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof byte[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          byte[] array = Arrays.toArrayOfByte((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[I")) { // int[]
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof int[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          int[] array = Arrays.toArrayOfInt((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[C")) { // char[]
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof char[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          char[] array = Arrays.toArrayOfChar((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else if(param instanceof String) {
          String sParam = (String) param;
          aoResult[i] = sParam.toCharArray();
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[Z")) { // boolean[]
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof boolean[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          boolean[] array = Arrays.toArrayOfBoolean((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[D")) { // double[]
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof double[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          double[] array = Arrays.toArrayOfDouble((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.startsWith("[L") && sTypeName.endsWith(";")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param.getClass().isArray()) {
          aoResult[i] = FUtil.toObject(param, sTypeName);
        }
        else if(param instanceof Collection) {
          aoResult[i] = FUtil.toObject(param, sTypeName);
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Set") || sTypeName.equals("java.util.HashSet")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Collection) {
          aoResult[i] = new HashSet((Collection) param);
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.sql.Date")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.util.Date) {
          aoResult[i] = new java.sql.Date(((java.util.Date) param).getTime());
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = new java.sql.Date(((Calendar) param).getTimeInMillis());
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = new java.sql.Date(calDate.getTimeInMillis());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.sql.Timestamp")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.util.Date) {
          aoResult[i] = new java.sql.Timestamp(((java.util.Date) param).getTime());
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = new java.sql.Timestamp(((Calendar) param).getTimeInMillis());
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = new java.sql.Timestamp(calDate.getTimeInMillis());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.sql.Time")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof java.util.Date) {
          aoResult[i] = new java.sql.Time(((java.util.Date) param).getTime());
        }
        else if(param instanceof java.util.Calendar) {
          aoResult[i] = new java.sql.Time(((Calendar) param).getTimeInMillis());
        }
        else if(param instanceof String) {
          Calendar calDate = FUtil.stringToCalendar((String) param);
          if(calDate == null) return null;
          aoResult[i] = new java.sql.Time(calDate.getTimeInMillis());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.math.BigDecimal")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else
        if(param instanceof Number) {
          aoResult[i] = new BigDecimal(param.toString());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.math.BigInteger")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Number) {
          aoResult[i] = new BigInteger(param.toString());
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.lang.Object")) {
        if(param == null) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = param;
        }
      }
      else {
        if(param == null) {
          aoResult[i] = null;
        }
        else if(param instanceof Map) {
          aoResult[i] = FUtil.populateBean(types[i], (Map) param);
        }
        else if(param instanceof String) {
          if(types[i].isEnum()) {
            try {
              aoResult[i] = Enum.valueOf(types[i], (String) param);
            }
            catch(Exception ex) {
              System.err.println("RpcUtil.getParameters(" + method + "," + params + "): " + ex);
              return null;
            }
          }
          else {
            return null;
          }
        }
        else {
          return null;
        }
      }
    }
    return aoResult;
  }
  
  public static
  Object[] getParametersExt(Method method, List params)
  {
    Class[] types = method.getParameterTypes();
    if(types.length != params.size()) return null;
    Object[] aoResult = new Object[types.length];
    for(int i = 0; i < types.length; i++) {
      String sTypeName = types[i].getName();
      Object param     = params.get(i);
      
      if(sTypeName.equals("java.lang.String")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toString(param, null);
        }
      }
      else if(sTypeName.equals("int")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = new Integer(0);
        }
        else {
          aoResult[i] = FUtil.toInteger(param, new Integer(0));
        }
      }
      else if(sTypeName.equals("java.lang.Number")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toNumber(param, null);
        }
      }
      else if(sTypeName.equals("java.lang.Integer")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toInteger(param, null);
        }
      }
      else if(sTypeName.equals("long")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = new Long(0);
        }
        else {
          aoResult[i] = FUtil.toLongObj(param, new Long(0));
        }
      }
      else if(sTypeName.equals("java.lang.Long")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toLongObj(param, null);
        }
      }
      else if(sTypeName.equals("double")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = new Double(0.0d);
        }
        else {
          aoResult[i] = FUtil.toDoubleObj(param, new Double(0.0d));
        }
      }
      else if(sTypeName.equals("java.lang.Double")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toDoubleObj(param, null);
        }
      }
      else if(sTypeName.equals("java.math.BigDecimal")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toBigDecimal(param, null);
        }
      }
      else if(sTypeName.equals("java.math.BigInteger")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toBigInteger(param, null);
        }
      }
      else if(sTypeName.equals("boolean")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = Boolean.FALSE;
        }
        else {
          aoResult[i] = FUtil.toBooleanObj(param, Boolean.FALSE);
        }
      }
      else if(sTypeName.equals("java.lang.Boolean")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toBooleanObj(param, null);
        }
      }
      else if(sTypeName.equals("java.util.Date")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toDate(param, null);
        }
      }
      else if(sTypeName.equals("java.util.Calendar")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toCalendar(param, null);
        }
      }
      else if(sTypeName.equals("java.time.LocalDate")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toLocalDate(param, null);
        }
      }
      else if(sTypeName.equals("java.time.LocalDateTime")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toLocalDateTime(param, null);
        }
      }
      else if(sTypeName.equals("java.util.Vector")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = FUtil.toVector(param, null);
          }
        }
      }
      else if(sTypeName.equals("java.util.Stack")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            Stack stack = new Stack();
            stack.addAll(FUtil.toVector(param, true));
            aoResult[i] = stack;
          }
        }
      }
      else if(sTypeName.equals("java.util.List") || sTypeName.equals("java.util.ArrayList") || sTypeName.equals("java.util.Collection")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = FUtil.toList(param, null);
          }
        }
      }
      else if(sTypeName.equals("java.util.LinkedList")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new LinkedList(FUtil.toList(param, true));
          }
        }
      }
      else if(sTypeName.equals("java.util.Hashtable")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = FUtil.toHashtable(param, false);
          }
        }
      }
      else if(sTypeName.equals("java.util.Map") || sTypeName.equals("java.util.HashMap")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = FUtil.toMap(param, false);
          }
        }
      }
      else if(sTypeName.equals("java.util.Properties")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof Map) {
          Properties properties = new Properties();
          Iterator iterator = ((Map) param).entrySet().iterator();
          while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object oVal = entry.getValue();
            if(oVal == null) continue;
            properties.setProperty(entry.getKey().toString(), oVal.toString());
          }
          aoResult[i] = properties;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.TreeSet")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new TreeSet(FUtil.toList(param, true));
          }
        }
      }
      else if(sTypeName.equals("java.util.TreeMap")) {
        String sBeanGenericType = getBeanGenericType(method, i);
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          if(sBeanGenericType != null) {
            aoResult[i] = FUtil.toObject(param, sBeanGenericType);
          }
          else {
            aoResult[i] = new TreeMap(FUtil.toMap(param, true));
          }
        }
      }
      else if(sTypeName.equals("[B")) { // byte[]
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof byte[]) {
          aoResult[i] = param;
        }
        else if(param instanceof String) {
          // FHIR
          try {
            aoResult[i] = Base64Coder.decode((String) param);
          }
          catch(Exception ex) {
          }
        }
        else if(param instanceof Collection) {
          byte[] array = Arrays.toArrayOfByte((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[I")) { // int[]
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof int[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          int[] array = Arrays.toArrayOfInt((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[C")) { // char[]
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof char[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          char[] array = Arrays.toArrayOfChar((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else if(param instanceof String) {
          String sParam = (String) param;
          aoResult[i] = sParam.toCharArray();
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[Z")) { // boolean[]
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof boolean[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          boolean[] array = Arrays.toArrayOfBoolean((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("[D")) { // double[]
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof double[]) {
          aoResult[i] = param;
        }
        else if(param instanceof Collection) {
          double[] array = Arrays.toArrayOfDouble((Collection) param);
          if(array == null) return null;
          aoResult[i] = array;
        }
        else {
          return null;
        }
      }
      else if(sTypeName.startsWith("[L") && sTypeName.endsWith(";")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param.getClass().isArray()) {
          aoResult[i] = FUtil.toObject(param, sTypeName);
        }
        else if(param instanceof Collection) {
          aoResult[i] = FUtil.toObject(param, sTypeName);
        }
        else if(param instanceof Map) {
          // FHIR
          List<Object> colParam = new ArrayList<Object>(1);
          colParam.add(param);
          aoResult[i] = FUtil.toObject(colParam, sTypeName);
        }
        else {
          return null;
        }
      }
      else if(sTypeName.equals("java.util.Set") || sTypeName.equals("java.util.HashSet")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toSet(param, false);
        }
      }
      else if(sTypeName.equals("java.sql.Date")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toSQLDate(param, null);
        }
      }
      else if(sTypeName.equals("java.sql.Time")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toSQLTime(param, null);
        }
      }
      else if(sTypeName.equals("java.sql.Timestamp")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = FUtil.toSQLTimestamp(param, null);
        }
      }
      else if(sTypeName.equals("java.lang.Object")) {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else {
          aoResult[i] = param;
        }
      }
      else {
        if(param == null || param.equals("null")) {
          aoResult[i] = null;
        }
        else if(param instanceof Map) {
          aoResult[i] = FUtil.populateBean(types[i], (Map) param);
        }
        else if(param instanceof String) {
          if(types[i].isEnum()) {
            try {
              aoResult[i] = Enum.valueOf(types[i], (String) param);
            }
            catch(Exception ex) {
              System.err.println("RpcUtil.getParametersExt(" + method + "," + params + "): " + ex);
              return null;
            }
          }
          else {
            return null;
          }
        }
        else {
          return null;
        }
      }
    }
    return aoResult;
  }
  
  protected static
  String getStringParams(List list)
  {
    if(list == null || list.size() == 0) return "";
    String sResult = "";
    for(int i = 0; i < list.size(); i++) {
      Object oValue = list.get(i);
      if(oValue == null) {
        sResult += ",null";
      }
      else {
        sResult += "," + oValue.getClass().getName();
      }
    }
    if(sResult.length() > 0) sResult = sResult.substring(1);
    return sResult;
  }
}
