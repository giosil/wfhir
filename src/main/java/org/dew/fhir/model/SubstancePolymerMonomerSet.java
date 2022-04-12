package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer_MonomerSet</a>
 */
public
class SubstancePolymerMonomerSet extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstancePolymerStartingMaterial[] startingMaterial;
  protected CodeableConcept ratioType;
  
  public SubstancePolymerMonomerSet()
  {
  }
  
  public SubstancePolymerStartingMaterial[] getStartingMaterial() {
    return startingMaterial;
  }
  
  public void setStartingMaterial(SubstancePolymerStartingMaterial[] startingMaterial) {
    this.startingMaterial = startingMaterial;
  }
  
  public CodeableConcept getRatioType() {
    return ratioType;
  }
  
  public void setRatioType(CodeableConcept ratioType) {
    this.ratioType = ratioType;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymerMonomerSet) {
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
    return "SubstancePolymerMonomerSet(" + id + ")";
  }
}
