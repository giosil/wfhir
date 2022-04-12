package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Indication for the Medicinal Product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIndication_OtherTherapy</a>
 */
public
class MedicinalProductIndicationOtherTherapy extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> medicationReference;
  protected CodeableConcept medicationCodeableConcept;
  protected CodeableConcept therapyRelationshipType;
  
  public MedicinalProductIndicationOtherTherapy()
  {
  }
  
  public Reference<Resource> getMedicationReference() {
    return medicationReference;
  }
  
  public void setMedicationReference(Reference<Resource> medicationReference) {
    this.medicationReference = medicationReference;
  }
  
  public CodeableConcept getMedicationCodeableConcept() {
    return medicationCodeableConcept;
  }
  
  public void setMedicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
    this.medicationCodeableConcept = medicationCodeableConcept;
  }
  
  public CodeableConcept getTherapyRelationshipType() {
    return therapyRelationshipType;
  }
  
  public void setTherapyRelationshipType(CodeableConcept therapyRelationshipType) {
    this.therapyRelationshipType = therapyRelationshipType;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIndicationOtherTherapy) {
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
    return "MedicinalProductIndicationOtherTherapy(" + id + ")";
  }
}
