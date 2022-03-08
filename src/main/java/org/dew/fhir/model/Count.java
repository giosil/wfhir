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
  private static final long serialVersionUID = -4446820247442043090L;
  
  protected String code;
  protected String system;
  protected Integer value;
  
  public Count()
  {
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
    if(object instanceof Count) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return value;
  }
  
  @Override
  public String toString() {
    return "Count(" + code + "," + system + "," + value + ")";
  }
}
