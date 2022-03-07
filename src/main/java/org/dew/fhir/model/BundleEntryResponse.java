package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Indicates the results of processing the corresponding 'request' entry in the batch 
 * or transaction being responded to or what the results of an operation where when returning history.
 *
 * @see <a href="https://www.hl7.org/fhir/bundle-definitions.html#Bundle.entry.response">Bundle.entry.response</a>
 */
public 
class BundleEntryResponse extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -197480045127629797L;
  
  protected String status;
  protected String location;
  protected String etag;
  protected Date lastModified;
  protected Resource outcome;
  
  public BundleEntryResponse()
  {
  }

  public String getStatus() {
    return status;
  }

  public String getLocation() {
    return location;
  }

  public String getEtag() {
    return etag;
  }

  public Date getLastModified() {
    return lastModified;
  }

  public Resource getOutcome() {
    return outcome;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }

  public void setOutcome(Resource outcome) {
    this.outcome = outcome;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof BundleEntryResponse) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (status + ":" + location).hashCode();
  }
  
  @Override
  public String toString() {
    return "BundleResponse(" + id + "," + status + "," + location + ")";
  }
}
