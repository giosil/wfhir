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
  private static final long serialVersionUID = -7701460222040263535L;

  protected Reference<Location> location;
  protected String code;
  protected CodeableConcept physicalType;
  protected Period period;
  
  public EncounterLocation()
  {
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public String getCode() {
    return code;
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

  public void setCode(String code) {
    this.code = code;
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
