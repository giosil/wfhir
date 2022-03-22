package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 *  
 * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting. 
 * Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
 *
 * @see <a href="https://www.hl7.org/fhir/detectedissue-definitions.html#DetectedIssue.mitigation">DetectedIssue.mitigation</a>
 */
public 
class DetectedIssueMitigation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7414081916384309883L;
  
  protected CodeableConcept action;
  protected Date date;
  protected Reference<Resource> author;
  
  public DetectedIssueMitigation()
  {
  }

  public CodeableConcept getAction() {
    return action;
  }

  public Date getDate() {
    return date;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public void setAction(CodeableConcept action) {
    this.action = action;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DetectedIssueMitigation) {
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
    return "DetectedIssueMitigation(" + id + ")";
  }
}
