package org.dew.fhir.client;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import java.lang.reflect.Field;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

import org.dew.fhir.util.Base64Coder;

public 
class WHttp 
{
  protected String urlBase;
  protected String basicAuthUsername;
  protected String basicAuthPassword;
  protected String bearer;
  protected String charsetName = "UTF-8";
  protected String defaultContentType = "application/fhir+json";
  protected Map<String, Object> headers;
  
  protected int connectTimeout = 60000;
  protected int readTimeout = 60000;
  protected SSLSocketFactory sslSocketFactory;
  
  protected int lastStatusCode;
  
  protected OutputStream tracerRequest;
  protected OutputStream tracerResponse;
  
  public WHttp()
  {
  }

  public WHttp(String urlBase)
  {
    this.urlBase = urlBase;
  }
  
  public WHttp(String urlBase, Map<String, Object> headers)
  {
    this.urlBase = urlBase;
    this.headers = headers;
  }
  
  public OutputStream getTracerRequest() {
    return tracerRequest;
  }
  
  public void setTracerRequest(OutputStream tracerRequest) {
    this.tracerRequest = tracerRequest;
  }
  
  public void setTracerRequest(String filePath) {
    if(filePath == null || filePath.length() == 0) {
      this.tracerRequest = null;
    }
    else {
      try {
        this.tracerRequest = new FileOutputStream(filePath);
      }
      catch(Exception ex) {
        ex.printStackTrace();
        this.tracerRequest = null;
      }
    }
  }
  
  public OutputStream getTracerResponse() {
    return tracerResponse;
  }
  
  public void setTracerResponse(OutputStream tracerResponse) {
    this.tracerResponse = tracerResponse;
  }
  
  public void setTracerResponse(String filePath) {
    if(filePath == null || filePath.length() == 0) {
      this.tracerResponse = null;
    }
    else {
      try {
        this.tracerResponse = new FileOutputStream(filePath);
      }
      catch(Exception ex) {
        ex.printStackTrace();
        this.tracerResponse = null;
      }
    }
  }
  
  public String getUrlBase() {
    return urlBase;
  }

  public String getBasicAuthUsername() {
    return basicAuthUsername;
  }

  public String getBasicAuthPassword() {
    return basicAuthPassword;
  }

  public String getBearer() {
    return bearer;
  }

  public String getCharsetName() {
    return charsetName;
  }

  public String getDefaultContentType() {
    return defaultContentType;
  }

  public Map<String, Object> getHeaders() {
    return headers;
  }

  public int getConnectTimeout() {
    return connectTimeout;
  }

  public int getReadTimeout() {
    return readTimeout;
  }

  public int getLastStatusCode() {
    return lastStatusCode;
  }

  public void setUrlBase(String urlBase) {
    this.urlBase = urlBase;
  }

  public void setBasicAuthUsername(String basicAuthUsername) {
    this.basicAuthUsername = basicAuthUsername;
  }

  public void setBasicAuthPassword(String basicAuthPassword) {
    this.basicAuthPassword = basicAuthPassword;
  }

  public void setBearer(String bearer) {
    this.bearer = bearer;
  }

  public void setCharsetName(String charsetName) {
    this.charsetName = charsetName;
  }

  public void setDefaultContentType(String defaultContentType) {
    this.defaultContentType = defaultContentType;
  }

  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  public void setConnectTimeout(int connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public void setReadTimeout(int readTimeout) {
    this.readTimeout = readTimeout;
  }

  public SSLSocketFactory getSslSocketFactory() {
    return sslSocketFactory;
  }

  public void setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
    this.sslSocketFactory = sslSocketFactory;
  }

  public
  String get()
    throws Exception
  {
    return http("GET", null, null, null);
  }
  
  public
  String get(String url)
    throws Exception
  {
    return http("GET", url, null, null);
  }
  
  public
  String get(Map<String, Object> parameters)
    throws Exception
  {
    return http("GET", null, parameters, null);
  }
  
  public
  String get(String url, Map<String, Object> parameters)
    throws Exception
  {
    return http("GET", url, parameters, null);
  }
  
  public
  int head()
    throws Exception
  {
    return head(null, null);
  }
  
  public
  int head(String url)
    throws Exception
  {
    return head(url, null);
  }
  
  public
  int head(Map<String, Object> parameters)
    throws Exception
  {
    return head(null, parameters);
  }
  
