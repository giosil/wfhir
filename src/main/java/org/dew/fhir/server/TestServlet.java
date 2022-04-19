package org.dew.fhir.server;

import java.security.Principal;

import javax.servlet.ServletException;

import org.dew.fhir.mock.MockOrganizationService;

/**
 * 
 * FHIR Servlet test implementation.
 *
 */
public 
class TestServlet extends FHIRServlet
{
  private static final long serialVersionUID = 1L;

  @Override
  public 
  void init() 
    throws ServletException 
  {
    baseLocation     = null;
    checkSession     = false;
    checkSessionName = "user";
    basicAuth        = true;
    basicRealm       = "wfhir";
    
    services.addHandler("organization", new MockOrganizationService());
  }
  
  @Override
  protected
  Principal authenticate(String username, String password)
  {
    if(!username.equals(password)) return null;
    return new FHIRPrincipal(username);
  }
}
