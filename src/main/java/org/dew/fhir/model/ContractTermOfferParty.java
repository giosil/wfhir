package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Offer Recipient.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.offer.party">Contract.term.offer.party</a>
 */
public 
class ContractTermOfferParty extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -5850908625844070615L;
  
  protected Reference<Resource>[] reference;
  protected CodeableConcept role;
  
  public ContractTermOfferParty()
  {
  }

  public Reference<Resource>[] getReference() {
    return reference;
  }

  public CodeableConcept getRole() {
    return role;
  }

  public void setReference(Reference<Resource>[] reference) {
    this.reference = reference;
  }

  public void setRole(CodeableConcept role) {
    this.role = role;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractContentDefinition) {
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
    return "ContractTermOfferParty(" + id + "," + role + ")";
  }
}
