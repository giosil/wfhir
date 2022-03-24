package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An expression that describes applicability criteria or start/stop conditions for the action.
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.action.condition">PlanDefinition.action.condition</a>
 */
public 
class PlanDefinitionActionCondition extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7907207473324991665L;
  
  protected String kind;
  protected Expression expression;
  
  public PlanDefinitionActionCondition()
  {
  }

  public String getKind() {
    return kind;
  }

  public Expression getExpression() {
    return expression;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setExpression(Expression expression) {
    this.expression = expression;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionActionCondition) {
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
    return "PlanDefinitionActionCondition(" + id + "," + kind + "," + expression + ")";
  }
}
