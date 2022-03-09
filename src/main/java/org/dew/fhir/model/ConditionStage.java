package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Clinical stage or grade of a condition. May include formal severity assessments.
 *
 * @see <a href="https://www.hl7.org/fhir/condition-definitions.html#Condition.stage">Condition.stage</a>
 */
public 
class ConditionStage extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6723001798230245106L;
  
  protected CodeableConcept summary;
  protected Reference<Resource>[] assessment;
  protected CodeableConcept type;
  
  public ConditionStage()
  {
  }
  
  public CodeableConcept getSummary() {
    return summary;
  }

  public Reference<Resource>[] getAssessment() {
    return assessment;
  }

  public CodeableConcept getType() {
    return type;
  }

  public void setSummary(CodeableConcept summary) {
    this.summary = summary;
  }

  public void setAssessment(Reference<Resource>[] assessment) {
    this.assessment = assessment;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ConditionStage) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (summary + ":" + type).hashCode();
  }
  
  @Override
  public String toString() {
    return "ConditionStage(" + summary + "," + type + ")";
  }
}
