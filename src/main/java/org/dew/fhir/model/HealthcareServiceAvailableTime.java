package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Times that the Service Site is available.
 *
 * @see <a href="https://build.fhir.org/healthcareservice-definitions.html#HealthcareService.availableTime">HealthcareService.availableTime</a>
 */
public 
class HealthcareServiceAvailableTime extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 804782323408597474L;
  
  protected String[] daysOfWeek;
  protected Boolean allDay;
  protected Date availableStartTime;
  protected Date availableEndTime;
  
  public HealthcareServiceAvailableTime()
  {
  }

  public String[] getDaysOfWeek() {
    return daysOfWeek;
  }

  public Boolean getAllDay() {
    return allDay;
  }

  public Date getAvailableStartTime() {
    return availableStartTime;
  }

  public Date getAvailableEndTime() {
    return availableEndTime;
  }

  public void setDaysOfWeek(String[] daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }

  public void setAvailableStartTime(Date availableStartTime) {
    this.availableStartTime = availableStartTime;
  }

  public void setAvailableEndTime(Date availableEndTime) {
    this.availableEndTime = availableEndTime;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof HealthcareServiceAvailableTime) {
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
    return "HealthcareServiceAvailableTime(" + id + "," + allDay + "," + availableStartTime + "," + availableEndTime + ")";
  }
}
