package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityRequest_Insurance</a>
 */
public
class CoverageEligibilityRequestInsurance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> coverage;
  protected Boolean focal;
  protected String businessArrangement;
  
  public CoverageEligibilityRequestInsurance()
  {
  }
  
  public Reference<Resource> getCoverage() {
    return coverage;
  }
  
  public void setCoverage(Reference<Resource> coverage) {
    this.coverage = coverage;
  }
  
  public Boolean getFocal() {
    return focal;
  }
  
  public void setFocal(Boolean focal) {
    this.focal = focal;
  }
  
  public String getBusinessArrangement() {
    return businessArrangement;
  }
  
  public void setBusinessArrangement(String businessArrangement) {
    this.businessArrangement = businessArrangement;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityRequestInsurance) {
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
    return "CoverageEligibilityRequestInsurance(" + id + ")";
  }
}
