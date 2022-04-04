package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Used to define the parts of a composite search parameter.
 *
 * @see <a href="https://www.hl7.org/fhir/searchparameter-definitions.html#SearchParameter.component">SearchParameter.component</a>
 */
public 
class SearchParameterComponent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -8243827254082024648L;
  
  protected String definition;
  protected String expression;
  
  public SearchParameterComponent()
  {
  }

  public String getDefinition() {
    return definition;
  }

  public String getExpression() {
    return expression;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SearchParameterComponent) {
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
    return "SearchParameterComponent(" + id + "," + definition + "," + expression + ")";
  }
}
