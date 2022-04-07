package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Legal expressions or representations of this Contract.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.legal">Contract.legal</a>
 */
public 
class ContractLegal extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 6767272446285394186L;
  
  protected Attachment contentAttachment;
  protected Reference<Resource> contentReference;
  
  public ContractLegal()
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
    if(object instanceof ContractLegal) {
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
    return "ContractLegal(" + id + "," + contentAttachment + "," + contentReference + ")";
  }
}

