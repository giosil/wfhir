package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Resource1</a>
 */
public
class ImplementationGuideResource1 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> reference;
  protected String exampleCanonical;
  protected String relativePath;
  protected Boolean exampleBoolean;
  
  public ImplementationGuideResource1()
  {
  }
  
  public Reference<Resource> getReference() {
    return reference;
  }
  
  public void setReference(Reference<Resource> reference) {
    this.reference = reference;
  }
  
  public String getExampleCanonical() {
    return exampleCanonical;
  }
  
  public void setExampleCanonical(String exampleCanonical) {
    this.exampleCanonical = exampleCanonical;
  }
  
  public String getRelativePath() {
    return relativePath;
  }
  
  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }
  
  public Boolean getExampleBoolean() {
    return exampleBoolean;
  }
  
  public void setExampleBoolean(Boolean exampleBoolean) {
    this.exampleBoolean = exampleBoolean;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideResource1) {
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
    return "ImplementationGuideResource1(" + id + ")";
  }
}
