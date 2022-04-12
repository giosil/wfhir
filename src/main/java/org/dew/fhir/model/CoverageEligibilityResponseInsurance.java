package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityResponse_Insurance</a>
 */
public
class CoverageEligibilityResponseInsurance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> coverage;
  protected Period benefitPeriod;
  protected Boolean inforce;
  protected CoverageEligibilityResponseItem[] item;
  
  public CoverageEligibilityResponseInsurance()
  {
  }
  
  public Reference<Resource> getCoverage() {
    return coverage;
  }
  
  public void setCoverage(Reference<Resource> coverage) {
    this.coverage = coverage;
  }
  
  public Period getBenefitPeriod() {
    return benefitPeriod;
  }
  
  public void setBenefitPeriod(Period benefitPeriod) {
    this.benefitPeriod = benefitPeriod;
  }
  
  public Boolean getInforce() {
    return inforce;
  }
  
  public void setInforce(Boolean inforce) {
    this.inforce = inforce;
  }
  
  public CoverageEligibilityResponseItem[] getItem() {
    return item;
  }
  
  public void setItem(CoverageEligibilityResponseItem[] item) {
    this.item = item;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityResponseInsurance) {
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
    return "CoverageEligibilityResponseInsurance(" + id + ")";
  }
}
