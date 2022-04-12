package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">EffectEvidenceSynthesis_PrecisionEstimate</a>
 */
public
class EffectEvidenceSynthesisPrecisionEstimate extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Double level;
  protected Double from;
  protected Double to;
  protected CodeableConcept type;
  
  public EffectEvidenceSynthesisPrecisionEstimate()
  {
  }
  
  public Double getLevel() {
    return level;
  }
  
  public void setLevel(Double level) {
    this.level = level;
  }
  
  public Double getFrom() {
    return from;
  }
  
  public void setFrom(Double from) {
    this.from = from;
  }
  
  public Double getTo() {
    return to;
  }
  
  public void setTo(Double to) {
    this.to = to;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EffectEvidenceSynthesisPrecisionEstimate) {
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
    return "EffectEvidenceSynthesisPrecisionEstimate(" + id + ")";
  }
}
