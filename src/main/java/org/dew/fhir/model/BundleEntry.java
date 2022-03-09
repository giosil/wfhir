package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Entry in the bundle.
 *
 * @see <a href="https://www.hl7.org/fhir/bundle-definitions.html#Bundle.entry">Bundle.entry</a>
 */
public 
class BundleEntry extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -1653473702215133317L;
  
  protected BundleEntryLink[] link;
  protected String fullUrl;
  protected Resource resource;
  protected BundleEntrySearch search;
  protected BundleEntryRequest request;
  protected BundleEntryResponse response;
  
  public BundleEntry()
  {
  }

  public BundleEntryLink[] getLink() {
    return link;
  }

  public String getFullUrl() {
    return fullUrl;
  }

  public Resource getResource() {
    return resource;
  }

  public BundleEntrySearch getSearch() {
    return search;
  }

  public BundleEntryRequest getRequest() {
    return request;
  }

  public BundleEntryResponse getResponse() {
    return response;
  }

  public void setLink(BundleEntryLink[] link) {
    this.link = link;
  }

  public void setFullUrl(String fullUrl) {
    this.fullUrl = fullUrl;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public void setSearch(BundleEntrySearch search) {
    this.search = search;
  }

  public void setRequest(BundleEntryRequest request) {
    this.request = request;
  }

  public void setResponse(BundleEntryResponse response) {
    this.response = response;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof BundleEntry) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(fullUrl == null) return 0;
    return fullUrl.hashCode();
  }
  
  @Override
  public String toString() {
    return "BundleEntry(" + id + "," + link + "," + fullUrl + ")";
  }
}