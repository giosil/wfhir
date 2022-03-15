package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A sample value for this element demonstrating the type of information that would typically be found in the element.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.example">ElementDefinition.example</a>
 */
public 
class ElementDefinitionExample extends Element implements Serializable
{
  private static final long serialVersionUID = 1086866483273296702L;
  
  protected String label;
  protected String value;
  
  public ElementDefinitionExample()
  {
  }

  public String getLabel() {
    return label;
  }

  public String getValue() {
    return value;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionExample) {
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
    return "ElementDefinitionExample(" + id + ")";
  }
}
