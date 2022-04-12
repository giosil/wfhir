package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport_Test</a>
 */
public
class TestReportTest extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String name;
  protected String description;
  protected TestReportAction1[] action;
  
  public TestReportTest()
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
  
  public TestReportAction1[] getAction() {
    return action;
  }
  
  public void setAction(TestReportAction1[] action) {
    this.action = action;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReportTest) {
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
    return "TestReportTest(" + id + ")";
  }
}
