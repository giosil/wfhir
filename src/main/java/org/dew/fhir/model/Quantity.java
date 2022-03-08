package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A measured amount (or an amount that can potentially be measured).
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Quantity">Quantity</a>
 */
public 
class Quantity extends Element implements Serializable
{
  private static final long serialVersionUID = -7860987903572076004L;
  
  protected Double value;
  protected String comparator;
  protected String unit;
  protected String system;
  protected String code;
  
  public Quantity()
  {
  }

  public Double getValue() {
    return value;
  }

  public String getComparator() {
    return comparator;
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

  public void setComparator(String comparator) {
    this.comparator = comparator;
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
    if(object instanceof Quantity) {
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
    return "Quantity(" + code + "," + value + ")";
  }
}