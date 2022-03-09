package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Age data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Age">Age</a>
 */
public 
class Age extends Element implements Serializable
{
  private static final long serialVersionUID = 8976841018613020936L;
  
  protected String code;
  protected String system;
  protected Integer value;
  
  public Age()
  {
  }

  public Age(String code, String system, Integer value)
  {
    this.code = code;
    this.system = system;
    this.value = value;
  }

  public String getCode() {
    return code;
  }

  public String getSystem() {
    return system;
  }

  public Integer getValue() {
    return value;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Age) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(value == null) return 0;
    return value;
  }
  
  @Override
  public String toString() {
    return "Age(" + code + "," + system + "," + value + ")";
  }
}