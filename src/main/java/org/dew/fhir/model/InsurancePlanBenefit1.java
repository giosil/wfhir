package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Benefit1</a>
 */
public
class InsurancePlanBenefit1 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected InsurancePlanCost[] cost;
  protected CodeableConcept type;
  
  public InsurancePlanBenefit1()
  {
  }
  
  public InsurancePlanCost[] getCost() {
    return cost;
  }
  
  public void setCost(InsurancePlanCost[] cost) {
    this.cost = cost;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanBenefit1) {
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
    return "InsurancePlanBenefit1(" + id + ")";
  }
}
