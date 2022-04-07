package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 *
 * @see <a href="https://www.hl7.org/fhir/familymemberhistory.html">FamilyMemberHistory</a>
 */
public 
class FamilyMemberHistory extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 1104956400619995850L;
  
  protected Identifier[] identifier;
  protected String[] instantiatesCanonical;
  protected String[] instantiatesUri;
  protected String status;
  protected CodeableConcept dataAbsentReason;
  protected Reference<Patient> patient;
  protected Date date;
  protected String name;
  protected CodeableConcept relationship;
  protected CodeableConcept sex;
  protected Period bornPeriod;
  protected Date bornDate;
  protected String bornString;
  protected Age ageAge;
  protected Range ageRange;
  protected String ageString;
  protected Boolean estimatedAge;
  protected Boolean deceasedBoolean;
  protected Age deceasedAge;
  protected Range deceasedRange;
  protected Date deceasedDate;
  protected String deceasedString;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Annotation[] note;
  protected FamilyMemberHistoryCondition[] condition; 
  
  public FamilyMemberHistory()
  {
    this.resourceType = "FamilyMemberHistory";
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

  public String getStatus() {
    return status;
  }

  public CodeableConcept getDataAbsentReason() {
    return dataAbsentReason;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Date getDate() {
    return date;
  }

  public String getName() {
    return name;
  }

  public CodeableConcept getRelationship() {
    return relationship;
  }

  public CodeableConcept getSex() {
    return sex;
  }

  public Period getBornPeriod() {
    return bornPeriod;
  }

  public Date getBornDate() {
    return bornDate;
  }

  public String getBornString() {
    return bornString;
  }

  public Age getAgeAge() {
    return ageAge;
  }

  public Range getAgeRange() {
    return ageRange;
  }

  public String getAgeString() {
    return ageString;
  }

  public Boolean getEstimatedAge() {
    return estimatedAge;
  }

  public Boolean getDeceasedBoolean() {
    return deceasedBoolean;
  }

  public Age getDeceasedAge() {
    return deceasedAge;
  }

  public Range getDeceasedRange() {
    return deceasedRange;
  }

  public Date getDeceasedDate() {
    return deceasedDate;
  }

  public String getDeceasedString() {
    return deceasedString;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Annotation[] getNote() {
    return note;
  }

  public FamilyMemberHistoryCondition[] getCondition() {
    return condition;
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

  public void setStatus(String status) {
    this.status = status;
  }

  public void setDataAbsentReason(CodeableConcept dataAbsentReason) {
    this.dataAbsentReason = dataAbsentReason;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRelationship(CodeableConcept relationship) {
    this.relationship = relationship;
  }

  public void setSex(CodeableConcept sex) {
    this.sex = sex;
  }

  public void setBornPeriod(Period bornPeriod) {
    this.bornPeriod = bornPeriod;
  }

  public void setBornDate(Date bornDate) {
    this.bornDate = bornDate;
  }

  public void setBornString(String bornString) {
    this.bornString = bornString;
  }

  public void setAgeAge(Age ageAge) {
    this.ageAge = ageAge;
  }

  public void setAgeRange(Range ageRange) {
    this.ageRange = ageRange;
  }

  public void setAgeString(String ageString) {
    this.ageString = ageString;
  }

  public void setEstimatedAge(Boolean estimatedAge) {
    this.estimatedAge = estimatedAge;
  }

  public void setDeceasedBoolean(Boolean deceasedBoolean) {
    this.deceasedBoolean = deceasedBoolean;
  }

  public void setDeceasedAge(Age deceasedAge) {
    this.deceasedAge = deceasedAge;
  }

  public void setDeceasedRange(Range deceasedRange) {
    this.deceasedRange = deceasedRange;
  }

  public void setDeceasedDate(Date deceasedDate) {
    this.deceasedDate = deceasedDate;
  }

  public void setDeceasedString(String deceasedString) {
    this.deceasedString = deceasedString;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setCondition(FamilyMemberHistoryCondition[] condition) {
    this.condition = condition;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof FamilyMemberHistory) {
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
    return "FamilyMemberHistory(" + id + "," + name + ")";
  }
}
