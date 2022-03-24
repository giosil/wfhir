package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those recommendations.
 *
 * @see <a href="https://www.hl7.org/fhir/immunizationevaluation.html">ImmunizationEvaluation</a>
 */
public 
class ImmunizationEvaluation extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -2025384861420947377L;
  
  protected Identifier[] identifier;
  protected String status;
  protected Reference<Patient> patient;
  protected Date date;
  protected Reference<Organization> authority;
  protected CodeableConcept targetDisease;
  protected Reference<Immunization> immunizationEvent;
  protected CodeableConcept doseStatus;
  protected CodeableConcept[] doseStatusReason;
  protected String description;
  protected String series;
  protected Integer doseNumberPositiveInt;
  protected String doseNumberString;
  protected Integer seriesDosesPositiveInt;
  protected String seriesDosesString;
  
  public ImmunizationEvaluation()
  {
    this.resourceType = "ImmunizationEvaluation";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Date getDate() {
    return date;
  }

  public Reference<Organization> getAuthority() {
    return authority;
  }

  public CodeableConcept getTargetDisease() {
    return targetDisease;
  }

  public Reference<Immunization> getImmunizationEvent() {
    return immunizationEvent;
  }

  public CodeableConcept getDoseStatus() {
    return doseStatus;
  }

  public CodeableConcept[] getDoseStatusReason() {
    return doseStatusReason;
  }

  public String getDescription() {
    return description;
  }

  public String getSeries() {
    return series;
  }

  public Integer getDoseNumberPositiveInt() {
    return doseNumberPositiveInt;
  }

  public String getDoseNumberString() {
    return doseNumberString;
  }

  public Integer getSeriesDosesPositiveInt() {
    return seriesDosesPositiveInt;
  }

  public String getSeriesDosesString() {
    return seriesDosesString;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setAuthority(Reference<Organization> authority) {
    this.authority = authority;
  }

  public void setTargetDisease(CodeableConcept targetDisease) {
    this.targetDisease = targetDisease;
  }

  public void setImmunizationEvent(Reference<Immunization> immunizationEvent) {
    this.immunizationEvent = immunizationEvent;
  }

  public void setDoseStatus(CodeableConcept doseStatus) {
    this.doseStatus = doseStatus;
  }

  public void setDoseStatusReason(CodeableConcept[] doseStatusReason) {
    this.doseStatusReason = doseStatusReason;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public void setDoseNumberPositiveInt(Integer doseNumberPositiveInt) {
    this.doseNumberPositiveInt = doseNumberPositiveInt;
  }

  public void setDoseNumberString(String doseNumberString) {
    this.doseNumberString = doseNumberString;
  }

  public void setSeriesDosesPositiveInt(Integer seriesDosesPositiveInt) {
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
  }

  public void setSeriesDosesString(String seriesDosesString) {
    this.seriesDosesString = seriesDosesString;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationEvaluation) {
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
    return "ImmunizationEvaluation(" + id + ")";
  }
}
