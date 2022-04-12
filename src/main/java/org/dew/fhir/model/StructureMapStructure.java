package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Structure</a>
 */
public
class StructureMapStructure extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String mode;
  protected String documentation;
  protected String alias;
  protected String url;
  
  public StructureMapStructure()
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
  
  public String getAlias() {
    return alias;
  }
  
  public void setAlias(String alias) {
    this.alias = alias;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapStructure) {
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
    return "StructureMapStructure(" + id + ")";
  }
}
