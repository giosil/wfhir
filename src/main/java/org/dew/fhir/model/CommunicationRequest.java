package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 *
 * @see <a href="https://www.hl7.org/fhir">CommunicationRequest</a>
 */
public
class CommunicationRequest extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Annotation[] note;
  protected Reference<Resource> subject;
  protected Reference<Resource>[] about;
  protected Reference<Resource>[] reasonReference;
  protected CodeableConcept[] medium;
  protected CodeableConcept statusReason;
  protected CommunicationRequestPayload[] payload;
  protected CodeableConcept[] reasonCode;
  protected Boolean doNotPerform;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource> requester;
  protected Identifier[] identifier;
  protected Date authoredOn;
  protected Reference<Resource>[] replaces;
  protected Reference<Resource> encounter;
  protected String priority;
  protected Period occurrencePeriod;
  protected Reference<Resource> sender;
  protected Reference<Resource>[] recipient;
  protected Date occurrenceDateTime;
  protected Identifier groupIdentifier;
  protected CodeableConcept[] category;
  protected String status;
  
  public CommunicationRequest()
  {
    this.resourceType = "CommunicationRequest";
  }
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public Reference<Resource> getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }
  
  public Reference<Resource>[] getAbout() {
    return about;
  }
  
  public void setAbout(Reference<Resource>[] about) {
    this.about = about;
  }
  
  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }
  
  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }
  
  public CodeableConcept[] getMedium() {
    return medium;
  }
  
  public void setMedium(CodeableConcept[] medium) {
    this.medium = medium;
  }
  
  public CodeableConcept getStatusReason() {
    return statusReason;
  }
  
  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }
  
  public CommunicationRequestPayload[] getPayload() {
    return payload;
  }
  
  public void setPayload(CommunicationRequestPayload[] payload) {
    this.payload = payload;
  }
  
  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }
  
  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }
  
  public Boolean getDoNotPerform() {
    return doNotPerform;
  }
  
  public void setDoNotPerform(Boolean doNotPerform) {
    this.doNotPerform = doNotPerform;
  }
  
  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }
  
  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }
  
  public Reference<Resource> getRequester() {
    return requester;
  }
  
  public void setRequester(Reference<Resource> requester) {
    this.requester = requester;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Date getAuthoredOn() {
    return authoredOn;
  }
  
  public void setAuthoredOn(Date authoredOn) {
    this.authoredOn = authoredOn;
  }
  
  public Reference<Resource>[] getReplaces() {
    return replaces;
  }
  
  public void setReplaces(Reference<Resource>[] replaces) {
    this.replaces = replaces;
  }
  
  public Reference<Resource> getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource> encounter) {
    this.encounter = encounter;
  }
  
  public String getPriority() {
    return priority;
  }
  
  public void setPriority(String priority) {
    this.priority = priority;
  }
  
  public Period getOccurrencePeriod() {
    return occurrencePeriod;
  }
  
  public void setOccurrencePeriod(Period occurrencePeriod) {
    this.occurrencePeriod = occurrencePeriod;
  }
  
  public Reference<Resource> getSender() {
    return sender;
  }
  
  public void setSender(Reference<Resource> sender) {
    this.sender = sender;
  }
  
  public Reference<Resource>[] getRecipient() {
    return recipient;
  }
  
  public void setRecipient(Reference<Resource>[] recipient) {
    this.recipient = recipient;
  }
  
  public Date getOccurrenceDateTime() {
    return occurrenceDateTime;
  }
  
  public void setOccurrenceDateTime(Date occurrenceDateTime) {
    this.occurrenceDateTime = occurrenceDateTime;
  }
  
  public Identifier getGroupIdentifier() {
    return groupIdentifier;
  }
  
  public void setGroupIdentifier(Identifier groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }
  
  public CodeableConcept[] getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CommunicationRequest) {
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
    return "CommunicationRequest(" + id + ")";
  }
}
