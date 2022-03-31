package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Dosage for the medication for the specific guidelines.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.administrationGuidelines.dosage">MedicationKnowledge.administrationGuidelines.dosage</a>
 */
public 
class MedicationKnowledgeAdministrationGuidelinesDosage extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3768906659111031361L;
  
  protected CodeableConcept type;
  protected Dosage[] dosage;
  
  public MedicationKnowledgeAdministrationGuidelinesDosage()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public Dosage[] getDosage() {
    return dosage;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setDosage(Dosage[] dosage) {
    this.dosage = dosage;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeAdministrationGuidelinesDosage) {
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
    return "MedicationKnowledgeAdministrationGuidelinesDosage(" + id + "," + type + ")";
  }
}
