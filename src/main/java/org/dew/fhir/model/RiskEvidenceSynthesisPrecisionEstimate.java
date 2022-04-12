package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">RiskEvidenceSynthesis_PrecisionEstimate</a>
 */
public
class RiskEvidenceSynthesisPrecisionEstimate extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Double level;
  protected Double from;
  protected Double to;
  protected CodeableConcept type;
  
  public RiskEvidenceSynthesisPrecisionEstimate()
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
    if(object instanceof RiskEvidenceSynthesisPrecisionEstimate) {
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
    return "RiskEvidenceSynthesisPrecisionEstimate(" + id + ")";
  }
}
