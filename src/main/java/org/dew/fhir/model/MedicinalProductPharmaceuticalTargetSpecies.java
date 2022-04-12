package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A pharmaceutical product described in terms of its composition and dose form.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPharmaceutical_TargetSpecies</a>
 */
public
class MedicinalProductPharmaceuticalTargetSpecies extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected MedicinalProductPharmaceuticalWithdrawalPeriod[] withdrawalPeriod;
  
  public MedicinalProductPharmaceuticalTargetSpecies()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public MedicinalProductPharmaceuticalWithdrawalPeriod[] getWithdrawalPeriod() {
    return withdrawalPeriod;
  }
  
  public void setWithdrawalPeriod(MedicinalProductPharmaceuticalWithdrawalPeriod[] withdrawalPeriod) {
    this.withdrawalPeriod = withdrawalPeriod;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPharmaceuticalTargetSpecies) {
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
    return "MedicinalProductPharmaceuticalTargetSpecies(" + id + ")";
  }
}
