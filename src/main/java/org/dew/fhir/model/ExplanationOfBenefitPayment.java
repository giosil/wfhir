package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_Payment</a>
 */
public
class ExplanationOfBenefitPayment extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Identifier identifier;
  protected CodeableConcept adjustmentReason;
  protected Money amount;
  protected Money adjustment;
  protected CodeableConcept type;
  
  public ExplanationOfBenefitPayment()
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
  
  public CodeableConcept getAdjustmentReason() {
    return adjustmentReason;
  }
  
  public void setAdjustmentReason(CodeableConcept adjustmentReason) {
    this.adjustmentReason = adjustmentReason;
  }
  
  public Money getAmount() {
    return amount;
  }
  
  public void setAmount(Money amount) {
    this.amount = amount;
  }
  
  public Money getAdjustment() {
    return adjustment;
  }
  
  public void setAdjustment(Money adjustment) {
    this.adjustment = adjustment;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitPayment) {
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
    return "ExplanationOfBenefitPayment(" + id + ")";
  }
}
