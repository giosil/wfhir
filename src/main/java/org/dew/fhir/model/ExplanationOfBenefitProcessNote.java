package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_ProcessNote</a>
 */
public
class ExplanationOfBenefitProcessNote extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer number;
  protected String type;
  
  public ExplanationOfBenefitProcessNote()
  {
  }
  
  public Integer getNumber() {
    return number;
  }
  
  public void setNumber(Integer number) {
    this.number = number;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitProcessNote) {
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
    return "ExplanationOfBenefitProcessNote(" + id + ")";
  }
}
