package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Software that is covered by this capability statement. 
 * It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.software">CapabilityStatement.software</a>
 */
public 
class CapabilityStatementSoftware extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -8083733135483952142L;
  
  protected String name;
  protected String version;
  protected Date releaseDate;
  
  public CapabilityStatementSoftware()
  {
  }

  public String getName() {
    return name;
  }

  public String getVersion() {
    return version;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementSoftware) {
      return this.hashCode() == object.hashCode();
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
    return "CapabilityStatementSoftware(" + id + "," + name + "," + version + ")";
  }
}
