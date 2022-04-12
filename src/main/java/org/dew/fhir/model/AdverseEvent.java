package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Actual or potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 *
 * @see <a href="https://www.hl7.org/fhir/adverseevent.html">AdverseEvent</a>
 */
public 
class AdverseEvent extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -5399533306663677632L;
  
  protected Identifier identifier;
  protected String actuality;
  protected CodeableConcept[] category;
  protected CodeableConcept event;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date date;
  protected Date detected;
  protected Date recordedDate;
  protected Reference<Condition>[] resultingCondition;
  protected Reference<Location> location;
  protected CodeableConcept seriousness;
  protected CodeableConcept severity;
  protected CodeableConcept outcome;
  protected Reference<Resource> recorder;
  protected Reference<Resource>[] contributor;
  protected AdverseEventSuspectEntity[] suspectEntity;
  protected Reference<Resource>[] subjectMedicalHistory;
  protected Reference<DocumentReference>[] referenceDocument;
  protected Reference<ResearchStudy>[] study;
  
  public AdverseEvent()
  {
    this.resourceType = "AdverseEvent";
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }

  public String getActuality() {
    return actuality;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getEvent() {
    return event;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getDate() {
    return date;
  }

  public Date getDetected() {
    return detected;
  }

  public Date getRecordedDate() {
    return recordedDate;
  }

  public Reference<Condition>[] getResultingCondition() {
    return resultingCondition;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public CodeableConcept getSeriousness() {
    return seriousness;
  }

  public CodeableConcept getSeverity() {
    return severity;
  }

  public CodeableConcept getOutcome() {
    return outcome;
  }

  public Reference<Resource> getRecorder() {
    return recorder;
  }

  public Reference<Resource>[] getContributor() {
    return contributor;
  }

  public AdverseEventSuspectEntity[] getSuspectEntity() {
    return suspectEntity;
  }

  public Reference<Resource>[] getSubjectMedicalHistory() {
    return subjectMedicalHistory;
  }

  public Reference<DocumentReference>[] getReferenceDocument() {
    return referenceDocument;
  }

  public Reference<ResearchStudy>[] getStudy() {
    return study;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setActuality(String actuality) {
    this.actuality = actuality;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setEvent(CodeableConcept event) {
    this.event = event;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setDetected(Date detected) {
    this.detected = detected;
  }

  public void setRecordedDate(Date recordedDate) {
    this.recordedDate = recordedDate;
  }

  public void setResultingCondition(Reference<Condition>[] resultingCondition) {
    this.resultingCondition = resultingCondition;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setSeriousness(CodeableConcept seriousness) {
    this.seriousness = seriousness;
  }

  public void setSeverity(CodeableConcept severity) {
    this.severity = severity;
  }

  public void setOutcome(CodeableConcept outcome) {
    this.outcome = outcome;
  }

  public void setRecorder(Reference<Resource> recorder) {
    this.recorder = recorder;
  }

  public void setContributor(Reference<Resource>[] contributor) {
    this.contributor = contributor;
  }

  public void setSuspectEntity(AdverseEventSuspectEntity[] suspectEntity) {
    this.suspectEntity = suspectEntity;
  }

  public void setSubjectMedicalHistory(Reference<Resource>[] subjectMedicalHistory) {
    this.subjectMedicalHistory = subjectMedicalHistory;
  }

  public void setReferenceDocument(Reference<DocumentReference>[] referenceDocument) {
    this.referenceDocument = referenceDocument;
  }

  public void setStudy(Reference<ResearchStudy>[] study) {
    this.study = study;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof AdverseEvent) {
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
    return "AdverseEvent(" + id + ")";
  }
}
