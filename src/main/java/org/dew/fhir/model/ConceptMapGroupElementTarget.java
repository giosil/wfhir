package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A concept from the target value set that this concept maps to.
 *
 * @see <a href="https://www.hl7.org/fhir/conceptmap-definitions.html#ConceptMap.group.element.target">ConceptMap.group.element.target</a>
 */
public 
class ConceptMapGroupElementTarget extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 5854176968852593640L;
  
  protected String code;
  protected String display;
  protected String equivalence;
  protected String comment;
  protected ConceptMapGroupElementTargetDependsOn[] dependsOn;
  protected ConceptMapGroupElementTargetDependsOn[] product;
  
  public ConceptMapGroupElementTarget()
  {
  }

  public String getCode() {
    return code;
  }

  public String getDisplay() {
    return display;
  }

  public String getEquivalence() {
    return equivalence;
  }

  public String getComment() {
    return comment;
  }

  public ConceptMapGroupElementTargetDependsOn[] getDependsOn() {
    return dependsOn;
  }

  public ConceptMapGroupElementTargetDependsOn[] getProduct() {
    return product;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setEquivalence(String equivalence) {
    this.equivalence = equivalence;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setDependsOn(ConceptMapGroupElementTargetDependsOn[] dependsOn) {
    this.dependsOn = dependsOn;
  }

  public void setProduct(ConceptMapGroupElementTargetDependsOn[] product) {
    this.product = product;
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
    return "ConceptMapGroupElementTarget(" + id + "," + code + ")";
  }
}
