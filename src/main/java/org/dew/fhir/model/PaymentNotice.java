package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
 *
 * @see <a href="https://www.hl7.org/fhir">PaymentNotice</a>
 */
public
class PaymentNotice extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> request;
  protected Reference<Resource> payee;
  protected Reference<Resource> provider;
  protected Reference<Resource> payment;
  protected CodeableConcept paymentStatus;
  protected Identifier[] identifier;
  protected Money amount;
  protected Date created;
  protected Reference<Resource> response;
  protected Reference<Resource> recipient;
  protected Date paymentDate;
  protected String status;
  
  public PaymentNotice()
  {
    this.resourceType = "PaymentNotice";
  }
  
  public Reference<Resource> getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource> request) {
    this.request = request;
  }
  
  public Reference<Resource> getPayee() {
    return payee;
  }
  
  public void setPayee(Reference<Resource> payee) {
    this.payee = payee;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public Reference<Resource> getPayment() {
    return payment;
  }
  
  public void setPayment(Reference<Resource> payment) {
    this.payment = payment;
  }
  
  public CodeableConcept getPaymentStatus() {
    return paymentStatus;
  }
  
  public void setPaymentStatus(CodeableConcept paymentStatus) {
    this.paymentStatus = paymentStatus;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Money getAmount() {
    return amount;
  }
  
  public void setAmount(Money amount) {
    this.amount = amount;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public Reference<Resource> getResponse() {
    return response;
  }
  
  public void setResponse(Reference<Resource> response) {
    this.response = response;
  }
  
  public Reference<Resource> getRecipient() {
    return recipient;
  }
  
  public void setRecipient(Reference<Resource> recipient) {
    this.recipient = recipient;
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
    if(object instanceof PaymentNotice) {
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
    return "PaymentNotice(" + id + ")";
  }
}
