package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 *
 * @see <a href="https://www.hl7.org/fhir/careteam.html">CareTeam</a>
 */
public
class CareTeam extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -5890468390422121336L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept[] category;
  protected String name;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Period period;
  protected CareTeamParticipant[] participant;
  protected CodeableConcept[] reasonCode;
  protected Reference<Condition>[] reasonReference;
  protected Reference<Organization>[] managingOrganization;
  protected ContactPoint[] telecom;
  protected Annotation[] note;
  
  public CareTeam()
  {
    this.resourceType = "CareTeam";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public String getName() {
    return name;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Period getPeriod() {
    return period;
  }

  public CareTeamParticipant[] getParticipant() {
    return participant;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Condition>[] getReasonReference() {
    return reasonReference;
  }

  public Reference<Organization>[] getManagingOrganization() {
    return managingOrganization;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setParticipant(CareTeamParticipant[] participant) {
    this.participant = participant;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Condition>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setManagingOrganization(Reference<Organization>[] managingOrganization) {
    this.managingOrganization = managingOrganization;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CareTeam) {
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
    return "CareTeam(" + id + ")";
  }
}
