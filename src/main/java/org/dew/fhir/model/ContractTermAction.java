package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.action">Contract.term.action</a>
 */
public 
class ContractTermAction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 6215666677896758856L;
  
  protected Boolean doNotPerform;
  protected CodeableConcept type;
  protected ContractTermActionSubject[] subject;
  protected CodeableConcept intent;
  protected String[] linkId;
  protected CodeableConcept status;
  protected Reference<Resource> context;
  protected String[] contextLinkId;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Timing occurrenceTiming;
  protected Reference<Resource>[] requester;
  protected String[] requesterLinkId;
  protected CodeableConcept[] performerType;
  protected CodeableConcept performerRole;
  protected Reference<Resource> performer;
  protected String[] performerLinkId;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected String[] reason;
  protected String[] reasonLinkId;
  protected Annotation[] note;
  protected Integer[] securityLabelNumber;
  
  public ContractTermAction()
  {
  }

  public Boolean getDoNotPerform() {
    return doNotPerform;
  }

  public CodeableConcept getType() {
    return type;
  }

  public ContractTermActionSubject[] getSubject() {
    return subject;
  }

  public CodeableConcept getIntent() {
    return intent;
  }

  public String[] getLinkId() {
    return linkId;
  }

  public CodeableConcept getStatus() {
    return status;
  }

  public Reference<Resource> getContext() {
    return context;
  }

  public String[] getContextLinkId() {
    return contextLinkId;
  }

  public Date getOccurrenceDateTime() {
    return occurrenceDateTime;
  }

  public Period getOccurrencePeriod() {
    return occurrencePeriod;
  }

  public Timing getOccurrenceTiming() {
    return occurrenceTiming;
  }

  public Reference<Resource>[] getRequester() {
    return requester;
  }

  public String[] getRequesterLinkId() {
    return requesterLinkId;
  }

  public CodeableConcept[] getPerformerType() {
    return performerType;
  }

  public CodeableConcept getPerformerRole() {
    return performerRole;
  }

  public Reference<Resource> getPerformer() {
    return performer;
  }

  public String[] getPerformerLinkId() {
    return performerLinkId;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public String[] getReason() {
    return reason;
  }

  public String[] getReasonLinkId() {
    return reasonLinkId;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Integer[] getSecurityLabelNumber() {
    return securityLabelNumber;
  }

  public void setDoNotPerform(Boolean doNotPerform) {
    this.doNotPerform = doNotPerform;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubject(ContractTermActionSubject[] subject) {
    this.subject = subject;
  }

  public void setIntent(CodeableConcept intent) {
    this.intent = intent;
  }

  public void setLinkId(String[] linkId) {
    this.linkId = linkId;
  }

  public void setStatus(CodeableConcept status) {
    this.status = status;
  }

  public void setContext(Reference<Resource> context) {
    this.context = context;
  }

  public void setContextLinkId(String[] contextLinkId) {
    this.contextLinkId = contextLinkId;
  }

  public void setOccurrenceDateTime(Date occurrenceDateTime) {
    this.occurrenceDateTime = occurrenceDateTime;
  }

  public void setOccurrencePeriod(Period occurrencePeriod) {
    this.occurrencePeriod = occurrencePeriod;
  }

  public void setOccurrenceTiming(Timing occurrenceTiming) {
    this.occurrenceTiming = occurrenceTiming;
  }

  public void setRequester(Reference<Resource>[] requester) {
    this.requester = requester;
  }

  public void setRequesterLinkId(String[] requesterLinkId) {
    this.requesterLinkId = requesterLinkId;
  }

  public void setPerformerType(CodeableConcept[] performerType) {
    this.performerType = performerType;
  }

  public void setPerformerRole(CodeableConcept performerRole) {
    this.performerRole = performerRole;
  }

  public void setPerformer(Reference<Resource> performer) {
    this.performer = performer;
  }

  public void setPerformerLinkId(String[] performerLinkId) {
    this.performerLinkId = performerLinkId;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setReason(String[] reason) {
    this.reason = reason;
  }

  public void setReasonLinkId(String[] reasonLinkId) {
    this.reasonLinkId = reasonLinkId;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setSecurityLabelNumber(Integer[] securityLabelNumber) {
    this.securityLabelNumber = securityLabelNumber;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermAction) {
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
    return "ContractTermAction(" + id + "," + type + "," + intent + ")";
  }
}
