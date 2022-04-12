package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An ingredient of a manufactured item or pharmaceutical product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIngredient_Strength</a>
 */
public
class MedicinalProductIngredientStrength extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Ratio presentation;
  protected Ratio concentrationLowLimit;
  protected CodeableConcept[] country;
  protected MedicinalProductIngredientReferenceStrength[] referenceStrength;
  protected Ratio concentration;
  protected Ratio presentationLowLimit;
  protected String measurementPoint;
  
  public MedicinalProductIngredientStrength()
  {
  }
  
  public Ratio getPresentation() {
    return presentation;
  }
  
  public void setPresentation(Ratio presentation) {
    this.presentation = presentation;
  }
  
  public Ratio getConcentrationLowLimit() {
    return concentrationLowLimit;
  }
  
  public void setConcentrationLowLimit(Ratio concentrationLowLimit) {
    this.concentrationLowLimit = concentrationLowLimit;
  }
  
  public CodeableConcept[] getCountry() {
    return country;
  }
  
  public void setCountry(CodeableConcept[] country) {
    this.country = country;
  }
  
  public MedicinalProductIngredientReferenceStrength[] getReferenceStrength() {
    return referenceStrength;
  }
  
  public void setReferenceStrength(MedicinalProductIngredientReferenceStrength[] referenceStrength) {
    this.referenceStrength = referenceStrength;
  }
  
  public Ratio getConcentration() {
    return concentration;
  }
  
  public void setConcentration(Ratio concentration) {
    this.concentration = concentration;
  }
  
  public Ratio getPresentationLowLimit() {
    return presentationLowLimit;
  }
  
  public void setPresentationLowLimit(Ratio presentationLowLimit) {
    this.presentationLowLimit = presentationLowLimit;
  }
  
  public String getMeasurementPoint() {
    return measurementPoint;
  }
  
  public void setMeasurementPoint(String measurementPoint) {
    this.measurementPoint = measurementPoint;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIngredientStrength) {
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
    return "MedicinalProductIngredientStrength(" + id + ")";
  }
}
