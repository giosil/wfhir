package org.dew.fhir.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public
class Arrays
{
  public static
  byte[] toArrayOfByte(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new byte[0];
    byte[] aResult = new byte[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = (byte) 0;
      }
      else if(oValue instanceof Number) {
        aResult[i++] = ((Number) oValue).byteValue();
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  char[] toArrayOfChar(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new char[0];
    char[] aResult = new char[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = ' ';
      }
      else if(oValue instanceof Number) {
        aResult[i++] = (char)((Number) oValue).intValue();
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  int[] toArrayOfInt(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new int[0];
    int[] aResult = new int[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = 0;
      }
      else if(oValue instanceof Number) {
        aResult[i++] = ((Number) oValue).intValue();
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  int[] toArrayOfInt(Collection<?> collection, boolean boStrict)
  {
    if(collection == null || collection.size() == 0) return new int[0];
    int[] aResult = new int[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(boStrict) {
        if(oValue == null) {
          aResult[i++] = 0;
        }
        else if(oValue instanceof Number) {
          aResult[i++] = ((Number) oValue).intValue();
        }
        else {
          return null;
        }
      }
      else {
        if(oValue == null) {
          aResult[i++] = 0;
        }
        else if(oValue instanceof Number) {
          aResult[i++] = ((Number) oValue).intValue();
        }
        else if(oValue instanceof String) {
          int iValue = 0;
          try{ iValue = Integer.parseInt((String) oValue); } catch(Exception ex) {}
          aResult[i++] = iValue;
        }
        else {
          return null;
        }
      }
    }
    return aResult;
  }
  
  public static
  double[] toArrayOfDouble(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new double[0];
    double[] aResult = new double[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = 0.0d;
      }
      else if(oValue instanceof Number) {
        aResult[i++] = ((Number) oValue).doubleValue();
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  double[] toArrayOfDouble(Collection<?> collection, boolean boStrict)
  {
    if(collection == null || collection.size() == 0) return new double[0];
    double[] aResult = new double[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(boStrict) {
        if(oValue == null) {
          aResult[i++] = 0.0d;
        }
        else if(oValue instanceof Number) {
          aResult[i++] = ((Number) oValue).doubleValue();
        }
        else {
          return null;
        }
      }
      else {
        if(oValue == null) {
          aResult[i++] = 0.0d;
        }
        else if(oValue instanceof Number) {
          aResult[i++] = ((Number) oValue).doubleValue();
        }
        else if(oValue instanceof String) {
          double dValue = 0;
          try{ dValue = Double.parseDouble(((String) oValue).replace(',','.')); } catch(Exception ex) {}
          aResult[i++] = dValue;
        }
        else {
          return null;
        }
      }
    }
    return aResult;
  }
  
  public static
  boolean[] toArrayOfBoolean(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new boolean[0];
    boolean[] aResult = new boolean[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = false;
      }
      else if(oValue instanceof Boolean) {
        aResult[i++] = ((Boolean) oValue).booleanValue();
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  String[] toArrayOfString(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new String[0];
    String[] aResult = new String[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = null;
      }
      else if(oValue instanceof String) {
        aResult[i++] = (String) oValue;
      }
      else if(oValue instanceof CharSequence) {
        aResult[i++] = oValue.toString();
      }
      else if(oValue instanceof byte[]) {
        aResult[i++] = new String((byte[]) oValue);
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  java.util.Date[] toArrayOfDate(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new java.util.Date[0];
    java.util.Date[] aResult = new java.util.Date[collection.size()];
    int i = 0;
    Iterator<?>iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = null;
      }
      else if(oValue instanceof java.sql.Date) {
        aResult[i++] = new java.util.Date(((java.sql.Date) oValue).getTime());
      }
      else if(oValue instanceof java.sql.Time) {
        aResult[i++] = new java.util.Date(((java.sql.Time) oValue).getTime());
      }
      else if(oValue instanceof java.sql.Timestamp) {
        aResult[i++] = new java.util.Date(((java.sql.Timestamp) oValue).getTime());
      }
      else if(oValue instanceof java.util.Date) {
        aResult[i++] = (java.util.Date) oValue;
      }
      else if(oValue instanceof java.util.Calendar) {
        aResult[i++] = ((java.util.Calendar) oValue).getTime();
      }
      else if(oValue instanceof String) {
        Calendar cal = FUtil.stringToCalendar((String) oValue);
        if(cal == null) return null;
        aResult[i++] = new java.util.Date(cal.getTimeInMillis());
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  java.util.Calendar[] toArrayOfCalendar(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new java.util.Calendar[0];
    java.util.Calendar[] aResult = new java.util.Calendar[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = null;
        continue;
      }
      else if(oValue instanceof java.util.Calendar) {
        aResult[i++] = (java.util.Calendar) oValue;
        continue;
      }
      Calendar cal = Calendar.getInstance();
      if(oValue instanceof java.sql.Date) {
        cal.setTimeInMillis(((java.sql.Date) oValue).getTime());
        aResult[i++] = cal;
      }
      else if(oValue instanceof java.sql.Time) {
        cal.setTimeInMillis(((java.sql.Time) oValue).getTime());
        aResult[i++] = cal;
      }
      else if(oValue instanceof java.sql.Timestamp) {
        cal.setTimeInMillis(((java.sql.Timestamp) oValue).getTime());
        aResult[i++] = cal;
      }
      else if(oValue instanceof java.util.Date) {
        cal.setTimeInMillis(((java.util.Date) oValue).getTime());
        aResult[i++] = cal;
      }
      else if(oValue instanceof String) {
        cal = FUtil.stringToCalendar((String) oValue);
        if(cal == null) return null;
        aResult[i++] = cal;
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  BigDecimal[] toArrayOfBigDecimal(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new BigDecimal[0];
    BigDecimal[] aResult = new BigDecimal[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = null;
      }
      else if(oValue instanceof BigDecimal) {
        aResult[i++] = (BigDecimal) oValue;
      }
      else if(oValue instanceof Number) {
        aResult[i++] = FUtil.toBigDecimal(oValue, null);
      }
      else if(oValue instanceof String) {
        aResult[i++] = FUtil.toBigDecimal(oValue, null);
      }
      else {
        return null;
      }
    }
    return aResult;
  }
  
  public static
  BigInteger[] toArrayOfBigInteger(Collection<?> collection)
  {
    if(collection == null || collection.size() == 0) return new BigInteger[0];
    BigInteger[] aResult = new BigInteger[collection.size()];
    int i = 0;
    Iterator<?> iterator = collection.iterator();
    while(iterator.hasNext()) {
      Object oValue = iterator.next();
      if(oValue == null) {
        aResult[i++] = null;
      }
      else if(oValue instanceof BigInteger) {
        aResult[i++] = (BigInteger) oValue;
      }
      else if(oValue instanceof Number) {
        aResult[i++] = FUtil.toBigInteger(oValue, null);
      }
      else if(oValue instanceof String) {
        aResult[i++] = FUtil.toBigInteger(oValue, null);
      }
      else {
        return null;
      }
    }
    return aResult;
  }
}
