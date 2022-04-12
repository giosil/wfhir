package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.
 *
 * @see <a href="https://www.hl7.org/fhir">Communication</a>
 */
public
class Communication extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] partOf;
  protected Annotation[] note;
  protected Reference<Resource> subject;
  protected Reference<Resource>[] about;
  protected Reference<Resource>[] reasonReference;
  protected CodeableConcept[] medium;
  protected String[] instantiatesUri;
  protected CodeableConcept statusReason;
  protected CommunicationPayload[] payload;
  protected Reference<Resource>[] inResponseTo;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] basedOn;
  protected Identifier[] identifier;
  protected Date received;
  protected Reference<Resource> encounter;
  protected String[] instantiatesCanonical;
  protected String priority;
  protected Date sent;
  protected Reference<Resource> sender;
  protected Reference<Resource>[] recipient;
  protected CodeableConcept topic;
  protected CodeableConcept[] category;
  protected String status;
  
  public Communication()
  {
    this.resourceType = "Communication";
  }
  
  public Reference<Resource>[] getPartOf() {
    return partOf;
  }
  
  public void setPartOf(Reference<Resource>[] partOf) {
    this.partOf = partOf;
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
  
  public String[] getInstantiatesUri() {
    return instantiatesUri;
  }
  
  public void setInstantiatesUri(String[] instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }
  
  public CodeableConcept getStatusReason() {
    return statusReason;
  }
  
  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }
  
  public CommunicationPayload[] getPayload() {
    return payload;
  }
  
  public void setPayload(CommunicationPayload[] payload) {
    this.payload = payload;
  }
  
  public Reference<Resource>[] getInResponseTo() {
    return inResponseTo;
  }
  
  public void setInResponseTo(Reference<Resource>[] inResponseTo) {
    this.inResponseTo = inResponseTo;
  }
  
  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }
  
  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }
  
  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }
  
  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Date getReceived() {
    return received;
  }
  
  public void setReceived(Date received) {
    this.received = received;
  }
  
  public Reference<Resource> getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource> encounter) {
    this.encounter = encounter;
  }
  
  public String[] getInstantiatesCanonical() {
    return instantiatesCanonical;
  }
  
  public void setInstantiatesCanonical(String[] instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }
  
  public String getPriority() {
    return priority;
  }
  
  public void setPriority(String priority) {
    this.priority = priority;
  }
  
  public Date getSent() {
    return sent;
  }
  
  public void setSent(Date sent) {
    this.sent = sent;
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
  
  public CodeableConcept getTopic() {
    return topic;
  }
  
  public void setTopic(CodeableConcept topic) {
    this.topic = topic;
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
    if(object instanceof Communication) {
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
    return "Communication(" + id + ")";
  }
}
