package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport_Setup</a>
 */
public
class TestReportSetup extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected TestReportAction[] action;
  
  public TestReportSetup()
  {
  }
  
  public TestReportAction[] getAction() {
    return action;
  }
  
  public void setAction(TestReportAction[] action) {
    this.action = action;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReportSetup) {
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
    return "TestReportSetup(" + id + ")";
  }
}
