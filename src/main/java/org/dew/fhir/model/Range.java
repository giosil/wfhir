package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A set of ordered Quantity values defined by a low and high limit.
 * A Range specifies a set of possible values; usually, one value from the range applies (e.g. "give the patient between 2 and 4 tablets"). 
 * Ranges are typically used in instructions.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Range">Range</a>
 */
public 
class Range extends Element implements Serializable
{
  private static final long serialVersionUID = -1663122693667728107L;
  
  protected SimpleQuantity low;
  protected SimpleQuantity high;
  
  public Range()
  {
  }

  public Range(SimpleQuantity low, SimpleQuantity high)
  {
    this.low = low;
    this.high = high;
  }

  public SimpleQuantity getLow() {
    return low;
  }

  public SimpleQuantity getHigh() {
    return high;
  }

  public void setLow(SimpleQuantity low) {
    this.low = low;
  }

  public void setHigh(SimpleQuantity high) {
    this.high = high;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Range) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (low + ":" + high).hashCode();
  }
  
  @Override
  public String toString() {
    return "Range(" + low + "," + high + ")";
  }
}
