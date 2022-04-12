package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">RiskEvidenceSynthesis_CertaintySubcomponent</a>
 */
public
class RiskEvidenceSynthesisCertaintySubcomponent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] rating;
  protected Annotation[] note;
  protected CodeableConcept type;
  
  public RiskEvidenceSynthesisCertaintySubcomponent()
  {
  }
  
  public CodeableConcept[] getRating() {
    return rating;
  }
  
  public void setRating(CodeableConcept[] rating) {
    this.rating = rating;
  }
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RiskEvidenceSynthesisCertaintySubcomponent) {
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
    return "RiskEvidenceSynthesisCertaintySubcomponent(" + id + ")";
  }
}
