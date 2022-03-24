package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Vaccine date recommendations. For example, earliest date to administer, latest date to administer, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/immunizationrecommendation-definitions.html#ImmunizationRecommendation.recommendation.dateCriterion">ImmunizationRecommendation.recommendation.dateCriterion</a>
 */
public 
class ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -4526326802032209992L;
  
  protected CodeableConcept code;
  protected Date value;
  
  public ImmunizationRecommendationRecommendationDateCriterion()
  {
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Date getValue() {
    return value;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setValue(Date value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationRecommendationRecommendationDateCriterion) {
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
    return "ImmunizationRecommendationRecommendationDateCriterion(" + id + ")";
  }
}
