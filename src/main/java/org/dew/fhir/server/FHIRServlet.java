package org.dew.fhir.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dew.fhir.mock.MockOrganizationService;
import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.OperationOutcomeIssue;
import org.dew.fhir.model.Resource;

import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;
import org.dew.fhir.services.FHIRServices;
import org.dew.fhir.services.IFHIRService;
import org.dew.fhir.util.FHIRUtil;

/**
 * 
 * FHIR Server.
 *
 */
public 
class FHIRServlet extends HttpServlet 
{
  private static final long serialVersionUID = -8635635498516268187L;
  
  protected static int BUFF_LENGTH = 1024;
  
  protected FHIRServices services = new FHIRServices();
  
  @Override
  public 
  void init() 
    throws ServletException 
  {
    services.addHandler("organization", new MockOrganizationService());
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
    FHIRRequest fhirRequest = createFHIRRequest(request);
    if(fhirRequest == null) return;
    
    IFHIRService service = services.getHandler(fhirRequest.getType());
    if(service == null) {
      response.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    
    FHIRResponse fhirResponse = null;
    try {
      if(fhirRequest.isHistory()) {
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
    FHIRRequest fhirRequest = createFHIRRequest(request);
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
    FHIRRequest fhirRequest = createFHIRRequest(request);
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
    FHIRRequest fhirRequest = createFHIRRequest(request);
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
    FHIRRequest fhirRequest = createFHIRRequest(request);
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
  FHIRRequest createFHIRRequest(HttpServletRequest request)
    throws IOException
  {
    FHIRRequest result = new FHIRRequest();
    
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
      result.addParameter(name, request.getParameter(name));
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
    byte[] buff = new byte[BUFF_LENGTH];
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
          data = FHIRUtil.serialize(createOperationOutcome("NR"), contentType);
        }
      }
    }
    if(data == null) data = "";
    byte[] content = data.getBytes();
    
    response.setContentType(contentType);
    response.setContentLength(content.length);
    
    OutputStream out = response.getOutputStream();
    out.write(content, 0, content.length);
    out.flush();
  }
  
  protected
  String getBase(HttpServletRequest request)
  {
    String result = request.getServletPath();
    if(result == null || result.length() == 0) {
      return "http://localhost:8080/wfhir/fhir";
    }
    if(result.endsWith("/")) {
      return result.substring(0, result.length()-1);
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
    if(pathInfo.startsWith("/'")) {
      pathInfo = pathInfo.substring(1);
    }
    if(pathInfo.endsWith("/")) {
      pathInfo = pathInfo.substring(0, pathInfo.length()-1);
    }
    if(pathInfo.length() == 0) return new ArrayList<String>();
    return Arrays.asList(pathInfo.split("/"));
  }
  
  protected
  OperationOutcome createOperationOutcome(String code)
  {
    OperationOutcomeIssue issue = new OperationOutcomeIssue();
    issue.setCode(code);
    OperationOutcome operationOutcome = new OperationOutcome();
    operationOutcome.setIssue(new OperationOutcomeIssue[] { issue });
    
    return operationOutcome;
  }
}
