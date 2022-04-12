package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder_Nutrient</a>
 */
public
class NutritionOrderNutrient extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Quantity amount;
  protected CodeableConcept modifier;
  
  public NutritionOrderNutrient()
  {
  }
  
  public Quantity getAmount() {
    return amount;
  }
  
  public void setAmount(Quantity amount) {
    this.amount = amount;
  }
  
  public CodeableConcept getModifier() {
    return modifier;
  }
  
  public void setModifier(CodeableConcept modifier) {
    this.modifier = modifier;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrderNutrient) {
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
    return "NutritionOrderNutrient(" + id + ")";
  }
}
