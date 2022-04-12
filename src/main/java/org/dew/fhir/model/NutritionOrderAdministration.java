package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder_Administration</a>
 */
public
class NutritionOrderAdministration extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Timing schedule;
  protected Ratio rateRatio;
  protected Quantity quantity;
  protected Quantity rateQuantity;
  
  public NutritionOrderAdministration()
  {
  }
  
  public Timing getSchedule() {
    return schedule;
  }
  
  public void setSchedule(Timing schedule) {
    this.schedule = schedule;
  }
  
  public Ratio getRateRatio() {
    return rateRatio;
  }
  
  public void setRateRatio(Ratio rateRatio) {
    this.rateRatio = rateRatio;
  }
  
  public Quantity getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }
  
  public Quantity getRateQuantity() {
    return rateQuantity;
  }
  
  public void setRateQuantity(Quantity rateQuantity) {
    this.rateQuantity = rateQuantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrderAdministration) {
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
    return "NutritionOrderAdministration(" + id + ")";
  }
}
