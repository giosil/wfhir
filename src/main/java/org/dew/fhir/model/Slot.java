package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A slot of time on a schedule that may be available for booking appointments.
 *
 * @see <a href="https://www.hl7.org/fhir/slot.html">Slot</a>
 */
public 
class Slot extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 7101206599913389103L;
  
  protected Identifier[] identifier;
  protected CodeableConcept[] serviceCategory;
  protected CodeableConcept[] serviceType;
  protected CodeableConcept[] specialty;
  protected CodeableConcept appointmentType;
  protected Reference<Schedule> schedule;
  protected String status;
  protected Date start;
  protected Date end;
  protected Boolean overbooked;
  protected String comment;
  
  public Slot()
  {
    this.resourceType = "Slot";
  }

  public Identifier[] getIdentifier() {
    return identifier;
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

  public Reference<Schedule> getSchedule() {
    return schedule;
  }

  public String getStatus() {
    return status;
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  public Boolean getOverbooked() {
    return overbooked;
  }

  public String getComment() {
    return comment;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
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

  public void setSchedule(Reference<Schedule> schedule) {
    this.schedule = schedule;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public void setOverbooked(Boolean overbooked) {
    this.overbooked = overbooked;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Slot) {
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
    return "Slot(" + id + ")";
  }
}
