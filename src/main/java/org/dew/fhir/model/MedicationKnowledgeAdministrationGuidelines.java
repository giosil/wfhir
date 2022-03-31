package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Guidelines for the administration of the medication.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.administrationGuidelines">MedicationKnowledge.administrationGuidelines</a>
 */
public 
class MedicationKnowledgeAdministrationGuidelines extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -4136411486373758920L;
  
  protected MedicationKnowledgeAdministrationGuidelinesDosage[] dosage;
  protected CodeableConcept indicationCodeableConcept;
  protected Reference<ObservationDefinition> indicationReference;
  protected MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics[] patientCharacteristics;
  
  public MedicationKnowledgeAdministrationGuidelines()
  {
  }

  public MedicationKnowledgeAdministrationGuidelinesDosage[] getDosage() {
    return dosage;
  }

  public CodeableConcept getIndicationCodeableConcept() {
    return indicationCodeableConcept;
  }

  public Reference<ObservationDefinition> getIndicationReference() {
    return indicationReference;
  }

  public MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics[] getPatientCharacteristics() {
    return patientCharacteristics;
  }

  public void setDosage(MedicationKnowledgeAdministrationGuidelinesDosage[] dosage) {
    this.dosage = dosage;
  }

  public void setIndicationCodeableConcept(CodeableConcept indicationCodeableConcept) {
    this.indicationCodeableConcept = indicationCodeableConcept;
  }

  public void setIndicationReference(Reference<ObservationDefinition> indicationReference) {
    this.indicationReference = indicationReference;
  }

  public void setPatientCharacteristics(
      MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics[] patientCharacteristics) {
    this.patientCharacteristics = patientCharacteristics;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeAdministrationGuidelines) {
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
    return "MedicationKnowledgeAdministrationGuidelines(" + id + "," + indicationCodeableConcept + "," + indicationReference + ")";
  }
}
