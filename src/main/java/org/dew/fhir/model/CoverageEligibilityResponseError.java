package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityResponse_Error</a>
 */
public
class CoverageEligibilityResponseError extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  
  public CoverageEligibilityResponseError()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityResponseError) {
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
    return "CoverageEligibilityResponseError(" + id + ")";
  }
}
