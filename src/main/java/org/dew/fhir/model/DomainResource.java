package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A domain resource is a resource that:
 * <ul>
 *   <li>has a human-readable XHTML representation of the content of the resource;</li>
 *   <li>can contain additional related resources inside the resource;</li>
 *   <li>can have additional extensions and modifierExtensions as well as the defined data.</li>
 * </ul>
 * 
 *  @see <a href="https://www.hl7.org/fhir/domainresource.html">DomainResource</a>
 *  @see <a href="https://www.hl7.org/fhir/resourcelist.html">Resource Index</a>
 */
public 
class DomainResource extends Resource implements Serializable
{
  private static final long serialVersionUID = -7656445250255957680L;
  
  protected Narrative text;
  protected Resource[] contained;
  protected Extension[] extension;
  protected Extension[] modifierExtension;
  
  public DomainResource()
  {
    this.resourceType = "DomainResource";
  }
  
  public DomainResource(Resource[] contained)
  {
    this.contained = contained;
  }
  
  public DomainResource(Resource[] contained, Narrative text)
  {
    this.contained = contained;
    this.text = text;
  }
  
  public Narrative getText() {
    return text;
  }

  public Resource[] getContained() {
    return contained;
  }

  public Extension[] getExtension() {
    return extension;
  }

  public Extension[] getModifierExtension() {
    return modifierExtension;
  }

  public void setText(Narrative text) {
    this.text = text;
  }

  public void setContained(Resource[] contained) {
    this.contained = contained;
  }

  public void setExtension(Extension[] extension) {
    this.extension = extension;
  }

  public void setModifierExtension(Extension[] modifierExtension) {
    this.modifierExtension = modifierExtension;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DomainResource) {
      String sId = ((DomainResource) object).getId();
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
    return "DomainResource(" + id + "," + resourceType + ")";
  }
}
