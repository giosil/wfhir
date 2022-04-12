package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Metadata</a>
 */
public
class TestScriptMetadata extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestScriptLink[] link;
  protected TestScriptCapability[] capability;
  
  public TestScriptMetadata()
  {
  }
  
  public TestScriptLink[] getLink() {
    return link;
  }
  
  public void setLink(TestScriptLink[] link) {
    this.link = link;
  }
  
  public TestScriptCapability[] getCapability() {
    return capability;
  }
  
  public void setCapability(TestScriptCapability[] capability) {
    this.capability = capability;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptMetadata) {
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
    return "TestScriptMetadata(" + id + ")";
  }
}
