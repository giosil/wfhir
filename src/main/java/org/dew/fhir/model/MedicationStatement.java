package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of a medication that is being consumed by a patient. 
 * A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future. 
 * The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician. 
 * A common scenario where this information is captured is during the history taking process during a patient visit or stay. 
 * The medication information may come from sources such as the patient's memory, from a prescription bottle, or from a list of medications the patient, clinician or other party maintains.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationstatement.html">MedicationStatement</a>
 */
public 
class MedicationStatement extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 996625859436101287L;
  
  protected Identifier[] identifier;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource>[] partOf;
  protected String status;
  protected CodeableConcept[] statusReason;
  protected CodeableConcept category;
  protected CodeableConcept medicationCodeableConcept;
  protected Reference<Medication> medicationReference;
  protected Reference<Resource> subject;
  protected Reference<Resource> context;
  protected Date effectiveDateTime;
  protected Period effectivePeriod;
  protected Date dateAsserted;
  protected Reference<Resource> informationSource;
  protected Reference<Resource>[] derivedFrom;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Annotation[] note;
  protected Dosage[] dosage;
  
  public MedicationStatement()
  {
    this.resourceType = "MedicationStatement";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
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

  public Date getEffectiveDateTime() {
    return effectiveDateTime;
  }

  public Period getEffectivePeriod() {
    return effectivePeriod;
  }

  public Date getDateAsserted() {
    return dateAsserted;
  }

  public Reference<Resource> getInformationSource() {
    return informationSource;
  }

  public Reference<Resource>[] getDerivedFrom() {
    return derivedFrom;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Dosage[] getDosage() {
    return dosage;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
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

  public void setEffectiveDateTime(Date effectiveDateTime) {
    this.effectiveDateTime = effectiveDateTime;
  }

  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }

  public void setDateAsserted(Date dateAsserted) {
    this.dateAsserted = dateAsserted;
  }

  public void setInformationSource(Reference<Resource> informationSource) {
    this.informationSource = informationSource;
  }

  public void setDerivedFrom(Reference<Resource>[] derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setDosage(Dosage[] dosage) {
    this.dosage = dosage;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationStatement) {
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
    return "MedicationStatement(" + id + "," + category + ")";
  }
}
