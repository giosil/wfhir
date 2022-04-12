package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport_Operation</a>
 */
public
class TestReportOperation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String result;
  protected String detail;
  protected String message;
  
  public TestReportOperation()
  {
  }
  
  public String getResult() {
    return result;
  }
  
  public void setResult(String result) {
    this.result = result;
  }
  
  public String getDetail() {
    return detail;
  }
  
  public void setDetail(String detail) {
    this.detail = detail;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReportOperation) {
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
    return "TestReportOperation(" + id + ")";
  }
}
