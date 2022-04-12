package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Coverage</a>
 */
public
class InsurancePlanCoverage extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept type;
  protected InsurancePlanBenefit[] benefit;
  protected Reference<Resource>[] network;
  
  public InsurancePlanCoverage()
  {
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public InsurancePlanBenefit[] getBenefit() {
    return benefit;
  }
  
  public void setBenefit(InsurancePlanBenefit[] benefit) {
    this.benefit = benefit;
  }
  
  public Reference<Resource>[] getNetwork() {
    return network;
  }
  
  public void setNetwork(Reference<Resource>[] network) {
    this.network = network;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanCoverage) {
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
    return "InsurancePlanCoverage(" + id + ")";
  }
}
