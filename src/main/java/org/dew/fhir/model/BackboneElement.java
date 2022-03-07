package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The base definition for complex elements defined as part of a resource definition - that is, elements that have children that are defined in the resource. 
 * Data Type elements do not use this type, though a few data types specialize it.
 * 
 * @see <a href="https://www.hl7.org/fhir/backboneelement.html">BackboneElement</a>
 */
public 
class BackboneElement extends Element implements Serializable
{
  private static final long serialVersionUID = 2439835231724290521L;
  
  protected Extension[] modifierExtension;
  
  public BackboneElement()
  {
  }

  public Extension[] getModifierExtension() {
    return modifierExtension;
  }

  public void setModifierExtension(Extension[] modifierExtension) {
    this.modifierExtension = modifierExtension;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof BackboneElement) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(modifierExtension == null) return 0;
    return modifierExtension.hashCode();
  }
  
  @Override
  public String toString() {
    if(modifierExtension == null) {
      return "BackboneElement(" + id + ",null)";
    }
    return "BackboneElement(" + id + ",Extension[" + modifierExtension.length + "])";
  }
}

