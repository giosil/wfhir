package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
 *
 * @see <a href="https://www.hl7.org/fhir/procedure.html">Procedure</a>
 */
public 
class Procedure extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 3777446457056721317L;
  
  protected Identifier[] identifier;
  protected String[] instantiatesCanonical;
  protected String[] instantiatesUri;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource>[] partOf;
  protected String status;
  protected CodeableConcept statusReason;
  protected CodeableConcept category;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date performedDateTime;
  protected Period performedPeriod;
  protected String performedString;
  protected Age performedAge;
  protected Range performedRange;
  protected Reference<Resource> recorder;
  protected Reference<Resource> asserter;
  protected ProcedurePerformer[] performer;
  protected Reference<Location> location;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected CodeableConcept[] bodySite;
  protected CodeableConcept outcome;
  protected Reference<Resource>[] report;
  protected CodeableConcept[] complication;
  protected Reference<Condition>[] complicationDetail;
  protected CodeableConcept[] followUp;
  protected Annotation[] note;
  protected ProcedureFocalDevice[] focalDevice;
  protected Reference<Resource>[] usedReference;
  protected CodeableConcept[] usedCode;
  
  public Procedure()
  {
    this.resourceType = "Procedure";
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

  public Reference<Resource>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getStatusReason() {
    return statusReason;
  }

  public CodeableConcept getCategory() {
    return category;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getPerformedDateTime() {
    return performedDateTime;
  }

  public Period getPerformedPeriod() {
    return performedPeriod;
  }

  public String getPerformedString() {
    return performedString;
  }

  public Age getPerformedAge() {
    return performedAge;
  }

  public Range getPerformedRange() {
    return performedRange;
  }

  public Reference<Resource> getRecorder() {
    return recorder;
  }

  public Reference<Resource> getAsserter() {
    return asserter;
  }

  public ProcedurePerformer[] getPerformer() {
    return performer;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public CodeableConcept[] getBodySite() {
    return bodySite;
  }

  public CodeableConcept getOutcome() {
    return outcome;
  }

  public Reference<Resource>[] getReport() {
    return report;
  }

  public CodeableConcept[] getComplication() {
    return complication;
  }

  public Reference<Condition>[] getComplicationDetail() {
    return complicationDetail;
  }

  public CodeableConcept[] getFollowUp() {
    return followUp;
  }

  public Annotation[] getNote() {
    return note;
  }

  public ProcedureFocalDevice[] getFocalDevice() {
    return focalDevice;
  }

  public Reference<Resource>[] getUsedReference() {
    return usedReference;
  }

  public CodeableConcept[] getUsedCode() {
    return usedCode;
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

  public void setPartOf(Reference<Resource>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }

  public void setCategory(CodeableConcept category) {
    this.category = category;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setPerformedDateTime(Date performedDateTime) {
    this.performedDateTime = performedDateTime;
  }

  public void setPerformedPeriod(Period performedPeriod) {
    this.performedPeriod = performedPeriod;
  }

  public void setPerformedString(String performedString) {
    this.performedString = performedString;
  }

  public void setPerformedAge(Age performedAge) {
    this.performedAge = performedAge;
  }

  public void setPerformedRange(Range performedRange) {
    this.performedRange = performedRange;
  }

  public void setRecorder(Reference<Resource> recorder) {
    this.recorder = recorder;
  }

  public void setAsserter(Reference<Resource> asserter) {
    this.asserter = asserter;
  }

  public void setPerformer(ProcedurePerformer[] performer) {
    this.performer = performer;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setBodySite(CodeableConcept[] bodySite) {
    this.bodySite = bodySite;
  }

  public void setOutcome(CodeableConcept outcome) {
    this.outcome = outcome;
  }

  public void setReport(Reference<Resource>[] report) {
    this.report = report;
  }

  public void setComplication(CodeableConcept[] complication) {
    this.complication = complication;
  }

  public void setComplicationDetail(Reference<Condition>[] complicationDetail) {
    this.complicationDetail = complicationDetail;
  }

  public void setFollowUp(CodeableConcept[] followUp) {
    this.followUp = followUp;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setFocalDevice(ProcedureFocalDevice[] focalDevice) {
    this.focalDevice = focalDevice;
  }

  public void setUsedReference(Reference<Resource>[] usedReference) {
    this.usedReference = usedReference;
  }

  public void setUsedCode(CodeableConcept[] usedCode) {
    this.usedCode = usedCode;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Procedure) {
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
    return "Procedure(" + id + ")";
  }
}
