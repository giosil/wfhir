package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order). Note that this information is not always sent with the order. 
 * There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
 * 
 * @see <a href="https://www.hl7.org/fhir/medicationrequest-definitions.html#MedicationRequest.dispenseRequest">#MedicationRequest.dispenseRequest</a>
 */
public 
class MedicationRequestDispenseRequest extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1042231412046672983L;
  
  protected MedicationRequestDispenseRequestInitialFill initialFill;
  protected Duration dispenseInterval;
  protected Period validityPeriod;
  protected Integer numberOfRepeatsAllowed;
  protected SimpleQuantity quantity;
  protected Duration expectedSupplyDuration;
  protected Reference<Organization> performer;
  
  public MedicationRequestDispenseRequest()
  {
  }

  public MedicationRequestDispenseRequestInitialFill getInitialFill() {
    return initialFill;
  }

  public Duration getDispenseInterval() {
    return dispenseInterval;
  }

  public Period getValidityPeriod() {
    return validityPeriod;
  }

  public Integer getNumberOfRepeatsAllowed() {
    return numberOfRepeatsAllowed;
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public Duration getExpectedSupplyDuration() {
    return expectedSupplyDuration;
  }

  public Reference<Organization> getPerformer() {
    return performer;
  }

  public void setInitialFill(MedicationRequestDispenseRequestInitialFill initialFill) {
    this.initialFill = initialFill;
  }

  public void setDispenseInterval(Duration dispenseInterval) {
    this.dispenseInterval = dispenseInterval;
  }

  public void setValidityPeriod(Period validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  public void setNumberOfRepeatsAllowed(Integer numberOfRepeatsAllowed) {
    this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setExpectedSupplyDuration(Duration expectedSupplyDuration) {
    this.expectedSupplyDuration = expectedSupplyDuration;
  }

  public void setPerformer(Reference<Organization> performer) {
    this.performer = performer;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationRequestDispenseRequest) {
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
    return "MedicationRequestDispenseRequest(" + id + ")";
  }
}
