package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_GeneralCost</a>
 */
public
class InsurancePlanGeneralCost extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money cost;
  protected Integer groupSize;
  protected String comment;
  protected CodeableConcept type;
  
  public InsurancePlanGeneralCost()
  {
  }
  
  public Money getCost() {
    return cost;
  }
  
  public void setCost(Money cost) {
    this.cost = cost;
  }
  
  public Integer getGroupSize() {
    return groupSize;
  }
  
  public void setGroupSize(Integer groupSize) {
    this.groupSize = groupSize;
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanGeneralCost) {
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
    return "InsurancePlanGeneralCost(" + id + ")";
  }
}
