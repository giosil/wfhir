package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.kinetics">MedicationKnowledge.kinetics</a>
 */
public 
class MedicationKnowledgeKinetics extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -55973208795211391L;
  
  protected SimpleQuantity[] areaUnderCurve;
  protected SimpleQuantity[] lethalDose50;
  protected Duration halfLifePeriod;
  
  public MedicationKnowledgeKinetics()
  {
  }

  public SimpleQuantity[] getAreaUnderCurve() {
    return areaUnderCurve;
  }

  public SimpleQuantity[] getLethalDose50() {
    return lethalDose50;
  }

  public Duration getHalfLifePeriod() {
    return halfLifePeriod;
  }

  public void setAreaUnderCurve(SimpleQuantity[] areaUnderCurve) {
    this.areaUnderCurve = areaUnderCurve;
  }

  public void setLethalDose50(SimpleQuantity[] lethalDose50) {
    this.lethalDose50 = lethalDose50;
  }

  public void setHalfLifePeriod(Duration halfLifePeriod) {
    this.halfLifePeriod = halfLifePeriod;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeKinetics) {
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
    return "MedicationKnowledgeKinetics(" + id + ")";
  }
}
