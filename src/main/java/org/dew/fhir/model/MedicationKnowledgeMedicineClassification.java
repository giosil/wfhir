package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Categorization of the medication within a formulary or classification system.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.medicineClassification">MedicationKnowledge.medicineClassification</a>
 */
public 
class MedicationKnowledgeMedicineClassification extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7518457320812038793L;
  
  protected CodeableConcept type;
  protected CodeableConcept[] classification;
  
  public MedicationKnowledgeMedicineClassification()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getClassification() {
    return classification;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setClassification(CodeableConcept[] classification) {
    this.classification = classification;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeMedicineClassification) {
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
    return "MedicationKnowledgeMedicineClassification(" + id + "," + type + ")";
  }
}
