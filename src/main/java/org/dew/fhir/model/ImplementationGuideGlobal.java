package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Global</a>
 */
public
class ImplementationGuideGlobal extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String type;
  protected String profile;
  
  public ImplementationGuideGlobal()
  {
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getProfile() {
    return profile;
  }
  
  public void setProfile(String profile) {
    this.profile = profile;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideGlobal) {
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
    return "ImplementationGuideGlobal(" + id + ")";
  }
}
