package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Count data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Count">Count</a>
 */
public 
class Count extends Element implements Serializable
{
  private static final long serialVersionUID = 8069565837340517055L;
  
  protected String code;
  protected String system;
  protected Integer value;
  
  public Count()
  {
  }
  
  public Count(String code, int value)
  {
    this.code = code;
    this.value = value;
  }
  
  public Count(String code, String system, int value)
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
    if(object instanceof Count) {
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
    return "Count(" + code + "," + system + "," + value + ")";
  }
}
