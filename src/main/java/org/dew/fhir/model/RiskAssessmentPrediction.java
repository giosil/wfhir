package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Describes the expected outcome for the subject.
 *
 * @see <a href="https://www.hl7.org/fhir/riskassessment-definitions.html#RiskAssessment.prediction">RiskAssessment.prediction</a>
 */
public 
class RiskAssessmentPrediction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -4663450927792348025L;
  
  protected CodeableConcept outcome;
  protected Double probabilityDecimal;
  protected Range probabilityRange;
  protected CodeableConcept qualitativeRisk;
  protected Double relativeRisk;
  protected Period whenPeriod;
  protected Range whenRange;
  protected String rationale;
  
  public RiskAssessmentPrediction()
  {
  }

  public CodeableConcept getOutcome() {
    return outcome;
  }

  public Double getProbabilityDecimal() {
    return probabilityDecimal;
  }

  public Range getProbabilityRange() {
    return probabilityRange;
  }

  public CodeableConcept getQualitativeRisk() {
    return qualitativeRisk;
  }

  public Double getRelativeRisk() {
    return relativeRisk;
  }

  public Period getWhenPeriod() {
    return whenPeriod;
  }

  public Range getWhenRange() {
    return whenRange;
  }

  public String getRationale() {
    return rationale;
  }

  public void setOutcome(CodeableConcept outcome) {
    this.outcome = outcome;
  }

  public void setProbabilityDecimal(Double probabilityDecimal) {
    this.probabilityDecimal = probabilityDecimal;
  }

  public void setProbabilityRange(Range probabilityRange) {
    this.probabilityRange = probabilityRange;
  }

  public void setQualitativeRisk(CodeableConcept qualitativeRisk) {
    this.qualitativeRisk = qualitativeRisk;
  }

  public void setRelativeRisk(Double relativeRisk) {
    this.relativeRisk = relativeRisk;
  }

  public void setWhenPeriod(Period whenPeriod) {
    this.whenPeriod = whenPeriod;
  }

  public void setWhenRange(Range whenRange) {
    this.whenRange = whenRange;
  }

  public void setRationale(String rationale) {
    this.rationale = rationale;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RiskAssessmentPrediction) {
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
    return "RiskAssessmentPrediction(" + id + "," + outcome + "," + qualitativeRisk + ")";
  }
}
