package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder_OralDiet</a>
 */
public
class NutritionOrderOralDiet extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Timing[] schedule;
  protected NutritionOrderNutrient[] nutrient;
  protected NutritionOrderTexture[] texture;
  protected String instruction;
  protected CodeableConcept[] fluidConsistencyType;
  protected CodeableConcept[] type;
  
  public NutritionOrderOralDiet()
  {
  }
  
  public Timing[] getSchedule() {
    return schedule;
  }
  
  public void setSchedule(Timing[] schedule) {
    this.schedule = schedule;
  }
  
  public NutritionOrderNutrient[] getNutrient() {
    return nutrient;
  }
  
  public void setNutrient(NutritionOrderNutrient[] nutrient) {
    this.nutrient = nutrient;
  }
  
  public NutritionOrderTexture[] getTexture() {
    return texture;
  }
  
  public void setTexture(NutritionOrderTexture[] texture) {
    this.texture = texture;
  }
  
  public String getInstruction() {
    return instruction;
  }
  
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }
  
  public CodeableConcept[] getFluidConsistencyType() {
    return fluidConsistencyType;
  }
  
  public void setFluidConsistencyType(CodeableConcept[] fluidConsistencyType) {
    this.fluidConsistencyType = fluidConsistencyType;
  }
  
  public CodeableConcept[] getType() {
    return type;
  }
  
  public void setType(CodeableConcept[] type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrderOralDiet) {
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
    return "NutritionOrderOralDiet(" + id + ")";
  }
}
