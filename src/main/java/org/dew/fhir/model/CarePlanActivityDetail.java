package org.dew.fhir.model;

import java.io.Serializable;

/**
 *  
 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
 *
 * @see <a href="https://www.hl7.org/fhir/careplan-definitions.html#CarePlan.activity.detail">CarePlan.activity.detail</a>
 */
public 
class CarePlanActivityDetail extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -230274979460075295L;
  
  protected String kind;
  protected String[] instantiatesCanonical;
  protected CodeableConcept code;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Reference<Goal> goal;
  protected String status;
  protected CodeableConcept statusReason;
  protected Boolean doNotPerform;
  protected Timing scheduledTiming;
  protected Period scheduledPeriod;
  protected String scheduledString;
  protected Reference<Location> location;
  protected Reference<Resource> performer;
  protected CodeableConcept productCodeableConcept;
  protected Reference<Resource> productReference;
  protected SimpleQuantity dailyAmount;
  protected SimpleQuantity quantity;
  protected String description;
  
  public CarePlanActivityDetail()
  {
  }

  public String getKind() {
    return kind;
  }

  public String[] getInstantiatesCanonical() {
    return instantiatesCanonical;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Reference<Goal> getGoal() {
    return goal;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getStatusReason() {
    return statusReason;
  }

  public Boolean getDoNotPerform() {
    return doNotPerform;
  }

  public Timing getScheduledTiming() {
    return scheduledTiming;
  }

  public Period getScheduledPeriod() {
    return scheduledPeriod;
  }

  public String getScheduledString() {
    return scheduledString;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public Reference<Resource> getPerformer() {
    return performer;
  }

  public CodeableConcept getProductCodeableConcept() {
    return productCodeableConcept;
  }

  public Reference<Resource> getProductReference() {
    return productReference;
  }

  public SimpleQuantity getDailyAmount() {
    return dailyAmount;
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public String getDescription() {
    return description;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setInstantiatesCanonical(String[] instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setGoal(Reference<Goal> goal) {
    this.goal = goal;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept statusReason) {
    this.statusReason = statusReason;
  }

  public void setDoNotPerform(Boolean doNotPerform) {
    this.doNotPerform = doNotPerform;
  }

  public void setScheduledTiming(Timing scheduledTiming) {
    this.scheduledTiming = scheduledTiming;
  }

  public void setScheduledPeriod(Period scheduledPeriod) {
    this.scheduledPeriod = scheduledPeriod;
  }

  public void setScheduledString(String scheduledString) {
    this.scheduledString = scheduledString;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setPerformer(Reference<Resource> performer) {
    this.performer = performer;
  }

  public void setProductCodeableConcept(CodeableConcept productCodeableConcept) {
    this.productCodeableConcept = productCodeableConcept;
  }

  public void setProductReference(Reference<Resource> productReference) {
    this.productReference = productReference;
  }

  public void setDailyAmount(SimpleQuantity dailyAmount) {
    this.dailyAmount = dailyAmount;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CarePlanActivityDetail) {
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
    return "CarePlanActivityDetail(" + id + ")";
  }
}
