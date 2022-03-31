package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.administrationGuidelines.patientCharacteristics">MedicationKnowledge.administrationGuidelines.patientCharacteristics</a>
 */
public 
class MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -7171182569326374549L;
  
  protected CodeableConcept characteristicCodeableConcept;
  protected SimpleQuantity characteristicQuantity;
  protected String[] value;
  
  public MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics()
  {
  }

  public CodeableConcept getCharacteristicCodeableConcept() {
    return characteristicCodeableConcept;
  }

  public SimpleQuantity getCharacteristicQuantity() {
    return characteristicQuantity;
  }

  public String[] getValue() {
    return value;
  }

  public void setCharacteristicCodeableConcept(CodeableConcept characteristicCodeableConcept) {
    this.characteristicCodeableConcept = characteristicCodeableConcept;
  }

  public void setCharacteristicQuantity(SimpleQuantity characteristicQuantity) {
    this.characteristicQuantity = characteristicQuantity;
  }

  public void setValue(String[] value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics) {
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
    return "MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics(" + id + "," + characteristicCodeableConcept + "," + characteristicQuantity + ")";
  }
}
