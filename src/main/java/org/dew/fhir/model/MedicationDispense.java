package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Indicates that a medication product is to be or has been dispensed for a named person/patient. 
 * This includes a description of the medication product (supply) provided and the instructions for administering the medication. 
 * The medication dispense is the result of a pharmacy system responding to a medication order.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationdispense.html">MedicationDispense</a>
 */
public 
class MedicationDispense extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -5947707937356058374L;
  
  protected Identifier[] identifier;
  protected Reference<Procedure>[] partOf;
  protected String status;
  protected CodeableConcept statusReasonCodeableConcept;
  protected Reference<DetectedIssue> statusReasonReference;
  protected CodeableConcept category;
  protected CodeableConcept medicationCodeableConcept;
  protected Reference<Medication> medicationReference;
  protected Reference<Resource> subject;
  protected Reference<Resource> context;
  protected Reference<Resource>[] supportingInformation;
  protected MedicationDispensePerformer[] performer;
  protected Reference<Location> location;
  protected Reference<MedicationRequest>[] authorizingPrescription;
  protected CodeableConcept type;
  protected Quantity quantity;
  protected Quantity daysSupply;
  protected Date whenPrepared;
  protected Date whenHandedOver;
  protected Reference<Location> destination;
  protected Reference<Resource>[] receiver;
  protected Annotation[] note;
  protected Dosage[] dosageInstruction;
  protected MedicationDispenseSubstitution substitution;
  protected Reference<DetectedIssue>[] detectedIssue;
  protected Reference<Provenance>[] eventHistory;
  
  public MedicationDispense()
  {
    this.resourceType = "MedicationDispense";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Procedure>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getStatusReasonCodeableConcept() {
    return statusReasonCodeableConcept;
  }

  public Reference<DetectedIssue> getStatusReasonReference() {
    return statusReasonReference;
  }

  public CodeableConcept getCategory() {
    return category;
  }

  public CodeableConcept getMedicationCodeableConcept() {
    return medicationCodeableConcept;
  }

  public Reference<Medication> getMedicationReference() {
    return medicationReference;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Resource> getContext() {
    return context;
  }

  public Reference<Resource>[] getSupportingInformation() {
    return supportingInformation;
  }

  public MedicationDispensePerformer[] getPerformer() {
    return performer;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public Reference<MedicationRequest>[] getAuthorizingPrescription() {
    return authorizingPrescription;
  }

  public CodeableConcept getType() {
    return type;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public Quantity getDaysSupply() {
    return daysSupply;
  }

  public Date getWhenPrepared() {
    return whenPrepared;
  }

  public Date getWhenHandedOver() {
    return whenHandedOver;
  }

  public Reference<Location> getDestination() {
    return destination;
  }

  public Reference<Resource>[] getReceiver() {
    return receiver;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Dosage[] getDosageInstruction() {
    return dosageInstruction;
  }

  public MedicationDispenseSubstitution getSubstitution() {
    return substitution;
  }

  public Reference<DetectedIssue>[] getDetectedIssue() {
    return detectedIssue;
  }

  public Reference<Provenance>[] getEventHistory() {
    return eventHistory;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setPartOf(Reference<Procedure>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReasonCodeableConcept(CodeableConcept statusReasonCodeableConcept) {
    this.statusReasonCodeableConcept = statusReasonCodeableConcept;
  }

  public void setStatusReasonReference(Reference<DetectedIssue> statusReasonReference) {
    this.statusReasonReference = statusReasonReference;
  }

  public void setCategory(CodeableConcept category) {
    this.category = category;
  }

  public void setMedicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
    this.medicationCodeableConcept = medicationCodeableConcept;
  }

  public void setMedicationReference(Reference<Medication> medicationReference) {
    this.medicationReference = medicationReference;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setContext(Reference<Resource> context) {
    this.context = context;
  }

  public void setSupportingInformation(Reference<Resource>[] supportingInformation) {
    this.supportingInformation = supportingInformation;
  }

  public void setPerformer(MedicationDispensePerformer[] performer) {
    this.performer = performer;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setAuthorizingPrescription(Reference<MedicationRequest>[] authorizingPrescription) {
    this.authorizingPrescription = authorizingPrescription;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public void setDaysSupply(Quantity daysSupply) {
    this.daysSupply = daysSupply;
  }

  public void setWhenPrepared(Date whenPrepared) {
    this.whenPrepared = whenPrepared;
  }

  public void setWhenHandedOver(Date whenHandedOver) {
    this.whenHandedOver = whenHandedOver;
  }

  public void setDestination(Reference<Location> destination) {
    this.destination = destination;
  }

  public void setReceiver(Reference<Resource>[] receiver) {
    this.receiver = receiver;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setDosageInstruction(Dosage[] dosageInstruction) {
    this.dosageInstruction = dosageInstruction;
  }

  public void setSubstitution(MedicationDispenseSubstitution substitution) {
    this.substitution = substitution;
  }

  public void setDetectedIssue(Reference<DetectedIssue>[] detectedIssue) {
    this.detectedIssue = detectedIssue;
  }

  public void setEventHistory(Reference<Provenance>[] eventHistory) {
    this.eventHistory = eventHistory;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationDispense) {
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
    return "MedicationDispense(" + id + ")";
  }
}
