package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
 *
 * @see <a href="https://www.hl7.org/fhir">ChargeItemDefinition_Applicability</a>
 */
public
class ChargeItemDefinitionApplicability extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String expression;
  protected String description;
  
  public ChargeItemDefinitionApplicability()
  {
  }
  
  public String getExpression() {
    return expression;
  }
  
  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ChargeItemDefinitionApplicability) {
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
    return "ChargeItemDefinitionApplicability(" + id + ")";
  }
}
