package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Distance data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Distance">Distance</a>
 */
public 
class Distance extends Element implements Serializable
{
  private static final long serialVersionUID = -6011244847783522710L;
  
  protected String code;
  protected String system;
  protected Integer value;
  
  public Distance()
  {
  }
  
  public Distance(String code, int value)
  {
    this.code = code;
    this.value = value;
  }
  
  public Distance(String code, String system, int value)
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
    if(object instanceof Distance) {
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
    return "Distance(" + code + "," + system + "," + value + ")";
  }
}