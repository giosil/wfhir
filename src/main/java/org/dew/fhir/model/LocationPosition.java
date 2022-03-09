package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
 *
 * @see <a href="https://www.hl7.org/fhir/location-definitions.html#Location.position">Location.position</a>
 */
public 
class LocationPosition extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 154809899589756753L;
  
  protected Double longitude;
  protected Double latitude;
  protected Double altitude;
  
  public LocationPosition()
  {
  }
  
  public LocationPosition(double longitude, double latitude)
  {
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public Double getLatitude() {
    return latitude;
  }

  public Double getAltitude() {
    return altitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof LocationPosition) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (longitude + ":" + latitude + ":" + altitude).hashCode();
  }
  
  @Override
  public String toString() {
    return "LocationPosition(" + longitude + "," + latitude + "," + altitude + ")";
  }
}
