package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Characteristics for quantitative results of this observation.
 *
 * @see <a href="https://www.hl7.org/fhir/observationdefinition-definitions.html#ObservationDefinition.quantitativeDetails">ObservationDefinition.quantitativeDetails</a>
 */
public 
class ObservationDefinitionQuantitativeDetails extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -726324642758906746L;

  protected CodeableConcept customaryUnit;
  protected CodeableConcept unit;
  protected Double conversionFactor;
  protected Integer decimalPrecision;
  
  public ObservationDefinitionQuantitativeDetails()
  {
  }

  public CodeableConcept getCustomaryUnit() {
    return customaryUnit;
  }

  public CodeableConcept getUnit() {
    return unit;
  }

  public Double getConversionFactor() {
    return conversionFactor;
  }

  public Integer getDecimalPrecision() {
    return decimalPrecision;
  }

  public void setCustomaryUnit(CodeableConcept customaryUnit) {
    this.customaryUnit = customaryUnit;
  }

  public void setUnit(CodeableConcept unit) {
    this.unit = unit;
  }

  public void setConversionFactor(Double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public void setDecimalPrecision(Integer decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ObservationDefinitionQuantitativeDetails) {
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
    return "ObservationDefinitionQuantitativeDetails(" + id + "," + customaryUnit + "," + unit + "," + conversionFactor + "," + decimalPrecision + ")";
  }
}
