package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Describes validation requirements, source(s), status and dates for one or more elements.
 *
 * @see <a href="https://www.hl7.org/fhir">VerificationResult</a>
 */
public
class VerificationResult extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date statusDate;
  protected Date nextScheduled;
  protected VerificationResultPrimarySource[] primarySource;
  protected CodeableConcept validationType;
  protected VerificationResultValidator[] validator;
  protected String[] targetLocation;
  protected Timing frequency;
  protected CodeableConcept failureAction;
  protected VerificationResultAttestation attestation;
  protected CodeableConcept need;
  protected Reference<Resource>[] target;
  protected Date lastPerformed;
  protected CodeableConcept[] validationProcess;
  protected String status;
  
  public VerificationResult()
  {
    this.resourceType = "VerificationResult";
  }
  
  public Date getStatusDate() {
    return statusDate;
  }
  
  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }
  
  public Date getNextScheduled() {
    return nextScheduled;
  }
  
  public void setNextScheduled(Date nextScheduled) {
    this.nextScheduled = nextScheduled;
  }
  
  public VerificationResultPrimarySource[] getPrimarySource() {
    return primarySource;
  }
  
  public void setPrimarySource(VerificationResultPrimarySource[] primarySource) {
    this.primarySource = primarySource;
  }
  
  public CodeableConcept getValidationType() {
    return validationType;
  }
  
  public void setValidationType(CodeableConcept validationType) {
    this.validationType = validationType;
  }
  
  public VerificationResultValidator[] getValidator() {
    return validator;
  }
  
  public void setValidator(VerificationResultValidator[] validator) {
    this.validator = validator;
  }
  
  public String[] getTargetLocation() {
    return targetLocation;
  }
  
  public void setTargetLocation(String[] targetLocation) {
    this.targetLocation = targetLocation;
  }
  
  public Timing getFrequency() {
    return frequency;
  }
  
  public void setFrequency(Timing frequency) {
    this.frequency = frequency;
  }
  
  public CodeableConcept getFailureAction() {
    return failureAction;
  }
  
  public void setFailureAction(CodeableConcept failureAction) {
    this.failureAction = failureAction;
  }
  
  public VerificationResultAttestation getAttestation() {
    return attestation;
  }
  
  public void setAttestation(VerificationResultAttestation attestation) {
    this.attestation = attestation;
  }
  
  public CodeableConcept getNeed() {
    return need;
  }
  
  public void setNeed(CodeableConcept need) {
    this.need = need;
  }
  
  public Reference<Resource>[] getTarget() {
    return target;
  }
  
  public void setTarget(Reference<Resource>[] target) {
    this.target = target;
  }
  
  public Date getLastPerformed() {
    return lastPerformed;
  }
  
  public void setLastPerformed(Date lastPerformed) {
    this.lastPerformed = lastPerformed;
  }
  
  public CodeableConcept[] getValidationProcess() {
    return validationProcess;
  }
  
  public void setValidationProcess(CodeableConcept[] validationProcess) {
    this.validationProcess = validationProcess;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VerificationResult) {
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
    return "VerificationResult(" + id + ")";
  }
}
