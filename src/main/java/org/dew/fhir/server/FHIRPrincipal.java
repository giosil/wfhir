package org.dew.fhir.server;

import java.io.Serializable;

import java.security.Principal;

/**
 * 
 * Base Principal implementation.
 *
 */
public
class FHIRPrincipal implements Principal, Serializable
{
  private static final long serialVersionUID = 6123515113035153652L;
  
  protected String name;
  
  public FHIRPrincipal() 
  {
    this.name = "anonymous";
  }
  
  public FHIRPrincipal(String name) 
  {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Principal) {
      String principalName = ((Principal) object).getName();
      if(principalName == null && name == null) return true;
      return principalName != null && principalName.equals(name);
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(name == null) return 0;
    return name.hashCode();
  }
  
  @Override
  public String toString() {
    return name;
  }
}