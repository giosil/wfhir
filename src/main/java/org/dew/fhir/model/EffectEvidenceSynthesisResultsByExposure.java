package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">EffectEvidenceSynthesis_ResultsByExposure</a>
 */
public
class EffectEvidenceSynthesisResultsByExposure extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept variantState;
  protected String exposureState;
  protected String description;
  protected Reference<Resource> riskEvidenceSynthesis;
  
  public EffectEvidenceSynthesisResultsByExposure()
  {
  }
  
  public CodeableConcept getVariantState() {
    return variantState;
  }
  
  public void setVariantState(CodeableConcept variantState) {
    this.variantState = variantState;
  }
  
  public String getExposureState() {
    return exposureState;
  }
  
  public void setExposureState(String exposureState) {
    this.exposureState = exposureState;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Reference<Resource> getRiskEvidenceSynthesis() {
    return riskEvidenceSynthesis;
  }
  
  public void setRiskEvidenceSynthesis(Reference<Resource> riskEvidenceSynthesis) {
    this.riskEvidenceSynthesis = riskEvidenceSynthesis;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EffectEvidenceSynthesisResultsByExposure) {
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
    return "EffectEvidenceSynthesisResultsByExposure(" + id + ")";
  }
}
