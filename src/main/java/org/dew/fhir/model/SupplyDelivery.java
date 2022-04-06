package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Record of delivery of what is supplied.
 *
 * @see <a href="https://www.hl7.org/fhir/supplydelivery.html">SupplyDelivery</a>
 */
public 
class SupplyDelivery extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 1270133784560924159L;
  
  protected Identifier[] identifier;
  protected Reference<SupplyRequest>[] basedOn;
  protected Reference<Resource>[] partOf;
  protected String status;
  protected Reference<Patient> patient;
  protected CodeableConcept type;
  protected SupplyDeliverySuppliedItem suppliedItem;
  protected Date occurrenceDateTime;
  protected Period occurrencePeriod;
  protected Timing occurrenceTiming;
  protected Reference<Resource> supplier;
  protected Reference<Location> destination;
  protected Reference<Resource>[] receiver;
  
  public SupplyDelivery()
  {
    this.resourceType = "SupplyDelivery";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<SupplyRequest>[] getBasedOn() {
    return basedOn;
  }

  public Reference<Resource>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public CodeableConcept getType() {
    return type;
  }

  public SupplyDeliverySuppliedItem getSuppliedItem() {
    return suppliedItem;
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

  public Reference<Resource> getSupplier() {
    return supplier;
  }

  public Reference<Location> getDestination() {
    return destination;
  }

  public Reference<Resource>[] getReceiver() {
    return receiver;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setBasedOn(Reference<SupplyRequest>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setPartOf(Reference<Resource>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSuppliedItem(SupplyDeliverySuppliedItem suppliedItem) {
    this.suppliedItem = suppliedItem;
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

  public void setSupplier(Reference<Resource> supplier) {
    this.supplier = supplier;
  }

  public void setDestination(Reference<Location> destination) {
    this.destination = destination;
  }

  public void setReceiver(Reference<Resource>[] receiver) {
    this.receiver = receiver;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SupplyDelivery) {
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
    return "SupplyDelivery(" + id + "," + patient + "," + type + ")";
  }
}
