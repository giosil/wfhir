package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A material substance originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.
 *
 * @see <a href="https://www.hl7.org/fhir">BiologicallyDerivedProduct_Storage</a>
 */
public
class BiologicallyDerivedProductStorage extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Period duration;
  protected Double temperature;
  protected String description;
  protected String scale;
  
  public BiologicallyDerivedProductStorage()
  {
  }
  
  public Period getDuration() {
    return duration;
  }
  
  public void setDuration(Period duration) {
    this.duration = duration;
  }
  
  public Double getTemperature() {
    return temperature;
  }
  
  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getScale() {
    return scale;
  }
  
  public void setScale(String scale) {
    this.scale = scale;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BiologicallyDerivedProductStorage) {
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
    return "BiologicallyDerivedProductStorage(" + id + ")";
  }
}
