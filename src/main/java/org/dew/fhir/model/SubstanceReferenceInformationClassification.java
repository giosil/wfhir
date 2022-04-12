package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceReferenceInformation_Classification</a>
 */
public
class SubstanceReferenceInformationClassification extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] subtype;
  protected CodeableConcept domain;
  protected Reference<Resource>[] source;
  protected CodeableConcept classification;
  
  public SubstanceReferenceInformationClassification()
  {
  }
  
  public CodeableConcept[] getSubtype() {
    return subtype;
  }
  
  public void setSubtype(CodeableConcept[] subtype) {
    this.subtype = subtype;
  }
  
  public CodeableConcept getDomain() {
    return domain;
  }
  
  public void setDomain(CodeableConcept domain) {
    this.domain = domain;
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public CodeableConcept getClassification() {
    return classification;
  }
  
  public void setClassification(CodeableConcept classification) {
    this.classification = classification;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceReferenceInformationClassification) {
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
    return "SubstanceReferenceInformationClassification(" + id + ")";
  }
}
