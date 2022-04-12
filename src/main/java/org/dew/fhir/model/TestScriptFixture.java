package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Fixture</a>
 */
public
class TestScriptFixture extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> resource;
  protected Boolean autocreate;
  protected Boolean autodelete;
  
  public TestScriptFixture()
  {
  }
  
  public Reference<Resource> getResource() {
    return resource;
  }
  
  public void setResource(Reference<Resource> resource) {
    this.resource = resource;
  }
  
  public Boolean getAutocreate() {
    return autocreate;
  }
  
  public void setAutocreate(Boolean autocreate) {
    this.autocreate = autocreate;
  }
  
  public Boolean getAutodelete() {
    return autodelete;
  }
  
  public void setAutodelete(Boolean autodelete) {
    this.autodelete = autodelete;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptFixture) {
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
    return "TestScriptFixture(" + id + ")";
  }
}
