package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder_Supplement</a>
 */
public
class NutritionOrderSupplement extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Timing[] schedule;
  protected Quantity quantity;
  protected String instruction;
  protected CodeableConcept type;
  protected String productName;
  
  public NutritionOrderSupplement()
  {
  }
  
  public Timing[] getSchedule() {
    return schedule;
  }
  
  public void setSchedule(Timing[] schedule) {
    this.schedule = schedule;
  }
  
  public Quantity getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }
  
  public String getInstruction() {
    return instruction;
  }
  
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public String getProductName() {
    return productName;
  }
  
  public void setProductName(String productName) {
    this.productName = productName;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrderSupplement) {
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
    return "NutritionOrderSupplement(" + id + ")";
  }
}
