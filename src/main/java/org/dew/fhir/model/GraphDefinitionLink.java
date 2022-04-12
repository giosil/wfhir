package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 *
 * @see <a href="https://www.hl7.org/fhir">GraphDefinition_Link</a>
 */
public
class GraphDefinitionLink extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String max;
  protected String description;
  protected GraphDefinitionTarget[] target;
  protected String path;
  protected String sliceName;
  protected Integer min;
  
  public GraphDefinitionLink()
  {
  }
  
  public String getMax() {
    return max;
  }
  
  public void setMax(String max) {
    this.max = max;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public GraphDefinitionTarget[] getTarget() {
    return target;
  }
  
  public void setTarget(GraphDefinitionTarget[] target) {
    this.target = target;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setPath(String path) {
    this.path = path;
  }
  
  public String getSliceName() {
    return sliceName;
  }
  
  public void setSliceName(String sliceName) {
    this.sliceName = sliceName;
  }
  
  public Integer getMin() {
    return min;
  }
  
  public void setMin(Integer min) {
    this.min = min;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof GraphDefinitionLink) {
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
    return "GraphDefinitionLink(" + id + ")";
  }
}
