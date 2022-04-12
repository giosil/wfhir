package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityResponse</a>
 */
public
class CoverageEligibilityResponse extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CoverageEligibilityResponseInsurance[] insurance;
  protected Reference<Resource> request;
  protected String[] purpose;
  protected String preAuthRef;
  protected CoverageEligibilityResponseError[] error;
  protected Period servicedPeriod;
  protected Reference<Resource> patient;
  protected Reference<Resource> insurer;
  protected String outcome;
  protected Identifier[] identifier;
  protected Date created;
  protected Reference<Resource> requestor;
  protected String disposition;
  protected CodeableConcept form;
  protected Date servicedDate;
  protected String status;
  
  public CoverageEligibilityResponse()
  {
    this.resourceType = "CoverageEligibilityResponse";
  }
  
  public CoverageEligibilityResponseInsurance[] getInsurance() {
    return insurance;
  }
  
  public void setInsurance(CoverageEligibilityResponseInsurance[] insurance) {
    this.insurance = insurance;
  }
  
  public Reference<Resource> getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource> request) {
    this.request = request;
  }
  
  public String[] getPurpose() {
    return purpose;
  }
  
  public void setPurpose(String[] purpose) {
    this.purpose = purpose;
  }
  
  public String getPreAuthRef() {
    return preAuthRef;
  }
  
  public void setPreAuthRef(String preAuthRef) {
    this.preAuthRef = preAuthRef;
  }
  
  public CoverageEligibilityResponseError[] getError() {
    return error;
  }
  
  public void setError(CoverageEligibilityResponseError[] error) {
    this.error = error;
  }
  
  public Period getServicedPeriod() {
    return servicedPeriod;
  }
  
  public void setServicedPeriod(Period servicedPeriod) {
    this.servicedPeriod = servicedPeriod;
  }
  
  public Reference<Resource> getPatient() {
    return patient;
  }
  
  public void setPatient(Reference<Resource> patient) {
    this.patient = patient;
  }
  
  public Reference<Resource> getInsurer() {
    return insurer;
  }
  
  public void setInsurer(Reference<Resource> insurer) {
    this.insurer = insurer;
  }
  
  public String getOutcome() {
    return outcome;
  }
  
  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public Reference<Resource> getRequestor() {
    return requestor;
  }
  
  public void setRequestor(Reference<Resource> requestor) {
    this.requestor = requestor;
  }
  
  public String getDisposition() {
    return disposition;
  }
  
  public void setDisposition(String disposition) {
    this.disposition = disposition;
  }
  
  public CodeableConcept getForm() {
    return form;
  }
  
  public void setForm(CodeableConcept form) {
    this.form = form;
  }
  
  public Date getServicedDate() {
    return servicedDate;
  }
  
  public void setServicedDate(Date servicedDate) {
    this.servicedDate = servicedDate;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityResponse) {
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
    return "CoverageEligibilityResponse(" + id + ")";
  }
}
