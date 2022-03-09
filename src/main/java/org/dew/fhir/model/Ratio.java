package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A relationship between two Quantity values expressed as a numerator and a denominator.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Ratio">Ratio</a>
 */
public 
class Ratio extends Element implements Serializable
{
  private static final long serialVersionUID = -7923949540927746108L;
  
  protected Quantity numerator;
  protected Quantity denominator;
  
  public Ratio()
  {
  }

  public Ratio(Quantity numerator, Quantity denominator)
  {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Quantity getNumerator() {
    return numerator;
  }

  public Quantity getDenominator() {
    return denominator;
  }

  public void setNumerator(Quantity numerator) {
    this.numerator = numerator;
  }

  public void setDenominator(Quantity denominator) {
    this.denominator = denominator;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Ratio) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (numerator + ":" + denominator).hashCode();
  }
  
  @Override
  public String toString() {
    return "Ratio(" + numerator + "," + denominator + ")";
  }
}
