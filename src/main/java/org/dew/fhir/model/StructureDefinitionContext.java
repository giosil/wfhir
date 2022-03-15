package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies the types of resource or data type elements to which the extension can be applied.
 *
 * @see <a href="https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.context">StructureDefinition.context</a>
 */
public 
class StructureDefinitionContext extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 5892550356760674751L;
  
  protected String type;
  protected String expression;
  
  public StructureDefinitionContext()
  {
  }

  public String getType() {
    return type;
  }

  public String getExpression() {
    return expression;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureDefinitionContext) {
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
    return "StructureDefinitionContext(" + id + ")";
  }
}
