package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder_Texture</a>
 */
public
class NutritionOrderTexture extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept foodType;
  protected CodeableConcept modifier;
  
  public NutritionOrderTexture()
  {
  }
  
  public CodeableConcept getFoodType() {
    return foodType;
  }
  
  public void setFoodType(CodeableConcept foodType) {
    this.foodType = foodType;
  }
  
  public CodeableConcept getModifier() {
    return modifier;
  }
  
  public void setModifier(CodeableConcept modifier) {
    this.modifier = modifier;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrderTexture) {
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
    return "NutritionOrderTexture(" + id + ")";
  }
}
