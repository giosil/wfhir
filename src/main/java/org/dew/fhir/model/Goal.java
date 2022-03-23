package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/goal.html">Goal</a>
 */
public 
class Goal extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -6969049255619196642L;
  
  protected Identifier[] identifier;
  protected String lifecycleStatus;
  protected CodeableConcept achievementStatus;
  protected CodeableConcept[] category;
  protected CodeableConcept priority;
  protected CodeableConcept description;
  protected Reference<Resource> subject;
  protected Date startDate;
  protected CodeableConcept startCodeableConcept;
  protected GoalTarget[] target;
  protected Date statusDate;
  protected String statusReason;
  protected Reference<Resource> expressedBy;
  protected Reference<Resource>[] addresses;
  protected Annotation[] note;
  protected CodeableConcept[] outcomeCode;
  protected Reference<Observation>[] outcomeReference;
  
  public Goal()
  {
    this.resourceType = "Goal";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public CodeableConcept getAchievementStatus() {
    return achievementStatus;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getPriority() {
    return priority;
  }

  public CodeableConcept getDescription() {
    return description;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Date getStartDate() {
    return startDate;
  }

  public CodeableConcept getStartCodeableConcept() {
    return startCodeableConcept;
  }

  public GoalTarget[] getTarget() {
    return target;
  }

  public Date getStatusDate() {
    return statusDate;
  }

  public String getStatusReason() {
    return statusReason;
  }

  public Reference<Resource> getExpressedBy() {
    return expressedBy;
  }

  public Reference<Resource>[] getAddresses() {
    return addresses;
  }

  public Annotation[] getNote() {
    return note;
  }

  public CodeableConcept[] getOutcomeCode() {
    return outcomeCode;
  }

  public Reference<Observation>[] getOutcomeReference() {
    return outcomeReference;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public void setAchievementStatus(CodeableConcept achievementStatus) {
    this.achievementStatus = achievementStatus;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setPriority(CodeableConcept priority) {
    this.priority = priority;
  }

  public void setDescription(CodeableConcept description) {
    this.description = description;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public void setStartCodeableConcept(CodeableConcept startCodeableConcept) {
    this.startCodeableConcept = startCodeableConcept;
  }

  public void setTarget(GoalTarget[] target) {
    this.target = target;
  }

  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public void setExpressedBy(Reference<Resource> expressedBy) {
    this.expressedBy = expressedBy;
  }

  public void setAddresses(Reference<Resource>[] addresses) {
    this.addresses = addresses;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setOutcomeCode(CodeableConcept[] outcomeCode) {
    this.outcomeCode = outcomeCode;
  }

  public void setOutcomeReference(Reference<Observation>[] outcomeReference) {
    this.outcomeReference = outcomeReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Goal) {
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
    return "Goal(" + id + ")";
  }
}
