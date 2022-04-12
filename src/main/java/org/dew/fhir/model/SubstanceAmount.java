package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * SubstanceAmount bean.
 *
 * @see <a href="http://www.hl7.org/fhir/substanceamount.html">SubstanceAmount</a>
 */
public 
class SubstanceAmount extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 974896824677024883L;
  
  protected Quantity amountQuantity;
  protected Range amountRange;
  protected String amountString;
  protected CodeableConcept amountType;
  protected String amountText;
  protected SubstanceAmountReferenceRange referenceRange;
  
  public SubstanceAmount()
  {
  }

  public Quantity getAmountQuantity() {
    return amountQuantity;
  }

  public Range getAmountRange() {
    return amountRange;
  }

  public String getAmountString() {
    return amountString;
  }

  public CodeableConcept getAmountType() {
    return amountType;
  }

  public String getAmountText() {
    return amountText;
  }

  public SubstanceAmountReferenceRange getReferenceRange() {
    return referenceRange;
  }

  public void setAmountQuantity(Quantity amountQuantity) {
    this.amountQuantity = amountQuantity;
  }

  public void setAmountRange(Range amountRange) {
    this.amountRange = amountRange;
  }

  public void setAmountString(String amountString) {
    this.amountString = amountString;
  }

  public void setAmountType(CodeableConcept amountType) {
    this.amountType = amountType;
  }

  public void setAmountText(String amountText) {
    this.amountText = amountText;
  }

  public void setReferenceRange(SubstanceAmountReferenceRange referenceRange) {
    this.referenceRange = referenceRange;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MarketingStatus) {
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
    return "SubstanceAmount(" + id + "," + amountQuantity + "," + amountType + ")";
  }
}
