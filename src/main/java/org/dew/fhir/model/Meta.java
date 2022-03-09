package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Each resource contains an element "meta", of type "Meta", which is a set of metadata that provides technical and workflow context to the resource. 
 * The metadata items are all optional, though some or all of them may be required in particular implementations or contexts of use.
 * 
 * @see <a href="https://www.hl7.org/fhir/resource.html#Meta">Meta</a>
 */
public 
class Meta extends Element implements Serializable
{
  private static final long serialVersionUID = -165320454522184153L;
  
  protected String versionId;
  protected Date lastUpdated;
  protected String source;
  protected String[] profile;
  protected Coding[] security;
  protected Coding[] tag;
  
  public Meta()
  {
  }

  public Meta(String versionId)
  {
    this.versionId = versionId;
  }

  public Meta(String versionId, String source)
  {
    this.versionId = versionId;
    this.source = source;
  }

  public String getVersionId() {
    return versionId;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public String getSource() {
    return source;
  }

  public String[] getProfile() {
    return profile;
  }

  public Coding[] getSecurity() {
    return security;
  }

  public Coding[] getTag() {
    return tag;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public void setProfile(String[] profile) {
    this.profile = profile;
  }

  public void setSecurity(Coding[] security) {
    this.security = security;
  }

  public void setTag(Coding[] tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Meta) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (versionId + ":" + source).hashCode();
  }
  
  @Override
  public String toString() {
    return "Meta(" + versionId + "," + source + ")";
  }
}
