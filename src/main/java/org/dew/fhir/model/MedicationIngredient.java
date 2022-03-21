package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="https://www.hl7.org/fhir/medication-definitions.html#Medication.ingredient">Medication.ingredient</a>
 */
public 
class MedicationIngredient extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1703345839630150391L;
  
  protected CodeableConcept itemCodeableConcept;
  protected Reference<Resource> itemReference;
  protected Boolean isActive;
  protected Ratio strength;
  
  public MedicationIngredient()
  {
  }

  public CodeableConcept getItemCodeableConcept() {
    return itemCodeableConcept;
  }

  public Reference<Resource> getItemReference() {
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

  public void setItemReference(Reference<Resource> itemReference) {
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
    if(object instanceof MedicationIngredient) {
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
    return "MedicationIngredient(" + id + ")";
  }
}
