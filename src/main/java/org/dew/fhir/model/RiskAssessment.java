package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 *
 * @see <a href="https://www.hl7.org/fhir/riskassessment.html">RiskAssessment</a>
 */
public 
class RiskAssessment extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -8519261797236457754L;
  
  protected Identifier[] identifier;
  protected Reference<Resource> basedOn;
  protected Reference<Resource> parent;
  protected String status;
  protected CodeableConcept method;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Reference<Condition> condition;
  protected Reference<Resource> performer;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Reference<Resource>[] basis;
  protected RiskAssessmentPrediction[] prediction;
  protected String mitigation;
  protected Annotation[] note;
  
  public RiskAssessment()
  {
    this.resourceType = "RiskAssessment";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Resource> getBasedOn() {
    return basedOn;
  }

  public Reference<Resource> getParent() {
    return parent;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getMethod() {
    return method;
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

  public Date getOccurrenceDateTime() {
    return occurrenceDateTime;
  }

  public Period getOccurrencePeriod() {
    return occurrencePeriod;
  }

  public Reference<Condition> getCondition() {
    return condition;
  }

  public Reference<Resource> getPerformer() {
    return performer;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Reference<Resource>[] getBasis() {
    return basis;
  }

  public RiskAssessmentPrediction[] getPrediction() {
    return prediction;
  }

  public String getMitigation() {
    return mitigation;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setBasedOn(Reference<Resource> basedOn) {
    this.basedOn = basedOn;
  }

  public void setParent(Reference<Resource> parent) {
    this.parent = parent;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
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

  public void setOccurrenceDateTime(Date occurrenceDateTime) {
    this.occurrenceDateTime = occurrenceDateTime;
  }

  public void setOccurrencePeriod(Period occurrencePeriod) {
    this.occurrencePeriod = occurrencePeriod;
  }

  public void setCondition(Reference<Condition> condition) {
    this.condition = condition;
  }

  public void setPerformer(Reference<Resource> performer) {
    this.performer = performer;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setBasis(Reference<Resource>[] basis) {
    this.basis = basis;
  }

  public void setPrediction(RiskAssessmentPrediction[] prediction) {
    this.prediction = prediction;
  }

  public void setMitigation(String mitigation) {
    this.mitigation = mitigation;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof RiskAssessment) {
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
    return "RiskAssessment(" + id + "," + method + "," + code + "," + text + ")";
  }
}
