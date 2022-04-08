package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The details of a healthcare service available at a location.
 *
 * @see <a href="https://build.fhir.org/healthcareservice.html">HealthcareService</a>
 */
public 
class HealthcareService extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 8432269032126445126L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected Reference<Organization> providedBy;
  protected CodeableConcept[] category;
  protected CodeableConcept[] type;
  protected CodeableConcept[] specialty;
  protected Reference<Location>[] location;
  protected String name;
  protected String comment;
  protected String extraDetails;
  protected Attachment photo;
  protected ExtendedContactDetail[] contact;
  protected ContactPoint[] telecom;
  protected Reference<Location>[] coverageArea;
  protected CodeableConcept[] serviceProvisionCode;
  protected HealthcareServiceEligibility[] eligibility;
  protected CodeableConcept[] program;
  protected CodeableConcept[] characteristic;
  protected CodeableConcept[] communication;
  protected CodeableConcept[] referralMethod;
  protected Boolean appointmentRequired;
  protected HealthcareServiceAvailableTime[] availableTime;
  protected HealthcareServiceNotAvailable[] notAvailable;
  protected String availabilityExceptions;
  protected Reference<Endpoint>[] endpoint;
  
  public HealthcareService()
  {
    this.resourceType = "HealthcareService";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Boolean getActive() {
    return active;
  }

  public Reference<Organization> getProvidedBy() {
    return providedBy;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public CodeableConcept[] getSpecialty() {
    return specialty;
  }

  public Reference<Location>[] getLocation() {
    return location;
  }

  public String getName() {
    return name;
  }

  public String getComment() {
    return comment;
  }

  public String getExtraDetails() {
    return extraDetails;
  }

  public Attachment getPhoto() {
    return photo;
  }

  public ExtendedContactDetail[] getContact() {
    return contact;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public Reference<Location>[] getCoverageArea() {
    return coverageArea;
  }

  public CodeableConcept[] getServiceProvisionCode() {
    return serviceProvisionCode;
  }

  public HealthcareServiceEligibility[] getEligibility() {
    return eligibility;
  }

  public CodeableConcept[] getProgram() {
    return program;
  }

  public CodeableConcept[] getCharacteristic() {
    return characteristic;
  }

  public CodeableConcept[] getCommunication() {
    return communication;
  }

  public CodeableConcept[] getReferralMethod() {
    return referralMethod;
  }

  public Boolean getAppointmentRequired() {
    return appointmentRequired;
  }

  public HealthcareServiceAvailableTime[] getAvailableTime() {
    return availableTime;
  }

  public HealthcareServiceNotAvailable[] getNotAvailable() {
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

  public void setProvidedBy(Reference<Organization> providedBy) {
    this.providedBy = providedBy;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setSpecialty(CodeableConcept[] specialty) {
    this.specialty = specialty;
  }

  public void setLocation(Reference<Location>[] location) {
    this.location = location;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setExtraDetails(String extraDetails) {
    this.extraDetails = extraDetails;
  }

  public void setPhoto(Attachment photo) {
    this.photo = photo;
  }

  public void setContact(ExtendedContactDetail[] contact) {
    this.contact = contact;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setCoverageArea(Reference<Location>[] coverageArea) {
    this.coverageArea = coverageArea;
  }

  public void setServiceProvisionCode(CodeableConcept[] serviceProvisionCode) {
    this.serviceProvisionCode = serviceProvisionCode;
  }

  public void setEligibility(HealthcareServiceEligibility[] eligibility) {
    this.eligibility = eligibility;
  }

  public void setProgram(CodeableConcept[] program) {
    this.program = program;
  }

  public void setCharacteristic(CodeableConcept[] characteristic) {
    this.characteristic = characteristic;
  }

  public void setCommunication(CodeableConcept[] communication) {
    this.communication = communication;
  }

  public void setReferralMethod(CodeableConcept[] referralMethod) {
    this.referralMethod = referralMethod;
  }

  public void setAppointmentRequired(Boolean appointmentRequired) {
    this.appointmentRequired = appointmentRequired;
  }

  public void setAvailableTime(HealthcareServiceAvailableTime[] availableTime) {
    this.availableTime = availableTime;
  }

  public void setNotAvailable(HealthcareServiceNotAvailable[] notAvailable) {
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
    if(object instanceof HealthcareService) {
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
    return "HealthcareService(" + id + "," + name + ")";
  }
}
