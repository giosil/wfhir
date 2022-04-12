package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 *
 * @see <a href="https://www.hl7.org/fhir">PaymentReconciliation</a>
 */
public
class PaymentReconciliation extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> request;
  protected Money paymentAmount;
  protected PaymentReconciliationProcessNote[] processNote;
  protected String outcome;
  protected Identifier[] identifier;
  protected Period period;
  protected CodeableConcept formCode;
  protected Date created;
  protected Reference<Resource> requestor;
  protected Reference<Resource> paymentIssuer;
  protected String disposition;
  protected Identifier paymentIdentifier;
  protected PaymentReconciliationDetail[] detail;
  protected Date paymentDate;
  protected String status;
  
  public PaymentReconciliation()
  {
    this.resourceType = "PaymentReconciliation";
  }
  
  public Reference<Resource> getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource> request) {
    this.request = request;
  }
  
  public Money getPaymentAmount() {
    return paymentAmount;
  }
  
  public void setPaymentAmount(Money paymentAmount) {
    this.paymentAmount = paymentAmount;
  }
  
  public PaymentReconciliationProcessNote[] getProcessNote() {
    return processNote;
  }
  
  public void setProcessNote(PaymentReconciliationProcessNote[] processNote) {
    this.processNote = processNote;
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
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
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
  
  public Reference<Resource> getPaymentIssuer() {
    return paymentIssuer;
  }
  
  public void setPaymentIssuer(Reference<Resource> paymentIssuer) {
    this.paymentIssuer = paymentIssuer;
  }
  
  public String getDisposition() {
    return disposition;
  }
  
  public void setDisposition(String disposition) {
    this.disposition = disposition;
  }
  
  public Identifier getPaymentIdentifier() {
    return paymentIdentifier;
  }
  
  public void setPaymentIdentifier(Identifier paymentIdentifier) {
    this.paymentIdentifier = paymentIdentifier;
  }
  
  public PaymentReconciliationDetail[] getDetail() {
    return detail;
  }
  
  public void setDetail(PaymentReconciliationDetail[] detail) {
    this.detail = detail;
  }
  
  public Date getPaymentDate() {
    return paymentDate;
  }
  
  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PaymentReconciliation) {
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
    return "PaymentReconciliation(" + id + ")";
  }
}
