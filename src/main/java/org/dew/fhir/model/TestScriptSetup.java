package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Setup</a>
 */
public
class TestScriptSetup extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestScriptAction[] action;
  
  public TestScriptSetup()
  {
  }
  
  public TestScriptAction[] getAction() {
    return action;
  }
  
  public void setAction(TestScriptAction[] action) {
    this.action = action;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptSetup) {
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
    return "TestScriptSetup(" + id + ")";
  }
}
