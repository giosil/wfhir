package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Duration data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Duration">Duration</a>
 */
public 
class Duration extends Element implements Serializable
{
  private static final long serialVersionUID = 3515888721287090672L;
  
  protected String code;
  protected String system;
  protected Integer value;
  
  public Duration()
  {
  }
  
  public Duration(String code, int value)
  {
    this.code = code;
    this.value = value;
  }
  
  public Duration(String code, String system, int value)
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
  
  public int intValue() {
    if(value == null) return 0;
    return value.intValue();
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Duration) {
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
    return "Duration(" + code + "," + system + "," + value + ")";
  }
}
