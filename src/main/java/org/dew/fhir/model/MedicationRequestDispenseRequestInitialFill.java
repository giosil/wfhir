package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates the quantity or duration for the first dispense of the medication.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationrequest-definitions.html#MedicationRequest.dispenseRequest.initialFill">MedicationRequest.dispenseRequest.initialFill</a>
 */
public 
class MedicationRequestDispenseRequestInitialFill extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 5617814817319969796L;

  protected SimpleQuantity quantity;
  protected Duration duration;
  
  public MedicationRequestDispenseRequestInitialFill()
  {
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public Duration getDuration() {
    return duration;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationRequestDispenseRequestInitialFill) {
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
    return "MedicationRequestDispenseRequestInitialFill(" + id + ")";
  }
}
