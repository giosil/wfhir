package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A snapshot view is expressed in a standalone form that can be used and interpreted without considering the base StructureDefinition.
 *
 * @see <a href="https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.snapshot">StructureDefinition.snapshot</a>
 */
public 
class StructureDefinitionSnapshot extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 664638475647332822L;
  
  protected ElementDefinition[] element;
  
  public StructureDefinitionSnapshot()
  {
  }

  public ElementDefinition[] getElement() {
    return element;
  }

  public void setElement(ElementDefinition[] element) {
    this.element = element;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureDefinitionSnapshot) {
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
    return "StructureDefinitionSnapshot(" + id + ")";
  }
}
