package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Links related to a Bundle.
 * 
 * @see <a href="https://www.hl7.org/fhir/bundle.html#Bundle.link">Bundle.link</a>
 */
public 
class BundleLink extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 8730933081772996454L;
  
  protected String relation;
  protected String url;
  
  public BundleLink()
  {
  }
  
  public BundleLink(String url)
  {
    this.url = url;
  }
  
  public BundleLink(String url, String relation)
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
    if(object instanceof BundleLink) {
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
    return "BundleLink(" + id + "," + relation + "," + url + ")";
  }
}
