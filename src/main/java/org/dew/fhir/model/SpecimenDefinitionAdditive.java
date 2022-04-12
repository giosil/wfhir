package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="https://www.hl7.org/fhir">SpecimenDefinition_Additive</a>
 */
public
class SpecimenDefinitionAdditive extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> additiveReference;
  protected CodeableConcept additiveCodeableConcept;
  
  public SpecimenDefinitionAdditive()
  {
  }
  
  public Reference<Resource> getAdditiveReference() {
    return additiveReference;
  }
  
  public void setAdditiveReference(Reference<Resource> additiveReference) {
    this.additiveReference = additiveReference;
  }
  
  public CodeableConcept getAdditiveCodeableConcept() {
    return additiveCodeableConcept;
  }
  
  public void setAdditiveCodeableConcept(CodeableConcept additiveCodeableConcept) {
    this.additiveCodeableConcept = additiveCodeableConcept;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenDefinitionAdditive) {
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
    return "SpecimenDefinitionAdditive(" + id + ")";
  }
}
