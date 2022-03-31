package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specifies the schedule of a medication in jurisdiction.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.regulatory.schedule">MedicationKnowledge.regulatory.schedule</a>
 */
public 
class MedicationKnowledgeRegulatorySchedule extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4603103668677900806L;
  
  protected CodeableConcept schedule;
  
  public MedicationKnowledgeRegulatorySchedule()
  {
  }

  public MedicationKnowledgeRegulatorySchedule(CodeableConcept schedule)
  {
    this.schedule = schedule;
  }

  public CodeableConcept getSchedule() {
    return schedule;
  }

  public void setSchedule(CodeableConcept schedule) {
    this.schedule = schedule;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeRegulatorySchedule) {
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
    return "MedicationKnowledgeRegulatorySchedule(" + id + "," + schedule + ")";
  }
}
