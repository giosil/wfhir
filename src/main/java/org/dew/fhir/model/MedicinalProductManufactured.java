package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The manufactured item as contained in the packaged medicinal product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductManufactured</a>
 */
public
class MedicinalProductManufactured extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] otherCharacteristics;
  protected Quantity quantity;
  protected Reference<Resource>[] ingredient;
  protected ProdCharacteristic physicalCharacteristics;
  protected Reference<Resource>[] manufacturer;
  protected CodeableConcept unitOfPresentation;
  protected CodeableConcept manufacturedDoseForm;
  
  public MedicinalProductManufactured()
  {
    this.resourceType = "MedicinalProductManufactured";
  }
  
  public CodeableConcept[] getOtherCharacteristics() {
    return otherCharacteristics;
  }
  
  public void setOtherCharacteristics(CodeableConcept[] otherCharacteristics) {
    this.otherCharacteristics = otherCharacteristics;
  }
  
  public Quantity getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }
  
  public Reference<Resource>[] getIngredient() {
    return ingredient;
  }
  
  public void setIngredient(Reference<Resource>[] ingredient) {
    this.ingredient = ingredient;
  }
  
  public ProdCharacteristic getPhysicalCharacteristics() {
    return physicalCharacteristics;
  }
  
  public void setPhysicalCharacteristics(ProdCharacteristic physicalCharacteristics) {
    this.physicalCharacteristics = physicalCharacteristics;
  }
  
  public Reference<Resource>[] getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(Reference<Resource>[] manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  public CodeableConcept getUnitOfPresentation() {
    return unitOfPresentation;
  }
  
  public void setUnitOfPresentation(CodeableConcept unitOfPresentation) {
    this.unitOfPresentation = unitOfPresentation;
  }
  
  public CodeableConcept getManufacturedDoseForm() {
    return manufacturedDoseForm;
  }
  
  public void setManufacturedDoseForm(CodeableConcept manufacturedDoseForm) {
    this.manufacturedDoseForm = manufacturedDoseForm;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductManufactured) {
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
    return "MedicinalProductManufactured(" + id + ")";
  }
}
