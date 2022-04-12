package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_Insurance</a>
 */
public
class ExplanationOfBenefitInsurance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> coverage;
  protected Boolean focal;
  protected String[] preAuthRef;
  
  public ExplanationOfBenefitInsurance()
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
  
  public String[] getPreAuthRef() {
    return preAuthRef;
  }
  
  public void setPreAuthRef(String[] preAuthRef) {
    this.preAuthRef = preAuthRef;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitInsurance) {
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
    return "ExplanationOfBenefitInsurance(" + id + ")";
  }
}
