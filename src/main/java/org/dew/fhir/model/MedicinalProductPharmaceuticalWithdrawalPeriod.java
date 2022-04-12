package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A pharmaceutical product described in terms of its composition and dose form.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPharmaceutical_WithdrawalPeriod</a>
 */
public
class MedicinalProductPharmaceuticalWithdrawalPeriod extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String supportingInformation;
  protected CodeableConcept tissue;
  protected Quantity value;
  
  public MedicinalProductPharmaceuticalWithdrawalPeriod()
  {
  }
  
  public String getSupportingInformation() {
    return supportingInformation;
  }
  
  public void setSupportingInformation(String supportingInformation) {
    this.supportingInformation = supportingInformation;
  }
  
  public CodeableConcept getTissue() {
    return tissue;
  }
  
  public void setTissue(CodeableConcept tissue) {
    this.tissue = tissue;
  }
  
  public Quantity getValue() {
    return value;
  }
  
  public void setValue(Quantity value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPharmaceuticalWithdrawalPeriod) {
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
    return "MedicinalProductPharmaceuticalWithdrawalPeriod(" + id + ")";
  }
}
