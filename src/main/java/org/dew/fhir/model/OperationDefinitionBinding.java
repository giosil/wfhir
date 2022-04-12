package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 *
 * @see <a href="https://www.hl7.org/fhir">OperationDefinition_Binding</a>
 */
public
class OperationDefinitionBinding extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String valueSet;
  protected String strength;
  
  public OperationDefinitionBinding()
  {
  }
  
  public String getValueSet() {
    return valueSet;
  }
  
  public void setValueSet(String valueSet) {
    this.valueSet = valueSet;
  }
  
  public String getStrength() {
    return strength;
  }
  
  public void setStrength(String strength) {
    this.strength = strength;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationDefinitionBinding) {
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
    return "OperationDefinitionBinding(" + id + ")";
  }
}
