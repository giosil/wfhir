package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Capability</a>
 */
public
class TestScriptCapability extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String capabilities;
  protected Integer[] origin;
  protected Integer destination;
  protected String[] link;
  protected String description;
  protected Boolean required;
  protected Boolean validated;
  
  public TestScriptCapability()
  {
  }
  
  public String getCapabilities() {
    return capabilities;
  }
  
  public void setCapabilities(String capabilities) {
    this.capabilities = capabilities;
  }
  
  public Integer[] getOrigin() {
    return origin;
  }
  
  public void setOrigin(Integer[] origin) {
    this.origin = origin;
  }
  
  public Integer getDestination() {
    return destination;
  }
  
  public void setDestination(Integer destination) {
    this.destination = destination;
  }
  
  public String[] getLink() {
    return link;
  }
  
  public void setLink(String[] link) {
    this.link = link;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Boolean getRequired() {
    return required;
  }
  
  public void setRequired(Boolean required) {
    this.required = required;
  }
  
  public Boolean getValidated() {
    return validated;
  }
  
  public void setValidated(Boolean validated) {
    this.validated = validated;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptCapability) {
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
    return "TestScriptCapability(" + id + ")";
  }
}
