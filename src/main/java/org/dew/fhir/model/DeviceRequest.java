package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 *
 * @see <a href="https://www.hl7.org/fhir/devicerequest.html">DeviceRequest</a>
 */
public 
class DeviceRequest extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -6723405528414823691L;
  
  protected Identifier[] identifier;
  protected String[] instantiatesCanonical;
  protected String[] instantiatesUri;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource>[] priorRequest;
  protected Identifier groupIdentifier;
  protected String status;
  protected String intent;
  protected String priority;
  protected Reference<Device> codeReference;
  protected CodeableConcept codeCodeableConcept;
  protected DeviceRequestParameter[] parameter;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Timing occurrenceTiming;
  protected Date authoredOn;
  protected Reference<Resource> requester;
  protected CodeableConcept performerType;
  protected Reference<Resource> performer;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Reference<Resource>[] insurance;
  protected Reference<Resource>[] supportingInfo;
  protected Annotation[] note;
  protected Reference<Provenance>[] relevantHistory;
  
  public DeviceRequest()
  {
    this.resourceType = "DeviceRequest";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String[] getInstantiatesCanonical() {
    return instantiatesCanonical;
  }

  public String[] getInstantiatesUri() {
    return instantiatesUri;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }

  public Reference<Resource>[] getPriorRequest() {
    return priorRequest;
  }

  public Identifier getGroupIdentifier() {
    return groupIdentifier;
  }

  public String getStatus() {
    return status;
  }

  public String getIntent() {
    return intent;
  }

  public String getPriority() {
    return priority;
  }

  public Reference<Device> getCodeReference() {
    return codeReference;
  }

  public CodeableConcept getCodeCodeableConcept() {
    return codeCodeableConcept;
  }

  public DeviceRequestParameter[] getParameter() {
    return parameter;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
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

  public Date getAuthoredOn() {
    return authoredOn;
  }

  public Reference<Resource> getRequester() {
    return requester;
  }

  public CodeableConcept getPerformerType() {
    return performerType;
  }

  public Reference<Resource> getPerformer() {
    return performer;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Reference<Resource>[] getInsurance() {
    return insurance;
  }

  public Reference<Resource>[] getSupportingInfo() {
    return supportingInfo;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Reference<Provenance>[] getRelevantHistory() {
    return relevantHistory;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setInstantiatesCanonical(String[] instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }

  public void setInstantiatesUri(String[] instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setPriorRequest(Reference<Resource>[] priorRequest) {
    this.priorRequest = priorRequest;
  }

  public void setGroupIdentifier(Identifier groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setCodeReference(Reference<Device> codeReference) {
    this.codeReference = codeReference;
  }

  public void setCodeCodeableConcept(CodeableConcept codeCodeableConcept) {
    this.codeCodeableConcept = codeCodeableConcept;
  }

  public void setParameter(DeviceRequestParameter[] parameter) {
    this.parameter = parameter;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
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

  public void setAuthoredOn(Date authoredOn) {
    this.authoredOn = authoredOn;
  }

  public void setRequester(Reference<Resource> requester) {
    this.requester = requester;
  }

  public void setPerformerType(CodeableConcept performerType) {
    this.performerType = performerType;
  }

  public void setPerformer(Reference<Resource> performer) {
    this.performer = performer;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setInsurance(Reference<Resource>[] insurance) {
    this.insurance = insurance;
  }

  public void setSupportingInfo(Reference<Resource>[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setRelevantHistory(Reference<Provenance>[] relevantHistory) {
    this.relevantHistory = relevantHistory;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceRequest) {
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
    return "DeviceRequest(" + id + "," + subject + ")";
  }
}
