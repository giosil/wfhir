package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Test</a>
 */
public
class TestScriptTest extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String name;
  protected String description;
  protected TestScriptAction1[] action;
  
  public TestScriptTest()
  {
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public TestScriptAction1[] getAction() {
    return action;
  }
  
  public void setAction(TestScriptAction1[] action) {
    this.action = action;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptTest) {
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
    return "TestScriptTest(" + id + ")";
  }
}
