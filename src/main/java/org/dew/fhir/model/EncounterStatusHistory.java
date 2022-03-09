package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter-definitions.html#Encounter.statusHistory">Encounter.statusHistory</a>
 */
public 
class EncounterStatusHistory extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 8077872673049696029L;
  
  protected String status;
  protected Period period;
  
  public EncounterStatusHistory()
  {
  }

  public EncounterStatusHistory(String status)
  {
    this.status = status;
  }

  public EncounterStatusHistory(String status, Period period)
  {
    this.status = status;
    this.period = period;
  }

  public String getStatus() {
    return status;
  }

  public Period getPeriod() {
    return period;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EncounterStatusHistory) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (status + ":" + period).hashCode();
  }
  
  @Override
  public String toString() {
    return "EncounterStatusHistory(" + status + "," + period + ")";
  }
}