package org.dew.fhir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * A container for a collection of resources.
 *
 * @see <a href="https://www.hl7.org/fhir/bundle.html">Bundle</a>
 */
public 
class Bundle extends Resource implements Serializable
{
  private static final long serialVersionUID = -7561680620155153059L;
  
  protected Identifier identifier;
  protected String type;
  protected Date timestamp;
  protected Integer total;
  protected BundleLink[] link;
  protected BundleEntry[] entry;
  protected Signature signature;
  
  public Bundle()
  {
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }

  public String getType() {
    return type;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public Integer getTotal() {
    return total;
  }

  public BundleLink[] getLink() {
    return link;
  }

  public BundleEntry[] getEntry() {
    return entry;
  }

  public Signature getSignature() {
    return signature;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public void setLink(BundleLink[] link) {
    this.link = link;
  }

  public void setEntry(BundleEntry[] entry) {
    this.entry = entry;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Bundle) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(identifier == null) return 0;
    return identifier.hashCode();
  }
  
  @Override
  public String toString() {
    return "Bundle(" + id + "," + identifier + "," + total + ")";
  }
}
