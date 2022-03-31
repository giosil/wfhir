package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The program under which the medication is reviewed.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.monitoringProgram">MedicationKnowledge.monitoringProgram</a>
 */
public 
class MedicationKnowledgeMonitoringProgram extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4806551128075538397L;

  protected CodeableConcept type;
  protected String name;
  
  public MedicationKnowledgeMonitoringProgram()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeMonitoringProgram) {
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
    return "MedicationKnowledgeMonitoringProgram(" + id + "," + type + "," + name + ")";
  }
}
