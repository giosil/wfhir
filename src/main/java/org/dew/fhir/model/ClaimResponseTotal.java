package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Total</a>
 */
public
class ClaimResponseTotal extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money amount;
  protected CodeableConcept category;
  
  public ClaimResponseTotal()
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
    if(object instanceof ClaimResponseTotal) {
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
    return "ClaimResponseTotal(" + id + ")";
  }
}
