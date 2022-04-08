package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. 
 * The managing organization assumes a level of responsibility for the patient during this time.
 *
 * @see <a href="https://www.hl7.org/fhir/episodeofcare.html">EpisodeOfCare</a>
 */
public 
class EpisodeOfCare extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 6031013307833125799L;
  
  protected Identifier[] identifier;
  protected String status;
  protected EpisodeOfCareStatusHistory[] statusHistory;
  protected CodeableConcept[] type;
  protected EpisodeOfCareDiagnosis[] diagnosis;
  protected Reference<Patient> patient;
  protected Reference<Organization> managingOrganization;
  protected Period period;
  protected Reference<ServiceRequest>[] referralRequest;
  protected Reference<Resource> careManager;
  protected Reference<CareTeam>[] team;
  protected Reference<Account>[] account;
  
  public EpisodeOfCare()
  {
    this.resourceType = "EpisodeOfCare";
  }
 
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public EpisodeOfCareStatusHistory[] getStatusHistory() {
    return statusHistory;
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public EpisodeOfCareDiagnosis[] getDiagnosis() {
    return diagnosis;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Reference<Organization> getManagingOrganization() {
    return managingOrganization;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<ServiceRequest>[] getReferralRequest() {
    return referralRequest;
  }

  public Reference<Resource> getCareManager() {
    return careManager;
  }

  public Reference<CareTeam>[] getTeam() {
    return team;
  }

  public Reference<Account>[] getAccount() {
    return account;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusHistory(EpisodeOfCareStatusHistory[] statusHistory) {
    this.statusHistory = statusHistory;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setDiagnosis(EpisodeOfCareDiagnosis[] diagnosis) {
    this.diagnosis = diagnosis;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setManagingOrganization(Reference<Organization> managingOrganization) {
    this.managingOrganization = managingOrganization;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setReferralRequest(Reference<ServiceRequest>[] referralRequest) {
    this.referralRequest = referralRequest;
  }

  public void setCareManager(Reference<Resource> careManager) {
    this.careManager = careManager;
  }

  public void setTeam(Reference<CareTeam>[] team) {
    this.team = team;
  }

  public void setAccount(Reference<Account>[] account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof EpisodeOfCare) {
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
    return "EpisodeOfCare(" + id + "," + status + "," + period + ")";
  }
}
