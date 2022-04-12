package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer_Repeat</a>
 */
public
class SubstancePolymerRepeat extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstancePolymerRepeatUnit[] repeatUnit;
  protected Integer numberOfUnits;
  protected CodeableConcept repeatUnitAmountType;
  protected String averageMolecularFormula;
  
  public SubstancePolymerRepeat()
  {
  }
  
  public SubstancePolymerRepeatUnit[] getRepeatUnit() {
    return repeatUnit;
  }
  
  public void setRepeatUnit(SubstancePolymerRepeatUnit[] repeatUnit) {
    this.repeatUnit = repeatUnit;
  }
  
  public Integer getNumberOfUnits() {
    return numberOfUnits;
  }
  
  public void setNumberOfUnits(Integer numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }
  
  public CodeableConcept getRepeatUnitAmountType() {
    return repeatUnitAmountType;
  }
  
  public void setRepeatUnitAmountType(CodeableConcept repeatUnitAmountType) {
    this.repeatUnitAmountType = repeatUnitAmountType;
  }
  
  public String getAverageMolecularFormula() {
    return averageMolecularFormula;
  }
  
  public void setAverageMolecularFormula(String averageMolecularFormula) {
    this.averageMolecularFormula = averageMolecularFormula;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymerRepeat) {
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
    return "SubstancePolymerRepeat(" + id + ")";
  }
}
