package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityRequest</a>
 */
public
class CoverageEligibilityRequest extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CoverageEligibilityRequestInsurance[] insurance;
  protected String[] purpose;
  protected Period servicedPeriod;
  protected CoverageEligibilityRequestSupportingInfo[] supportingInfo;
  protected Reference<Resource> provider;
  protected Reference<Resource> patient;
  protected Reference<Resource> insurer;
  protected Reference<Resource> enterer;
  protected Identifier[] identifier;
  protected CoverageEligibilityRequestItem[] item;
  protected Date created;
  protected CodeableConcept priority;
  protected Date servicedDate;
  protected Reference<Resource> facility;
  protected String status;
  
  public CoverageEligibilityRequest()
  {
    this.resourceType = "CoverageEligibilityRequest";
  }
  
  public CoverageEligibilityRequestInsurance[] getInsurance() {
    return insurance;
  }
  
  public void setInsurance(CoverageEligibilityRequestInsurance[] insurance) {
    this.insurance = insurance;
  }
  
  public String[] getPurpose() {
    return purpose;
  }
  
  public void setPurpose(String[] purpose) {
    this.purpose = purpose;
  }
  
  public Period getServicedPeriod() {
    return servicedPeriod;
  }
  
  public void setServicedPeriod(Period servicedPeriod) {
    this.servicedPeriod = servicedPeriod;
  }
  
  public CoverageEligibilityRequestSupportingInfo[] getSupportingInfo() {
    return supportingInfo;
  }
  
  public void setSupportingInfo(CoverageEligibilityRequestSupportingInfo[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
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
  
  public Reference<Resource> getEnterer() {
    return enterer;
  }
  
  public void setEnterer(Reference<Resource> enterer) {
    this.enterer = enterer;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public CoverageEligibilityRequestItem[] getItem() {
    return item;
  }
  
  public void setItem(CoverageEligibilityRequestItem[] item) {
    this.item = item;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public CodeableConcept getPriority() {
    return priority;
  }
  
  public void setPriority(CodeableConcept priority) {
    this.priority = priority;
  }
  
  public Date getServicedDate() {
    return servicedDate;
  }
  
  public void setServicedDate(Date servicedDate) {
    this.servicedDate = servicedDate;
  }
  
  public Reference<Resource> getFacility() {
    return facility;
  }
  
  public void setFacility(Reference<Resource> facility) {
    this.facility = facility;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityRequest) {
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
    return "CoverageEligibilityRequest(" + id + ")";
  }
}
