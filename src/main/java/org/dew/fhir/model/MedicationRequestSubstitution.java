package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates whether or not substitution can or should be part of the dispense. 
 * In some cases, substitution must happen, in other cases substitution must not happen. 
 * This block explains the prescriber's intent. If nothing is specified substitution may be done.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationrequest-definitions.html#MedicationRequest.substitution">MedicationRequest.substitution</a>
 */
public 
class MedicationRequestSubstitution extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6955488459940158255L;
  
  protected Boolean allowedBoolean;
  protected CodeableConcept allowedCodeableConcept;
  protected CodeableConcept reason;
  
  public MedicationRequestSubstitution()
  {
  }

  public Boolean getAllowedBoolean() {
    return allowedBoolean;
  }

  public CodeableConcept getAllowedCodeableConcept() {
    return allowedCodeableConcept;
  }

  public CodeableConcept getReason() {
    return reason;
  }

  public void setAllowedBoolean(Boolean allowedBoolean) {
    this.allowedBoolean = allowedBoolean;
  }

  public void setAllowedCodeableConcept(CodeableConcept allowedCodeableConcept) {
    this.allowedCodeableConcept = allowedCodeableConcept;
  }

  public void setReason(CodeableConcept reason) {
    this.reason = reason;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationRequestSubstitution) {
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
    return "MedicationRequestSubstitution(" + id + ")";
  }
}
