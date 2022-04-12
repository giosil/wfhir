package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A pharmaceutical product described in terms of its composition and dose form.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPharmaceutical</a>
 */
public
class MedicinalProductPharmaceutical extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected MedicinalProductPharmaceuticalCharacteristics[] characteristics;
  protected CodeableConcept administrableDoseForm;
  protected Reference<Resource>[] ingredient;
  protected MedicinalProductPharmaceuticalRouteOfAdministration[] routeOfAdministration;
  protected CodeableConcept unitOfPresentation;
  protected Reference<Resource>[] device;
  
  public MedicinalProductPharmaceutical()
  {
    this.resourceType = "MedicinalProductPharmaceutical";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public MedicinalProductPharmaceuticalCharacteristics[] getCharacteristics() {
    return characteristics;
  }
  
  public void setCharacteristics(MedicinalProductPharmaceuticalCharacteristics[] characteristics) {
    this.characteristics = characteristics;
  }
  
  public CodeableConcept getAdministrableDoseForm() {
    return administrableDoseForm;
  }
  
  public void setAdministrableDoseForm(CodeableConcept administrableDoseForm) {
    this.administrableDoseForm = administrableDoseForm;
  }
  
  public Reference<Resource>[] getIngredient() {
    return ingredient;
  }
  
  public void setIngredient(Reference<Resource>[] ingredient) {
    this.ingredient = ingredient;
  }
  
  public MedicinalProductPharmaceuticalRouteOfAdministration[] getRouteOfAdministration() {
    return routeOfAdministration;
  }
  
  public void setRouteOfAdministration(MedicinalProductPharmaceuticalRouteOfAdministration[] routeOfAdministration) {
    this.routeOfAdministration = routeOfAdministration;
  }
  
  public CodeableConcept getUnitOfPresentation() {
    return unitOfPresentation;
  }
  
  public void setUnitOfPresentation(CodeableConcept unitOfPresentation) {
    this.unitOfPresentation = unitOfPresentation;
  }
  
  public Reference<Resource>[] getDevice() {
    return device;
  }
  
  public void setDevice(Reference<Resource>[] device) {
    this.device = device;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPharmaceutical) {
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
    return "MedicinalProductPharmaceutical(" + id + ")";
  }
}
