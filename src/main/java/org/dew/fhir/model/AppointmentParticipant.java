package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Participant involved in a appointment.
 *
 * @see <a href="https://www.hl7.org/fhir/appointment-definitions.html#Appointment.participant">Appointment.participant</a>
 */
public 
class AppointmentParticipant extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8422319853769776312L;
  
  protected CodeableConcept[] type;
  protected Reference<Resource> actor;
  protected String required;
  protected String status;
  protected Period period;
  
  public AppointmentParticipant()
  {
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public Reference<Resource> getActor() {
    return actor;
  }

  public String getRequired() {
    return required;
  }

  public String getStatus() {
    return status;
  }

  public Period getPeriod() {
    return period;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setActor(Reference<Resource> actor) {
    this.actor = actor;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AppointmentParticipant) {
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
    return "AppointmentParticipant(" + id + ")";
  }
}
