package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
 *
 * @see <a href="https://www.hl7.org/fhir">Linkage_Item</a>
 */
public
class LinkageItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String type;
  protected Reference<Resource> resource;
  
  public LinkageItem()
  {
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public Reference<Resource> getResource() {
    return resource;
  }
  
  public void setResource(Reference<Resource> resource) {
    this.resource = resource;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof LinkageItem) {
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
    return "LinkageItem(" + id + ")";
  }
}
