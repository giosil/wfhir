package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Action2</a>
 */
public
class TestScriptAction2 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestScriptOperation operation;
  
  public TestScriptAction2()
  {
  }
  
  public TestScriptOperation getOperation() {
    return operation;
  }
  
  public void setOperation(TestScriptOperation operation) {
    this.operation = operation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptAction2) {
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
    return "TestScriptAction2(" + id + ")";
  }
}
