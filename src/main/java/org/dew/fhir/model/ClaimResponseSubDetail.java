package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_SubDetail</a>
 */
public
class ClaimResponseSubDetail extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer subDetailSequence;
  protected ClaimResponseAdjudication[] adjudication;
  protected Integer[] noteNumber;
  
  public ClaimResponseSubDetail()
  {
  }
  
  public Integer getSubDetailSequence() {
    return subDetailSequence;
  }
  
  public void setSubDetailSequence(Integer subDetailSequence) {
    this.subDetailSequence = subDetailSequence;
  }
  
  public ClaimResponseAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ClaimResponseAdjudication[] adjudication) {
    this.adjudication = adjudication;
  }
  
  public Integer[] getNoteNumber() {
    return noteNumber;
  }
  
  public void setNoteNumber(Integer[] noteNumber) {
    this.noteNumber = noteNumber;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseSubDetail) {
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
    return "ClaimResponseSubDetail(" + id + ")";
  }
}
