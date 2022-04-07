package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Contract Valued Item List.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.asset.valuedItem">Contract.term.asset.valuedItem</a>
 */
public 
class ContractTermAssetValuedItem extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1994780374684251544L;
  
  protected CodeableConcept entityCodeableConcept;
  protected Reference<Resource> entityReference;
  protected Identifier identifier;
  protected Date effectiveTime;
  protected SimpleQuantity quantity;
  protected Money unitPrice;
  protected Double factor;
  protected Double points;
  protected Money net;
  protected String payment;
  protected Date paymentDate;
  protected Reference<Resource> responsible;
  protected Reference<Resource> recipient;
  protected String[] linkId;
  protected Integer[] securityLabelNumber;
  
  public ContractTermAssetValuedItem()
  {
  }

  public CodeableConcept getEntityCodeableConcept() {
    return entityCodeableConcept;
  }

  public Reference<Resource> getEntityReference() {
    return entityReference;
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public Date getEffectiveTime() {
    return effectiveTime;
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public Money getUnitPrice() {
    return unitPrice;
  }

  public Double getFactor() {
    return factor;
  }

  public Double getPoints() {
    return points;
  }

  public Money getNet() {
    return net;
  }

  public String getPayment() {
    return payment;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public Reference<Resource> getResponsible() {
    return responsible;
  }

  public Reference<Resource> getRecipient() {
    return recipient;
  }

  public String[] getLinkId() {
    return linkId;
  }

  public Integer[] getSecurityLabelNumber() {
    return securityLabelNumber;
  }

  public void setEntityCodeableConcept(CodeableConcept entityCodeableConcept) {
    this.entityCodeableConcept = entityCodeableConcept;
  }

  public void setEntityReference(Reference<Resource> entityReference) {
    this.entityReference = entityReference;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setEffectiveTime(Date effectiveTime) {
    this.effectiveTime = effectiveTime;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(Money unitPrice) {
    this.unitPrice = unitPrice;
  }

  public void setFactor(Double factor) {
    this.factor = factor;
  }

  public void setPoints(Double points) {
    this.points = points;
  }

  public void setNet(Money net) {
    this.net = net;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public void setResponsible(Reference<Resource> responsible) {
    this.responsible = responsible;
  }

  public void setRecipient(Reference<Resource> recipient) {
    this.recipient = recipient;
  }

  public void setLinkId(String[] linkId) {
    this.linkId = linkId;
  }

  public void setSecurityLabelNumber(Integer[] securityLabelNumber) {
    this.securityLabelNumber = securityLabelNumber;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermAssetValuedItem) {
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
    return "ContractTermAssetValuedItem(" + id + "," + entityCodeableConcept + "," + entityReference + "," + identifier + ")";
  }
}
