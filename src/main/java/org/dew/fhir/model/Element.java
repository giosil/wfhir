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
  private static final long serialVersionUID = 1711123913799493511L;
  
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
  
  public Element(Extension extension)
  {
    if(extension != null) {
      this.extension = new Extension[] { extension };
    }
  }
  
  public Element(String url, String codingSystem, String codingCode, String codingDisplay)
  {
    if(url != null && url.length() > 0) {
      this.extension = new Extension[] { new Extension(url, codingSystem, codingCode, codingDisplay) };
    }
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
