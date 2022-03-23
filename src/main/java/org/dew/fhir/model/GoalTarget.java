package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Indicates what should be done by when.
 *
 * @see <a href="https://www.hl7.org/fhir/goal-definitions.html#Goal.target">Goal.target</a>
 */
public 
class GoalTarget extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5909938212655201971L;

  protected CodeableConcept measure;
  protected Quantity detailQuantity;
  protected Range detailRange;
  protected CodeableConcept detailCodeableConcept;
  protected String detailString;
  protected Boolean detailBoolean;
  protected Integer detailInteger;
  protected Ratio detailRatio;
  protected Date dueDate;
  protected Duration dueDuration;
  
  public GoalTarget()
  {
  }

  public CodeableConcept getMeasure() {
    return measure;
  }

  public Quantity getDetailQuantity() {
    return detailQuantity;
  }

  public Range getDetailRange() {
    return detailRange;
  }

  public CodeableConcept getDetailCodeableConcept() {
    return detailCodeableConcept;
  }

  public String getDetailString() {
    return detailString;
  }

  public Boolean getDetailBoolean() {
    return detailBoolean;
  }

  public Integer getDetailInteger() {
    return detailInteger;
  }

  public Ratio getDetailRatio() {
    return detailRatio;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public Duration getDueDuration() {
    return dueDuration;
  }

  public void setMeasure(CodeableConcept measure) {
    this.measure = measure;
  }

  public void setDetailQuantity(Quantity detailQuantity) {
    this.detailQuantity = detailQuantity;
  }

  public void setDetailRange(Range detailRange) {
    this.detailRange = detailRange;
  }

  public void setDetailCodeableConcept(CodeableConcept detailCodeableConcept) {
    this.detailCodeableConcept = detailCodeableConcept;
  }

  public void setDetailString(String detailString) {
    this.detailString = detailString;
  }

  public void setDetailBoolean(Boolean detailBoolean) {
    this.detailBoolean = detailBoolean;
  }

  public void setDetailInteger(Integer detailInteger) {
    this.detailInteger = detailInteger;
  }

  public void setDetailRatio(Ratio detailRatio) {
    this.detailRatio = detailRatio;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public void setDueDuration(Duration dueDuration) {
    this.dueDuration = dueDuration;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof GoalTarget) {
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
    return "GoalTarget(" + id + ")";
  }
}
