package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies a planned action to occur as part of the plan. For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/careplan-definitions.html#CarePlan.activity">CarePlan.activity</a>
 */
public 
class CarePlanActivity extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -2825537429948678003L;
  
  protected CodeableConcept[] outcomeCodeableConcept;
  protected Reference<Resource>[] outcomeReference;
  protected Annotation[] progress;
  protected Reference<Resource> reference;
  protected CarePlanActivityDetail detail;
  
  public CarePlanActivity()
  {
  }

  public CodeableConcept[] getOutcomeCodeableConcept() {
    return outcomeCodeableConcept;
  }

  public Reference<Resource>[] getOutcomeReference() {
    return outcomeReference;
  }

  public Annotation[] getProgress() {
    return progress;
  }

  public Reference<Resource> getReference() {
    return reference;
  }

  public CarePlanActivityDetail getDetail() {
    return detail;
  }

  public void setOutcomeCodeableConcept(CodeableConcept[] outcomeCodeableConcept) {
    this.outcomeCodeableConcept = outcomeCodeableConcept;
  }

  public void setOutcomeReference(Reference<Resource>[] outcomeReference) {
    this.outcomeReference = outcomeReference;
  }

  public void setProgress(Annotation[] progress) {
    this.progress = progress;
  }

  public void setReference(Reference<Resource> reference) {
    this.reference = reference;
  }

  public void setDetail(CarePlanActivityDetail detail) {
    this.detail = detail;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CarePlanActivity) {
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
    return "CarePlanActivity(" + id + ")";
  }
}
