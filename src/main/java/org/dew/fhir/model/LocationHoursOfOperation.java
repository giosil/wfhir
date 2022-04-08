package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * What days/times during a week is this location usually open.
 *
 * @see <a href="https://www.hl7.org/fhir/location-definitions.html#Location.hoursOfOperation">Location.hoursOfOperation</a>
 */
public 
class LocationHoursOfOperation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -420776768962775933L;
  
  protected String[] daysOfWeek;
  protected Boolean allDay;
  protected Date openingTime;
  protected Date closingTime;
  
  public LocationHoursOfOperation()
  {
  }

  public String[] getDaysOfWeek() {
    return daysOfWeek;
  }

  public Boolean getAllDay() {
    return allDay;
  }

  public Date getOpeningTime() {
    return openingTime;
  }

  public Date getClosingTime() {
    return closingTime;
  }

  public void setDaysOfWeek(String[] daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }

  public void setOpeningTime(Date openingTime) {
    this.openingTime = openingTime;
  }

  public void setClosingTime(Date closingTime) {
    this.closingTime = closingTime;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof LocationHoursOfOperation) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (openingTime + ":" + closingTime + ":" + allDay).hashCode();
  }
  
  @Override
  public String toString() {
    return "LocationHoursOfOperation(" + openingTime + "," + closingTime + "," + allDay + ")";
  }
}
