package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. 
 * Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/detectedissue.html">DetectedIssue</a>
 */
public 
class DetectedIssue extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 2521536282666389594L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept code;
  protected String severity;
  protected Reference<Patient> patient;
  protected Date identifiedDateTime;
  protected Period identifiedPeriod;
  protected Reference<Resource> author;
  protected Reference<Resource>[] implicated;
  protected DetectedIssueEvidence[] evidence;
  protected String detail;
  protected String reference;
  protected DetectedIssueMitigation[] mitigation;
  
  public DetectedIssue()
  {
    this.resourceType = "DetectedIssue";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getSeverity() {
    return severity;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Date getIdentifiedDateTime() {
    return identifiedDateTime;
  }

  public Period getIdentifiedPeriod() {
    return identifiedPeriod;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public Reference<Resource>[] getImplicated() {
    return implicated;
  }

  public DetectedIssueEvidence[] getEvidence() {
    return evidence;
  }

  public String getDetail() {
    return detail;
  }

  public String getReference() {
    return reference;
  }

  public DetectedIssueMitigation[] getMitigation() {
    return mitigation;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setIdentifiedDateTime(Date identifiedDateTime) {
    this.identifiedDateTime = identifiedDateTime;
  }

  public void setIdentifiedPeriod(Period identifiedPeriod) {
    this.identifiedPeriod = identifiedPeriod;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }

  public void setImplicated(Reference<Resource>[] implicated) {
    this.implicated = implicated;
  }

  public void setEvidence(DetectedIssueEvidence[] evidence) {
    this.evidence = evidence;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public void setMitigation(DetectedIssueMitigation[] mitigation) {
    this.mitigation = mitigation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DetectedIssue) {
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
    return "DetectedIssue(" + id + ")";
  }
}
