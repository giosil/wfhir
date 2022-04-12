package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">RiskEvidenceSynthesis_RiskEstimate</a>
 */
public
class RiskEvidenceSynthesisRiskEstimate extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept unitOfMeasure;
  protected String description;
  protected CodeableConcept type;
  protected Integer numeratorCount;
  protected Integer denominatorCount;
  protected RiskEvidenceSynthesisPrecisionEstimate[] precisionEstimate;
  protected Double value;
  
  public RiskEvidenceSynthesisRiskEstimate()
  {
  }
  
  public CodeableConcept getUnitOfMeasure() {
    return unitOfMeasure;
  }
  
  public void setUnitOfMeasure(CodeableConcept unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Integer getNumeratorCount() {
    return numeratorCount;
  }
  
  public void setNumeratorCount(Integer numeratorCount) {
    this.numeratorCount = numeratorCount;
  }
  
  public Integer getDenominatorCount() {
    return denominatorCount;
  }
  
  public void setDenominatorCount(Integer denominatorCount) {
    this.denominatorCount = denominatorCount;
  }
  
  public RiskEvidenceSynthesisPrecisionEstimate[] getPrecisionEstimate() {
    return precisionEstimate;
  }
  
  public void setPrecisionEstimate(RiskEvidenceSynthesisPrecisionEstimate[] precisionEstimate) {
    this.precisionEstimate = precisionEstimate;
  }
  
  public Double getValue() {
    return value;
  }
  
  public void setValue(Double value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RiskEvidenceSynthesisRiskEstimate) {
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
    return "RiskEvidenceSynthesisRiskEstimate(" + id + ")";
  }
}
