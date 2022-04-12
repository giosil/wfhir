package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 *
 * @see <a href="https://www.hl7.org/fhir">Coverage_CostToBeneficiary</a>
 */
public
class CoverageCostToBeneficiary extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CoverageException[] exception;
  protected Money valueMoney;
  protected CodeableConcept type;
  protected Quantity valueQuantity;
  
  public CoverageCostToBeneficiary()
  {
  }
  
  public CoverageException[] getException() {
    return exception;
  }
  
  public void setException(CoverageException[] exception) {
    this.exception = exception;
  }
  
  public Money getValueMoney() {
    return valueMoney;
  }
  
  public void setValueMoney(Money valueMoney) {
    this.valueMoney = valueMoney;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Quantity getValueQuantity() {
    return valueQuantity;
  }
  
  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageCostToBeneficiary) {
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
    return "CoverageCostToBeneficiary(" + id + ")";
  }
}
