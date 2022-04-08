package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. 
 * The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 *
 * @see <a href="https://www.hl7.org/fhir/diagnosticreport.html">DiagnosticReport</a>
 */
public 
class DiagnosticReport extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 2400854766504735870L;
  
  protected Identifier[] identifier;
  protected Reference<Resource>[] basedOn;
  protected String status;
  protected CodeableConcept[] category;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date effectiveDateTime;
  protected Period effectivePeriod;
  protected Date issued;
  protected Reference<Resource>[] performer;
  protected Reference<Resource>[] resultsInterpreter;
  protected Reference<Specimen>[] specimen;
  protected Reference<Observation>[] result;
  protected Reference<ImagingStudy>[] imagingStudy;
  protected DiagnosticReportMedia[] media;
  protected String conclusion;
  protected CodeableConcept[] conclusionCode;
  protected Attachment[] presentedForm;
  
  public DiagnosticReport()
  {
    this.resourceType = "DiagnosticReport";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getCategory() {
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

  public Date getEffectiveDateTime() {
    return effectiveDateTime;
  }

  public Period getEffectivePeriod() {
    return effectivePeriod;
  }

  public Date getIssued() {
    return issued;
  }

  public Reference<Resource>[] getPerformer() {
    return performer;
  }

  public Reference<Resource>[] getResultsInterpreter() {
    return resultsInterpreter;
  }

  public Reference<Specimen>[] getSpecimen() {
    return specimen;
  }

  public Reference<Observation>[] getResult() {
    return result;
  }

  public Reference<ImagingStudy>[] getImagingStudy() {
    return imagingStudy;
  }

  public DiagnosticReportMedia[] getMedia() {
    return media;
  }

  public String getConclusion() {
    return conclusion;
  }

  public CodeableConcept[] getConclusionCode() {
    return conclusionCode;
  }

  public Attachment[] getPresentedForm() {
    return presentedForm;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCategory(CodeableConcept[] category) {
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

  public void setEffectiveDateTime(Date effectiveDateTime) {
    this.effectiveDateTime = effectiveDateTime;
  }

  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }

  public void setIssued(Date issued) {
    this.issued = issued;
  }

  public void setPerformer(Reference<Resource>[] performer) {
    this.performer = performer;
  }

  public void setResultsInterpreter(Reference<Resource>[] resultsInterpreter) {
    this.resultsInterpreter = resultsInterpreter;
  }

  public void setSpecimen(Reference<Specimen>[] specimen) {
    this.specimen = specimen;
  }

  public void setResult(Reference<Observation>[] result) {
    this.result = result;
  }

  public void setImagingStudy(Reference<ImagingStudy>[] imagingStudy) {
    this.imagingStudy = imagingStudy;
  }

  public void setMedia(DiagnosticReportMedia[] media) {
    this.media = media;
  }

  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }

  public void setConclusionCode(CodeableConcept[] conclusionCode) {
    this.conclusionCode = conclusionCode;
  }

  public void setPresentedForm(Attachment[] presentedForm) {
    this.presentedForm = presentedForm;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DiagnosticReport) {
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
    return "DiagnosticReport(" + id + ")";
  }
}
