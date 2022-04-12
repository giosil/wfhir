package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_SpecificCost</a>
 */
public
class InsurancePlanSpecificCost extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept category;
  protected InsurancePlanBenefit1[] benefit;
  
  public InsurancePlanSpecificCost()
  {
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  public InsurancePlanBenefit1[] getBenefit() {
    return benefit;
  }
  
  public void setBenefit(InsurancePlanBenefit1[] benefit) {
    this.benefit = benefit;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanSpecificCost) {
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
    return "InsurancePlanSpecificCost(" + id + ")";
  }
}
