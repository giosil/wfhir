package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_DependsOn</a>
 */
public
class ImplementationGuideDependsOn extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String packageId;
  protected String uri;
  protected String version;
  
  public ImplementationGuideDependsOn()
  {
  }
  
  public String getPackageId() {
    return packageId;
  }
  
  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }
  
  public String getUri() {
    return uri;
  }
  
  public void setUri(String uri) {
    this.uri = uri;
  }
  
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideDependsOn) {
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
    return "ImplementationGuideDependsOn(" + id + ")";
  }
}
