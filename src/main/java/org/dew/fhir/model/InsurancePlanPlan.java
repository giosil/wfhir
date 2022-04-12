package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Plan</a>
 */
public
class InsurancePlanPlan extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected CodeableConcept type;
  protected InsurancePlanSpecificCost[] specificCost;
  protected Reference<Resource>[] coverageArea;
  protected Reference<Resource>[] network;
  protected InsurancePlanGeneralCost[] generalCost;
  
  public InsurancePlanPlan()
  {
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public InsurancePlanSpecificCost[] getSpecificCost() {
    return specificCost;
  }
  
  public void setSpecificCost(InsurancePlanSpecificCost[] specificCost) {
    this.specificCost = specificCost;
  }
  
  public Reference<Resource>[] getCoverageArea() {
    return coverageArea;
  }
  
  public void setCoverageArea(Reference<Resource>[] coverageArea) {
    this.coverageArea = coverageArea;
  }
  
  public Reference<Resource>[] getNetwork() {
    return network;
  }
  
  public void setNetwork(Reference<Resource>[] network) {
    this.network = network;
  }
  
  public InsurancePlanGeneralCost[] getGeneralCost() {
    return generalCost;
  }
  
  public void setGeneralCost(InsurancePlanGeneralCost[] generalCost) {
    this.generalCost = generalCost;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanPlan) {
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
    return "InsurancePlanPlan(" + id + ")";
  }
}
