package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 *
 * @see <a href="https://www.hl7.org/fhir/condition.html">Condition</a>
 */
public 
class Condition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 426204030730762834L;
  
  protected Identifier[] identifier;
  protected CodeableConcept clinicalStatus;
  protected CodeableConcept verificationStatus;
  protected CodeableConcept[] category;
  protected CodeableConcept severity;
  protected CodeableConcept code;
  protected CodeableConcept[] bodySite;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date onsetDateTime;
  protected Age onsetAge;
  protected Period onsetPeriod;
  protected Range onsetRange;
  protected String onsetString;
  protected Date abatementDateTime;
  protected Age abatementAge;
  protected Period abatementPeriod;
  protected Range abatementRange;
  protected String abatementString;
  protected Date recordedDate;
  protected Reference<Resource> recorder;
  protected Reference<Resource> asserter;
  protected ConditionStage[] stage;
  protected ConditionEvidence[] evidence;
  protected Annotation[] note;
  
  public Condition()
  {
    this.resourceType = "Condition";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public CodeableConcept getClinicalStatus() {
    return clinicalStatus;
  }

  public CodeableConcept getVerificationStatus() {
    return verificationStatus;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getSeverity() {
    return severity;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public CodeableConcept[] getBodySite() {
    return bodySite;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getOnsetDateTime() {
    return onsetDateTime;
  }

  public Age getOnsetAge() {
    return onsetAge;
  }

  public Period getOnsetPeriod() {
    return onsetPeriod;
  }

  public Range getOnsetRange() {
    return onsetRange;
  }

  public String getOnsetString() {
    return onsetString;
  }

  public Date getAbatementDateTime() {
    return abatementDateTime;
  }

  public Age getAbatementAge() {
    return abatementAge;
  }

  public Period getAbatementPeriod() {
    return abatementPeriod;
  }

  public Range getAbatementRange() {
    return abatementRange;
  }

  public String getAbatementString() {
    return abatementString;
  }

  public Date getRecordedDate() {
    return recordedDate;
  }

  public Reference<Resource> getRecorder() {
    return recorder;
  }

  public Reference<Resource> getAsserter() {
    return asserter;
  }

  public ConditionStage[] getStage() {
    return stage;
  }

  public ConditionEvidence[] getEvidence() {
    return evidence;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setClinicalStatus(CodeableConcept clinicalStatus) {
    this.clinicalStatus = clinicalStatus;
  }

  public void setVerificationStatus(CodeableConcept verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setSeverity(CodeableConcept severity) {
    this.severity = severity;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setBodySite(CodeableConcept[] bodySite) {
    this.bodySite = bodySite;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setOnsetDateTime(Date onsetDateTime) {
    this.onsetDateTime = onsetDateTime;
  }

  public void setOnsetAge(Age onsetAge) {
    this.onsetAge = onsetAge;
  }

  public void setOnsetPeriod(Period onsetPeriod) {
    this.onsetPeriod = onsetPeriod;
  }

  public void setOnsetRange(Range onsetRange) {
    this.onsetRange = onsetRange;
  }

  public void setOnsetString(String onsetString) {
    this.onsetString = onsetString;
  }

  public void setAbatementDateTime(Date abatementDateTime) {
    this.abatementDateTime = abatementDateTime;
  }

  public void setAbatementAge(Age abatementAge) {
    this.abatementAge = abatementAge;
  }

  public void setAbatementPeriod(Period abatementPeriod) {
    this.abatementPeriod = abatementPeriod;
  }

  public void setAbatementRange(Range abatementRange) {
    this.abatementRange = abatementRange;
  }

  public void setAbatementString(String abatementString) {
    this.abatementString = abatementString;
  }

  public void setRecordedDate(Date recordedDate) {
    this.recordedDate = recordedDate;
  }

  public void setRecorder(Reference<Resource> recorder) {
    this.recorder = recorder;
  }

  public void setAsserter(Reference<Resource> asserter) {
    this.asserter = asserter;
  }

  public void setStage(ConditionStage[] stage) {
    this.stage = stage;
  }

  public void setEvidence(ConditionEvidence[] evidence) {
    this.evidence = evidence;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Condition) {
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
    return "Condition(" + id + ")";
  }
}
