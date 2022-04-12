package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Insurance</a>
 */
public
class ClaimResponseInsurance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> coverage;
  protected Integer sequence;
  protected Boolean focal;
  protected String businessArrangement;
  protected Reference<Resource> claimResponse;
  
  public ClaimResponseInsurance()
  {
  }
  
  public Reference<Resource> getCoverage() {
    return coverage;
  }
  
  public void setCoverage(Reference<Resource> coverage) {
    this.coverage = coverage;
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
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
  
  public Reference<Resource> getClaimResponse() {
    return claimResponse;
  }
  
  public void setClaimResponse(Reference<Resource> claimResponse) {
    this.claimResponse = claimResponse;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseInsurance) {
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
    return "ClaimResponseInsurance(" + id + ")";
  }
}
