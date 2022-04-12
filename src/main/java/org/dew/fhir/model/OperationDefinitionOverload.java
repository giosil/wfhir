package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 *
 * @see <a href="https://www.hl7.org/fhir">OperationDefinition_Overload</a>
 */
public
class OperationDefinitionOverload extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String comment;
  protected String[] parameterName;
  
  public OperationDefinitionOverload()
  {
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public String[] getParameterName() {
    return parameterName;
  }
  
  public void setParameterName(String[] parameterName) {
    this.parameterName = parameterName;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationDefinitionOverload) {
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
    return "OperationDefinitionOverload(" + id + ")";
  }
}
