package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 *
 * @see <a href="https://www.hl7.org/fhir">RequestGroup_Condition</a>
 */
public
class RequestGroupCondition extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Expression expression;
  protected String kind;
  
  public RequestGroupCondition()
  {
  }
  
  public Expression getExpression() {
    return expression;
  }
  
  public void setExpression(Expression expression) {
    this.expression = expression;
  }
  
  public String getKind() {
    return kind;
  }
  
  public void setKind(String kind) {
    this.kind = kind;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RequestGroupCondition) {
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
    return "RequestGroupCondition(" + id + ")";
  }
}
