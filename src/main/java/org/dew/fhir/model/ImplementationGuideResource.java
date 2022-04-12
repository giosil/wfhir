package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Resource</a>
 */
public
class ImplementationGuideResource extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String groupingId;
  protected String description;
  protected Reference<Resource> reference;
  protected String exampleCanonical;
  protected String[] fhirVersion;
  protected String name;
  protected Boolean exampleBoolean;
  
  public ImplementationGuideResource()
  {
  }
  
  public String getGroupingId() {
    return groupingId;
  }
  
  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
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
  
  public String[] getFhirVersion() {
    return fhirVersion;
  }
  
  public void setFhirVersion(String[] fhirVersion) {
    this.fhirVersion = fhirVersion;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Boolean getExampleBoolean() {
    return exampleBoolean;
  }
  
  public void setExampleBoolean(Boolean exampleBoolean) {
    this.exampleBoolean = exampleBoolean;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideResource) {
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
    return "ImplementationGuideResource(" + id + ")";
  }
}
