package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Computable Policy Rule Language Representations of this Contract.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.rule">Contract.rule</a>
 */
public 
class ContractRule extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 8983712201945801624L;
  
  protected Attachment contentAttachment;
  protected Reference<DocumentReference> contentReference;
  
  public ContractRule()
  {
  }

  public Attachment getContentAttachment() {
    return contentAttachment;
  }

  public Reference<DocumentReference> getContentReference() {
    return contentReference;
  }

  public void setContentAttachment(Attachment contentAttachment) {
    this.contentAttachment = contentAttachment;
  }

  public void setContentReference(Reference<DocumentReference> contentReference) {
    this.contentReference = contentReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractRule) {
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
    return "ContractRule(" + id + "," + contentAttachment + "," + contentReference + ")";
  }
}
