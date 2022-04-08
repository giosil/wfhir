package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 *
 * @see <a href="https://www.hl7.org/fhir/consent.html">Consent</a>
 */
public 
class Consent extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -4306726242792187616L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept scope;
  protected CodeableConcept[] category;
  protected Reference<Patient> patient;
  protected Date dateTime;
  protected Reference<Resource>[] performer;
  protected Reference<Organization>[] organization;
  protected Attachment sourceAttachment;
  protected Reference<Resource> sourceReference;
  protected ConsentPolicy[] policy;
  protected CodeableConcept policyRule;
  protected ConsentVerification[] verification;
  protected ConsentProvision provision;
  
  public Consent()
  {
    this.resourceType = "Consent";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getScope() {
    return scope;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Date getDateTime() {
    return dateTime;
  }

  public Reference<Resource>[] getPerformer() {
    return performer;
  }

  public Reference<Organization>[] getOrganization() {
    return organization;
  }

  public Attachment getSourceAttachment() {
    return sourceAttachment;
  }

  public Reference<Resource> getSourceReference() {
    return sourceReference;
  }

  public ConsentPolicy[] getPolicy() {
    return policy;
  }

  public CodeableConcept getPolicyRule() {
    return policyRule;
  }

  public ConsentVerification[] getVerification() {
    return verification;
  }

  public ConsentProvision getProvision() {
    return provision;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setScope(CodeableConcept scope) {
    this.scope = scope;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public void setPerformer(Reference<Resource>[] performer) {
    this.performer = performer;
  }

  public void setOrganization(Reference<Organization>[] organization) {
    this.organization = organization;
  }

  public void setSourceAttachment(Attachment sourceAttachment) {
    this.sourceAttachment = sourceAttachment;
  }

  public void setSourceReference(Reference<Resource> sourceReference) {
    this.sourceReference = sourceReference;
  }

  public void setPolicy(ConsentPolicy[] policy) {
    this.policy = policy;
  }

  public void setPolicyRule(CodeableConcept policyRule) {
    this.policyRule = policyRule;
  }

  public void setVerification(ConsentVerification[] verification) {
    this.verification = verification;
  }

  public void setProvision(ConsentProvision provision) {
    this.provision = provision;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Consent) {
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
    return "Consent(" + id + ")";
  }
}
