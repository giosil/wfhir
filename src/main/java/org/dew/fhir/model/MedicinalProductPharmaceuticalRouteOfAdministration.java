package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A pharmaceutical product described in terms of its composition and dose form.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPharmaceutical_RouteOfAdministration</a>
 */
public
class MedicinalProductPharmaceuticalRouteOfAdministration extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected Quantity maxSingleDose;
  protected Duration maxTreatmentPeriod;
  protected MedicinalProductPharmaceuticalTargetSpecies[] targetSpecies;
  protected Quantity firstDose;
  protected Quantity maxDosePerDay;
  protected Ratio maxDosePerTreatmentPeriod;
  
  public MedicinalProductPharmaceuticalRouteOfAdministration()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Quantity getMaxSingleDose() {
    return maxSingleDose;
  }
  
  public void setMaxSingleDose(Quantity maxSingleDose) {
    this.maxSingleDose = maxSingleDose;
  }
  
  public Duration getMaxTreatmentPeriod() {
    return maxTreatmentPeriod;
  }
  
  public void setMaxTreatmentPeriod(Duration maxTreatmentPeriod) {
    this.maxTreatmentPeriod = maxTreatmentPeriod;
  }
  
  public MedicinalProductPharmaceuticalTargetSpecies[] getTargetSpecies() {
    return targetSpecies;
  }
  
  public void setTargetSpecies(MedicinalProductPharmaceuticalTargetSpecies[] targetSpecies) {
    this.targetSpecies = targetSpecies;
  }
  
  public Quantity getFirstDose() {
    return firstDose;
  }
  
  public void setFirstDose(Quantity firstDose) {
    this.firstDose = firstDose;
  }
  
  public Quantity getMaxDosePerDay() {
    return maxDosePerDay;
  }
  
  public void setMaxDosePerDay(Quantity maxDosePerDay) {
    this.maxDosePerDay = maxDosePerDay;
  }
  
  public Ratio getMaxDosePerTreatmentPeriod() {
    return maxDosePerTreatmentPeriod;
  }
  
  public void setMaxDosePerTreatmentPeriod(Ratio maxDosePerTreatmentPeriod) {
    this.maxDosePerTreatmentPeriod = maxDosePerTreatmentPeriod;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPharmaceuticalRouteOfAdministration) {
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
    return "MedicinalProductPharmaceuticalRouteOfAdministration(" + id + ")";
  }
}
