package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Page</a>
 */
public
class ImplementationGuidePage extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String generation;
  protected Reference<Resource> nameReference;
  protected String nameUrl;
  protected ImplementationGuidePage[] page;
  protected String title;
  
  public ImplementationGuidePage()
  {
  }
  
  public String getGeneration() {
    return generation;
  }
  
  public void setGeneration(String generation) {
    this.generation = generation;
  }
  
  public Reference<Resource> getNameReference() {
    return nameReference;
  }
  
  public void setNameReference(Reference<Resource> nameReference) {
    this.nameReference = nameReference;
  }
  
  public String getNameUrl() {
    return nameUrl;
  }
  
  public void setNameUrl(String nameUrl) {
    this.nameUrl = nameUrl;
  }
  
  public ImplementationGuidePage[] getPage() {
    return page;
  }
  
  public void setPage(ImplementationGuidePage[] page) {
    this.page = page;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuidePage) {
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
    return "ImplementationGuidePage(" + id + ")";
  }
}
