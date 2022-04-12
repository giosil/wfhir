package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_RequestHeader</a>
 */
public
class TestScriptRequestHeader extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String field;
  protected String value;
  
  public TestScriptRequestHeader()
  {
  }
  
  public String getField() {
    return field;
  }
  
  public void setField(String field) {
    this.field = field;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptRequestHeader) {
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
    return "TestScriptRequestHeader(" + id + ")";
  }
}
