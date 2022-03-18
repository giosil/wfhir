package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
 *
 * @see <a href="https://www.hl7.org/fhir/episodeofcare-definitions.html#EpisodeOfCare.statusHistory">EpisodeOfCare.statusHistory</a>
 */
public 
class EpisodeOfCareStatusHistory extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1353345829726462218L;
  
  protected String status;
  protected Period period;
  
  public EpisodeOfCareStatusHistory()
  {
  }
  
  public EpisodeOfCareStatusHistory(String status)
  {
    this.status = status;
  }
  
  public EpisodeOfCareStatusHistory(String status, Period period)
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
    if(object instanceof EpisodeOfCareStatusHistory) {
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
    return "EpisodeOfCareStatusHistory(" + id + "," + status + "," + period + ")";
  }
}
