package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_Related</a>
 */
public
class ExplanationOfBenefitRelated extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier reference;
  protected Reference<Resource> claim;
  protected CodeableConcept relationship;
  
  public ExplanationOfBenefitRelated()
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
    if(object instanceof ExplanationOfBenefitRelated) {
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
    return "ExplanationOfBenefitRelated(" + id + ")";
  }
}
