package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An amount of currency.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Money">Money</a>
 */
public 
class Money extends Element implements Serializable
{
  private static final long serialVersionUID = -1669859165639525613L;
  
  protected Double value;
  protected String currency;
  
  public Money()
  {
  }

  public Money(double value)
  {
    this.value = value;
  }

  public Money(double value, String currency)
  {
    this.value = value;
    this.currency = currency;
  }

  public Double getValue() {
    return value;
  }

  public String getCurrency() {
    return currency;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Money) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (value + ":" + currency).hashCode();
  }
  
  @Override
  public String toString() {
    return "Money(" + value + "," + currency + ")";
  }
}
