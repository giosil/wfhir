package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 *
 * @see <a href="https://www.hl7.org/fhir/appointmentresponse.html">AppointmentResponse</a>
 */
public 
class AppointmentResponse extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -1705196609688238666L;
  
  protected Identifier[] identifier;
  protected Reference<Appointment> appointment;
  protected Date start;
  protected Date end;
  protected CodeableConcept[] participantType;
  protected Reference<Resource> actor;
  protected String participantStatus;
  protected String comment;
  
  public AppointmentResponse()
  {
    this.resourceType = "AppointmentResponse";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Appointment> getAppointment() {
    return appointment;
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  public CodeableConcept[] getParticipantType() {
    return participantType;
  }

  public Reference<Resource> getActor() {
    return actor;
  }

  public String getParticipantStatus() {
    return participantStatus;
  }

  public String getComment() {
    return comment;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setAppointment(Reference<Appointment> appointment) {
    this.appointment = appointment;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public void setParticipantType(CodeableConcept[] participantType) {
    this.participantType = participantType;
  }

  public void setActor(Reference<Resource> actor) {
    this.actor = actor;
  }

  public void setParticipantStatus(String participantStatus) {
    this.participantStatus = participantStatus;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AppointmentResponse) {
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
    return "AppointmentResponse(" + id + ")";
  }
}
