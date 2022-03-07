package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The base definition for all elements contained inside a resource.
 *
 *  @see <a href="https://www.hl7.org/fhir/element.html">Element</a>
 */
public 
class Element implements Serializable
{
  private static final long serialVersionUID = -5172687335571406399L;
  
  protected String id;
  protected Extension[] extension;
  
  public Element()
  {
  }
  
  public Element(String id)
  {
    this.id = id;
  }
  
  public Element(String id, Extension[] extension)
  {
    this.id = id;
    this.extension = extension;
  }

  public String getId() {
    return id;
  }

  public Extension[] getExtension() {
    return extension;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setExtension(Extension[] extension) {
    this.extension = extension;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Element) {
      String sId = ((Element) object).getId();
      if(id == null && sId == null) return true;
      return id != null && id.equals(sId);
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
    if(extension == null) {
      return "Element(" + id + ",null)";
    }
    return "Element(" + id + ",Extension[" + extension.length + "])";
  }
}
