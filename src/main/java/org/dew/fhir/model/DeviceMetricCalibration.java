package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * @see <a href="https://www.hl7.org/fhir">DeviceMetric_Calibration</a>
 */
public
class DeviceMetricCalibration extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String state;
  protected Date time;
  protected String type;
  
  public DeviceMetricCalibration()
  {
  }
  
  public String getState() {
    return state;
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
  public Date getTime() {
    return time;
  }
  
  public void setTime(Date time) {
    this.time = time;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceMetricCalibration) {
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
    return "DeviceMetricCalibration(" + id + ")";
  }
}
