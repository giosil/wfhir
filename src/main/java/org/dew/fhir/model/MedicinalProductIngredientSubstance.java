package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An ingredient of a manufactured item or pharmaceutical product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIngredient_Substance</a>
 */
public
class MedicinalProductIngredientSubstance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected MedicinalProductIngredientStrength[] strength;
  
  public MedicinalProductIngredientSubstance()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public MedicinalProductIngredientStrength[] getStrength() {
    return strength;
  }
  
  public void setStrength(MedicinalProductIngredientStrength[] strength) {
    this.strength = strength;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIngredientSubstance) {
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
    return "MedicinalProductIngredientSubstance(" + id + ")";
  }
}
