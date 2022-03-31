package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.ingredient">MedicationKnowledge.ingredient</a>
 */
public 
class MedicationKnowledgeIngredient extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -400119861730422997L;
  
  protected CodeableConcept itemCodeableConcept;
  protected Reference<Substance> itemReference;
  protected Boolean isActive;
  protected Ratio strength;
  
  public MedicationKnowledgeIngredient()
  {
  }

  public CodeableConcept getItemCodeableConcept() {
    return itemCodeableConcept;
  }

  public Reference<Substance> getItemReference() {
    return itemReference;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public Ratio getStrength() {
    return strength;
  }

  public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
    this.itemCodeableConcept = itemCodeableConcept;
  }

  public void setItemReference(Reference<Substance> itemReference) {
    this.itemReference = itemReference;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public void setStrength(Ratio strength) {
    this.strength = strength;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeIngredient) {
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
    return "MedicationKnowledgeIngredient(" + id + "," + itemCodeableConcept + "," + itemReference + ")";
  }
}