  public
  int head(String url, Map<String, Object> parameters)
    throws Exception
  {
    String sURL = null;
    if(parameters != null && !parameters.isEmpty()) {
      sURL = getCompleteURL(url, parameters);
    }
    else {
      sURL = getCompleteURL(url);
    }
    if(tracerRequest != null) {
      try{ 
        tracerRequest.write(("HEAD " + sURL).getBytes());
        tracerRequest.write('\n');
      } 
      catch(Exception ex) {
      }
    }
    HttpURLConnection connection = (HttpURLConnection) new URL(sURL).openConnection();
    connection.setRequestMethod("HEAD");
    if(bearer != null && bearer.length() > 0) {
      connection.addRequestProperty("Authorization", "Bearer " + bearer);
    }
    else if(basicAuthUsername != null && basicAuthUsername.length() > 0) {
      if(basicAuthPassword == null) basicAuthPassword = "";
      connection.addRequestProperty("Authorization", "Basic " + Base64Coder.encodeString(basicAuthUsername + ":" + basicAuthPassword));
    }
    if(connectTimeout > 0) {
      connection.setConnectTimeout(connectTimeout);
    }
    if(readTimeout > 0) {
      connection.setReadTimeout(readTimeout);
    }
    int statusCode = connection.getResponseCode();
    lastStatusCode = statusCode;
    if(tracerResponse != null) {
      try{ 
        tracerResponse.write(String.valueOf(statusCode).getBytes());
        tracerResponse.write('\n');
      } 
      catch(Exception ex) {
      }
    }
    return statusCode;
  }
  
  public
  String post(String data)
    throws Exception
  {
    return http("POST", null, null, data);
  }
  
  public
  String post(String url, String data)
    throws Exception
  {
    return http("POST", url, null, data);
  }
  
  public
  String post(Map<String, Object> parameters)
    throws Exception
  {
    return http("POST", null, parameters, null);
  }
  
  public
  String post(String url, Map<String, Object> parameters)
    throws Exception
  {
    return http("POST", url, parameters, null);
  }
  
  public
  String post(Map<String, Object> parameters, String data)
    throws Exception
  {
    return http("POST", null, parameters, data);
  }
  
  public
  String post(String url, Map<String, Object> parameters, String data)
    throws Exception
  {
    return http("POST", url, parameters, data);
  }
  
  public
  String put(String data)
    throws Exception
  {
    return http("PUT", null, null, data);
  }
  
  public
  String put(String url, String data)
    throws Exception
  {
    return http("PUT", url, null, data);
  }
  
  public
  String put(Map<String, Object> parameters)
    throws Exception
  {
    return http("PUT", null, parameters, null);
  }
  
  public
  String put(String url, Map<String, Object> parameters)
    throws Exception
  {
    return http("PUT", url, parameters, null);
  }
  
  public
  String put(Map<String, Object> parameters, String data)
    throws Exception
  {
    return http("PUT", null, parameters, data);
  }
  
  public
  String put(String url, Map<String, Object> parameters, String data)
    throws Exception
  {
    return http("PUT", url, parameters, data);
  }
  
  public
  String patch(String data)
    throws Exception
  {
    return http("PATCH", null, null, data);
  }
  
  public
  String patch(String url, String data)
    throws Exception
  {
    return http("PATCH", url, null, data);
  }
  
  public
  String patch(Map<String, Object> parameters)
    throws Exception
  {
    return http("PATCH", null, parameters, null);
  }
  
  public
  String patch(String url, Map<String, Object> parameters)
    throws Exception
  {
    return http("PATCH", url, parameters, null);
  }
  
  public
  String patch(Map<String, Object> parameters, String data)
    throws Exception
  {
    return http("PATCH", null, parameters, data);
  }
  
  public
  String patch(String url, Map<String, Object> parameters, String data)
    throws Exception
  {
    return http("PATCH", url, parameters, data);
  }
  
  public
  String delete()
    throws Exception
  {
    return http("DELETE", null, null, null);
  }
  
  public
  String delete(String url)
    throws Exception
  {
    return http("DELETE", url, null, null);
  }
  
  public
  String delete(Map<String, Object> parameters)
    throws Exception
  {
    return http("DELETE", null, parameters, null);
  }
  
  public
  String delete(String url, Map<String, Object> parameters)
    throws Exception
  {
    return http("DELETE", url, parameters, null);
  }
  
