package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
 *
 * @see <a href="https://www.hl7.org/fhir">ChargeItemDefinition_PriceComponent</a>
 */
public
class ChargeItemDefinitionPriceComponent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money amount;
  protected CodeableConcept code;
  protected String type;
  protected Double factor;
  
  public ChargeItemDefinitionPriceComponent()
  {
  }
  
  public Money getAmount() {
    return amount;
  }
  
  public void setAmount(Money amount) {
    this.amount = amount;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public Double getFactor() {
    return factor;
  }
  
  public void setFactor(Double factor) {
    this.factor = factor;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ChargeItemDefinitionPriceComponent) {
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
    return "ChargeItemDefinitionPriceComponent(" + id + ")";
  }
}
