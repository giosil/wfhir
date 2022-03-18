package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
 *
 * @see <a href="https://www.hl7.org/fhir/conceptmap-definitions.html#ConceptMap.group.element.target.dependsOn">ConceptMap.group.element.target.dependsOn</a>
 */
public 
class ConceptMapGroupElementTargetDependsOn extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8183911771924935323L;
  
  protected String property;
  protected String system;
  protected String value;
  protected String display;
  
  protected ConceptMapGroupElementTargetDependsOn()
  {
  }

  public String getProperty() {
    return property;
  }

  public String getSystem() {
    return system;
  }

  public String getValue() {
    return value;
  }

  public String getDisplay() {
    return display;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setDisplay(String display) {
    this.display = display;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConceptMapGroupElementTargetDependsOn) {
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
    return "ConceptMapGroupElementTargetDependsOn(" + id + "," + property + "," + system + "," + value + ")";
  }
}
