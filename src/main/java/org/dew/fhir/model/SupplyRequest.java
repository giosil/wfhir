package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * @see <a href="https://www.hl7.org/fhir/supplyrequest.html">SupplyRequest</a>
 */
public 
class SupplyRequest extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -4046113034914825517L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept category;
  protected String priority;
  protected CodeableConcept itemCodeableConcept;
  protected Reference<Resource> itemReference;
  protected Quantity quantity;
  protected SupplyRequestParameter[] parameter;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Timing occurrenceTiming;
  protected Date authoredOn;
  protected Reference<Resource> requester;
  protected Reference<Resource>[] supplier;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Reference<Resource> deliverFrom;
  protected Reference<Resource> deliverTo;
  
  public SupplyRequest()
  {
    this.resourceType = "SupplyRequest";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getCategory() {
    return category;
  }

  public String getPriority() {
    return priority;
  }

  public CodeableConcept getItemCodeableConcept() {
    return itemCodeableConcept;
  }

  public Reference<Resource> getItemReference() {
    return itemReference;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public SupplyRequestParameter[] getParameter() {
    return parameter;
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

  public Date getAuthoredOn() {
    return authoredOn;
  }

  public Reference<Resource> getRequester() {
    return requester;
  }

  public Reference<Resource>[] getSupplier() {
    return supplier;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Reference<Resource> getDeliverFrom() {
    return deliverFrom;
  }

  public Reference<Resource> getDeliverTo() {
    return deliverTo;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCategory(CodeableConcept category) {
    this.category = category;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
    this.itemCodeableConcept = itemCodeableConcept;
  }

  public void setItemReference(Reference<Resource> itemReference) {
    this.itemReference = itemReference;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public void setParameter(SupplyRequestParameter[] parameter) {
    this.parameter = parameter;
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

  public void setAuthoredOn(Date authoredOn) {
    this.authoredOn = authoredOn;
  }

  public void setRequester(Reference<Resource> requester) {
    this.requester = requester;
  }

  public void setSupplier(Reference<Resource>[] supplier) {
    this.supplier = supplier;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setDeliverFrom(Reference<Resource> deliverFrom) {
    this.deliverFrom = deliverFrom;
  }

  public void setDeliverTo(Reference<Resource> deliverTo) {
    this.deliverTo = deliverTo;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SupplyRequest) {
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
    return "SupplyRequest(" + id + "," + category + "," + priority + ")";
  }
}
