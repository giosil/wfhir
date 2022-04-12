package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Related</a>
 */
public
class ClaimRelated extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier reference;
  protected Reference<Resource> claim;
  protected CodeableConcept relationship;
  
  public ClaimRelated()
  {
  }
  
  public Identifier getReference() {
    return reference;
  }
  
  public void setReference(Identifier reference) {
    this.reference = reference;
  }
  
  public Reference<Resource> getClaim() {
    return claim;
  }
  
  public void setClaim(Reference<Resource> claim) {
    this.claim = claim;
  }
  
  public CodeableConcept getRelationship() {
    return relationship;
  }
  
  public void setRelationship(CodeableConcept relationship) {
    this.relationship = relationship;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimRelated) {
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
    return "ClaimRelated(" + id + ")";
  }
}
