package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityRequest_Diagnosis</a>
 */
public
class CoverageEligibilityRequestDiagnosis extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> diagnosisReference;
  protected CodeableConcept diagnosisCodeableConcept;
  
  public CoverageEligibilityRequestDiagnosis()
  {
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
    if(object instanceof CoverageEligibilityRequestDiagnosis) {
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
    return "CoverageEligibilityRequestDiagnosis(" + id + ")";
  }
}
