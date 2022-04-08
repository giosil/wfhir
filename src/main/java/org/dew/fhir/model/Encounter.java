package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter.html">Encounter</a>
 */
public 
class Encounter extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 4819389895054214957L;
  
  protected Identifier[] identifier;
  protected String status;
  protected EncounterStatusHistory[] statusHistory;
  protected Coding class_;
  protected EncounterClassHistory[] classHistory;
  protected CodeableConcept[] type;
  protected CodeableConcept serviceType;
  protected CodeableConcept priority;
  protected Reference<Resource> subject;
  protected Reference<EpisodeOfCare>[] episodeOfCare;
  protected Reference<ServiceRequest>[] basedOn;
  protected EncounterParticipant[] participant;
  protected Reference<Appointment>[] appointment;
  protected Period period;
  protected Duration length;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected EncounterDiagnosis[] diagnosis;
  protected Reference<Resource>[] account;
  protected EncounterHospitalization hospitalization;
  protected EncounterLocation[] location;
  protected Reference<Organization> serviceProvider;
  protected Reference<Encounter> partOf;
  
  public Encounter()
  {
    this.resourceType = "Encounter";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public EncounterStatusHistory[] getStatusHistory() {
    return statusHistory;
  }

  public Coding getClass_() {
    return class_;
  }

  public EncounterClassHistory[] getClassHistory() {
    return classHistory;
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public CodeableConcept getServiceType() {
    return serviceType;
  }

  public CodeableConcept getPriority() {
    return priority;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<EpisodeOfCare>[] getEpisodeOfCare() {
    return episodeOfCare;
  }

  public Reference<ServiceRequest>[] getBasedOn() {
    return basedOn;
  }

  public EncounterParticipant[] getParticipant() {
    return participant;
  }

  public Reference<Appointment>[] getAppointment() {
    return appointment;
  }

  public Period getPeriod() {
    return period;
  }

  public Duration getLength() {
    return length;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public EncounterDiagnosis[] getDiagnosis() {
    return diagnosis;
  }

  public Reference<Resource>[] getAccount() {
    return account;
  }

  public EncounterHospitalization getHospitalization() {
    return hospitalization;
  }

  public EncounterLocation[] getLocation() {
    return location;
  }

  public Reference<Organization> getServiceProvider() {
    return serviceProvider;
  }

  public Reference<Encounter> getPartOf() {
    return partOf;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusHistory(EncounterStatusHistory[] statusHistory) {
    this.statusHistory = statusHistory;
  }

  public void setClass_(Coding class_) {
    this.class_ = class_;
  }

  public void setClassHistory(EncounterClassHistory[] classHistory) {
    this.classHistory = classHistory;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setServiceType(CodeableConcept serviceType) {
    this.serviceType = serviceType;
  }

  public void setPriority(CodeableConcept priority) {
    this.priority = priority;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEpisodeOfCare(Reference<EpisodeOfCare>[] episodeOfCare) {
    this.episodeOfCare = episodeOfCare;
  }

  public void setBasedOn(Reference<ServiceRequest>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setParticipant(EncounterParticipant[] participant) {
    this.participant = participant;
  }

  public void setAppointment(Reference<Appointment>[] appointment) {
    this.appointment = appointment;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setLength(Duration length) {
    this.length = length;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setDiagnosis(EncounterDiagnosis[] diagnosis) {
    this.diagnosis = diagnosis;
  }

  public void setAccount(Reference<Resource>[] account) {
    this.account = account;
  }

  public void setHospitalization(EncounterHospitalization hospitalization) {
    this.hospitalization = hospitalization;
  }

  public void setLocation(EncounterLocation[] location) {
    this.location = location;
  }

  public void setServiceProvider(Reference<Organization> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public void setPartOf(Reference<Encounter> partOf) {
    this.partOf = partOf;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Encounter) {
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
    return "Encounter(" + id + ")";
  }
}
