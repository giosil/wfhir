package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Data that comes from a series of measurements taken by a device, which may have upper and lower limits. 
 * The data type also supports more than one dimension in the data.
 * A SampledData provides a concise way to handle the data produced by devices that sample a particular physical state at a high frequency. 
 * A typical use for this is for the output of an ECG or EKG device. 
 * The data type includes a series of raw decimal values (which are mostly simple integers), along with adjustments for scale and factor. 
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#sampleddata">SampledData</a>
 */
public 
class SampledData extends Element implements Serializable
{
  private static final long serialVersionUID = -7860987903572076004L;
  
  protected SimpleQuantity origin;
  protected Double period;
  protected Double factor;
  protected Double lowerLimit;
  protected Double upperLimit;
  protected Integer dimensions;
  protected String data;
  
  public SampledData()
  {
  }

  public SimpleQuantity getOrigin() {
    return origin;
  }

  public Double getPeriod() {
    return period;
  }

  public Double getFactor() {
    return factor;
  }

  public Double getLowerLimit() {
    return lowerLimit;
  }

  public Double getUpperLimit() {
    return upperLimit;
  }

  public Integer getDimensions() {
    return dimensions;
  }

  public String getData() {
    return data;
  }

  public void setOrigin(SimpleQuantity origin) {
    this.origin = origin;
  }

  public void setPeriod(Double period) {
    this.period = period;
  }

  public void setFactor(Double factor) {
    this.factor = factor;
  }

  public void setLowerLimit(Double lowerLimit) {
    this.lowerLimit = lowerLimit;
  }

  public void setUpperLimit(Double upperLimit) {
    this.upperLimit = upperLimit;
  }

  public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SampledData) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (origin + ":" + data).hashCode();
  }
  
  @Override
  public String toString() {
    return "SampledData(" + origin + "," + data + ")";
  }
}

