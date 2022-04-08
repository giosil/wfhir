package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 *
 * @see <a href="https://www.hl7.org/fhir/servicerequest.html">ServiceRequest</a>
 */
public 
class ServiceRequest extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -2594342923310316218L;
  
  protected Identifier[] identifier;
  protected String[] instantiatesCanonical;
  protected String[] instantiatesUri;
  protected Reference<Resource>[] basedOn;
  protected Reference<ServiceRequest>[] replaces;
  protected Identifier requisition;
  protected String status;
  protected String intent;
  protected CodeableConcept[] category;
  protected String priority;
  protected Boolean doNotPerform;
  protected CodeableConcept code;
  protected CodeableConcept[] orderDetail;
  protected Quantity quantityQuantity;
  protected Ratio quantityRatio;
  protected Range quantityRange;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Timing occurrenceTiming;
  protected Boolean asNeededBoolean;
  protected CodeableConcept asNeededCodeableConcept;
  protected Date authoredOn;
  protected Reference<Resource> requester;
  protected CodeableConcept performerType;
  protected Reference<Resource>[] performer;
  protected CodeableConcept[] locationCode;
  protected Reference<Location>[] locationReference;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Reference<Resource>[] insurance;
  protected Reference<Resource>[] supportingInfo;
  protected Reference<Specimen>[] specimen;
  protected CodeableConcept[] bodySite;
  protected Annotation[] note;
  protected String patientInstruction;
  protected Reference<Provenance>[] relevantHistory;
  
  public ServiceRequest()
  {
    this.resourceType = "ServiceRequest";
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

  public Reference<ServiceRequest>[] getReplaces() {
    return replaces;
  }

  public Identifier getRequisition() {
    return requisition;
  }

  public String getStatus() {
    return status;
  }

  public String getIntent() {
    return intent;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public String getPriority() {
    return priority;
  }

  public Boolean getDoNotPerform() {
    return doNotPerform;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public CodeableConcept[] getOrderDetail() {
    return orderDetail;
  }

  public Quantity getQuantityQuantity() {
    return quantityQuantity;
  }

  public Ratio getQuantityRatio() {
    return quantityRatio;
  }

  public Range getQuantityRange() {
    return quantityRange;
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

  public Boolean getAsNeededBoolean() {
    return asNeededBoolean;
  }

  public CodeableConcept getAsNeededCodeableConcept() {
    return asNeededCodeableConcept;
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

  public Reference<Resource>[] getPerformer() {
    return performer;
  }

  public CodeableConcept[] getLocationCode() {
    return locationCode;
  }

  public Reference<Location>[] getLocationReference() {
    return locationReference;
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

  public Reference<Specimen>[] getSpecimen() {
    return specimen;
  }

  public CodeableConcept[] getBodySite() {
    return bodySite;
  }

  public Annotation[] getNote() {
    return note;
  }

  public String getPatientInstruction() {
    return patientInstruction;
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

  public void setReplaces(Reference<ServiceRequest>[] replaces) {
    this.replaces = replaces;
  }

  public void setRequisition(Identifier requisition) {
    this.requisition = requisition;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setDoNotPerform(Boolean doNotPerform) {
    this.doNotPerform = doNotPerform;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setOrderDetail(CodeableConcept[] orderDetail) {
    this.orderDetail = orderDetail;
  }

  public void setQuantityQuantity(Quantity quantityQuantity) {
    this.quantityQuantity = quantityQuantity;
  }

  public void setQuantityRatio(Ratio quantityRatio) {
    this.quantityRatio = quantityRatio;
  }

  public void setQuantityRange(Range quantityRange) {
    this.quantityRange = quantityRange;
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

  public void setAsNeededBoolean(Boolean asNeededBoolean) {
    this.asNeededBoolean = asNeededBoolean;
  }

  public void setAsNeededCodeableConcept(CodeableConcept asNeededCodeableConcept) {
    this.asNeededCodeableConcept = asNeededCodeableConcept;
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

  public void setPerformer(Reference<Resource>[] performer) {
    this.performer = performer;
  }

  public void setLocationCode(CodeableConcept[] locationCode) {
    this.locationCode = locationCode;
  }

  public void setLocationReference(Reference<Location>[] locationReference) {
    this.locationReference = locationReference;
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

  public void setSpecimen(Reference<Specimen>[] specimen) {
    this.specimen = specimen;
  }

  public void setBodySite(CodeableConcept[] bodySite) {
    this.bodySite = bodySite;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setPatientInstruction(String patientInstruction) {
    this.patientInstruction = patientInstruction;
  }

  public void setRelevantHistory(Reference<Provenance>[] relevantHistory) {
    this.relevantHistory = relevantHistory;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ServiceRequest) {
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
    return "ServiceRequest(" + id + ")";
  }
}
