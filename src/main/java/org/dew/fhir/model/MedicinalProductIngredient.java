package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An ingredient of a manufactured item or pharmaceutical product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIngredient</a>
 */
public
class MedicinalProductIngredient extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier identifier;
  protected CodeableConcept role;
  protected MedicinalProductIngredientSubstance substance;
  protected Boolean allergenicIndicator;
  protected Reference<Resource>[] manufacturer;
  protected MedicinalProductIngredientSpecifiedSubstance[] specifiedSubstance;
  
  public MedicinalProductIngredient()
  {
    this.resourceType = "MedicinalProductIngredient";
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept getRole() {
    return role;
  }
  
  public void setRole(CodeableConcept role) {
    this.role = role;
  }
  
  public MedicinalProductIngredientSubstance getSubstance() {
    return substance;
  }
  
  public void setSubstance(MedicinalProductIngredientSubstance substance) {
    this.substance = substance;
  }
  
  public Boolean getAllergenicIndicator() {
    return allergenicIndicator;
  }
  
  public void setAllergenicIndicator(Boolean allergenicIndicator) {
    this.allergenicIndicator = allergenicIndicator;
  }
  
  public Reference<Resource>[] getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(Reference<Resource>[] manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  public MedicinalProductIngredientSpecifiedSubstance[] getSpecifiedSubstance() {
    return specifiedSubstance;
  }
  
  public void setSpecifiedSubstance(MedicinalProductIngredientSpecifiedSubstance[] specifiedSubstance) {
    this.specifiedSubstance = specifiedSubstance;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIngredient) {
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
    return "MedicinalProductIngredient(" + id + ")";
  }
}
