package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityRequest_SupportingInfo</a>
 */
public
class CoverageEligibilityRequestSupportingInfo extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer sequence;
  protected Boolean appliesToAll;
  protected Reference<Resource> information;
  
  public CoverageEligibilityRequestSupportingInfo()
  {
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public Boolean getAppliesToAll() {
    return appliesToAll;
  }
  
  public void setAppliesToAll(Boolean appliesToAll) {
    this.appliesToAll = appliesToAll;
  }
  
  public Reference<Resource> getInformation() {
    return information;
  }
  
  public void setInformation(Reference<Resource> information) {
    this.information = information;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityRequestSupportingInfo) {
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
    return "CoverageEligibilityRequestSupportingInfo(" + id + ")";
  }
}
