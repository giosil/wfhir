package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
 *
 * @see <a href="https://www.hl7.org/fhir/consent-definitions.html#Consent.policy">Consent.policy</a>
 */
public 
class ConsentPolicy extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 772754361098247008L;
  
  protected String authority;
  protected String uri;
  
  public ConsentPolicy()
  {
  }

  public String getAuthority() {
    return authority;
  }

  public String getUri() {
    return uri;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConsentPolicy) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(id == null) return 0;
    return id.hashCode();
  }
  
  @Override
  public String toString() {
    return "ConsentPolicy(" + id + ")";
  }
}
