package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.drugCharacteristic">MedicationKnowledge.drugCharacteristic</a>
 */
public 
class MedicationKnowledgeDrugCharacteristic extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 2023802260169949987L;
  
  protected CodeableConcept type;
  protected CodeableConcept valueCodeableConcept;
  protected String valueString;
  protected SimpleQuantity valueQuantity;
  protected String valueBase64Binary;
  
  public MedicationKnowledgeDrugCharacteristic()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept;
  }

  public String getValueString() {
    return valueString;
  }

  public SimpleQuantity getValueQuantity() {
    return valueQuantity;
  }

  public String getValueBase64Binary() {
    return valueBase64Binary;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
    this.valueCodeableConcept = valueCodeableConcept;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueQuantity(SimpleQuantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueBase64Binary(String valueBase64Binary) {
    this.valueBase64Binary = valueBase64Binary;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeDrugCharacteristic) {
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
    return "MedicationKnowledgeDrugCharacteristic(" + id + "," + type + ")";
  }
}
