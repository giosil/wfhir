package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data types (string, uri).
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.binding">ElementDefinition.binding</a>
 */
public 
class ElementDefinitionBinding extends Element implements Serializable 
{
  private static final long serialVersionUID = -3983842160279656855L;
  
  protected String strength;
  protected String description;
  protected String valueSet;
  
  public ElementDefinitionBinding()
  {
  }

  public String getStrength() {
    return strength;
  }

  public String getDescription() {
    return description;
  }

  public String getValueSet() {
    return valueSet;
  }

  public void setStrength(String strength) {
    this.strength = strength;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setValueSet(String valueSet) {
    this.valueSet = valueSet;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionConstraint) {
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
    return "ElementDefinitionConstraint(" + id + ")";
  }
}
