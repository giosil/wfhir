package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Describes validation requirements, source(s), status and dates for one or more elements.
 *
 * @see <a href="https://www.hl7.org/fhir">VerificationResult_PrimarySource</a>
 */
public
class VerificationResultPrimarySource extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] pushTypeAvailable;
  protected CodeableConcept[] communicationMethod;
  protected Date validationDate;
  protected CodeableConcept[] type;
  protected CodeableConcept validationStatus;
  protected Reference<Resource> who;
  protected CodeableConcept canPushUpdates;
  
  public VerificationResultPrimarySource()
  {
  }
  
  public CodeableConcept[] getPushTypeAvailable() {
    return pushTypeAvailable;
  }
  
  public void setPushTypeAvailable(CodeableConcept[] pushTypeAvailable) {
    this.pushTypeAvailable = pushTypeAvailable;
  }
  
  public CodeableConcept[] getCommunicationMethod() {
    return communicationMethod;
  }
  
  public void setCommunicationMethod(CodeableConcept[] communicationMethod) {
    this.communicationMethod = communicationMethod;
  }
  
  public Date getValidationDate() {
    return validationDate;
  }
  
  public void setValidationDate(Date validationDate) {
    this.validationDate = validationDate;
  }
  
  public CodeableConcept[] getType() {
    return type;
  }
  
  public void setType(CodeableConcept[] type) {
    this.type = type;
  }
  
  public CodeableConcept getValidationStatus() {
    return validationStatus;
  }
  
  public void setValidationStatus(CodeableConcept validationStatus) {
    this.validationStatus = validationStatus;
  }
  
  public Reference<Resource> getWho() {
    return who;
  }
  
  public void setWho(Reference<Resource> who) {
    this.who = who;
  }
  
  public CodeableConcept getCanPushUpdates() {
    return canPushUpdates;
  }
  
  public void setCanPushUpdates(CodeableConcept canPushUpdates) {
    this.canPushUpdates = canPushUpdates;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VerificationResultPrimarySource) {
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
    return "VerificationResultPrimarySource(" + id + ")";
  }
}
