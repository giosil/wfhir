package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 *
 * @see <a href="https://www.hl7.org/fhir">MeasureReport_Component</a>
 */
public
class MeasureReportComponent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected CodeableConcept value;
  
  public MeasureReportComponent()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public CodeableConcept getValue() {
    return value;
  }
  
  public void setValue(CodeableConcept value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureReportComponent) {
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
    return "MeasureReportComponent(" + id + ")";
  }
}
