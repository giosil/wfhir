package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityResponse_Benefit</a>
 */
public
class CoverageEligibilityResponseBenefit extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String usedString;
  protected String allowedString;
  protected Integer allowedUnsignedInt;
  protected CodeableConcept type;
  protected Money allowedMoney;
  protected Integer usedUnsignedInt;
  protected Money usedMoney;
  
  public CoverageEligibilityResponseBenefit()
  {
  }
  
  public String getUsedString() {
    return usedString;
  }
  
  public void setUsedString(String usedString) {
    this.usedString = usedString;
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
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Money getAllowedMoney() {
    return allowedMoney;
  }
  
  public void setAllowedMoney(Money allowedMoney) {
    this.allowedMoney = allowedMoney;
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
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityResponseBenefit) {
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
    return "CoverageEligibilityResponseBenefit(" + id + ")";
  }
}
