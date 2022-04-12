package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Benefit</a>
 */
public
class InsurancePlanBenefit extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected InsurancePlanLimit[] limit;
  protected String requirement;
  protected CodeableConcept type;
  
  public InsurancePlanBenefit()
  {
  }
  
  public InsurancePlanLimit[] getLimit() {
    return limit;
  }
  
  public void setLimit(InsurancePlanLimit[] limit) {
    this.limit = limit;
  }
  
  public String getRequirement() {
    return requirement;
  }
  
  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanBenefit) {
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
    return "InsurancePlanBenefit(" + id + ")";
  }
}
