package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A list is a curated collection of resources.
 *
 * @see <a href="https://www.hl7.org/fhir">List_Entry</a>
 */
public
class ListEntry extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Reference<Resource> item;
  protected CodeableConcept flag;
  protected Boolean deleted;
  
  public ListEntry()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Reference<Resource> getItem() {
    return item;
  }
  
  public void setItem(Reference<Resource> item) {
    this.item = item;
  }
  
  public CodeableConcept getFlag() {
    return flag;
  }
  
  public void setFlag(CodeableConcept flag) {
    this.flag = flag;
  }
  
  public Boolean getDeleted() {
    return deleted;
  }
  
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ListEntry) {
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
    return "ListEntry(" + id + ")";
  }
}
