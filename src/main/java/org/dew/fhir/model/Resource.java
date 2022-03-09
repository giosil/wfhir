package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A resource is an entity that:
 * <ul>
 *   <li>has a known identity (a URL) by which it can be addressed;</li>
 *   <li>identifies itself as one of the types of resource defined in this specification;</li>
 *   <li>contains a set of structured data items as described by the definition of the resource type;</li>
 *   <li>has an identified version that changes if the contents of the resource change.</li>
 * </ul>
 * 
 * @see <a href="https://www.hl7.org/fhir/resource.html">Resource</a>
 */
public 
class Resource implements Serializable
{
  private static final long serialVersionUID = 4521570479386842850L;
  
  protected String id;
  protected Meta meta;
  protected String implicitRules;
  protected String language;
  
  // JSON
  protected String resourceType;
  
  public Resource()
  {
  }
  
  public Resource(String id)
  {
    this.id = id;
  }
  
  public String getId() {
    return id;
  }

  public Meta getMeta() {
    return meta;
  }

  public String getImplicitRules() {
    return implicitRules;
  }

  public String getLanguage() {
    return language;
  }

  public String getResourceType() {
    return resourceType;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public void setImplicitRules(String implicitRules) {
    this.implicitRules = implicitRules;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Resource) {
      String sId = ((Resource) object).getId();
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
    return "Resource(" + id + "," + resourceType + ")";
  }
}
