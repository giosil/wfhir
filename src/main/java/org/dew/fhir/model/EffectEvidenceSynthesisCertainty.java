package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">EffectEvidenceSynthesis_Certainty</a>
 */
public
class EffectEvidenceSynthesisCertainty extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] rating;
  protected Annotation[] note;
  protected EffectEvidenceSynthesisCertaintySubcomponent[] certaintySubcomponent;
  
  public EffectEvidenceSynthesisCertainty()
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
  
  public EffectEvidenceSynthesisCertaintySubcomponent[] getCertaintySubcomponent() {
    return certaintySubcomponent;
  }
  
  public void setCertaintySubcomponent(EffectEvidenceSynthesisCertaintySubcomponent[] certaintySubcomponent) {
    this.certaintySubcomponent = certaintySubcomponent;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EffectEvidenceSynthesisCertainty) {
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
    return "EffectEvidenceSynthesisCertainty(" + id + ")";
  }
}
