package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Action1</a>
 */
public
class TestScriptAction1 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestScriptOperation operation;
  protected TestScriptAssert assert_;
  
  public TestScriptAction1()
  {
  }
  
  public TestScriptOperation getOperation() {
    return operation;
  }
  
  public void setOperation(TestScriptOperation operation) {
    this.operation = operation;
  }
  
  public TestScriptAssert getAssert_() {
    return assert_;
  }
  
  public void setAssert_(TestScriptAssert assert_) {
    this.assert_ = assert_;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptAction1) {
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
    return "TestScriptAction1(" + id + ")";
  }
}
