package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Catalog entries are wrappers that contextualize items included in a catalog.
 *
 * @see <a href="https://www.hl7.org/fhir">CatalogEntry_RelatedEntry</a>
 */
public
class CatalogEntryRelatedEntry extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> item;
  protected String relationtype;
  
  public CatalogEntryRelatedEntry()
  {
  }
  
  public Reference<Resource> getItem() {
    return item;
  }
  
  public void setItem(Reference<Resource> item) {
    this.item = item;
  }
  
  public String getRelationtype() {
    return relationtype;
  }
  
  public void setRelationtype(String relationtype) {
    this.relationtype = relationtype;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CatalogEntryRelatedEntry) {
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
    return "CatalogEntryRelatedEntry(" + id + ")";
  }
}
