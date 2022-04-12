package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 *
 * @see <a href="https://www.hl7.org/fhir">GraphDefinition_Compartment</a>
 */
public
class GraphDefinitionCompartment extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String code;
  protected String expression;
  protected String use;
  protected String rule;
  protected String description;
  
  public GraphDefinitionCompartment()
  {
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getExpression() {
    return expression;
  }
  
  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  public String getUse() {
    return use;
  }
  
  public void setUse(String use) {
    this.use = use;
  }
  
  public String getRule() {
    return rule;
  }
  
  public void setRule(String rule) {
    this.rule = rule;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof GraphDefinitionCompartment) {
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
    return "GraphDefinitionCompartment(" + id + ")";
  }
}
