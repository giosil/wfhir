package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Designates which child elements are used to discriminate between the slices when processing an instance. 
 * If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.slicing.discriminator">ElementDefinition.slicing.discriminator</a>
 */
public 
class ElementDefinitionSlicingDiscriminator extends Element implements Serializable 
{
  private static final long serialVersionUID = 1563005529515763708L;
  
  protected String type;
  protected String path;
  
  public ElementDefinitionSlicingDiscriminator()
  {
  }

  public String getType() {
    return type;
  }

  public String getPath() {
    return path;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setPath(String path) {
    this.path = path;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionSlicingDiscriminator) {
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
    return "ElementDefinitionSlicingDiscriminator(" + id + ")";
  }
}
