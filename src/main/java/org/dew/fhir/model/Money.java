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
  private static final long serialVersionUID = -7860987903572076004L;
  
  protected double value;
  protected String currency;
  
  public Money()
  {
  }

  public double getValue() {
    return value;
  }

  public String getCurrency() {
    return currency;
  }

  public void setValue(double value) {
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
    return (currency + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "Money(" + currency + "," + value + ")";
  }
}
