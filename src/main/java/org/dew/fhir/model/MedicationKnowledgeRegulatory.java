package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Regulatory information about a medication.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.regulatory">MedicationKnowledge.regulatory</a>
 */
public 
class MedicationKnowledgeRegulatory extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6243794421618266143L;
  
  protected Reference<Organization> regulatoryAuthority;
  protected MedicationKnowledgeRegulatorySubstitution[] substitution;
  protected MedicationKnowledgeRegulatorySchedule[] schedule;
  protected MedicationKnowledgeRegulatoryMaxDispense maxDispense;
  
  public MedicationKnowledgeRegulatory()
  {
  }

  public Reference<Organization> getRegulatoryAuthority() {
    return regulatoryAuthority;
  }

  public MedicationKnowledgeRegulatorySubstitution[] getSubstitution() {
    return substitution;
  }

  public MedicationKnowledgeRegulatorySchedule[] getSchedule() {
    return schedule;
  }

  public MedicationKnowledgeRegulatoryMaxDispense getMaxDispense() {
    return maxDispense;
  }

  public void setRegulatoryAuthority(Reference<Organization> regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
  }

  public void setSubstitution(MedicationKnowledgeRegulatorySubstitution[] substitution) {
    this.substitution = substitution;
  }

  public void setSchedule(MedicationKnowledgeRegulatorySchedule[] schedule) {
    this.schedule = schedule;
  }

  public void setMaxDispense(MedicationKnowledgeRegulatoryMaxDispense maxDispense) {
    this.maxDispense = maxDispense;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeRegulatory) {
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
    return "MedicationKnowledgeRegulatory(" + id + "," + regulatoryAuthority + ")";
  }
}
