package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">EffectEvidenceSynthesis_EffectEstimate</a>
 */
public
class EffectEvidenceSynthesisEffectEstimate extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept unitOfMeasure;
  protected CodeableConcept variantState;
  protected EffectEvidenceSynthesisPrecisionEstimate[] precisionEstimate;
  protected String description;
  protected CodeableConcept type;
  protected Double value;
  
  public EffectEvidenceSynthesisEffectEstimate()
  {
  }
  
  public CodeableConcept getUnitOfMeasure() {
    return unitOfMeasure;
  }
  
  public void setUnitOfMeasure(CodeableConcept unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }
  
  public CodeableConcept getVariantState() {
    return variantState;
  }
  
  public void setVariantState(CodeableConcept variantState) {
    this.variantState = variantState;
  }
  
  public EffectEvidenceSynthesisPrecisionEstimate[] getPrecisionEstimate() {
    return precisionEstimate;
  }
  
  public void setPrecisionEstimate(EffectEvidenceSynthesisPrecisionEstimate[] precisionEstimate) {
    this.precisionEstimate = precisionEstimate;
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
  
  public Double getValue() {
    return value;
  }
  
  public void setValue(Double value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EffectEvidenceSynthesisEffectEstimate) {
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
    return "EffectEvidenceSynthesisEffectEstimate(" + id + ")";
  }
}
