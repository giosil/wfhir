package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Customizations that should be applied to the statically defined resource. 
 * For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.action.dynamicValue">PlanDefinition.action.dynamicValue</a>
 */
public 
class PlanDefinitionActionDynamicValue extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6115477019593054088L;
  
  protected String path;
  protected Expression expression;
  
  public PlanDefinitionActionDynamicValue()
  {
  }

  public String getPath() {
    return path;
  }

  public Expression getExpression() {
    return expression;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setExpression(Expression expression) {
    this.expression = expression;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionActionDynamicValue) {
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
    return "PlanDefinitionActionDynamicValue(" + id + "," + path + "," + expression + ")";
  }
}
