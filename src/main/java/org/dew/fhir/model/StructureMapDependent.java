package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Dependent</a>
 */
public
class StructureMapDependent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String name;
  protected String[] variable;
  
  public StructureMapDependent()
  {
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String[] getVariable() {
    return variable;
  }
  
  public void setVariable(String[] variable) {
    this.variable = variable;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapDependent) {
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
    return "StructureMapDependent(" + id + ")";
  }
}
