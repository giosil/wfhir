package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates what should be done and within what timeframe.
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.goal.target">PlanDefinition.goal.target</a>
 */
public 
class PlanDefinitionGoalTarget extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -5546516174487663739L;
  
  protected CodeableConcept measure;
  protected Quantity detailQuantity;
  protected Range detailRange;
  protected CodeableConcept detailCodeableConcept;
  protected Duration due;
  
  public PlanDefinitionGoalTarget()
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

  public Duration getDue() {
    return due;
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

  public void setDue(Duration due) {
    this.due = due;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionGoalTarget) {
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
    return "PlanDefinitionGoalTarget(" + id + "," + measure + "," + detailQuantity + ")";
  }
}
