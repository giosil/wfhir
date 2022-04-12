package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Error</a>
 */
public
class ClaimResponseError extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer subDetailSequence;
  protected Integer itemSequence;
  protected CodeableConcept code;
  protected Integer detailSequence;
  
  public ClaimResponseError()
  {
  }
  
  public Integer getSubDetailSequence() {
    return subDetailSequence;
  }
  
  public void setSubDetailSequence(Integer subDetailSequence) {
    this.subDetailSequence = subDetailSequence;
  }
  
  public Integer getItemSequence() {
    return itemSequence;
  }
  
  public void setItemSequence(Integer itemSequence) {
    this.itemSequence = itemSequence;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Integer getDetailSequence() {
    return detailSequence;
  }
  
  public void setDetailSequence(Integer detailSequence) {
    this.detailSequence = detailSequence;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseError) {
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
    return "ClaimResponseError(" + id + ")";
  }
}
