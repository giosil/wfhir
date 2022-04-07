package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Circumstance of the asset.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.asset.context">Contract.term.asset.context</a>
 */
public 
class ContractTermAssetContext extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1676242196334872185L;
  
  protected Reference<Resource> reference;
  protected CodeableConcept[] code;
  protected String text;
  
  public ContractTermAssetContext()
  {
  }

  public Reference<Resource> getReference() {
    return reference;
  }

  public CodeableConcept[] getCode() {
    return code;
  }

  public String getText() {
    return text;
  }

  public void setReference(Reference<Resource> reference) {
    this.reference = reference;
  }

  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }

  public void setText(String text) {
    this.text = text;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermAssetContext) {
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
    return "ContractTermAssetContext(" + id + "," + reference + "," + text + ")";
  }
}
