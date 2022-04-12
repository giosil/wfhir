package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Detail</a>
 */
public
class ClaimResponseDetail extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ClaimResponseAdjudication[] adjudication;
  protected Integer detailSequence;
  protected ClaimResponseSubDetail[] subDetail;
  protected Integer[] noteNumber;
  
  public ClaimResponseDetail()
  {
  }
  
  public ClaimResponseAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ClaimResponseAdjudication[] adjudication) {
    this.adjudication = adjudication;
  }
  
  public Integer getDetailSequence() {
    return detailSequence;
  }
  
  public void setDetailSequence(Integer detailSequence) {
    this.detailSequence = detailSequence;
  }
  
  public ClaimResponseSubDetail[] getSubDetail() {
    return subDetail;
  }
  
  public void setSubDetail(ClaimResponseSubDetail[] subDetail) {
    this.subDetail = subDetail;
  }
  
  public Integer[] getNoteNumber() {
    return noteNumber;
  }
  
  public void setNoteNumber(Integer[] noteNumber) {
    this.noteNumber = noteNumber;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseDetail) {
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
    return "ClaimResponseDetail(" + id + ")";
  }
}
