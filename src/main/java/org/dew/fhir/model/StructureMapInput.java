package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Input</a>
 */
public
class StructureMapInput extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String mode;
  protected String documentation;
  protected String name;
  protected String type;
  
  public StructureMapInput()
  {
  }
  
  public String getMode() {
    return mode;
  }
  
  public void setMode(String mode) {
    this.mode = mode;
  }
  
  public String getDocumentation() {
    return documentation;
  }
  
  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapInput) {
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
    return "StructureMapInput(" + id + ")";
  }
}
