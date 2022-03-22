package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. 
 * The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationrequest.html">MedicationRequest</a>
 */
public 
class MedicationRequest extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 3550150178237059520L;

  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept statusReason;
  protected String intent;
  protected CodeableConcept[] category;
  protected String priority;
  protected Boolean doNotPerform;
  protected Boolean reportedBoolean;
  protected Reference<Resource> reportedReference;
  protected CodeableConcept medicationCodeableConcept;
  protected Reference<Medication> medicationReference;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Reference<Resource>[] supportingInformation;
  protected Date authoredOn;
  protected Reference<Resource> requester;
  protected Reference<Resource> performer;
  protected CodeableConcept performerType;
  protected Reference<Resource> recorder;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected String[] instantiatesCanonical;
  protected String[] instantiatesUri;
  protected Reference<Resource>[] basedOn;
  protected Identifier groupIdentifier;
  protected CodeableConcept courseOfTherapyType;
  protected Reference<Resource>[] insurance;
  protected Annotation[] note;
  protected Dosage[] dosageInstruction;
  protected MedicationRequestDispenseRequest dispenseRequest;
  protected MedicationRequestSubstitution substitution;
  protected Reference<MedicationRequest> priorPrescription;
  protected Reference<DetectedIssue>[] detectedIssue;
  protected Reference<Provenance>[] eventHistory;
  
  public MedicationRequest()
  {
    this.resourceType = "MedicationRequest";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getStatusReason() {
    return statusReason;
  }

  public String getIntent() {
    return intent;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public String getPriority() {
    return priority;
  }

  public Boolean getDoNotPerform() {
    return doNotPerform;
  }

  public Boolean getReportedBoolean() {
    return reportedBoolean;
  }

  public Reference<Resource> getReportedReference() {
    return reportedReference;
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

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Reference<Resource>[] getSupportingInformation() {
    return supportingInformation;
  }

  public Date getAuthoredOn() {
    return authoredOn;
  }

  public Reference<Resource> getRequester() {
    return requester;
  }

  public Reference<Resource> getPerformer() {
    return performer;
  }

  public CodeableConcept getPerformerType() {
    return performerType;
  }

  public Reference<Resource> getRecorder() {
    return recorder;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public String[] getInstantiatesCanonical() {
    return instantiatesCanonical;
  }

  public String[] getInstantiatesUri() {
    return instantiatesUri;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }

  public Identifier getGroupIdentifier() {
    return groupIdentifier;
  }

  public CodeableConcept getCourseOfTherapyType() {
    return courseOfTherapyType;
  }

  public Reference<Resource>[] getInsurance() {
    return insurance;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Dosage[] getDosageInstruction() {
    return dosageInstruction;
  }

  public MedicationRequestDispenseRequest getDispenseRequest() {
    return dispenseRequest;
  }

  public MedicationRequestSubstitution getSubstitution() {
    return substitution;
  }

  public Reference<MedicationRequest> getPriorPrescription() {
    return priorPrescription;
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

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setDoNotPerform(Boolean doNotPerform) {
    this.doNotPerform = doNotPerform;
  }

  public void setReportedBoolean(Boolean reportedBoolean) {
    this.reportedBoolean = reportedBoolean;
  }

  public void setReportedReference(Reference<Resource> reportedReference) {
    this.reportedReference = reportedReference;
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

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setSupportingInformation(Reference<Resource>[] supportingInformation) {
    this.supportingInformation = supportingInformation;
  }

  public void setAuthoredOn(Date authoredOn) {
    this.authoredOn = authoredOn;
  }

  public void setRequester(Reference<Resource> requester) {
    this.requester = requester;
  }

  public void setPerformer(Reference<Resource> performer) {
    this.performer = performer;
  }

  public void setPerformerType(CodeableConcept performerType) {
    this.performerType = performerType;
  }

  public void setRecorder(Reference<Resource> recorder) {
    this.recorder = recorder;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setInstantiatesCanonical(String[] instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }

  public void setInstantiatesUri(String[] instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setGroupIdentifier(Identifier groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }

  public void setCourseOfTherapyType(CodeableConcept courseOfTherapyType) {
    this.courseOfTherapyType = courseOfTherapyType;
  }

  public void setInsurance(Reference<Resource>[] insurance) {
    this.insurance = insurance;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setDosageInstruction(Dosage[] dosageInstruction) {
    this.dosageInstruction = dosageInstruction;
  }

  public void setDispenseRequest(MedicationRequestDispenseRequest dispenseRequest) {
    this.dispenseRequest = dispenseRequest;
  }

  public void setSubstitution(MedicationRequestSubstitution substitution) {
    this.substitution = substitution;
  }

  public void setPriorPrescription(Reference<MedicationRequest> priorPrescription) {
    this.priorPrescription = priorPrescription;
  }

  public void setDetectedIssue(Reference<DetectedIssue>[] detectedIssue) {
    this.detectedIssue = detectedIssue;
  }

  public void setEventHistory(Reference<Provenance>[] eventHistory) {
    this.eventHistory = eventHistory;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationRequest) {
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
    return "MedicationRequest(" + id + ")";
  }
}
