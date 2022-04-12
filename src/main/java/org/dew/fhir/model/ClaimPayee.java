package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Payee</a>
 */
public
class ClaimPayee extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept type;
  protected Reference<Resource> party;
  
  public ClaimPayee()
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
    if(object instanceof ClaimPayee) {
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
    return "ClaimPayee(" + id + ")";
  }
}
