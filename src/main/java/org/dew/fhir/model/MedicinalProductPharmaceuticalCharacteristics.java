package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A pharmaceutical product described in terms of its composition and dose form.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPharmaceutical_Characteristics</a>
 */
public
class MedicinalProductPharmaceuticalCharacteristics extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected CodeableConcept status;
  
  public MedicinalProductPharmaceuticalCharacteristics()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPharmaceuticalCharacteristics) {
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
    return "MedicinalProductPharmaceuticalCharacteristics(" + id + ")";
  }
}
