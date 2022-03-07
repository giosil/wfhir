package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Additional information about how this entry should be processed as part of a transaction or batch. 
 * For history, it shows how the entry was processed to create the version contained in the entry.
 *
 * @see <a href="https://www.hl7.org/fhir/bundle-definitions.html#Bundle.entry.request">Bundle.entry.request</a>
 */
public 
class BundleEntryRequest extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -197480045127629797L;
  
  protected String method;
  protected String url;
  protected String ifNoneMatch;
  protected Date ifModifiedSince;
  protected String ifMatch;
  protected String ifNoneExist;
  
  public BundleEntryRequest()
  {
  }
  
  public String getMethod() {
    return method;
  }

  public String getUrl() {
    return url;
  }

  public String getIfNoneMatch() {
    return ifNoneMatch;
  }

  public Date getIfModifiedSince() {
    return ifModifiedSince;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public String getIfNoneExist() {
    return ifNoneExist;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setIfNoneMatch(String ifNoneMatch) {
    this.ifNoneMatch = ifNoneMatch;
  }

  public void setIfModifiedSince(Date ifModifiedSince) {
    this.ifModifiedSince = ifModifiedSince;
  }

  public void setIfMatch(String ifMatch) {
    this.ifMatch = ifMatch;
  }

  public void setIfNoneExist(String ifNoneExist) {
    this.ifNoneExist = ifNoneExist;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof BundleEntryRequest) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (method + ":" + url).hashCode();
  }
  
  @Override
  public String toString() {
    return "BundleRequest(" + id + "," + method + "," + url + ")";
  }
}
