package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_SupportingInfo</a>
 */
public
class ClaimSupportingInfo extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean valueBoolean;
  protected CodeableConcept reason;
  protected CodeableConcept code;
  protected Reference<Resource> valueReference;
  protected Period timingPeriod;
  protected Date timingDate;
  protected Integer sequence;
  protected Attachment valueAttachment;
  protected String valueString;
  protected CodeableConcept category;
  protected Quantity valueQuantity;
  
  public ClaimSupportingInfo()
  {
  }
  
  public Boolean getValueBoolean() {
    return valueBoolean;
  }
  
  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }
  
  public CodeableConcept getReason() {
    return reason;
  }
  
  public void setReason(CodeableConcept reason) {
    this.reason = reason;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Reference<Resource> getValueReference() {
    return valueReference;
  }
  
  public void setValueReference(Reference<Resource> valueReference) {
    this.valueReference = valueReference;
  }
  
  public Period getTimingPeriod() {
    return timingPeriod;
  }
  
  public void setTimingPeriod(Period timingPeriod) {
    this.timingPeriod = timingPeriod;
  }
  
  public Date getTimingDate() {
    return timingDate;
  }
  
  public void setTimingDate(Date timingDate) {
    this.timingDate = timingDate;
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public Attachment getValueAttachment() {
    return valueAttachment;
  }
  
  public void setValueAttachment(Attachment valueAttachment) {
    this.valueAttachment = valueAttachment;
  }
  
  public String getValueString() {
    return valueString;
  }
  
  public void setValueString(String valueString) {
    this.valueString = valueString;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  public Quantity getValueQuantity() {
    return valueQuantity;
  }
  
  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimSupportingInfo) {
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
    return "ClaimSupportingInfo(" + id + ")";
  }
}
