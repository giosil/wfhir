package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Some observations have multiple component observations. 
 * These component observations are expressed as separate code value pairs that share the same attributes. 
 * Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
 *
 * @see <a href="https://www.hl7.org/fhir/observation-definitions.html#Observation.component">Observation.component</a>
 */
public 
class ObservationComponent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -3505719577151767420L;
  
  protected CodeableConcept code;
  protected Quantity valueQuantity;
  protected CodeableConcept valueCodeableConcept;
  protected String valueString;
  protected Boolean valueBoolean;
  protected Integer valueInteger;
  protected Range valueRange;
  protected Ratio valueRatio;
  protected SampledData valueSampledData;
  protected Date valueTime;
  protected Date valueDateTime;
  protected Period valuePeriod;
  protected CodeableConcept dataAbsentReason;
  protected CodeableConcept[] interpretation;
  protected ObservationReferenceRange[] referenceRange;
  
  public ObservationComponent()
  {
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Quantity getValueQuantity() {
    return valueQuantity;
  }

  public CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept;
  }

  public String getValueString() {
    return valueString;
  }

  public Boolean getValueBoolean() {
    return valueBoolean;
  }

  public Integer getValueInteger() {
    return valueInteger;
  }

  public Range getValueRange() {
    return valueRange;
  }

  public Ratio getValueRatio() {
    return valueRatio;
  }

  public SampledData getValueSampledData() {
    return valueSampledData;
  }

  public Date getValueTime() {
    return valueTime;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public Period getValuePeriod() {
    return valuePeriod;
  }

  public CodeableConcept getDataAbsentReason() {
    return dataAbsentReason;
  }

  public CodeableConcept[] getInterpretation() {
    return interpretation;
  }

  public ObservationReferenceRange[] getReferenceRange() {
    return referenceRange;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
    this.valueCodeableConcept = valueCodeableConcept;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }

  public void setValueRange(Range valueRange) {
    this.valueRange = valueRange;
  }

  public void setValueRatio(Ratio valueRatio) {
    this.valueRatio = valueRatio;
  }

  public void setValueSampledData(SampledData valueSampledData) {
    this.valueSampledData = valueSampledData;
  }

  public void setValueTime(Date valueTime) {
    this.valueTime = valueTime;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public void setValuePeriod(Period valuePeriod) {
    this.valuePeriod = valuePeriod;
  }

  public void setDataAbsentReason(CodeableConcept dataAbsentReason) {
    this.dataAbsentReason = dataAbsentReason;
  }

  public void setInterpretation(CodeableConcept[] interpretation) {
    this.interpretation = interpretation;
  }

  public void setReferenceRange(ObservationReferenceRange[] referenceRange) {
    this.referenceRange = referenceRange;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ObservationComponent) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(code == null) return 0;
    return code.hashCode();
  }
  
  @Override
  public String toString() {
    return "ObservationComponent(" + id + "," + code + ")";
  }
}
