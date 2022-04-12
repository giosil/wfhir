package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim</a>
 */
public
class Claim extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ClaimInsurance[] insurance;
  protected String use;
  protected CodeableConcept type;
  protected ClaimAccident accident;
  protected ClaimPayee payee;
  protected Money total;
  protected ClaimRelated[] related;
  protected ClaimSupportingInfo[] supportingInfo;
  protected Reference<Resource> provider;
  protected CodeableConcept fundsReserve;
  protected Reference<Resource> patient;
  protected Reference<Resource> insurer;
  protected Reference<Resource> enterer;
  protected ClaimCareTeam[] careTeam;
  protected Identifier[] identifier;
  protected ClaimItem[] item;
  protected Date created;
  protected ClaimDiagnosis[] diagnosis;
  protected Reference<Resource> originalPrescription;
  protected ClaimProcedure[] procedure;
  protected CodeableConcept priority;
  protected Reference<Resource> referral;
  protected Reference<Resource> prescription;
  protected Period billablePeriod;
  protected CodeableConcept subType;
  protected Reference<Resource> facility;
  protected String status;
  
  public Claim()
  {
    this.resourceType = "Claim";
  }
  
  public ClaimInsurance[] getInsurance() {
    return insurance;
  }
  
  public void setInsurance(ClaimInsurance[] insurance) {
    this.insurance = insurance;
  }
  
  public String getUse() {
    return use;
  }
  
  public void setUse(String use) {
    this.use = use;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public ClaimAccident getAccident() {
    return accident;
  }
  
  public void setAccident(ClaimAccident accident) {
    this.accident = accident;
  }
  
  public ClaimPayee getPayee() {
    return payee;
  }
  
  public void setPayee(ClaimPayee payee) {
    this.payee = payee;
  }
  
  public Money getTotal() {
    return total;
  }
  
  public void setTotal(Money total) {
    this.total = total;
  }
  
  public ClaimRelated[] getRelated() {
    return related;
  }
  
  public void setRelated(ClaimRelated[] related) {
    this.related = related;
  }
  
  public ClaimSupportingInfo[] getSupportingInfo() {
    return supportingInfo;
  }
  
  public void setSupportingInfo(ClaimSupportingInfo[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public CodeableConcept getFundsReserve() {
    return fundsReserve;
  }
  
  public void setFundsReserve(CodeableConcept fundsReserve) {
    this.fundsReserve = fundsReserve;
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
  
  public ClaimCareTeam[] getCareTeam() {
    return careTeam;
  }
  
  public void setCareTeam(ClaimCareTeam[] careTeam) {
    this.careTeam = careTeam;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public ClaimItem[] getItem() {
    return item;
  }
  
  public void setItem(ClaimItem[] item) {
    this.item = item;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public ClaimDiagnosis[] getDiagnosis() {
    return diagnosis;
  }
  
  public void setDiagnosis(ClaimDiagnosis[] diagnosis) {
    this.diagnosis = diagnosis;
  }
  
  public Reference<Resource> getOriginalPrescription() {
    return originalPrescription;
  }
  
  public void setOriginalPrescription(Reference<Resource> originalPrescription) {
    this.originalPrescription = originalPrescription;
  }
  
  public ClaimProcedure[] getProcedure() {
    return procedure;
  }
  
  public void setProcedure(ClaimProcedure[] procedure) {
    this.procedure = procedure;
  }
  
  public CodeableConcept getPriority() {
    return priority;
  }
  
  public void setPriority(CodeableConcept priority) {
    this.priority = priority;
  }
  
  public Reference<Resource> getReferral() {
    return referral;
  }
  
  public void setReferral(Reference<Resource> referral) {
    this.referral = referral;
  }
  
  public Reference<Resource> getPrescription() {
    return prescription;
  }
  
  public void setPrescription(Reference<Resource> prescription) {
    this.prescription = prescription;
  }
  
  public Period getBillablePeriod() {
    return billablePeriod;
  }
  
  public void setBillablePeriod(Period billablePeriod) {
    this.billablePeriod = billablePeriod;
  }
  
  public CodeableConcept getSubType() {
    return subType;
  }
  
  public void setSubType(CodeableConcept subType) {
    this.subType = subType;
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
    if(object instanceof Claim) {
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
    return "Claim(" + id + ")";
  }
}
