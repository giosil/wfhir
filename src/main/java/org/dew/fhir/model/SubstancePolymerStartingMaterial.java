package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer_StartingMaterial</a>
 */
public
class SubstancePolymerStartingMaterial extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstanceAmount amount;
  protected CodeableConcept material;
  protected CodeableConcept type;
  protected Boolean isDefining;
  
  public SubstancePolymerStartingMaterial()
  {
  }
  
  public SubstanceAmount getAmount() {
    return amount;
  }
  
  public void setAmount(SubstanceAmount amount) {
    this.amount = amount;
  }
  
  public CodeableConcept getMaterial() {
    return material;
  }
  
  public void setMaterial(CodeableConcept material) {
    this.material = material;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Boolean getIsDefining() {
    return isDefining;
  }
  
  public void setIsDefining(Boolean isDefining) {
    this.isDefining = isDefining;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymerStartingMaterial) {
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
    return "SubstancePolymerStartingMaterial(" + id + ")";
  }
}
