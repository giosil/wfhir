package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 *
 * @see <a href="https://www.hl7.org/fhir/immunization.html">Immunization</a>
 */
public 
class Immunization extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 3698942683423313510L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept statusReason;
  protected CodeableConcept vaccineCode;
  protected Reference<Patient> patient;
  protected Reference<Encounter> encounter;
  protected Date occurrenceDateTime;
  protected String occurrenceString;
  protected Date recorded;
  protected Boolean primarySource;
  protected CodeableConcept reportOrigin;
  protected Reference<Location> location;
  protected Reference<Organization> manufacturer;
  protected String lotNumber;
  protected Date expirationDate;
  protected CodeableConcept site;
  protected CodeableConcept route;
  protected Quantity doseQuantity;
  protected ImmunizationPerformer[] performer;
  protected Annotation[] note;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Boolean isSubpotent;
  protected CodeableConcept[] subpotentReason;
  protected ImmunizationEducation[] education;
  protected CodeableConcept[] programEligibility;
  protected CodeableConcept fundingSource;
  protected ImmunizationReaction[] reaction;
  protected ImmunizationProtocolApplied[] protocolApplied;
  
  public Immunization()
  {
    this.resourceType = "Immunization";
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

  public CodeableConcept getVaccineCode() {
    return vaccineCode;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getOccurrenceDateTime() {
    return occurrenceDateTime;
  }

  public String getOccurrenceString() {
    return occurrenceString;
  }

  public Date getRecorded() {
    return recorded;
  }

  public Boolean getPrimarySource() {
    return primarySource;
  }

  public CodeableConcept getReportOrigin() {
    return reportOrigin;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public Reference<Organization> getManufacturer() {
    return manufacturer;
  }

  public String getLotNumber() {
    return lotNumber;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public CodeableConcept getSite() {
    return site;
  }

  public CodeableConcept getRoute() {
    return route;
  }

  public Quantity getDoseQuantity() {
    return doseQuantity;
  }

  public ImmunizationPerformer[] getPerformer() {
    return performer;
  }

  public Annotation[] getNote() {
    return note;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Boolean getIsSubpotent() {
    return isSubpotent;
  }

  public CodeableConcept[] getSubpotentReason() {
    return subpotentReason;
  }

  public ImmunizationEducation[] getEducation() {
    return education;
  }

  public CodeableConcept[] getProgramEligibility() {
    return programEligibility;
  }

  public CodeableConcept getFundingSource() {
    return fundingSource;
  }

  public ImmunizationReaction[] getReaction() {
    return reaction;
  }

  public ImmunizationProtocolApplied[] getProtocolApplied() {
    return protocolApplied;
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

  public void setVaccineCode(CodeableConcept vaccineCode) {
    this.vaccineCode = vaccineCode;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setOccurrenceDateTime(Date occurrenceDateTime) {
    this.occurrenceDateTime = occurrenceDateTime;
  }

  public void setOccurrenceString(String occurrenceString) {
    this.occurrenceString = occurrenceString;
  }

  public void setRecorded(Date recorded) {
    this.recorded = recorded;
  }

  public void setPrimarySource(Boolean primarySource) {
    this.primarySource = primarySource;
  }

  public void setReportOrigin(CodeableConcept reportOrigin) {
    this.reportOrigin = reportOrigin;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setManufacturer(Reference<Organization> manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public void setSite(CodeableConcept site) {
    this.site = site;
  }

  public void setRoute(CodeableConcept route) {
    this.route = route;
  }

  public void setDoseQuantity(Quantity doseQuantity) {
    this.doseQuantity = doseQuantity;
  }

  public void setPerformer(ImmunizationPerformer[] performer) {
    this.performer = performer;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setIsSubpotent(Boolean isSubpotent) {
    this.isSubpotent = isSubpotent;
  }

  public void setSubpotentReason(CodeableConcept[] subpotentReason) {
    this.subpotentReason = subpotentReason;
  }

  public void setEducation(ImmunizationEducation[] education) {
    this.education = education;
  }

  public void setProgramEligibility(CodeableConcept[] programEligibility) {
    this.programEligibility = programEligibility;
  }

  public void setFundingSource(CodeableConcept fundingSource) {
    this.fundingSource = fundingSource;
  }

  public void setReaction(ImmunizationReaction[] reaction) {
    this.reaction = reaction;
  }

  public void setProtocolApplied(ImmunizationProtocolApplied[] protocolApplied) {
    this.protocolApplied = protocolApplied;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Immunization) {
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
    return "Immunization(" + id + ")";
  }
}
