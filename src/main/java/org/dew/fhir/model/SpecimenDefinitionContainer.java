package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="https://www.hl7.org/fhir">SpecimenDefinition_Container</a>
 */
public
class SpecimenDefinitionContainer extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String description;
  protected CodeableConcept type;
  protected Quantity capacity;
  protected SpecimenDefinitionAdditive[] additive;
  protected String preparation;
  protected CodeableConcept cap;
  protected CodeableConcept material;
  protected String minimumVolumeString;
  protected Quantity minimumVolumeQuantity;
  
  public SpecimenDefinitionContainer()
  {
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Quantity getCapacity() {
    return capacity;
  }
  
  public void setCapacity(Quantity capacity) {
    this.capacity = capacity;
  }
  
  public SpecimenDefinitionAdditive[] getAdditive() {
    return additive;
  }
  
  public void setAdditive(SpecimenDefinitionAdditive[] additive) {
    this.additive = additive;
  }
  
  public String getPreparation() {
    return preparation;
  }
  
  public void setPreparation(String preparation) {
    this.preparation = preparation;
  }
  
  public CodeableConcept getCap() {
    return cap;
  }
  
  public void setCap(CodeableConcept cap) {
    this.cap = cap;
  }
  
  public CodeableConcept getMaterial() {
    return material;
  }
  
  public void setMaterial(CodeableConcept material) {
    this.material = material;
  }
  
  public String getMinimumVolumeString() {
    return minimumVolumeString;
  }
  
  public void setMinimumVolumeString(String minimumVolumeString) {
    this.minimumVolumeString = minimumVolumeString;
  }
  
  public Quantity getMinimumVolumeQuantity() {
    return minimumVolumeQuantity;
  }
  
  public void setMinimumVolumeQuantity(Quantity minimumVolumeQuantity) {
    this.minimumVolumeQuantity = minimumVolumeQuantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenDefinitionContainer) {
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
    return "SpecimenDefinitionContainer(" + id + ")";
  }
}
