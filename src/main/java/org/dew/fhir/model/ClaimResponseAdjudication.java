package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Adjudication</a>
 */
public
class ClaimResponseAdjudication extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept reason;
  protected Money amount;
  protected CodeableConcept category;
  protected Double value;
  
  public ClaimResponseAdjudication()
  {
  }
  
  public CodeableConcept getReason() {
    return reason;
  }
  
  public void setReason(CodeableConcept reason) {
    this.reason = reason;
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
  
  public Double getValue() {
    return value;
  }
  
  public void setValue(Double value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseAdjudication) {
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
    return "ClaimResponseAdjudication(" + id + ")";
  }
}
