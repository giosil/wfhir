package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Destination</a>
 */
public
class TestScriptDestination extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer index;
  protected Coding profile;
  
  public TestScriptDestination()
  {
  }
  
  public Integer getIndex() {
    return index;
  }
  
  public void setIndex(Integer index) {
    this.index = index;
  }
  
  public Coding getProfile() {
    return profile;
  }
  
  public void setProfile(Coding profile) {
    this.profile = profile;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptDestination) {
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
    return "TestScriptDestination(" + id + ")";
  }
}
