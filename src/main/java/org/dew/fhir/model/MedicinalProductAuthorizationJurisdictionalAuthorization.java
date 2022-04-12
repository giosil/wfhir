package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The regulatory authorization of a medicinal product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductAuthorization_JurisdictionalAuthorization</a>
 */
public
class MedicinalProductAuthorizationJurisdictionalAuthorization extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Period validityPeriod;
  protected Identifier[] identifier;
  protected CodeableConcept country;
  protected CodeableConcept legalStatusOfSupply;
  protected CodeableConcept[] jurisdiction;
  
  public MedicinalProductAuthorizationJurisdictionalAuthorization()
  {
  }
  
  public Period getValidityPeriod() {
    return validityPeriod;
  }
  
  public void setValidityPeriod(Period validityPeriod) {
    this.validityPeriod = validityPeriod;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept getCountry() {
    return country;
  }
  
  public void setCountry(CodeableConcept country) {
    this.country = country;
  }
  
  public CodeableConcept getLegalStatusOfSupply() {
    return legalStatusOfSupply;
  }
  
  public void setLegalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
    this.legalStatusOfSupply = legalStatusOfSupply;
  }
  
  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductAuthorizationJurisdictionalAuthorization) {
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
    return "MedicinalProductAuthorizationJurisdictionalAuthorization(" + id + ")";
  }
}
