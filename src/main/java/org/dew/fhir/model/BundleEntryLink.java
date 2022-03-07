package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Links related to a Boundle entry.
 *
 * @see <a href="https://www.hl7.org/fhir/bundle-definitions.html#Bundle.entry.link">Bundle.entry.link</a>
 */
public 
class BundleEntryLink extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -6483017982427909521L;
  
  protected String relation;
  protected String url;
  
  public BundleEntryLink()
  {
  }
  
  public BundleEntryLink(String url)
  {
    this.url = url;
  }
  
  public BundleEntryLink(String url, String relation)
  {
    this.url = url;
    this.relation = relation;
  }

  public String getRelation() {
    return relation;
  }

  public String getUrl() {
    return url;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BundleEntryLink) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(url == null) return 0;
    return url.hashCode();
  }
  
  @Override
  public String toString() {
    return "BundleEntryLink(" + id + "," + relation + "," + url + ")";
  }
}
