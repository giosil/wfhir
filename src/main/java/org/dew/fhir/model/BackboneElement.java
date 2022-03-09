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
  private static final long serialVersionUID = -8654149705124430247L;
  
  protected Extension[] modifierExtension;
  
  public BackboneElement()
  {
  }

  public BackboneElement(String id)
  {
    this.id = id;
  }
  
  public BackboneElement(String id, Extension extension)
  {
    this.id = id;
    if(extension != null) {
      modifierExtension = new Extension[] { extension };
    }
  }
  
  public BackboneElement(String id, Extension[] modifierExtension)
  {
    this.id = id;
    this.modifierExtension = modifierExtension;
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
    if(id == null) return 0;
    return id.hashCode();
  }
  
  @Override
  public String toString() {
    if(modifierExtension == null) {
      return "BackboneElement(" + id + ",null)";
    }
    return "BackboneElement(" + id + ",Extension[" + modifierExtension.length + "])";
  }
}

