package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The HealthcareService is not available during this period of time due to the provided reason.
 *
 * @see <a href="https://build.fhir.org/healthcareservice-definitions.html#HealthcareService.notAvailable">HealthcareService.notAvailable</a>
 */
public 
class HealthcareServiceNotAvailable extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -3266608132837954799L;
  
  protected String description;
  protected Period during;
  
  public HealthcareServiceNotAvailable()
  {
  }

  public String getDescription() {
    return description;
  }

  public Period getDuring() {
    return during;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDuring(Period during) {
    this.during = during;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof HealthcareServiceNotAvailable) {
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
    return "HealthcareServiceNotAvailable(" + id + "," + description + "," + during + ")";
  }
}
