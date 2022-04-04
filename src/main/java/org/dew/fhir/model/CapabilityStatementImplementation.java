package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.implementation">CapabilityStatement.implementation</a>
 */
public 
class CapabilityStatementImplementation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -583081116865781816L;
  
  protected String description;
  protected String url;
  protected Reference<Organization> custodian;
  
  public CapabilityStatementImplementation()
  {
  }

  public String getDescription() {
    return description;
  }

  public String getUrl() {
    return url;
  }

  public Reference<Organization> getCustodian() {
    return custodian;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setCustodian(Reference<Organization> custodian) {
    this.custodian = custodian;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementImplementation) {
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
    return "CapabilityStatementImplementation(" + id + "," + description + "," + url + ")";
  }
}
