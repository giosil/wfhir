package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Rule</a>
 */
public
class StructureMapRule extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String documentation;
  protected String name;
  protected StructureMapRule[] rule;
  protected StructureMapSource[] source;
  protected StructureMapDependent[] dependent;
  protected StructureMapTarget[] target;
  
  public StructureMapRule()
  {
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
  
  public StructureMapRule[] getRule() {
    return rule;
  }
  
  public void setRule(StructureMapRule[] rule) {
    this.rule = rule;
  }
  
  public StructureMapSource[] getSource() {
    return source;
  }
  
  public void setSource(StructureMapSource[] source) {
    this.source = source;
  }
  
  public StructureMapDependent[] getDependent() {
    return dependent;
  }
  
  public void setDependent(StructureMapDependent[] dependent) {
    this.dependent = dependent;
  }
  
  public StructureMapTarget[] getTarget() {
    return target;
  }
  
  public void setTarget(StructureMapTarget[] target) {
    this.target = target;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapRule) {
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
    return "StructureMapRule(" + id + ")";
  }
}
