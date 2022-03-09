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
  private static final long serialVersionUID = 3100779512737121858L;

  protected Double value;
  protected String comparator;
  protected String unit;
  protected String system;
  protected String code;
  
  public Quantity()
  {
  }
  
  public Quantity(double value)
  {
    this.value = value;
  }

  public Quantity(double value, String unit)
  {
    this.value = value;
    this.unit = unit;
  }

  public Quantity(double value, String unit, String system)
  {
    this.value = value;
    this.unit = unit;
    this.system = system;
  }

  public Quantity(double value, String unit, String system, String code)
  {
    this.value = value;
    this.unit = unit;
    this.system = system;
    this.code = code;
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
  
  public int intValue() {
    if(value == null) return 0;
    return value.intValue();
  }
  
  public double doubleValue() {
    if(value == null) return 0.0d;
    return value.doubleValue();
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