package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_Total</a>
 */
public
class ExplanationOfBenefitTotal extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money amount;
  protected CodeableConcept category;
  
  public ExplanationOfBenefitTotal()
  {
  }
  
  public Money getAmount() {
    return amount;
  }
  
  public void setAmount(Money amount) {
    this.amount = amount;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitTotal) {
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
    return "ExplanationOfBenefitTotal(" + id + ")";
  }
}
