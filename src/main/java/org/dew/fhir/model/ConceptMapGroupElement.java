package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Mappings for an individual concept in the source to one or more concepts in the target.
 *
 * @see <a href="https://www.hl7.org/fhir/conceptmap-definitions.html#ConceptMap.group.element">ConceptMap.group.element</a>
 */
public 
class ConceptMapGroupElement extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -15562734283764968L;
  
  protected String code;
  protected String display;
  protected ConceptMapGroupElementTarget[] target;
  
  public ConceptMapGroupElement()
  {
  }

  public String getCode() {
    return code;
  }

  public String getDisplay() {
    return display;
  }

  public ConceptMapGroupElementTarget[] getTarget() {
    return target;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setTarget(ConceptMapGroupElementTarget[] target) {
    this.target = target;
  }
  
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConceptMapGroupElement) {
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
    return "ConceptMapGroupElement(" + id + "," + code + ")";
  }
}
