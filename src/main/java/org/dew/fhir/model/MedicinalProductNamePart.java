package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProduct_NamePart</a>
 */
public
class MedicinalProductNamePart extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Coding type;
  protected String part;
  
  public MedicinalProductNamePart()
  {
  }
  
  public Coding getType() {
    return type;
  }
  
  public void setType(Coding type) {
    this.type = type;
  }
  
  public String getPart() {
    return part;
  }
  
  public void setPart(String part) {
    this.part = part;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductNamePart) {
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
    return "MedicinalProductNamePart(" + id + ")";
  }
}
