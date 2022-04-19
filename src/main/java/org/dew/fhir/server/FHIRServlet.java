package org.dew.fhir.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.security.Principal;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.Resource;

import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;
import org.dew.fhir.services.FHIRServices;
import org.dew.fhir.services.IFHIRService;

import org.dew.fhir.util.Base64Coder;
import org.dew.fhir.util.FHIRUtil;

/**
 * 
 * FHIR Servlet.
 * 
 * <pre>
 * public
 * class WebServices extends org.rpc.server.RpcServlet
 * {
 *   public
 *   void init()
 *     throws javax.servlet.ServletException
 *   {
 *     baseLocation     = null;
 *     checkSession     = false;
 *     checkSessionName = "user";
 *     basicAuth        = true;
 *     basicRealm       = "wfhir";
 *     
 *     services.addHandler("organization", new MockOrganizationService());
 *   }
 *   
 *   protected
 *   Principal authenticate(String username, String password)
 *   {
 *     if(!username.equals(password)) return null;
 *     return new FHIRPrincipal(username);
 *   }
 *  }
 *  </pre>
 */
public 
class FHIRServlet extends HttpServlet 
{
  private static final long serialVersionUID = 7815919572017690048L;
  
  protected FHIRServices services = new FHIRServices();
  
  protected String  baseLocation     = null;
  protected boolean checkSession     = false;
  protected String  checkSessionName = "user";
  protected boolean basicAuth        = false;
  protected String  basicRealm       = "wfhir";
  protected String  encoding         = null;
  protected int     basicExpiryIn    = 4*60*60*1000;
  protected Map<String, PrincipalExpiryIn> basicCache = new LinkedHashMap<String, PrincipalExpiryIn>();
  
  @Override
  public 
  void init() 
    throws ServletException 
  {
  }
  
