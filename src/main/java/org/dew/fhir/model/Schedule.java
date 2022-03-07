package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A container for slots of time that may be available for booking appointments.
 * 
 * @see <a href="https://www.hl7.org/fhir/schedule.html">Schedule</a>
 */
public 
class Schedule extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -9028624104483647077L;
  
  protected Identifier[] identifier;
  protected boolean active;
  protected CodeableConcept[] serviceCategory;
  protected CodeableConcept[] serviceType;
  protected CodeableConcept[] specialty;
  protected Reference<Resource>[] actor;
  protected Period planningHorizon;
  protected String comment;
  
  public Schedule()
  {
  }
  
  public Schedule(Identifier singleIdentifier)
  {
    this.identifier = new Identifier[] { singleIdentifier };
    this.active = true;
  }
  
  public Schedule(Identifier[] identifier)
  {
    this.identifier = identifier;
    this.active = true;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public boolean isActive() {
    return active;
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

  public Reference<Resource>[] getActor() {
    return actor;
  }

  public Period getPlanningHorizon() {
    return planningHorizon;
  }

  public String getComment() {
    return comment;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(boolean active) {
    this.active = active;
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

  public void setActor(Reference<Resource>[] actor) {
    this.actor = actor;
  }

  public void setPlanningHorizon(Period planningHorizon) {
    this.planningHorizon = planningHorizon;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Schedule) {
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
    return "Schedule(" + id + ")";
  }
}

