package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport_Participant</a>
 */
public
class TestReportParticipant extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String display;
  protected String type;
  protected String uri;
  
  public TestReportParticipant()
  {
  }
  
  public String getDisplay() {
    return display;
  }
  
  public void setDisplay(String display) {
    this.display = display;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getUri() {
    return uri;
  }
  
  public void setUri(String uri) {
    this.uri = uri;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReportParticipant) {
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
    return "TestReportParticipant(" + id + ")";
  }
}
