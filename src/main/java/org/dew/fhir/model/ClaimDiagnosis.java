package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Diagnosis</a>
 */
public
class ClaimDiagnosis extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer sequence;
  protected CodeableConcept onAdmission;
  protected CodeableConcept packageCode;
  protected CodeableConcept[] type;
  protected Reference<Resource> diagnosisReference;
  protected CodeableConcept diagnosisCodeableConcept;
  
  public ClaimDiagnosis()
  {
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public CodeableConcept getOnAdmission() {
    return onAdmission;
  }
  
  public void setOnAdmission(CodeableConcept onAdmission) {
    this.onAdmission = onAdmission;
  }
  
  public CodeableConcept getPackageCode() {
    return packageCode;
  }
  
  public void setPackageCode(CodeableConcept packageCode) {
    this.packageCode = packageCode;
  }
  
  public CodeableConcept[] getType() {
    return type;
  }
  
  public void setType(CodeableConcept[] type) {
    this.type = type;
  }
  
  public Reference<Resource> getDiagnosisReference() {
    return diagnosisReference;
  }
  
  public void setDiagnosisReference(Reference<Resource> diagnosisReference) {
    this.diagnosisReference = diagnosisReference;
  }
  
  public CodeableConcept getDiagnosisCodeableConcept() {
    return diagnosisCodeableConcept;
  }
  
  public void setDiagnosisCodeableConcept(CodeableConcept diagnosisCodeableConcept) {
    this.diagnosisCodeableConcept = diagnosisCodeableConcept;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimDiagnosis) {
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
    return "ClaimDiagnosis(" + id + ")";
  }
}
