package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. 
 * Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
 *
 * @see <a href="https://www.hl7.org/fhir/chargeitem.html">ChargeItem</a>
 */
public 
class ChargeItem extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -4652035423893227986L;

  protected Identifier[] identifier;
  protected String[] definitionUri;
  protected String[] definitionCanonical;
  protected String status;
  protected Reference<ChargeItem>[] partOf;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Reference<Resource> context;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Timing occurrenceTiming;
  protected ChargeItemPerformer[] performer;
  protected Reference<Organization> performingOrganization;
  protected Reference<Organization> requestingOrganization;
  protected Reference<Organization> costCenter;
  protected Quantity quantity;
  protected CodeableConcept[] bodysite;
  protected Double factorOverride;
  protected Money priceOverride;
  protected String overrideReason;
  protected Reference<Resource> enterer;
  protected Date enteredDate;
  protected CodeableConcept[] reason;
  protected Reference<Resource>[] service;
  protected Reference<Resource> productReference;
  protected CodeableConcept productCodeableConcept;
  protected Reference<Account>[] account;
  protected Annotation[] note;
  protected Reference<Resource>[] supportingInformation;
  
  public ChargeItem()
  {
    this.resourceType = "ChargeItem";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String[] getDefinitionUri() {
    return definitionUri;
  }

  public String[] getDefinitionCanonical() {
    return definitionCanonical;
  }

  public String getStatus() {
    return status;
  }

  public Reference<ChargeItem>[] getPartOf() {
    return partOf;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Resource> getContext() {
    return context;
  }

  public Date getOccurrenceDateTime() {
    return occurrenceDateTime;
  }

  public Period getOccurrencePeriod() {
    return occurrencePeriod;
  }

  public Timing getOccurrenceTiming() {
    return occurrenceTiming;
  }

  public ChargeItemPerformer[] getPerformer() {
    return performer;
  }

  public Reference<Organization> getPerformingOrganization() {
    return performingOrganization;
  }

  public Reference<Organization> getRequestingOrganization() {
    return requestingOrganization;
  }

  public Reference<Organization> getCostCenter() {
    return costCenter;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public CodeableConcept[] getBodysite() {
    return bodysite;
  }

  public Double getFactorOverride() {
    return factorOverride;
  }

  public Money getPriceOverride() {
    return priceOverride;
  }

  public String getOverrideReason() {
    return overrideReason;
  }

  public Reference<Resource> getEnterer() {
    return enterer;
  }

  public Date getEnteredDate() {
    return enteredDate;
  }

  public CodeableConcept[] getReason() {
    return reason;
  }

  public Reference<Resource>[] getService() {
    return service;
  }

  public Reference<Resource> getProductReference() {
    return productReference;
  }

  public CodeableConcept getProductCodeableConcept() {
    return productCodeableConcept;
  }

  public Reference<Account>[] getAccount() {
    return account;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Reference<Resource>[] getSupportingInformation() {
    return supportingInformation;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setDefinitionUri(String[] definitionUri) {
    this.definitionUri = definitionUri;
  }

  public void setDefinitionCanonical(String[] definitionCanonical) {
    this.definitionCanonical = definitionCanonical;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPartOf(Reference<ChargeItem>[] partOf) {
    this.partOf = partOf;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setContext(Reference<Resource> context) {
    this.context = context;
  }

  public void setOccurrenceDateTime(Date occurrenceDateTime) {
    this.occurrenceDateTime = occurrenceDateTime;
  }

  public void setOccurrencePeriod(Period occurrencePeriod) {
    this.occurrencePeriod = occurrencePeriod;
  }

  public void setOccurrenceTiming(Timing occurrenceTiming) {
    this.occurrenceTiming = occurrenceTiming;
  }

  public void setPerformer(ChargeItemPerformer[] performer) {
    this.performer = performer;
  }

  public void setPerformingOrganization(Reference<Organization> performingOrganization) {
    this.performingOrganization = performingOrganization;
  }

  public void setRequestingOrganization(Reference<Organization> requestingOrganization) {
    this.requestingOrganization = requestingOrganization;
  }

  public void setCostCenter(Reference<Organization> costCenter) {
    this.costCenter = costCenter;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public void setBodysite(CodeableConcept[] bodysite) {
    this.bodysite = bodysite;
  }

  public void setFactorOverride(Double factorOverride) {
    this.factorOverride = factorOverride;
  }

  public void setPriceOverride(Money priceOverride) {
    this.priceOverride = priceOverride;
  }

  public void setOverrideReason(String overrideReason) {
    this.overrideReason = overrideReason;
  }

  public void setEnterer(Reference<Resource> enterer) {
    this.enterer = enterer;
  }

  public void setEnteredDate(Date enteredDate) {
    this.enteredDate = enteredDate;
  }

  public void setReason(CodeableConcept[] reason) {
    this.reason = reason;
  }

  public void setService(Reference<Resource>[] service) {
    this.service = service;
  }

  public void setProductReference(Reference<Resource> productReference) {
    this.productReference = productReference;
  }

  public void setProductCodeableConcept(CodeableConcept productCodeableConcept) {
    this.productCodeableConcept = productCodeableConcept;
  }

  public void setAccount(Reference<Account>[] account) {
    this.account = account;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setSupportingInformation(Reference<Resource>[] supportingInformation) {
    this.supportingInformation = supportingInformation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ChargeItem) {
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
    return "ChargeItem(" + id + "," + code + ")";
  }
}
