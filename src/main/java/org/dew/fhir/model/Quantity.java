package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A measured amount (or an amount that can potentially be measured).
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Quantity">Quantity</a>
 */
public 
class Quantity extends SimpleQuantity implements Serializable
{
  private static final long serialVersionUID = 2765287881482953882L;
  
  protected String comparator;
  
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