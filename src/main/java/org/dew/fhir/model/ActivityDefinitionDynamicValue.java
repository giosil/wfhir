package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource. 
 * For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.
 *
 * @see <a href="https://www.hl7.org/fhir/activitydefinition-definitions.html#ActivityDefinition.dynamicValue">ActivityDefinition.dynamicValue</a>
 */
public 
class ActivityDefinitionDynamicValue extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -9191395887727162089L;
  
  protected String path;
  protected Expression expression;
  
  public ActivityDefinitionDynamicValue()
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
    if(object instanceof ActivityDefinitionDynamicValue) {
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
    return "ActivityDefinitionDynamicValue(" + id + ")";
  }
}
