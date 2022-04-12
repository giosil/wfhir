package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
 *
 * @see <a href="https://www.hl7.org/fhir">ChargeItemDefinition_PropertyGroup</a>
 */
public
class ChargeItemDefinitionPropertyGroup extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ChargeItemDefinitionApplicability[] applicability;
  protected ChargeItemDefinitionPriceComponent[] priceComponent;
  
  public ChargeItemDefinitionPropertyGroup()
  {
  }
  
  public ChargeItemDefinitionApplicability[] getApplicability() {
    return applicability;
  }
  
  public void setApplicability(ChargeItemDefinitionApplicability[] applicability) {
    this.applicability = applicability;
  }
  
  public ChargeItemDefinitionPriceComponent[] getPriceComponent() {
    return priceComponent;
  }
  
  public void setPriceComponent(ChargeItemDefinitionPriceComponent[] priceComponent) {
    this.priceComponent = priceComponent;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ChargeItemDefinitionPropertyGroup) {
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
    return "ChargeItemDefinitionPropertyGroup(" + id + ")";
  }
}
