package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport_Action</a>
 */
public
class TestReportAction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestReportOperation operation;
  protected TestReportAssert assert_;
  
  public TestReportAction()
  {
  }
  
  public TestReportOperation getOperation() {
    return operation;
  }
  
  public void setOperation(TestReportOperation operation) {
    this.operation = operation;
  }
  
  public TestReportAssert getAssert_() {
    return assert_;
  }
  
  public void setAssert_(TestReportAssert assert_) {
    this.assert_ = assert_;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReportAction) {
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
    return "TestReportAction(" + id + ")";
  }
}
