package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information about security implementation from an interface perspective - what a client needs to know.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.security">CapabilityStatement.rest.security</a>
 */
public 
class CapabilityStatementRestSecurity extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1563867091371109682L;
  
  protected String cors;
  protected CodeableConcept[] service;
  protected String description;
  
  public CapabilityStatementRestSecurity()
  {
  }

  public String getCors() {
    return cors;
  }

  public CodeableConcept[] getService() {
    return service;
  }

  public String getDescription() {
    return description;
  }

  public void setCors(String cors) {
    this.cors = cors;
  }

  public void setService(CodeableConcept[] service) {
    this.service = service;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementRestSecurity) {
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
    return "CapabilityStatementRestSecurity(" + id + "," + description + "," + cors + ")";
  }
}
