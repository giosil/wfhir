package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 *
 * @see <a href="https://www.hl7.org/fhir/invoice.html">Invoice</a>
 */
public 
class Invoice extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -6262448748018678773L;
  
  protected Identifier[] identifier;
  protected String status;
  protected String cancelledReason;
  protected CodeableConcept type;
  protected Reference<Resource> subject;
  protected Reference<Resource> recipient;
  protected Date date;
  protected InvoiceParticipant[] participant;
  protected Reference<Organization> issuer;
  protected Reference<Account> account;
  protected InvoiceLineItem[] lineItem;
  protected InvoicePriceComponent[] totalPriceComponent;
  protected Money totalNet;
  protected Money totalGross;
  protected String paymentTerms;
  protected Annotation[] note;
  
  public Invoice()
  {
    this.resourceType = "Invoice";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public String getCancelledReason() {
    return cancelledReason;
  }

  public CodeableConcept getType() {
    return type;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Resource> getRecipient() {
    return recipient;
  }

  public Date getDate() {
    return date;
  }

  public InvoiceParticipant[] getParticipant() {
    return participant;
  }

  public Reference<Organization> getIssuer() {
    return issuer;
  }

  public Reference<Account> getAccount() {
    return account;
  }

  public InvoiceLineItem[] getLineItem() {
    return lineItem;
  }

  public InvoicePriceComponent[] getTotalPriceComponent() {
    return totalPriceComponent;
  }

  public Money getTotalNet() {
    return totalNet;
  }

  public Money getTotalGross() {
    return totalGross;
  }

  public String getPaymentTerms() {
    return paymentTerms;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCancelledReason(String cancelledReason) {
    this.cancelledReason = cancelledReason;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setRecipient(Reference<Resource> recipient) {
    this.recipient = recipient;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setParticipant(InvoiceParticipant[] participant) {
    this.participant = participant;
  }

  public void setIssuer(Reference<Organization> issuer) {
    this.issuer = issuer;
  }

  public void setAccount(Reference<Account> account) {
    this.account = account;
  }

  public void setLineItem(InvoiceLineItem[] lineItem) {
    this.lineItem = lineItem;
  }

  public void setTotalPriceComponent(InvoicePriceComponent[] totalPriceComponent) {
    this.totalPriceComponent = totalPriceComponent;
  }

  public void setTotalNet(Money totalNet) {
    this.totalNet = totalNet;
  }

  public void setTotalGross(Money totalGross) {
    this.totalGross = totalGross;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Invoice) {
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
    return "Invoice(" + id + ")";
  }
}
