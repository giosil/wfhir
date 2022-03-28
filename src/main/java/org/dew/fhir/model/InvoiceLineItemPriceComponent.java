package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. 
 * A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. 
 * The priceComponent element can be used to offer transparency to the recipient of the Invoice as to how the prices have been calculated.
 *
 * @see <a href="https://www.hl7.org/fhir/invoice-definitions.html#Invoice.lineItem.priceComponent">Invoice.lineItem.priceComponent</a>
 */
public 
class InvoiceLineItemPriceComponent extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -309155311050292697L;
  
  protected String type;
  protected CodeableConcept code;
  protected Double factor;
  protected Money amount;
  
  public InvoiceLineItemPriceComponent()
  {
  }

  public String getType() {
    return type;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Double getFactor() {
    return factor;
  }

  public Money getAmount() {
    return amount;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setFactor(Double factor) {
    this.factor = factor;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InvoiceLineItemPriceComponent) {
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
    return "InvoiceLineItemPriceComponent(" + id + "," + type + "," + code + ")";
  }
}
