package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * @see <a href="https://www.hl7.org/fhir">VisionPrescription_Prism</a>
 */
public
class VisionPrescriptionPrism extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Double amount;
  protected String base;
  
  public VisionPrescriptionPrism()
  {
  }
  
  public Double getAmount() {
    return amount;
  }
  
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  
  public String getBase() {
    return base;
  }
  
  public void setBase(String base) {
    this.base = base;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VisionPrescriptionPrism) {
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
    return "VisionPrescriptionPrism(" + id + ")";
  }
}
