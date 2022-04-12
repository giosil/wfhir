package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Group</a>
 */
public
class StructureMapGroup extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String documentation;
  protected StructureMapRule[] rule;
  protected String typeMode;
  protected StructureMapInput[] input;
  protected String extends_;
  protected String name;
  
  public StructureMapGroup()
  {
  }
  
  public String getDocumentation() {
    return documentation;
  }
  
  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  public StructureMapRule[] getRule() {
    return rule;
  }
  
  public void setRule(StructureMapRule[] rule) {
    this.rule = rule;
  }
  
  public String getTypeMode() {
    return typeMode;
  }
  
  public void setTypeMode(String typeMode) {
    this.typeMode = typeMode;
  }
  
  public StructureMapInput[] getInput() {
    return input;
  }
  
  public void setInput(StructureMapInput[] input) {
    this.input = input;
  }
  
  public String getExtends_() {
    return extends_;
  }
  
  public void setExtends_(String extends_) {
    this.extends_ = extends_;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapGroup) {
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
    return "StructureMapGroup(" + id + ")";
  }
}
