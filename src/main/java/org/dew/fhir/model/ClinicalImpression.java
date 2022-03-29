package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. 
 * Assessments are often 1:1 with a clinical consultation / encounter, but this varies greatly depending on the clinical workflow. 
 * This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 *
 * @see <a href="https://www.hl7.org/fhir/clinicalimpression.html">ClinicalImpression</a>
 */
public 
class ClinicalImpression extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -4403669901752762039L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept statusReason;
  protected CodeableConcept code;
  protected String description;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date effectiveDateTime;
  protected Period effectivePeriod;
  protected Date date;
  protected Reference<Resource> assessor;
  protected Reference<ClinicalImpression> previous;
  protected Reference<Resource>[] problem;
  protected ClinicalImpressionInvestigation[] investigation;
  protected String[] protocol;
  protected String summary;
  protected ClinicalImpressionFinding[] finding;
  protected CodeableConcept[] prognosisCodeableConcept;
  protected Reference<RiskAssessment>[] prognosisReference;
  protected Reference<Resource>[] supportingInfo;
  protected Annotation[] note;
  
  public ClinicalImpression()
  {
    this.resourceType = "ClinicalImpression";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getStatusReason() {
    return statusReason;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getEffectiveDateTime() {
    return effectiveDateTime;
  }

  public Period getEffectivePeriod() {
    return effectivePeriod;
  }

  public Date getDate() {
    return date;
  }

  public Reference<Resource> getAssessor() {
    return assessor;
  }

  public Reference<ClinicalImpression> getPrevious() {
    return previous;
  }

  public Reference<Resource>[] getProblem() {
    return problem;
  }

  public ClinicalImpressionInvestigation[] getInvestigation() {
    return investigation;
  }

  public String[] getProtocol() {
    return protocol;
  }

  public String getSummary() {
    return summary;
  }

  public ClinicalImpressionFinding[] getFinding() {
    return finding;
  }

  public CodeableConcept[] getPrognosisCodeableConcept() {
    return prognosisCodeableConcept;
  }

  public Reference<RiskAssessment>[] getPrognosisReference() {
    return prognosisReference;
  }

  public Reference<Resource>[] getSupportingInfo() {
    return supportingInfo;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setEffectiveDateTime(Date effectiveDateTime) {
    this.effectiveDateTime = effectiveDateTime;
  }

  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setAssessor(Reference<Resource> assessor) {
    this.assessor = assessor;
  }

  public void setPrevious(Reference<ClinicalImpression> previous) {
    this.previous = previous;
  }

  public void setProblem(Reference<Resource>[] problem) {
    this.problem = problem;
  }

  public void setInvestigation(ClinicalImpressionInvestigation[] investigation) {
    this.investigation = investigation;
  }

  public void setProtocol(String[] protocol) {
    this.protocol = protocol;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public void setFinding(ClinicalImpressionFinding[] finding) {
    this.finding = finding;
  }

  public void setPrognosisCodeableConcept(CodeableConcept[] prognosisCodeableConcept) {
    this.prognosisCodeableConcept = prognosisCodeableConcept;
  }

  public void setPrognosisReference(Reference<RiskAssessment>[] prognosisReference) {
    this.prognosisReference = prognosisReference;
  }

  public void setSupportingInfo(Reference<Resource>[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClinicalImpression) {
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
    return "ClinicalImpression(" + id + "," + code + "," + description + ")";
  }
}
