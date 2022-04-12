package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Locations where the patient has been during the encounter.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter-definitions.html#Encounter.location">Encounter.location</a>
 */
public 
class EncounterLocation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1762402781608774773L;
  
  protected Reference<Location> location;
  protected String status;
  protected CodeableConcept physicalType;
  protected Period period;
  
  public EncounterLocation()
  {
  }
  
  public Reference<Location> getLocation() {
    return location;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getPhysicalType() {
    return physicalType;
  }

  public Period getPeriod() {
    return period;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPhysicalType(CodeableConcept physicalType) {
    this.physicalType = physicalType;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof EncounterLocation) {
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
    return "EncounterLocation(" + id + ")";
  }
}
