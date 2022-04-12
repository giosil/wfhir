package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 *
 * @see <a href="https://www.hl7.org/fhir">Coverage_Exception</a>
 */
public
class CoverageException extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Period period;
  protected CodeableConcept type;
  
  public CoverageException()
  {
  }
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageException) {
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
    return "CoverageException(" + id + ")";
  }
}
