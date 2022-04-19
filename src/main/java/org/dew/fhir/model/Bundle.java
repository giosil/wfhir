package org.dew.fhir.model;

import java.io.Serializable;
import java.util.ArrayList;
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
    this.resourceType = "Bundle";
  }

  public Bundle(Identifier identifier)
  {
    this.resourceType = "Bundle";
    this.identifier = identifier;
  }
  
  public Bundle(String type)
  {
    this.resourceType = "Bundle";
    this.type = type;
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
  
  public 
  void addLink(String relation, String url)
  {
    if(url == null || url.length() == 0) {
      return;
    }
    if(relation == null || relation.length() == 0) {
      relation = "self";
    }
    if(link == null || link.length == 0) {
      link = new BundleLink[] { new BundleLink(url, relation) };
    }
    else {
      BundleLink[] newLink = new BundleLink[link.length + 1];
      for(int i = 0; i < link.length; i++) {
        newLink[i] = link[i];
      }
      newLink[link.length] = new BundleLink(url, relation);
    }
    total = link.length;
  }
  
  public 
  void addLink(String relation, String base, String type, Resource resource)
  {
    if(base == null) base = ""; 
    if(type == null || resource == null) return;
    addLink(relation, base + "/" + type + "/" + resource.getId());
  }
  
  public
  java.util.List<String> listURL()
  {
    if(link == null || link.length == 0) {
      return new ArrayList<>();
    }
    java.util.List<String> result = new ArrayList<String>();
    for(int i = 0; i < link.length; i++) {
      BundleLink bundleLink = link[i];
      if(bundleLink == null) continue;
      String linkURL = bundleLink.getUrl();
      if(linkURL == null || linkURL.length() == 0) continue;
      result.add(linkURL);
    }
    return result;
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
