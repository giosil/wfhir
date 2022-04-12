package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Item</a>
 */
public
class ClaimResponseItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ClaimResponseAdjudication[] adjudication;
  protected Integer itemSequence;
  protected ClaimResponseDetail[] detail;
  protected Integer[] noteNumber;
  
  public ClaimResponseItem()
  {
  }
  
  public ClaimResponseAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ClaimResponseAdjudication[] adjudication) {
    this.adjudication = adjudication;
  }
  
  public Integer getItemSequence() {
    return itemSequence;
  }
  
  public void setItemSequence(Integer itemSequence) {
    this.itemSequence = itemSequence;
  }
  
  public ClaimResponseDetail[] getDetail() {
    return detail;
  }
  
  public void setDetail(ClaimResponseDetail[] detail) {
    this.detail = detail;
  }
  
  public Integer[] getNoteNumber() {
    return noteNumber;
  }
  
  public void setNoteNumber(Integer[] noteNumber) {
    this.noteNumber = noteNumber;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseItem) {
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
    return "ClaimResponseItem(" + id + ")";
  }
}
