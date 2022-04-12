package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Page1</a>
 */
public
class ImplementationGuidePage1 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String[] anchor;
  protected String name;
  protected String title;
  
  public ImplementationGuidePage1()
  {
  }
  
  public String[] getAnchor() {
    return anchor;
  }
  
  public void setAnchor(String[] anchor) {
    this.anchor = anchor;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuidePage1) {
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
    return "ImplementationGuidePage1(" + id + ")";
  }
}
