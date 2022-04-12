package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An ingredient of a manufactured item or pharmaceutical product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIngredient_SpecifiedSubstance</a>
 */
public
class MedicinalProductIngredientSpecifiedSubstance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected MedicinalProductIngredientStrength[] strength;
  protected CodeableConcept confidentiality;
  protected CodeableConcept group;
  
  public MedicinalProductIngredientSpecifiedSubstance()
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
  
  public CodeableConcept getConfidentiality() {
    return confidentiality;
  }
  
  public void setConfidentiality(CodeableConcept confidentiality) {
    this.confidentiality = confidentiality;
  }
  
  public CodeableConcept getGroup() {
    return group;
  }
  
  public void setGroup(CodeableConcept group) {
    this.group = group;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIngredientSpecifiedSubstance) {
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
    return "MedicinalProductIngredientSpecifiedSubstance(" + id + ")";
  }
}
