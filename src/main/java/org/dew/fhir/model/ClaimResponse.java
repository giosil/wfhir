package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse</a>
 */
public
class ClaimResponse extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ClaimResponseInsurance[] insurance;
  protected Reference<Resource> request;
  protected String use;
  protected CodeableConcept payeeType;
  protected String preAuthRef;
  protected CodeableConcept type;
  protected ClaimResponseError[] error;
  protected ClaimResponseProcessNote[] processNote;
  protected ClaimResponseAdjudication[] adjudication;
  protected ClaimResponseAddItem[] addItem;
  protected ClaimResponseTotal[] total;
  protected CodeableConcept fundsReserve;
  protected Reference<Resource> patient;
  protected Reference<Resource> insurer;
  protected Reference<Resource>[] communicationRequest;
  protected ClaimResponsePayment payment;
  protected String outcome;
  protected Identifier[] identifier;
  protected Period preAuthPeriod;
  protected ClaimResponseItem[] item;
  protected CodeableConcept formCode;
  protected Date created;
  protected Reference<Resource> requestor;
  protected String disposition;
  protected Attachment form;
  protected CodeableConcept subType;
  protected String status;
  
  public ClaimResponse()
  {
    this.resourceType = "ClaimResponse";
  }
  
  public ClaimResponseInsurance[] getInsurance() {
    return insurance;
  }
  
  public void setInsurance(ClaimResponseInsurance[] insurance) {
    this.insurance = insurance;
  }
  
  public Reference<Resource> getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource> request) {
    this.request = request;
  }
  
  public String getUse() {
    return use;
  }
  
  public void setUse(String use) {
    this.use = use;
  }
  
  public CodeableConcept getPayeeType() {
    return payeeType;
  }
  
  public void setPayeeType(CodeableConcept payeeType) {
    this.payeeType = payeeType;
  }
  
  public String getPreAuthRef() {
    return preAuthRef;
  }
  
  public void setPreAuthRef(String preAuthRef) {
    this.preAuthRef = preAuthRef;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public ClaimResponseError[] getError() {
    return error;
  }
  
  public void setError(ClaimResponseError[] error) {
    this.error = error;
  }
  
  public ClaimResponseProcessNote[] getProcessNote() {
    return processNote;
  }
  
  public void setProcessNote(ClaimResponseProcessNote[] processNote) {
    this.processNote = processNote;
  }
  
  public ClaimResponseAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ClaimResponseAdjudication[] adjudication) {
    this.adjudication = adjudication;
  }
  
  public ClaimResponseAddItem[] getAddItem() {
    return addItem;
  }
  
  public void setAddItem(ClaimResponseAddItem[] addItem) {
    this.addItem = addItem;
  }
  
  public ClaimResponseTotal[] getTotal() {
    return total;
  }
  
  public void setTotal(ClaimResponseTotal[] total) {
    this.total = total;
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
  
  public Reference<Resource>[] getCommunicationRequest() {
    return communicationRequest;
  }
  
  public void setCommunicationRequest(Reference<Resource>[] communicationRequest) {
    this.communicationRequest = communicationRequest;
  }
  
  public ClaimResponsePayment getPayment() {
    return payment;
  }
  
  public void setPayment(ClaimResponsePayment payment) {
    this.payment = payment;
  }
  
  public String getOutcome() {
    return outcome;
  }
  
  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Period getPreAuthPeriod() {
    return preAuthPeriod;
  }
  
  public void setPreAuthPeriod(Period preAuthPeriod) {
    this.preAuthPeriod = preAuthPeriod;
  }
  
  public ClaimResponseItem[] getItem() {
    return item;
  }
  
  public void setItem(ClaimResponseItem[] item) {
    this.item = item;
  }
  
  public CodeableConcept getFormCode() {
    return formCode;
  }
  
  public void setFormCode(CodeableConcept formCode) {
    this.formCode = formCode;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public Reference<Resource> getRequestor() {
    return requestor;
  }
  
  public void setRequestor(Reference<Resource> requestor) {
    this.requestor = requestor;
  }
  
  public String getDisposition() {
    return disposition;
  }
  
  public void setDisposition(String disposition) {
    this.disposition = disposition;
  }
  
  public Attachment getForm() {
    return form;
  }
  
  public void setForm(Attachment form) {
    this.form = form;
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
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponse) {
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
    return "ClaimResponse(" + id + ")";
  }
}
