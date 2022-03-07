package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Many of the defined elements in a resource are references to other resources. 
 * Using these references, the resources combine to build a web of information about healthcare.
 *
 * @see <a href="https://www.hl7.org/fhir/references.html#Reference">Reference</a>
 */
public 
class Reference<T extends Resource> extends Element implements Serializable
{
  private static final long serialVersionUID = 2439835231724290521L;
  
  protected String reference;
  protected String type;
  protected Identifier identifier;
  protected String display;
  
  public Reference()
  {
  }

  public Reference(String reference, String type)
  {
    this.reference = reference;
    this.type = type;
  }
  
  public Reference(String reference, String type, Identifier identifier)
  {
    this.reference = reference;
    this.type = type;
    this.identifier = identifier;
  }
  
  public Reference(String reference, String type, Identifier identifier, String display)
  {
    this.reference = reference;
    this.type = type;
    this.identifier = identifier;
    this.display = display;
  }
  
  public String getReference() {
    return reference;
  }

  public String getType() {
    return type;
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public String getDisplay() {
    return display;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Reference) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (reference + ":" + identifier).hashCode();
  }
  
  @Override
  public String toString() {
    return "Reference(" + id + "," + reference + "," + type + "," + identifier + ")";
  }
}
