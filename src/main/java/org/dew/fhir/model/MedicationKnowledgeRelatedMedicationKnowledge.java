package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Associated or related knowledge about a medication.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.relatedMedicationKnowledge">MedicationKnowledge.relatedMedicationKnowledge</a>
 */
public 
class MedicationKnowledgeRelatedMedicationKnowledge extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 2492120829003117133L;
  
  protected CodeableConcept type;
  protected Reference<MedicationKnowledge>[] reference;
  
  public MedicationKnowledgeRelatedMedicationKnowledge()
  {
  }

  public MedicationKnowledgeRelatedMedicationKnowledge(CodeableConcept type)
  {
    this.type = type;
  }

  public CodeableConcept getType() {
    return type;
  }

  public Reference<MedicationKnowledge>[] getReference() {
    return reference;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setReference(Reference<MedicationKnowledge>[] reference) {
    this.reference = reference;
  }
  
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeRelatedMedicationKnowledge) {
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
    return "MedicationKnowledgeRelatedMedicationKnowledge(" + id + "," + type + ")";
  }
}
