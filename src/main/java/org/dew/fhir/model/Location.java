package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
 *
 * @see <a href="https://www.hl7.org/fhir/location.html">Location</a>
 */
public 
class Location extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1319698816061741608L;
  
  protected Identifier[] identifier;
  protected String status;
  protected Coding operationalStatus;
  protected String name;
  protected String[] alias;
  protected String description;
  protected String mode;
  protected CodeableConcept[] type;
  protected ContactPoint[] telecom;
  protected Address address;
  protected CodeableConcept physicalType;
  protected LocationPosition position;
  protected Reference<Organization> managingOrganization;
  protected Reference<Location> partOf;
  protected LocationHoursOfOperation[] hoursOfOperation;
  protected String availabilityExceptions;
  protected Reference<Endpoint>[] endpoint;
  
  public Location()
  {
    this.resourceType = "Location";
  }

  public Location(String name)
  {
    this.resourceType = "Location";
    this.name = name;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public Coding getOperationalStatus() {
    return operationalStatus;
  }

  public String getName() {
    return name;
  }

  public String[] getAlias() {
    return alias;
  }

  public String getDescription() {
    return description;
  }

  public String getMode() {
    return mode;
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public Address getAddress() {
    return address;
  }

  public CodeableConcept getPhysicalType() {
    return physicalType;
  }

  public LocationPosition getPosition() {
    return position;
  }

  public Reference<Organization> getManagingOrganization() {
    return managingOrganization;
  }

  public Reference<Location> getPartOf() {
    return partOf;
  }

  public LocationHoursOfOperation[] getHoursOfOperation() {
    return hoursOfOperation;
  }

  public String getAvailabilityExceptions() {
    return availabilityExceptions;
  }

  public Reference<Endpoint>[] getEndpoint() {
    return endpoint;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setOperationalStatus(Coding operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAlias(String[] alias) {
    this.alias = alias;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setPhysicalType(CodeableConcept physicalType) {
    this.physicalType = physicalType;
  }

  public void setPosition(LocationPosition position) {
    this.position = position;
  }

  public void setManagingOrganization(Reference<Organization> managingOrganization) {
    this.managingOrganization = managingOrganization;
  }

  public void setPartOf(Reference<Location> partOf) {
    this.partOf = partOf;
  }

  public void setHoursOfOperation(LocationHoursOfOperation[] hoursOfOperation) {
    this.hoursOfOperation = hoursOfOperation;
  }

  public void setAvailabilityExceptions(String availabilityExceptions) {
    this.availabilityExceptions = availabilityExceptions;
  }

  public void setEndpoint(Reference<Endpoint>[] endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Location) {
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
    return "Location(" + id + "," + name + ")";
  }
}
