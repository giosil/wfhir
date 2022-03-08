package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * SimpleQuantity data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#SimpleQuantity">SimpleQuantity</a>
 */
public 
class SimpleQuantity extends Element implements Serializable
{
  private static final long serialVersionUID = 8394534169077582238L;
  
  protected Double value;
  protected String unit;
  protected String system;
  protected String code;
  
  public SimpleQuantity()
  {
  }

  public Double getValue() {
    return value;
  }

  public String getUnit() {
    return unit;
  }

  public String getSystem() {
    return system;
  }

  public String getCode() {
    return code;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SimpleQuantity) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (code + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "SimpleQuantity(" + code + "," + value + ")";
  }
}