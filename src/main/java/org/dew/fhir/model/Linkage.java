package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
 *
 * @see <a href="https://www.hl7.org/fhir">Linkage</a>
 */
public
class Linkage extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected LinkageItem[] item;
  protected Reference<Resource> author;
  protected Boolean active;
  
  public Linkage()
  {
    this.resourceType = "Linkage";
  }
  
  public LinkageItem[] getItem() {
    return item;
  }
  
  public void setItem(LinkageItem[] item) {
    this.item = item;
  }
  
  public Reference<Resource> getAuthor() {
    return author;
  }
  
  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }
  
  public Boolean getActive() {
    return active;
  }
  
  public void setActive(Boolean active) {
    this.active = active;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Linkage) {
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
    return "Linkage(" + id + ")";
  }
}
