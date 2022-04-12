package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_Financial</a>
 */
public
class ExplanationOfBenefitFinancial extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money allowedMoney;
  protected String allowedString;
  protected Integer allowedUnsignedInt;
  protected Integer usedUnsignedInt;
  protected Money usedMoney;
  protected CodeableConcept type;
  
  public ExplanationOfBenefitFinancial()
  {
  }
  
  public Money getAllowedMoney() {
    return allowedMoney;
  }
  
  public void setAllowedMoney(Money allowedMoney) {
    this.allowedMoney = allowedMoney;
  }
  
  public String getAllowedString() {
    return allowedString;
  }
  
  public void setAllowedString(String allowedString) {
    this.allowedString = allowedString;
  }
  
  public Integer getAllowedUnsignedInt() {
    return allowedUnsignedInt;
  }
  
  public void setAllowedUnsignedInt(Integer allowedUnsignedInt) {
    this.allowedUnsignedInt = allowedUnsignedInt;
  }
  
  public Integer getUsedUnsignedInt() {
    return usedUnsignedInt;
  }
  
  public void setUsedUnsignedInt(Integer usedUnsignedInt) {
    this.usedUnsignedInt = usedUnsignedInt;
  }
  
  public Money getUsedMoney() {
    return usedMoney;
  }
  
  public void setUsedMoney(Money usedMoney) {
    this.usedMoney = usedMoney;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitFinancial) {
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
    return "ExplanationOfBenefitFinancial(" + id + ")";
  }
}
