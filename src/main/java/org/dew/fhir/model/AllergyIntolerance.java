package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 *
 * @see <a href="https://www.hl7.org/fhir/allergyintolerance.html">AllergyIntolerance</a>
 */
public 
class AllergyIntolerance extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 7122061711074997057L;
  
  protected Identifier[] identifier;
  protected CodeableConcept clinicalStatus;
  protected CodeableConcept verificationStatus;
  protected String type;
  protected String[] category;
  protected String criticality;
  protected CodeableConcept code;
  protected Reference<Patient> patient;
  protected Reference<Encounter> encounter;
  protected Date onsetDateTime;
  protected Age onsetAge;
  protected Period onsetPeriod;
  protected Range onsetRange;
  protected String onsetString;
  protected Date recordedDate;
  protected Reference<Resource> recorder;
  protected Reference<Resource> asserter;
  protected Date lastOccurrence;
  protected Annotation[] note;
  protected AllergyIntoleranceReaction[] reaction;
  
  public AllergyIntolerance()
  {
    this.resourceType = "AllergyIntolerance";
  }
  
  public AllergyIntolerance(String type)
  {
    this.resourceType = "AllergyIntolerance";
    this.type = type;
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

  public String getType() {
    return type;
  }

  public String[] getCategory() {
    return category;
  }

  public String getCriticality() {
    return criticality;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Patient> getPatient() {
    return patient;
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

  public Date getRecordedDate() {
    return recordedDate;
  }

  public Reference<Resource> getRecorder() {
    return recorder;
  }

  public Reference<Resource> getAsserter() {
    return asserter;
  }

  public Date getLastOccurrence() {
    return lastOccurrence;
  }

  public Annotation[] getNote() {
    return note;
  }

  public AllergyIntoleranceReaction[] getReaction() {
    return reaction;
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

  public void setType(String type) {
    this.type = type;
  }

  public void setCategory(String[] category) {
    this.category = category;
  }

  public void setCriticality(String criticality) {
    this.criticality = criticality;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
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

  public void setRecordedDate(Date recordedDate) {
    this.recordedDate = recordedDate;
  }

  public void setRecorder(Reference<Resource> recorder) {
    this.recorder = recorder;
  }

  public void setAsserter(Reference<Resource> asserter) {
    this.asserter = asserter;
  }

  public void setLastOccurrence(Date lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setReaction(AllergyIntoleranceReaction[] reaction) {
    this.reaction = reaction;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof AllergyIntolerance) {
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
    return "AllergyIntolerance(" + id + "," + type + ")";
  }
}
