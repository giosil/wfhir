package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Insurance</a>
 */
public
class ClaimInsurance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> coverage;
  protected Identifier identifier;
  protected Reference<Resource> claimResponse;
  protected String[] preAuthRef;
  protected Integer sequence;
  protected Boolean focal;
  protected String businessArrangement;
  
  public ClaimInsurance()
  {
  }
  
  public Reference<Resource> getCoverage() {
    return coverage;
  }
  
  public void setCoverage(Reference<Resource> coverage) {
    this.coverage = coverage;
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource> getClaimResponse() {
    return claimResponse;
  }
  
  public void setClaimResponse(Reference<Resource> claimResponse) {
    this.claimResponse = claimResponse;
  }
  
  public String[] getPreAuthRef() {
    return preAuthRef;
  }
  
  public void setPreAuthRef(String[] preAuthRef) {
    this.preAuthRef = preAuthRef;
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
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimInsurance) {
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
    return "ClaimInsurance(" + id + ")";
  }
}
