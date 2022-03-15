package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information about the base definition of the element, provided to make it unnecessary for tools to trace the deviation of the element through the derived and related profiles. 
 * When the element definition is not the original definition of an element - i.g. either in a constraint on another type, or for elements from a super type in a snap shot - then the information in provided in the element definition may be different to the base definition. 
 * On the original definition of the element, it will be same.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.base">ElementDefinition.base</a>
 */
public 
class ElementDefinitionBase extends Element implements Serializable
{
  private static final long serialVersionUID = 1808615589408891021L;
  
  protected String path;
  protected Integer min;
  protected String max;
  
  public ElementDefinitionBase()
  {
  }

  public String getPath() {
    return path;
  }

  public Integer getMin() {
    return min;
  }

  public String getMax() {
    return max;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public void setMax(String max) {
    this.max = max;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionBase) {
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
    return "ElementDefinitionBase(" + id + ")";
  }
}
