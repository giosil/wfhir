package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer_RepeatUnit</a>
 */
public
class SubstancePolymerRepeatUnit extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstancePolymerStructuralRepresentation[] structuralRepresentation;
  protected String repeatUnit;
  protected SubstanceAmount amount;
  protected SubstancePolymerDegreeOfPolymerisation[] degreeOfPolymerisation;
  protected CodeableConcept orientationOfPolymerisation;
  
  public SubstancePolymerRepeatUnit()
  {
  }
  
  public SubstancePolymerStructuralRepresentation[] getStructuralRepresentation() {
    return structuralRepresentation;
  }
  
  public void setStructuralRepresentation(SubstancePolymerStructuralRepresentation[] structuralRepresentation) {
    this.structuralRepresentation = structuralRepresentation;
  }
  
  public String getRepeatUnit() {
    return repeatUnit;
  }
  
  public void setRepeatUnit(String repeatUnit) {
    this.repeatUnit = repeatUnit;
  }
  
  public SubstanceAmount getAmount() {
    return amount;
  }
  
  public void setAmount(SubstanceAmount amount) {
    this.amount = amount;
  }
  
  public SubstancePolymerDegreeOfPolymerisation[] getDegreeOfPolymerisation() {
    return degreeOfPolymerisation;
  }
  
  public void setDegreeOfPolymerisation(SubstancePolymerDegreeOfPolymerisation[] degreeOfPolymerisation) {
    this.degreeOfPolymerisation = degreeOfPolymerisation;
  }
  
  public CodeableConcept getOrientationOfPolymerisation() {
    return orientationOfPolymerisation;
  }
  
  public void setOrientationOfPolymerisation(CodeableConcept orientationOfPolymerisation) {
    this.orientationOfPolymerisation = orientationOfPolymerisation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymerRepeatUnit) {
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
    return "SubstancePolymerRepeatUnit(" + id + ")";
  }
}
