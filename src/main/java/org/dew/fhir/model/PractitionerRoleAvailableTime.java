package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Times the practitioner is available or performing this role at the location and/or healthcareservice.
 *
 * @see <a href="https://build.fhir.org/practitionerrole-definitions.html#PractitionerRole.availableTime">PractitionerRole.availableTime</a>
 */
public 
class PractitionerRoleAvailableTime extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -3888435418904104527L;
  
  protected String[] daysOfWeek;
  protected Boolean allDay;
  protected Date availableStartTime;
  protected Date availableEndTime;
  
  public PractitionerRoleAvailableTime()
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
    if(object instanceof PractitionerRoleAvailableTime) {
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
    return "PractitionerRoleAvailableTime(" + id + "," + allDay + "," + availableStartTime + "," + availableEndTime + ")";
  }
}
