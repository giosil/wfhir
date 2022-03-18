package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The significant Conditions (or condition) that the family member had. 
 * This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
 *
 * @see <a href="https://www.hl7.org/fhir/familymemberhistory-definitions.html#FamilyMemberHistory.condition">MemberHistory.condition</a>
 */
public 
class FamilyMemberHistoryCondition extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -8018990311274223633L;
  
  protected CodeableConcept code;
  protected CodeableConcept outcome;
  protected Boolean contributedToDeath;
  protected Age onsetAge;
  protected Range onsetRange;
  protected Period onsetPeriod;
  protected String onsetString;
  protected Annotation[] note;
  
  public FamilyMemberHistoryCondition()
  {
  }

  public CodeableConcept getCode() {
    return code;
  }

  public CodeableConcept getOutcome() {
    return outcome;
  }

  public Boolean getContributedToDeath() {
    return contributedToDeath;
  }

  public Age getOnsetAge() {
    return onsetAge;
  }

  public Range getOnsetRange() {
    return onsetRange;
  }

  public Period getOnsetPeriod() {
    return onsetPeriod;
  }

  public String getOnsetString() {
    return onsetString;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setOutcome(CodeableConcept outcome) {
    this.outcome = outcome;
  }

  public void setContributedToDeath(Boolean contributedToDeath) {
    this.contributedToDeath = contributedToDeath;
  }

  public void setOnsetAge(Age onsetAge) {
    this.onsetAge = onsetAge;
  }

  public void setOnsetRange(Range onsetRange) {
    this.onsetRange = onsetRange;
  }

  public void setOnsetPeriod(Period onsetPeriod) {
    this.onsetPeriod = onsetPeriod;
  }

  public void setOnsetString(String onsetString) {
    this.onsetString = onsetString;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof FamilyMemberHistoryCondition) {
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
    return "FamilyMemberHistoryCondition(" + id + "," + code + ")";
  }
}
