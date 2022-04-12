package org.dew.fhir.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dew.fhir.model.Resource;
import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;

/**
 * 
 * FHIR Server.
 *
 */
public 
class FHIRServer extends HttpServlet 
{
  private static final long serialVersionUID = -8635635498516268187L;
  
  @Override
  public 
  void init() 
    throws ServletException 
  {
    // TODO Auto-generated method stub
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
    // TODO Auto-generated method stub
  }
  
  @Override
  public
  void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    // TODO Auto-generated method stub
  }
  
  @Override
  public
  void doPut(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    // TODO Auto-generated method stub
  }
  
  @Override
  public
  void doDelete(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    // TODO Auto-generated method stub
  }
  
  public
  void doPatch(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    // TODO Auto-generated method stub
  }
  
  protected
  FHIRRequest<Resource> createFHIRRequest(HttpServletRequest request, HttpServletResponse response)
  {
    return new FHIRRequest<Resource>();
  }
  
  protected
  void send(HttpServletRequest request, HttpServletResponse response, FHIRResponse<?> fhirResponse)
    throws ServletException, IOException
  {
    
  }
}
