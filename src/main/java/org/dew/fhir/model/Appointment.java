package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. 
 * This may result in one or more Encounter(s).
 *
 * @see <a href="https://www.hl7.org/fhir/appointment.html">Appointment</a>
 */
public 
class Appointment extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 5411822824303571252L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept cancelationReason;
  protected CodeableConcept[] serviceCategory;
  protected CodeableConcept[] serviceType;
  protected CodeableConcept[] specialty;
  protected CodeableConcept appointmentType;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Integer priority;
  protected String description;
  protected Reference<Resource>[] supportingInformation;
  protected Date start;
  protected Date end;
  protected Integer minutesDuration;
  protected Reference<Slot>[] slot;
  protected Date created;
  protected String comment;
  protected String patientInstruction;
  protected Reference<ServiceRequest>[] basedOn;
  protected AppointmentParticipant[] participant;
  protected Period[] requestedPeriod;
  
  public Appointment()
  {
    this.resourceType = "Appointment";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getCancelationReason() {
    return cancelationReason;
  }

  public CodeableConcept[] getServiceCategory() {
    return serviceCategory;
  }

  public CodeableConcept[] getServiceType() {
    return serviceType;
  }

  public CodeableConcept[] getSpecialty() {
    return specialty;
  }

  public CodeableConcept getAppointmentType() {
    return appointmentType;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Integer getPriority() {
    return priority;
  }

  public String getDescription() {
    return description;
  }

  public Reference<Resource>[] getSupportingInformation() {
    return supportingInformation;
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  public Integer getMinutesDuration() {
    return minutesDuration;
  }

  public Reference<Slot>[] getSlot() {
    return slot;
  }

  public Date getCreated() {
    return created;
  }

  public String getComment() {
    return comment;
  }

  public String getPatientInstruction() {
    return patientInstruction;
  }

  public Reference<ServiceRequest>[] getBasedOn() {
    return basedOn;
  }

  public AppointmentParticipant[] getParticipant() {
    return participant;
  }

  public Period[] getRequestedPeriod() {
    return requestedPeriod;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCancelationReason(CodeableConcept cancelationReason) {
    this.cancelationReason = cancelationReason;
  }

  public void setServiceCategory(CodeableConcept[] serviceCategory) {
    this.serviceCategory = serviceCategory;
  }

  public void setServiceType(CodeableConcept[] serviceType) {
    this.serviceType = serviceType;
  }

  public void setSpecialty(CodeableConcept[] specialty) {
    this.specialty = specialty;
  }

  public void setAppointmentType(CodeableConcept appointmentType) {
    this.appointmentType = appointmentType;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSupportingInformation(Reference<Resource>[] supportingInformation) {
    this.supportingInformation = supportingInformation;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public void setMinutesDuration(Integer minutesDuration) {
    this.minutesDuration = minutesDuration;
  }

  public void setSlot(Reference<Slot>[] slot) {
    this.slot = slot;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setPatientInstruction(String patientInstruction) {
    this.patientInstruction = patientInstruction;
  }

  public void setBasedOn(Reference<ServiceRequest>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setParticipant(AppointmentParticipant[] participant) {
    this.participant = participant;
  }

  public void setRequestedPeriod(Period[] requestedPeriod) {
    this.requestedPeriod = requestedPeriod;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Appointment) {
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
    return "Appointment(" + id + ")";
  }
}
