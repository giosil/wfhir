package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.friendly">Contract.friendly</a>
 */
public 
class ContractFriendly extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -4981960466684221154L;
  
  protected Attachment contentAttachment;
  protected Reference<Resource> contentReference;
  
  public ContractFriendly()
  {
  }

  public Attachment getContentAttachment() {
    return contentAttachment;
  }

  public Reference<Resource> getContentReference() {
    return contentReference;
  }

  public void setContentAttachment(Attachment contentAttachment) {
    this.contentAttachment = contentAttachment;
  }

  public void setContentReference(Reference<Resource> contentReference) {
    this.contentReference = contentReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractFriendly) {
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
    return "ContractFriendly(" + id + "," + contentAttachment + "," + contentReference + ")";
  }
}
