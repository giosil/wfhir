package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_Payee</a>
 */
public
class ExplanationOfBenefitPayee extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept type;
  protected Reference<Resource> party;
  
  public ExplanationOfBenefitPayee()
  {
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Reference<Resource> getParty() {
    return party;
  }
  
  public void setParty(Reference<Resource> party) {
    this.party = party;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitPayee) {
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
    return "ExplanationOfBenefitPayee(" + id + ")";
  }
}
