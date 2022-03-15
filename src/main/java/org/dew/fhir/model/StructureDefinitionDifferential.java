package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
 *
 * @see <a href="https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.differential">StructureDefinition.differential</a>
 */
public 
class StructureDefinitionDifferential extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 5538329295842478666L;
  
  protected ElementDefinition[] element;
  
  public StructureDefinitionDifferential()
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
    if(object instanceof StructureDefinitionDifferential) {
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
    return "StructureDefinitionDifferential(" + id + ")";
  }
}
