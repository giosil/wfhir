package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Reference range of possible or expected values.
 *
 * @see <a href="http://www.hl7.org/fhir/substanceamount-definitions.html#SubstanceAmount.referenceRange">SubstanceAmount.referenceRange</a>
 */
public 
class SubstanceAmountReferenceRange extends Element implements Serializable 
{
  private static final long serialVersionUID = 4593578738846597412L;
  
  protected Quantity lowLimit;
  protected Quantity highLimit;
  
  public SubstanceAmountReferenceRange()
  {
  }

  public Quantity getLowLimit() {
    return lowLimit;
  }

  public Quantity getHighLimit() {
    return highLimit;
  }

  public void setLowLimit(Quantity lowLimit) {
    this.lowLimit = lowLimit;
  }

  public void setHighLimit(Quantity highLimit) {
    this.highLimit = highLimit;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MarketingStatus) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(id == null) return 0;
    return id.hashCode();
  }
  
  @Override
  public String toString() {
    return "MarketingStatus(" + id + "," + lowLimit + "," + highLimit + ")";
  }
}