  public
  String http(String method, String url, Map<String, Object> parameters, String data)
    throws Exception
  {
    String sURL = "";
    
    if(method == null || method.length() < 2) {
      method = "GET";
    }
    else {
      method = method.toUpperCase();
    }
    
    boolean noBodyMethod = "GET".equals(method) || "HEAD".equals(method) || "DELETE".equals(method);
    boolean patchMethod  = "PATCH".equals(method);
    
    if(noBodyMethod) {
      sURL = getCompleteURL(url, parameters);
    }
    else {
      if(data != null && data.length() > 0) {
        sURL = getCompleteURL(url, parameters);
      }
      else {
        sURL = getCompleteURL(url);
      }
    }
    
    if(tracerRequest != null) {
      try{ 
        tracerRequest.write((method + " " + sURL).getBytes());
        tracerRequest.write('\n');
      } 
      catch(Exception ex) {
      }
    }
    
    HttpURLConnection connection = (HttpURLConnection) new URL(sURL).openConnection();
    
    if(patchMethod) {
      // HttpURLConnection don't support PATCH method
      try {
        final Object target;
        if(connection instanceof HttpsURLConnection) {
          final Field delegate = connection.getClass().getDeclaredField("delegate");
          delegate.setAccessible(true);
          target = delegate.get(connection);
        } 
        else {
          target = connection;
        }
        final Field fieldMethod = HttpURLConnection.class.getDeclaredField("method");
        fieldMethod.setAccessible(true);
        fieldMethod.set(target, "PATCH");
      }
      catch(Exception ex) {
        connection.setRequestProperty("X-HTTP-Method-Override", "PATCH");
        connection.setRequestMethod("POST");
      }
    }
    else {
      connection.setRequestMethod(method);
    }
    
    if(headers != null && !headers.isEmpty()) {
      Iterator<Map.Entry<String, Object>> iterator = headers.entrySet().iterator();
      while(iterator.hasNext()) {
        Map.Entry<String, Object> entry = iterator.next();
        String key = entry.getKey();
        if(key == null || key.length() == 0) continue;
        String val = toString(entry.getValue(), null);
        if(val == null) continue;
        connection.addRequestProperty(key, val);
      }
    }
    
    if(bearer != null && bearer.length() > 0) {
      connection.addRequestProperty("Authorization", "Bearer " + bearer);
    }
    else if(basicAuthUsername != null && basicAuthUsername.length() > 0) {
      if(basicAuthPassword == null) basicAuthPassword = "";
      connection.addRequestProperty("Authorization", "Basic " + Base64Coder.encodeString(basicAuthUsername + ":" + basicAuthPassword));
    }
    
    if(!noBodyMethod) {
      if(data != null && data.length() > 0) {
        if(data.startsWith("<")) {
          connection.addRequestProperty("Content-Type", "text/xml");
        }
        else {
          connection.addRequestProperty("Content-Type", defaultContentType);
        }
      }
      else if(parameters != null && !parameters.isEmpty()) {
        connection.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        
        data = toQueryString(parameters);
      }
      if(data != null && data.length() > 0) {
        connection.setDoOutput(true);
      }
    }
    
    if(sslSocketFactory != null) {
      if(connection instanceof HttpsURLConnection) {
        ((HttpsURLConnection) connection).setSSLSocketFactory(sslSocketFactory);
      }
    }
    if(connectTimeout > 0) {
      connection.setConnectTimeout(connectTimeout);
    }
    if(readTimeout > 0) {
      connection.setReadTimeout(readTimeout);
    }
    
    int statusCode = 0;
    boolean error = false;
    OutputStream out = null;
    try {
      if(data != null && data.length() > 0) {
        if(tracerRequest != null) {
          try{ 
            tracerRequest.write(data.getBytes());
            tracerRequest.write('\n');
          } 
          catch(Exception ex) {
          }
        }
        
        byte[] abData = data.getBytes(charsetName);
        connection.addRequestProperty("Content-Length", String.valueOf(abData.length));
        
        out = connection.getOutputStream();
        out.write(abData);
        out.flush();
        out.close();
      }
      
      statusCode = connection.getResponseCode();
      lastStatusCode = statusCode;
      error = statusCode >= 400;
    }
    finally {
      if(out != null) try{ out.close(); } catch(Exception ex) {}
    }
    
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      BufferedInputStream  bis = new BufferedInputStream(error ? connection.getErrorStream() : connection.getInputStream());
      byte[] buff = new byte[1024];
      int n;
      while((n = bis.read(buff)) > 0) baos.write(buff, 0, n);
      baos.flush();
      baos.close();
    }
    finally {
      if(connection != null) try{ connection.disconnect(); } catch(Exception ex) {}
    }
    
