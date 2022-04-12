package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The regulatory authorization of a medicinal product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductAuthorization</a>
 */
public
class MedicinalProductAuthorization extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date statusDate;
  protected CodeableConcept[] country;
  protected Reference<Resource> subject;
  protected CodeableConcept[] jurisdiction;
  protected Date internationalBirthDate;
  protected Period validityPeriod;
  protected MedicinalProductAuthorizationJurisdictionalAuthorization[] jurisdictionalAuthorization;
  protected Period dataExclusivityPeriod;
  protected Identifier[] identifier;
  protected Date dateOfFirstAuthorization;
  protected CodeableConcept legalBasis;
  protected Reference<Resource> holder;
  protected MedicinalProductAuthorizationProcedure procedure;
  protected Reference<Resource> regulator;
  protected CodeableConcept status;
  protected Date restoreDate;
  
  public MedicinalProductAuthorization()
  {
    this.resourceType = "MedicinalProductAuthorization";
  }
  
  public Date getStatusDate() {
    return statusDate;
  }
  
  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }
  
  public CodeableConcept[] getCountry() {
    return country;
  }
  
  public void setCountry(CodeableConcept[] country) {
    this.country = country;
  }
  
  public Reference<Resource> getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }
  
  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  public Date getInternationalBirthDate() {
    return internationalBirthDate;
  }
  
  public void setInternationalBirthDate(Date internationalBirthDate) {
    this.internationalBirthDate = internationalBirthDate;
  }
  
  public Period getValidityPeriod() {
    return validityPeriod;
  }
  
  public void setValidityPeriod(Period validityPeriod) {
    this.validityPeriod = validityPeriod;
  }
  
  public MedicinalProductAuthorizationJurisdictionalAuthorization[] getJurisdictionalAuthorization() {
    return jurisdictionalAuthorization;
  }
  
  public void setJurisdictionalAuthorization(MedicinalProductAuthorizationJurisdictionalAuthorization[] jurisdictionalAuthorization) {
    this.jurisdictionalAuthorization = jurisdictionalAuthorization;
  }
  
  public Period getDataExclusivityPeriod() {
    return dataExclusivityPeriod;
  }
  
  public void setDataExclusivityPeriod(Period dataExclusivityPeriod) {
    this.dataExclusivityPeriod = dataExclusivityPeriod;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Date getDateOfFirstAuthorization() {
    return dateOfFirstAuthorization;
  }
  
  public void setDateOfFirstAuthorization(Date dateOfFirstAuthorization) {
    this.dateOfFirstAuthorization = dateOfFirstAuthorization;
  }
  
  public CodeableConcept getLegalBasis() {
    return legalBasis;
  }
  
  public void setLegalBasis(CodeableConcept legalBasis) {
    this.legalBasis = legalBasis;
  }
  
  public Reference<Resource> getHolder() {
    return holder;
  }
  
  public void setHolder(Reference<Resource> holder) {
    this.holder = holder;
  }
  
  public MedicinalProductAuthorizationProcedure getProcedure() {
    return procedure;
  }
  
  public void setProcedure(MedicinalProductAuthorizationProcedure procedure) {
    this.procedure = procedure;
  }
  
  public Reference<Resource> getRegulator() {
    return regulator;
  }
  
  public void setRegulator(Reference<Resource> regulator) {
    this.regulator = regulator;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  public Date getRestoreDate() {
    return restoreDate;
  }
  
  public void setRestoreDate(Date restoreDate) {
    this.restoreDate = restoreDate;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductAuthorization) {
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
    return "MedicinalProductAuthorization(" + id + ")";
  }
}
