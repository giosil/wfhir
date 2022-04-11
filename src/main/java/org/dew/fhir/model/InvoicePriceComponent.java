package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions. 
 * The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.
 *
 * @see <a href="https://www.hl7.org/fhir/invoice-definitions.html#Invoice.totalPriceComponent">Invoice.totalPriceComponent</a>
 */
public 
class InvoicePriceComponent extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1583455952756092188L;
  
  protected String type;
  protected CodeableConcept code;
  protected Double factor;
  protected Money amount;
  
  public InvoicePriceComponent()
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
    if(object instanceof InvoicePriceComponent) {
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
    return "InvoicePriceComponent(" + id + "," + type + "," + code + ")";
  }
}