  @Override
  protected 
  void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    String method = request.getMethod();
    if(method.equals("PATCH")) {
      doPatch(request, response);
    }
    else {
      super.service(request, response);
    }
  }
  
  @Override
  public
  void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Principal principal = checkSecurity(request, response);
    if(principal == null) return;
    
    FHIRRequest fhirRequest = createFHIRRequest(request, principal);
    if(fhirRequest == null) return;
    
    IFHIRService service = services.getHandler(fhirRequest.getType());
    if(service == null) {
      response.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    
    FHIRResponse fhirResponse = null;
    try {
      if(fhirRequest.isSearch()) {
        fhirResponse = service.search(fhirRequest);
      }
      else if(fhirRequest.isHistory()) {
        fhirResponse = service.vread(fhirRequest);
      }
      else {
        fhirResponse = service.read(fhirRequest);
      }
    }
    catch(Exception ex) {
      response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
      return;
    }
    
    send(request, response, fhirRequest, fhirResponse);
  }
  
  @Override
  public
  void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Principal principal = checkSecurity(request, response);
    if(principal == null) return;
    
    FHIRRequest fhirRequest = createFHIRRequest(request, principal);
    if(fhirRequest == null) return;
    
    IFHIRService service = services.getHandler(fhirRequest.getType());
    if(service == null) {
      response.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    
    FHIRResponse fhirResponse = null;
    try {
      fhirResponse = service.create(fhirRequest);
    }
    catch(Exception ex) {
      response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
      return;
    }
    
    send(request, response, fhirRequest, fhirResponse);
  }
  
  @Override
  public
  void doPut(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Principal principal = checkSecurity(request, response);
    if(principal == null) return;
    
    FHIRRequest fhirRequest = createFHIRRequest(request, principal);
    if(fhirRequest == null) return;
    
    IFHIRService service = services.getHandler(fhirRequest.getType());
    if(service == null) {
      response.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    
    FHIRResponse fhirResponse = null;
    try {
      fhirResponse = service.update(fhirRequest);
    }
    catch(Exception ex) {
      response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
      return;
    }
    
    send(request, response, fhirRequest, fhirResponse);
  }
  
  @Override
  public
  void doDelete(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Principal principal = checkSecurity(request, response);
    if(principal == null) return;
    
    FHIRRequest fhirRequest = createFHIRRequest(request, principal);
    if(fhirRequest == null) return;
    
    IFHIRService service = services.getHandler(fhirRequest.getType());
    if(service == null) {
      response.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    
    FHIRResponse fhirResponse = null;
    try {
      fhirResponse = service.delete(fhirRequest);
    }
    catch(Exception ex) {
      response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
      return;
    }
    
    send(request, response, fhirRequest, fhirResponse);
  }
  
  public
  void doPatch(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Principal principal = checkSecurity(request, response);
    if(principal == null) return;
    
    FHIRRequest fhirRequest = createFHIRRequest(request, principal);
    if(fhirRequest == null) return;
    
    IFHIRService service = services.getHandler(fhirRequest.getType());
    if(service == null) {
      response.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    
    FHIRResponse fhirResponse = null;
    try {
      fhirResponse = service.patch(fhirRequest);
    }
    catch(Exception ex) {
      response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
      return;
    }
    
    send(request, response, fhirRequest, fhirResponse);
  }
  
  protected 
  Principal checkSecurity(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    Principal principal = request.getUserPrincipal();
    if(principal != null) return principal;
    
    boolean checkFailed = false;
    
    if(checkSession) {
      principal = checkSession(request, response);
      if(principal != null) return principal;
      checkFailed = true;
    }
    
    if(basicAuth) {
      principal = checkBasicAuth(request, response);
      if(principal != null) return principal;
      checkFailed = true;
    }
    
    if(checkFailed) return null;
    // anonymous
    return new FHIRPrincipal();
  }
  
  protected
  Principal checkSession(HttpServletRequest request, HttpServletResponse response)
  {
    if(checkSessionName == null || checkSessionName.length() == 0) {
      return null;
    }
    HttpSession httpSession = request.getSession(false);
    if(httpSession == null) {
      if(!basicAuth) {
        try{ response.sendError(403); } catch(Throwable ignore) {} // Forbidden
      }
      return null;
    }
    Object checkObject = httpSession.getAttribute(checkSessionName);
    if(checkObject == null) {
      if(!basicAuth) {
        try{ response.sendError(403); } catch(Throwable ignore) {} // Forbidden
      }
      return null;
    }
    if(checkObject instanceof Principal) {
      return (Principal) checkObject;
    }
    return new FHIRPrincipal(checkObject.toString());
  }
  
  protected
  Principal checkBasicAuth(HttpServletRequest request, HttpServletResponse response)
  {
    Principal result = null;
    final String sAuthorization = request.getHeader("Authorization");
    // Basic Base64_User:Password (Length of Base64 encoded string is a multiple of 4)
    if(sAuthorization == null || sAuthorization.length() < 10) {
      response.addHeader("WWW-Authenticate", "Basic realm=\"" + basicRealm + "\"");
      try{ response.sendError(401); } catch(Throwable ignore) {} // Unauthorized
      return null;
    }
    else {
      String credentials = null;
      int iSep = -1;
      if(sAuthorization.startsWith("Bearer")) {
        credentials = sAuthorization.substring(7);
      }
      else {
        try{
          credentials = Base64Coder.decodeString(sAuthorization.substring(6));
        }
        catch(Throwable th) {
          try{ response.sendError(403); } catch(Throwable ignore) {} // Forbidden
          return null;
        }
        iSep = credentials.indexOf(':');
        if(iSep <= 0) {
          try{ response.sendError(403); } catch(Throwable ignore) {} // Forbidden
          return null;
        }
      }
      // Check cache
      final long currentTimeMillis = System.currentTimeMillis();
      boolean alreadyCached = false;
      final PrincipalExpiryIn principalExpiryIn = (PrincipalExpiryIn) basicCache.get(credentials);
      if(principalExpiryIn != null) {
        alreadyCached = true;
        if(principalExpiryIn.expiryIn > currentTimeMillis) {
          return principalExpiryIn.principal;
        }
      }
      if(iSep < 0) {
        result = checkToken(credentials);
        if(result == null) {
          try{ response.sendError(403); } catch(Throwable ignore) {} // Forbidden
          return null;
        }
      }
      else {
        result = authenticate(credentials.substring(0,iSep), credentials.substring(iSep+1));
      }
      if(result == null) {
        response.addHeader("WWW-Authenticate", "Basic realm=\"" + basicRealm.replace('"', '\'') + "\"");
        try{ response.sendError(401); } catch(Throwable ignore) {} // Unauthorized
        return null;
      }
      basicCache.put(credentials, new PrincipalExpiryIn(result, currentTimeMillis + basicExpiryIn));
      if(!alreadyCached) {
        final Iterator<Map.Entry<String, PrincipalExpiryIn>> iterator = basicCache.entrySet().iterator();
        final Map.Entry<String, PrincipalExpiryIn> entry = iterator.next();
        final PrincipalExpiryIn firstPrincipalExpiryIn = (PrincipalExpiryIn) entry.getValue();
        if(firstPrincipalExpiryIn.expiryIn < currentTimeMillis) {
          iterator.remove();
        }
      }
    }
    return result;
  }
  
  protected
  Principal checkToken(String token)
  {
    return null;
  }
  
  protected
  Principal authenticate(String username, String password)
  {
    return new FHIRPrincipal(username);
  }
  
  protected
  FHIRRequest createFHIRRequest(HttpServletRequest request, Principal principal)
    throws IOException
  {
    FHIRRequest result = new FHIRRequest();
    
    if(principal != null) {
      result.setPrincipal(principal);
    }
    else {
      Principal userPrincipal = request.getUserPrincipal();
      if(userPrincipal != null) {
        result.setPrincipal(userPrincipal);
      }
    }
    
    result.setBase(getBase(request));
    
    List<String> pathInfo = getPathInfo(request);
    if(pathInfo.size() > 0) {
      if(pathInfo.size() > 0) {
        String type = pathInfo.remove(0);
        result.setType(type);
      }
      int history = pathInfo.indexOf("_history");
      if(history >= 0) {
        result.setHistory(true);
        pathInfo.remove(history);
      }
      if(pathInfo.size() > 0) {
        result.setId(pathInfo.remove(0));
      }
      if(pathInfo.size() > 0) {
        result.setVid(pathInfo.remove(0));
      }
    }
    
    Enumeration<String> parameterNames = request.getParameterNames();
    while(parameterNames.hasMoreElements()) {
      String name = parameterNames.nextElement();
      result.add(name, request.getParameter(name));
    }
    
    String format = result.getFormat();
    if(format == null || format.length() < 3) {
      String accept = request.getHeader("Accept");
      if(accept != null && accept.length() > 0) {
        int sep = accept.indexOf(' ');
        if(sep > 0) {
          result.setFormat(accept.substring(0, sep));
        }
        else {
          result.setFormat(accept);
        }
      }
    }
    
    InputStream is = request.getInputStream();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    byte[] buff = new byte[1024];
    int n;
    while((n = is.read(buff)) > 0) {
      baos.write(buff, 0, n);
    }
    String requestData = baos.toString();
    if(requestData != null && requestData.length() > 0) {
      try {
        result.setResource(FHIRUtil.deserialize(requestData, result.getType()));
      }
      catch(Exception ex) {
      }
    }
    
    return result;
  }
  
  protected
  void send(HttpServletRequest request, HttpServletResponse response, FHIRRequest fhirRequest, FHIRResponse fhirResponse)
    throws ServletException, IOException
  {
    String base = fhirRequest.getBase();
    if(base == null || base.length() == 0) {
      base = getBase(request);
    }
    
    if(encoding != null && encoding.length() > 0) {
      response.setCharacterEncoding(encoding);
    }
    
    String type = fhirRequest.getType();
    String id   = fhirResponse.getId();
    String vid  = fhirResponse.getVid();
    if(id != null && id.length() > 0) {
      String location = base + "/" + type + "/" + id;
      if(vid != null && vid.length() > 0) {
        location += "/_history/" + vid;
      }
      response.setHeader("Location", location);
    }
    
    String contentType = "application/json+fhir";
    String format = fhirRequest.getFormat();
    boolean xmlFormat = format != null && format.indexOf("xml") >= 0;
    if(xmlFormat) {
      contentType = "application/xml+fhir";
    }
    
    String data = null;
    OperationOutcome outcome = fhirResponse.getOutcome();
    if(outcome != null) {
      data = FHIRUtil.serialize(outcome, contentType);
    }
    else {
      Bundle bundle = fhirResponse.getBundle();
      if(bundle != null) {
        data = FHIRUtil.serialize(bundle, contentType);
      }
      else {
        Resource resource = fhirResponse.getResource();
        if(resource != null) {
          data = FHIRUtil.serialize(resource, contentType);
        }
        else {
          data = FHIRUtil.serialize(new OperationOutcome("error", "error", "No resource available"), contentType);
        }
      }
    }
    if(data == null) data = "";
    byte[] content = data.getBytes();
    
    if(encoding != null && encoding.length() > 0) {
      response.setContentType(contentType + "; charset=" + encoding);
    }
    else {
      response.setContentType(contentType);
    }
    response.setContentLength(content.length);
    
    OutputStream out = response.getOutputStream();
    out.write(content, 0, content.length);
    out.flush();
  }
  
  protected
  String getBase(HttpServletRequest request)
  {
    if(baseLocation != null && baseLocation.length() > 7) {
      return baseLocation;
    }
    
    String serverName  = request.getServerName();
    int    serverPort  = request.getServerPort();
    String ctxPath     = request.getContextPath();
    String servletPath = request.getServletPath();
    String protocol    = serverPort == 443 ? "https" : "http";
    
    String result      = protocol + "://";
    if(serverName == null || serverName.length() == 0) {
      serverName = "localhost";
    }
    result += serverName;
    if(serverPort != 80 && serverPort != 443) {
      result += ":" + serverPort;
    }
    if(ctxPath == null || ctxPath.length() == 0) {
      ctxPath = "/wfhir";
    }
    if(ctxPath.startsWith("/")) {
      result += ctxPath;
    }
    else {
      result += "/" + ctxPath;
    }
    if(servletPath == null || servletPath.length() == 0) {
      servletPath = "/fhir";
    }
    if(servletPath.startsWith("/")) {
      result += servletPath;
    }
    else {
      result += "/" + servletPath;
    }
    return result;
  }
  
  protected
  List<String> getPathInfo(HttpServletRequest request)
  {
    String pathInfo = request.getPathInfo();
    if(pathInfo == null) {
      return new ArrayList<String>();
    }
    if(pathInfo.startsWith("/")) {
      pathInfo = pathInfo.substring(1);
    }
    if(pathInfo.endsWith("/")) {
      pathInfo = pathInfo.substring(0, pathInfo.length()-1);
    }
    List<String> result = new ArrayList<String>();
    if(pathInfo.length() == 0) return result;
    String[] array = pathInfo.split("/");
    if(array == null || array.length == 0) {
      return result;
    }
    for(int i = 0; i < array.length; i++) {
      result.add(array[i]);
    }
    return result;
  }
  
  static class PrincipalExpiryIn
  {
    private Principal principal;
    private long      expiryIn;
    
    public PrincipalExpiryIn(Principal principal, long expiryIn) {
      this.principal = principal;
      this.expiryIn  = expiryIn;
    }
    
    public Principal getPrincipal() {
      return principal;
    }
    
    public long getExpiryIn() {
      return expiryIn;
    }
  }
}
