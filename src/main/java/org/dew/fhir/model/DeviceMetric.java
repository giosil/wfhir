package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * @see <a href="https://www.hl7.org/fhir">DeviceMetric</a>
 */
public
class DeviceMetric extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String operationalStatus;
  protected Identifier[] identifier;
  protected Reference<Resource> parent;
  protected Timing measurementPeriod;
  protected String color;
  protected Reference<Resource> source;
  protected CodeableConcept type;
  protected CodeableConcept unit;
  protected String category;
  protected DeviceMetricCalibration[] calibration;
  
  public DeviceMetric()
  {
    this.resourceType = "DeviceMetric";
  }
  
  public String getOperationalStatus() {
    return operationalStatus;
  }
  
  public void setOperationalStatus(String operationalStatus) {
    this.operationalStatus = operationalStatus;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource> getParent() {
    return parent;
  }
  
  public void setParent(Reference<Resource> parent) {
    this.parent = parent;
  }
  
  public Timing getMeasurementPeriod() {
    return measurementPeriod;
  }
  
  public void setMeasurementPeriod(Timing measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public Reference<Resource> getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource> source) {
    this.source = source;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public CodeableConcept getUnit() {
    return unit;
  }
  
  public void setUnit(CodeableConcept unit) {
    this.unit = unit;
  }
  
  public String getCategory() {
    return category;
  }
  
  public void setCategory(String category) {
    this.category = category;
  }
  
  public DeviceMetricCalibration[] getCalibration() {
    return calibration;
  }
  
  public void setCalibration(DeviceMetricCalibration[] calibration) {
    this.calibration = calibration;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceMetric) {
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
    return "DeviceMetric(" + id + ")";
  }
}
