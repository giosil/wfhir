package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 *
 * @see <a href="https://www.hl7.org/fhir">RequestGroup</a>
 */
public
class RequestGroup extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Annotation[] note;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Reference<Resource>[] reasonReference;
  protected String[] instantiatesUri;
  protected RequestGroupAction[] action;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] basedOn;
  protected Identifier[] identifier;
  protected Date authoredOn;
  protected Reference<Resource>[] replaces;
  protected Reference<Resource> author;
  protected Reference<Resource> encounter;
  protected String[] instantiatesCanonical;
  protected String priority;
  protected String intent;
  protected Identifier groupIdentifier;
  protected String status;
  
  public RequestGroup()
  {
    this.resourceType = "RequestGroup";
  }
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Reference<Resource> getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }
  
  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }
  
  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }
  
  public String[] getInstantiatesUri() {
    return instantiatesUri;
  }
  
  public void setInstantiatesUri(String[] instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }
  
  public RequestGroupAction[] getAction() {
    return action;
  }
  
  public void setAction(RequestGroupAction[] action) {
    this.action = action;
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
  
  public Reference<Resource> getAuthor() {
    return author;
  }
  
  public void setAuthor(Reference<Resource> author) {
    this.author = author;
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
  
  public String getIntent() {
    return intent;
  }
  
  public void setIntent(String intent) {
    this.intent = intent;
  }
  
  public Identifier getGroupIdentifier() {
    return groupIdentifier;
  }
  
  public void setGroupIdentifier(Identifier groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RequestGroup) {
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
    return "RequestGroup(" + id + ")";
  }
}
