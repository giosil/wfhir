package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Each line item represents one charge for goods and services rendered. 
 * Details such as date, code and amount are found in the referenced ChargeItem resource.
 *
 * @see <a href="https://www.hl7.org/fhir/invoice-definitions.html#Invoice.lineItem">Invoice.lineItem</a>
 */
public 
class InvoiceLineItem extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -825362157184010659L;
  
  protected Integer sequence;
  protected Reference<ChargeItem> chargeItemReference;
  protected CodeableConcept chargeItemCodeableConcept;
  protected InvoiceLineItemPriceComponent[] priceComponent;
  
  public InvoiceLineItem()
  {
  }
  
  public InvoiceLineItem(int sequence)
  {
    this.sequence = sequence;
  }
  
  public InvoiceLineItem(int sequence, Reference<ChargeItem> chargeItemReference)
  {
    this.sequence = sequence;
    this.chargeItemReference = chargeItemReference;
  }

  public InvoiceLineItem(int sequence, CodeableConcept chargeItemCodeableConcept)
  {
    this.sequence = sequence;
    this.chargeItemCodeableConcept = chargeItemCodeableConcept;
  }

  public Integer getSequence() {
    return sequence;
  }

  public Reference<ChargeItem> getChargeItemReference() {
    return chargeItemReference;
  }

  public CodeableConcept getChargeItemCodeableConcept() {
    return chargeItemCodeableConcept;
  }

  public InvoiceLineItemPriceComponent[] getPriceComponent() {
    return priceComponent;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public void setChargeItemReference(Reference<ChargeItem> chargeItemReference) {
    this.chargeItemReference = chargeItemReference;
  }

  public void setChargeItemCodeableConcept(CodeableConcept chargeItemCodeableConcept) {
    this.chargeItemCodeableConcept = chargeItemCodeableConcept;
  }

  public void setPriceComponent(InvoiceLineItemPriceComponent[] priceComponent) {
    this.priceComponent = priceComponent;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InvoiceLineItem) {
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
    return "InvoiceLineItem(" + id + "," + sequence + "," + chargeItemReference + "," + chargeItemCodeableConcept + ")";
  }
}
