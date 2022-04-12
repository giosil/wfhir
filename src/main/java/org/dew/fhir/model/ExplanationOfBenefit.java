package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit</a>
 */
public
class ExplanationOfBenefit extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ExplanationOfBenefitInsurance[] insurance;
  protected Period benefitPeriod;
  protected Reference<Resource> claimResponse;
  protected String use;
  protected String[] preAuthRef;
  protected CodeableConcept type;
  protected Integer precedence;
  protected ExplanationOfBenefitProcessNote[] processNote;
  protected ExplanationOfBenefitPayee payee;
  protected ExplanationOfBenefitSupportingInfo[] supportingInfo;
  protected Reference<Resource> enterer;
  protected Reference<Resource> claim;
  protected ExplanationOfBenefitPayment payment;
  protected ExplanationOfBenefitCareTeam[] careTeam;
  protected Identifier[] identifier;
  protected ExplanationOfBenefitItem[] item;
  protected Date created;
  protected ExplanationOfBenefitDiagnosis[] diagnosis;
  protected CodeableConcept priority;
  protected Period[] preAuthRefPeriod;
  protected Period billablePeriod;
  protected CodeableConcept subType;
  protected String status;
  protected ExplanationOfBenefitBenefitBalance[] benefitBalance;
  protected ExplanationOfBenefitAccident accident;
  protected ExplanationOfBenefitAdjudication[] adjudication;
  protected ExplanationOfBenefitAddItem[] addItem;
  protected ExplanationOfBenefitTotal[] total;
  protected ExplanationOfBenefitRelated[] related;
  protected Reference<Resource> provider;
  protected CodeableConcept fundsReserveRequested;
  protected CodeableConcept fundsReserve;
  protected Reference<Resource> patient;
  protected Reference<Resource> insurer;
  protected String outcome;
  protected CodeableConcept formCode;
  protected Reference<Resource> originalPrescription;
  protected ExplanationOfBenefitProcedure[] procedure;
  protected String disposition;
  protected Reference<Resource> referral;
  protected Attachment form;
  protected Reference<Resource> prescription;
  protected Reference<Resource> facility;
  
  public ExplanationOfBenefit()
  {
    this.resourceType = "ExplanationOfBenefit";
  }
  
  public ExplanationOfBenefitInsurance[] getInsurance() {
    return insurance;
  }
  
  public void setInsurance(ExplanationOfBenefitInsurance[] insurance) {
    this.insurance = insurance;
  }
  
  public Period getBenefitPeriod() {
    return benefitPeriod;
  }
  
  public void setBenefitPeriod(Period benefitPeriod) {
    this.benefitPeriod = benefitPeriod;
  }
  
  public Reference<Resource> getClaimResponse() {
    return claimResponse;
  }
  
  public void setClaimResponse(Reference<Resource> claimResponse) {
    this.claimResponse = claimResponse;
  }
  
  public String getUse() {
    return use;
  }
  
  public void setUse(String use) {
    this.use = use;
  }
  
  public String[] getPreAuthRef() {
    return preAuthRef;
  }
  
  public void setPreAuthRef(String[] preAuthRef) {
    this.preAuthRef = preAuthRef;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Integer getPrecedence() {
    return precedence;
  }
  
  public void setPrecedence(Integer precedence) {
    this.precedence = precedence;
  }
  
  public ExplanationOfBenefitProcessNote[] getProcessNote() {
    return processNote;
  }
  
  public void setProcessNote(ExplanationOfBenefitProcessNote[] processNote) {
    this.processNote = processNote;
  }
  
  public ExplanationOfBenefitPayee getPayee() {
    return payee;
  }
  
  public void setPayee(ExplanationOfBenefitPayee payee) {
    this.payee = payee;
  }
  
  public ExplanationOfBenefitSupportingInfo[] getSupportingInfo() {
    return supportingInfo;
  }
  
  public void setSupportingInfo(ExplanationOfBenefitSupportingInfo[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }
  
  public Reference<Resource> getEnterer() {
    return enterer;
  }
  
  public void setEnterer(Reference<Resource> enterer) {
    this.enterer = enterer;
  }
  
  public Reference<Resource> getClaim() {
    return claim;
  }
  
  public void setClaim(Reference<Resource> claim) {
    this.claim = claim;
  }
  
  public ExplanationOfBenefitPayment getPayment() {
    return payment;
  }
  
  public void setPayment(ExplanationOfBenefitPayment payment) {
    this.payment = payment;
  }
  
  public ExplanationOfBenefitCareTeam[] getCareTeam() {
    return careTeam;
  }
  
  public void setCareTeam(ExplanationOfBenefitCareTeam[] careTeam) {
    this.careTeam = careTeam;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public ExplanationOfBenefitItem[] getItem() {
    return item;
  }
  
  public void setItem(ExplanationOfBenefitItem[] item) {
    this.item = item;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public ExplanationOfBenefitDiagnosis[] getDiagnosis() {
    return diagnosis;
  }
  
  public void setDiagnosis(ExplanationOfBenefitDiagnosis[] diagnosis) {
    this.diagnosis = diagnosis;
  }
  
  public CodeableConcept getPriority() {
    return priority;
  }
  
  public void setPriority(CodeableConcept priority) {
    this.priority = priority;
  }
  
  public Period[] getPreAuthRefPeriod() {
    return preAuthRefPeriod;
  }
  
  public void setPreAuthRefPeriod(Period[] preAuthRefPeriod) {
    this.preAuthRefPeriod = preAuthRefPeriod;
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
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public ExplanationOfBenefitBenefitBalance[] getBenefitBalance() {
    return benefitBalance;
  }
  
  public void setBenefitBalance(ExplanationOfBenefitBenefitBalance[] benefitBalance) {
    this.benefitBalance = benefitBalance;
  }
  
  public ExplanationOfBenefitAccident getAccident() {
    return accident;
  }
  
  public void setAccident(ExplanationOfBenefitAccident accident) {
    this.accident = accident;
  }
  
  public ExplanationOfBenefitAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ExplanationOfBenefitAdjudication[] adjudication) {
    this.adjudication = adjudication;
  }
  
  public ExplanationOfBenefitAddItem[] getAddItem() {
    return addItem;
  }
  
  public void setAddItem(ExplanationOfBenefitAddItem[] addItem) {
    this.addItem = addItem;
  }
  
  public ExplanationOfBenefitTotal[] getTotal() {
    return total;
  }
  
  public void setTotal(ExplanationOfBenefitTotal[] total) {
    this.total = total;
  }
  
  public ExplanationOfBenefitRelated[] getRelated() {
    return related;
  }
  
  public void setRelated(ExplanationOfBenefitRelated[] related) {
    this.related = related;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public CodeableConcept getFundsReserveRequested() {
    return fundsReserveRequested;
  }
  
  public void setFundsReserveRequested(CodeableConcept fundsReserveRequested) {
    this.fundsReserveRequested = fundsReserveRequested;
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
  
  public String getOutcome() {
    return outcome;
  }
  
  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }
  
  public CodeableConcept getFormCode() {
    return formCode;
  }
  
  public void setFormCode(CodeableConcept formCode) {
    this.formCode = formCode;
  }
  
  public Reference<Resource> getOriginalPrescription() {
    return originalPrescription;
  }
  
  public void setOriginalPrescription(Reference<Resource> originalPrescription) {
    this.originalPrescription = originalPrescription;
  }
  
  public ExplanationOfBenefitProcedure[] getProcedure() {
    return procedure;
  }
  
  public void setProcedure(ExplanationOfBenefitProcedure[] procedure) {
    this.procedure = procedure;
  }
  
  public String getDisposition() {
    return disposition;
  }
  
  public void setDisposition(String disposition) {
    this.disposition = disposition;
  }
  
  public Reference<Resource> getReferral() {
    return referral;
  }
  
  public void setReferral(Reference<Resource> referral) {
    this.referral = referral;
  }
  
  public Attachment getForm() {
    return form;
  }
  
  public void setForm(Attachment form) {
    this.form = form;
  }
  
  public Reference<Resource> getPrescription() {
    return prescription;
  }
  
  public void setPrescription(Reference<Resource> prescription) {
    this.prescription = prescription;
  }
  
  public Reference<Resource> getFacility() {
    return facility;
  }
  
  public void setFacility(Reference<Resource> facility) {
    this.facility = facility;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefit) {
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
    return "ExplanationOfBenefit(" + id + ")";
  }
}
