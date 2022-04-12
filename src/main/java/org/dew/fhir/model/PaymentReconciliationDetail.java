package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 *
 * @see <a href="https://www.hl7.org/fhir">PaymentReconciliation_Detail</a>
 */
public
class PaymentReconciliationDetail extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Identifier identifier;
  protected Reference<Resource> request;
  protected Reference<Resource> submitter;
  protected Money amount;
  protected Identifier predecessor;
  protected CodeableConcept type;
  protected Reference<Resource> payee;
  protected Reference<Resource> response;
  protected Reference<Resource> responsible;
  
  public PaymentReconciliationDetail()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource> getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource> request) {
    this.request = request;
  }
  
  public Reference<Resource> getSubmitter() {
    return submitter;
  }
  
  public void setSubmitter(Reference<Resource> submitter) {
    this.submitter = submitter;
  }
  
  public Money getAmount() {
    return amount;
  }
  
  public void setAmount(Money amount) {
    this.amount = amount;
  }
  
  public Identifier getPredecessor() {
    return predecessor;
  }
  
  public void setPredecessor(Identifier predecessor) {
    this.predecessor = predecessor;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Reference<Resource> getPayee() {
    return payee;
  }
  
  public void setPayee(Reference<Resource> payee) {
    this.payee = payee;
  }
  
  public Reference<Resource> getResponse() {
    return response;
  }
  
  public void setResponse(Reference<Resource> response) {
    this.response = response;
  }
  
  public Reference<Resource> getResponsible() {
    return responsible;
  }
  
  public void setResponsible(Reference<Resource> responsible) {
    this.responsible = responsible;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PaymentReconciliationDetail) {
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
    return "PaymentReconciliationDetail(" + id + ")";
  }
}
