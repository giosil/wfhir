package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Describes the event of a patient consuming or otherwise being administered a medication. 
 * This may be as simple as swallowing a tablet or it may be a long running infusion. 
 * Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationadministration.html">MedicationAdministrationPerformer</a>
 */
public 
class MedicationAdministration extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 5846130817494880946L;
  
  protected Identifier[] identifier;
  protected String[] instantiates;
  protected Reference<Resource>[] partOf;
  protected String status;
  protected CodeableConcept[] statusReason;
  protected CodeableConcept category;
  protected CodeableConcept medicationCodeableConcept;
  protected Reference<Medication> medicationReference;
  protected Reference<Resource> subject;
  protected Reference<Resource> context;
  protected Reference<Resource>[] supportingInformation;
  protected Date effectiveDateTime;
  protected Period effectivePeriod;
  protected MedicationAdministrationPerformer[] performer;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Reference<MedicationRequest> request;
  protected Reference<Device>[] device;
  protected Annotation[] note;
  protected MedicationAdministrationDosage dosage;
  protected Reference<Provenance>[] eventHistory;
  
  public MedicationAdministration()
  {
    this.resourceType = "MedicationAdministration";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String[] getInstantiates() {
    return instantiates;
  }

  public Reference<Resource>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getStatusReason() {
    return statusReason;
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

  public Date getEffectiveDateTime() {
    return effectiveDateTime;
  }

  public Period getEffectivePeriod() {
    return effectivePeriod;
  }

  public MedicationAdministrationPerformer[] getPerformer() {
    return performer;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Reference<MedicationRequest> getRequest() {
    return request;
  }

  public Reference<Device>[] getDevice() {
    return device;
  }

  public Annotation[] getNote() {
    return note;
  }

  public MedicationAdministrationDosage getDosage() {
    return dosage;
  }

  public Reference<Provenance>[] getEventHistory() {
    return eventHistory;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setInstantiates(String[] instantiates) {
    this.instantiates = instantiates;
  }

  public void setPartOf(Reference<Resource>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept[] statusReason) {
    this.statusReason = statusReason;
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

  public void setEffectiveDateTime(Date effectiveDateTime) {
    this.effectiveDateTime = effectiveDateTime;
  }

  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }

  public void setPerformer(MedicationAdministrationPerformer[] performer) {
    this.performer = performer;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setRequest(Reference<MedicationRequest> request) {
    this.request = request;
  }

  public void setDevice(Reference<Device>[] device) {
    this.device = device;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setDosage(MedicationAdministrationDosage dosage) {
    this.dosage = dosage;
  }

  public void setEventHistory(Reference<Provenance>[] eventHistory) {
    this.eventHistory = eventHistory;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationAdministration) {
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
    return "MedicationAdministration(" + id + ")";
  }
}
