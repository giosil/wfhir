package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductInteraction_Interactant</a>
 */
public
class MedicinalProductInteractionInteractant extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> itemReference;
  protected CodeableConcept itemCodeableConcept;
  
  public MedicinalProductInteractionInteractant()
  {
  }
  
  public Reference<Resource> getItemReference() {
    return itemReference;
  }
  
  public void setItemReference(Reference<Resource> itemReference) {
    this.itemReference = itemReference;
  }
  
  public CodeableConcept getItemCodeableConcept() {
    return itemCodeableConcept;
  }
  
  public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
    this.itemCodeableConcept = itemCodeableConcept;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductInteractionInteractant) {
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
    return "MedicinalProductInteractionInteractant(" + id + ")";
  }
}
