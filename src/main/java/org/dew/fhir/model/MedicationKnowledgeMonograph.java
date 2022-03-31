package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Associated documentation about the medication.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.monograph">MedicationKnowledge.monograph</a>
 */
public 
class MedicationKnowledgeMonograph extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 8203041437756389130L;
  
  protected CodeableConcept type;
  protected Reference<Resource> source;
  
  public MedicationKnowledgeMonograph()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public Reference<Resource> getSource() {
    return source;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSource(Reference<Resource> source) {
    this.source = source;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeMonograph) {
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
    return "MedicationKnowledgeMonograph(" + id + "," + type + "," + source + ")";
  }
}
