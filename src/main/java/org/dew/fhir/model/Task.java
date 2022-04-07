package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A task to be performed.
 *
 * @see <a href="https://www.hl7.org/fhir/task.html">Task</a>
 */
public 
class Task extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 6524825595020788333L;
  
  protected Identifier[] identifier;
  protected String instantiatesCanonical;
  protected String instantiatesUri;
  protected Reference<Resource>[] basedOn;
  protected Identifier groupIdentifier;
  protected Reference<Task>[] partOf;
  protected String status;
  protected CodeableConcept statusReason;
  protected CodeableConcept businessStatus;
  protected String intent;
  protected String priority;
  protected CodeableConcept code;
  protected String description;
  protected Reference<Resource> focus;
  protected Reference<Resource> for_;
  protected Reference<Encounter> encounter;
  protected Period executionPeriod;
  protected Date authoredOn;
  protected Date lastModified;
  protected Reference<Resource> requester;
  protected CodeableConcept[] performerType;
  protected Reference<Resource> owner;
  protected Reference<Location> location;
  protected CodeableConcept reasonCode;
  protected Reference<Resource> reasonReference;
  protected Reference<Resource>[] insurance;
  protected Annotation[] note;
  protected Reference<Provenance>[] relevantHistory;
  protected TaskRestriction restriction;
  protected TaskInput[] input;
  protected TaskOutput[] output;
  
  public Task()
  {
    this.resourceType = "Task";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getInstantiatesCanonical() {
    return instantiatesCanonical;
  }

  public String getInstantiatesUri() {
    return instantiatesUri;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }

  public Identifier getGroupIdentifier() {
    return groupIdentifier;
  }

  public Reference<Task>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getStatusReason() {
    return statusReason;
  }

  public CodeableConcept getBusinessStatus() {
    return businessStatus;
  }

  public String getIntent() {
    return intent;
  }

  public String getPriority() {
    return priority;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }

  public Reference<Resource> getFocus() {
    return focus;
  }

  public Reference<Resource> getFor_() {
    return for_;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Period getExecutionPeriod() {
    return executionPeriod;
  }

  public Date getAuthoredOn() {
    return authoredOn;
  }

  public Date getLastModified() {
    return lastModified;
  }

  public Reference<Resource> getRequester() {
    return requester;
  }

  public CodeableConcept[] getPerformerType() {
    return performerType;
  }

  public Reference<Resource> getOwner() {
    return owner;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public CodeableConcept getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource> getReasonReference() {
    return reasonReference;
  }

  public Reference<Resource>[] getInsurance() {
    return insurance;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Reference<Provenance>[] getRelevantHistory() {
    return relevantHistory;
  }

  public TaskRestriction getRestriction() {
    return restriction;
  }

  public TaskInput[] getInput() {
    return input;
  }

  public TaskOutput[] getOutput() {
    return output;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setInstantiatesCanonical(String instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }

  public void setInstantiatesUri(String instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setGroupIdentifier(Identifier groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }

  public void setPartOf(Reference<Task>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }

  public void setBusinessStatus(CodeableConcept businessStatus) {
    this.businessStatus = businessStatus;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setFocus(Reference<Resource> focus) {
    this.focus = focus;
  }

  public void setFor_(Reference<Resource> for_) {
    this.for_ = for_;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setExecutionPeriod(Period executionPeriod) {
    this.executionPeriod = executionPeriod;
  }

  public void setAuthoredOn(Date authoredOn) {
    this.authoredOn = authoredOn;
  }

  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }

  public void setRequester(Reference<Resource> requester) {
    this.requester = requester;
  }

  public void setPerformerType(CodeableConcept[] performerType) {
    this.performerType = performerType;
  }

  public void setOwner(Reference<Resource> owner) {
    this.owner = owner;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setReasonCode(CodeableConcept reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource> reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setInsurance(Reference<Resource>[] insurance) {
    this.insurance = insurance;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setRelevantHistory(Reference<Provenance>[] relevantHistory) {
    this.relevantHistory = relevantHistory;
  }

  public void setRestriction(TaskRestriction restriction) {
    this.restriction = restriction;
  }

  public void setInput(TaskInput[] input) {
    this.input = input;
  }

  public void setOutput(TaskOutput[] output) {
    this.output = output;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Task) {
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
    return "Task(" + id + "," + instantiatesCanonical + "," + instantiatesUri + "," + groupIdentifier + ")";
  }
}
