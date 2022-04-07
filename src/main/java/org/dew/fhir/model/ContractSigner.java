package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.signer">Contract.signer</a>
 */
public 
class ContractSigner extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5923643733934159421L;
  
  protected Coding type;
  protected Reference<Resource> party;
  protected Signature[] signature;
  
  public ContractSigner()
  {
  }

  public Coding getType() {
    return type;
  }

  public Reference<Resource> getParty() {
    return party;
  }

  public Signature[] getSignature() {
    return signature;
  }

  public void setType(Coding type) {
    this.type = type;
  }

  public void setParty(Reference<Resource> party) {
    this.party = party;
  }

  public void setSignature(Signature[] signature) {
    this.signature = signature;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractSigner) {
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
    return "ContractSigner(" + id + "," + type + "," + party + ")";
  }
}
