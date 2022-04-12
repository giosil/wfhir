package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An ingredient of a manufactured item or pharmaceutical product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIngredient_ReferenceStrength</a>
 */
public
class MedicinalProductIngredientReferenceStrength extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] country;
  protected Ratio strength;
  protected CodeableConcept substance;
  protected Ratio strengthLowLimit;
  protected String measurementPoint;
  
  public MedicinalProductIngredientReferenceStrength()
  {
  }
  
  public CodeableConcept[] getCountry() {
    return country;
  }
  
  public void setCountry(CodeableConcept[] country) {
    this.country = country;
  }
  
  public Ratio getStrength() {
    return strength;
  }
  
  public void setStrength(Ratio strength) {
    this.strength = strength;
  }
  
  public CodeableConcept getSubstance() {
    return substance;
  }
  
  public void setSubstance(CodeableConcept substance) {
    this.substance = substance;
  }
  
  public Ratio getStrengthLowLimit() {
    return strengthLowLimit;
  }
  
  public void setStrengthLowLimit(Ratio strengthLowLimit) {
    this.strengthLowLimit = strengthLowLimit;
  }
  
  public String getMeasurementPoint() {
    return measurementPoint;
  }
  
  public void setMeasurementPoint(String measurementPoint) {
    this.measurementPoint = measurementPoint;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIngredientReferenceStrength) {
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
    return "MedicinalProductIngredientReferenceStrength(" + id + ")";
  }
}