    if(error) throw new Exception("HTTP " + statusCode);
    
    byte[] abResponse = new String(baos.toByteArray(), charsetName).getBytes();
    
    if(tracerResponse != null) {
      try{ 
        tracerResponse.write(abResponse); 
        tracerResponse.write('\n');
      } 
      catch(Exception ex) {
      }
    }
    
    String result = new String(abResponse);
    return result;
  }
  
  public
  String getCompleteURL(String url)
  {
    if(url == null || url.length() == 0) {
      return urlBase;
    }
    if(urlBase == null || urlBase.length() == 0) {
      return url;
    }
    if(urlBase.indexOf('?') > 0) {
      return urlBase + "&" + url;
    }
    if(url != null && url.startsWith("/")) {
      return urlBase + url;
    }
    return urlBase + "/" + url;
  }
  
  public
  String getCompleteURL(String url, Map<String, Object> parameters)
  {
    String queryString = null;
    if(parameters != null && !parameters.isEmpty()) {
      queryString = toQueryString(parameters);
    }
    if(url == null || url.length() == 0) {
      if(queryString != null && queryString.length() > 0 && urlBase != null) {
        if(urlBase.indexOf('?') >= 0) {
          return urlBase + "&" + queryString;
        }
        else {
          return urlBase + "?" + queryString;
        }
      }
      return urlBase;
    }
    if(urlBase == null || urlBase.length() == 0) {
      if(queryString != null && queryString.length() > 0 && url != null) {
        if(url.indexOf('?') >= 0) {
          return url + "&" + queryString;
        }
        else {
          return url + "?" + queryString;
        }
      }
      return url;
    }
    String result = null;
    if(urlBase.indexOf('?') > 0) {
      result = urlBase + "&" + url;
    }
    else if(url != null && (url.startsWith("/") || url.startsWith(";"))) {
      result = urlBase + url;
    }
    else {
      result = urlBase + "/" + url;
    }
    if(queryString != null && queryString.length() > 0 && result != null) {
      if(url.indexOf('?') >= 0) {
        return result + "&" + queryString;
      }
      else {
        return result + "?" + queryString;
      }
    }
    return result;
  }
  
  public static
  String encode(Object value)
  {
    if(value == null) return "";
    String sValue = toString(value, "");
    try {
      return URLEncoder.encode(sValue, "UTF-8");
    }
    catch(Exception ex) {
      return sValue;
    }
  }
  
  public static
  void appendParam(StringBuilder sb, String parameterName, Object value)
  {
    if(value == null) return;
    
    if(sb.length() == 0) {
      sb.append(parameterName + "=" + encode(value));
    }
    else {
      sb.append("&" + parameterName + "=" + encode(value));
    }
  }
  
  public static
  String toQueryString(Map<String, Object> map)
  {
    if(map == null || map.isEmpty()) {
      return "";
    }
    StringBuilder sb = new StringBuilder(map.size() * 2 * 8);
    Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
    while(iterator.hasNext()) {
      Map.Entry<String, Object> entry = iterator.next();
      String key = entry.getKey();
      Object val = entry.getValue();
      appendParam(sb, key, val);
    }
    return sb.toString();
  }
  
  public static
  String toString(Object value, String sDefault)
  {
    if(value == null) {
      return sDefault;
    }
    if(value instanceof String) {
      return (String) value;
    }
    if(value instanceof Calendar) {
      return formatDate((Calendar) value);
    }
    if(value instanceof Date) {
      return formatDate((Date) value);
    }
    return value.toString();
  }
  
  public static
  String formatDate(Calendar cal)
  {
    if(cal == null) return "";
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    
    String sYear  = String.valueOf(iYear);
    String sMonth = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay   = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    
    return sYear + "-" + sMonth + "-" + sDay;
  }
  
  public static
  String formatDate(Date date)
  {
    if(date == null) return "";
    
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(date.getTime());
    
    int iYear  = cal.get(Calendar.YEAR);
    int iMonth = cal.get(Calendar.MONTH) + 1;
    int iDay   = cal.get(Calendar.DATE);
    
    String sYear  = String.valueOf(iYear);
    String sMonth = iMonth < 10 ? "0" + iMonth : String.valueOf(iMonth);
    String sDay   = iDay   < 10 ? "0" + iDay   : String.valueOf(iDay);
    
    return sYear + "-" + sMonth + "-" + sDay;
  }
}