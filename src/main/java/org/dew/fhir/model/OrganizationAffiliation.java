package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
 *
 * @see <a href="https://www.hl7.org/fhir">OrganizationAffiliation</a>
 */
public
class OrganizationAffiliation extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected Period period;
  protected CodeableConcept[] specialty;
  protected CodeableConcept[] code;
  protected Boolean active;
  protected Reference<Resource>[] network;
  protected Reference<Resource>[] endpoint;
  protected Reference<Resource>[] healthcareService;
  protected Reference<Resource> organization;
  protected Reference<Resource> participatingOrganization;
  protected Reference<Resource>[] location;
  protected ContactPoint[] telecom;
  
  public OrganizationAffiliation()
  {
    this.resourceType = "OrganizationAffiliation";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
  }
  
  public CodeableConcept[] getSpecialty() {
    return specialty;
  }
  
  public void setSpecialty(CodeableConcept[] specialty) {
    this.specialty = specialty;
  }
  
  public CodeableConcept[] getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }
  
  public Boolean getActive() {
    return active;
  }
  
  public void setActive(Boolean active) {
    this.active = active;
  }
  
  public Reference<Resource>[] getNetwork() {
    return network;
  }
  
  public void setNetwork(Reference<Resource>[] network) {
    this.network = network;
  }
  
  public Reference<Resource>[] getEndpoint() {
    return endpoint;
  }
  
  public void setEndpoint(Reference<Resource>[] endpoint) {
    this.endpoint = endpoint;
  }
  
  public Reference<Resource>[] getHealthcareService() {
    return healthcareService;
  }
  
  public void setHealthcareService(Reference<Resource>[] healthcareService) {
    this.healthcareService = healthcareService;
  }
  
  public Reference<Resource> getOrganization() {
    return organization;
  }
  
  public void setOrganization(Reference<Resource> organization) {
    this.organization = organization;
  }
  
  public Reference<Resource> getParticipatingOrganization() {
    return participatingOrganization;
  }
  
  public void setParticipatingOrganization(Reference<Resource> participatingOrganization) {
    this.participatingOrganization = participatingOrganization;
  }
  
  public Reference<Resource>[] getLocation() {
    return location;
  }
  
  public void setLocation(Reference<Resource>[] location) {
    this.location = location;
  }
  
  public ContactPoint[] getTelecom() {
    return telecom;
  }
  
  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OrganizationAffiliation) {
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
    return "OrganizationAffiliation(" + id + ")";
  }
}
