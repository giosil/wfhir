package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 *
 * @see <a href="https://build.fhir.org/practitionerrole.html">PractitionerRole</a>
 */
public 
class PractitionerRole extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -329972799157569826L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected Period period;
  protected Reference<Practitioner> practitioner;
  protected Reference<Organization> organization;
  protected CodeableConcept[] code;
  protected CodeableConcept[] specialty;
  protected Reference<Location>[] location;
  protected Reference<HealthcareService>[] healthcareService;
  protected ExtendedContactDetail[] contact;
  protected ContactPoint[] telecom;
  protected PractitionerRoleAvailableTime[] availableTime;
  protected PractitionerRoleNotAvailable[] notAvailable;
  protected String availabilityExceptions;
  protected Reference<Endpoint>[] endpoint;
  
  public PractitionerRole()
  {
    this.resourceType = "PractitionerRole";
  }
  
  public PractitionerRole(Reference<Practitioner> practitioner)
  {
    this.resourceType = "PractitionerRole";
    this.practitioner = practitioner;
  }
  
  public PractitionerRole(Reference<Practitioner> practitioner, Reference<Organization> organization)
  {
    this.resourceType = "PractitionerRole";
    this.practitioner = practitioner;
    this.organization = organization;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Boolean getActive() {
    return active;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Practitioner> getPractitioner() {
    return practitioner;
  }

  public Reference<Organization> getOrganization() {
    return organization;
  }

  public CodeableConcept[] getCode() {
    return code;
  }

  public CodeableConcept[] getSpecialty() {
    return specialty;
  }

  public Reference<Location>[] getLocation() {
    return location;
  }

  public Reference<HealthcareService>[] getHealthcareService() {
    return healthcareService;
  }

  public ExtendedContactDetail[] getContact() {
    return contact;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public PractitionerRoleAvailableTime[] getAvailableTime() {
    return availableTime;
  }

  public PractitionerRoleNotAvailable[] getNotAvailable() {
    return notAvailable;
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

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setPractitioner(Reference<Practitioner> practitioner) {
    this.practitioner = practitioner;
  }

  public void setOrganization(Reference<Organization> organization) {
    this.organization = organization;
  }

  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }

  public void setSpecialty(CodeableConcept[] specialty) {
    this.specialty = specialty;
  }

  public void setLocation(Reference<Location>[] location) {
    this.location = location;
  }

  public void setHealthcareService(Reference<HealthcareService>[] healthcareService) {
    this.healthcareService = healthcareService;
  }

  public void setContact(ExtendedContactDetail[] contact) {
    this.contact = contact;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setAvailableTime(PractitionerRoleAvailableTime[] availableTime) {
    this.availableTime = availableTime;
  }

  public void setNotAvailable(PractitionerRoleNotAvailable[] notAvailable) {
    this.notAvailable = notAvailable;
  }

  public void setAvailabilityExceptions(String availabilityExceptions) {
    this.availabilityExceptions = availabilityExceptions;
  }

  public void setEndpoint(Reference<Endpoint>[] endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PractitionerRole) {
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
    return "PractitionerRole(" + id + "," + practitioner + "," + organization + ")";
  }
}
