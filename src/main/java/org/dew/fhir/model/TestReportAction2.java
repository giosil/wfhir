package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport_Action2</a>
 */
public
class TestReportAction2 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestReportOperation operation;
  
  public TestReportAction2()
  {
  }
  
  public TestReportOperation getOperation() {
    return operation;
  }
  
  public void setOperation(TestReportOperation operation) {
    this.operation = operation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReportAction2) {
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
    return "TestReportAction2(" + id + ")";
  }
}
