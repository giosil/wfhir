package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Manifest</a>
 */
public
class ImplementationGuideManifest extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String[] image;
  protected String[] other;
  protected ImplementationGuideResource1[] resource;
  protected String rendering;
  protected ImplementationGuidePage1[] page;
  
  public ImplementationGuideManifest()
  {
  }
  
  public String[] getImage() {
    return image;
  }
  
  public void setImage(String[] image) {
    this.image = image;
  }
  
  public String[] getOther() {
    return other;
  }
  
  public void setOther(String[] other) {
    this.other = other;
  }
  
  public ImplementationGuideResource1[] getResource() {
    return resource;
  }
  
  public void setResource(ImplementationGuideResource1[] resource) {
    this.resource = resource;
  }
  
  public String getRendering() {
    return rendering;
  }
  
  public void setRendering(String rendering) {
    this.rendering = rendering;
  }
  
  public ImplementationGuidePage1[] getPage() {
    return page;
  }
  
  public void setPage(ImplementationGuidePage1[] page) {
    this.page = page;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideManifest) {
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
    return "ImplementationGuideManifest(" + id + ")";
  }
}
