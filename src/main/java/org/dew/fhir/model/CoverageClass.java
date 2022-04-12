package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 *
 * @see <a href="https://www.hl7.org/fhir">Coverage_Class</a>
 */
public
class CoverageClass extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String name;
  protected CodeableConcept type;
  protected String value;
  
  public CoverageClass()
  {
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageClass) {
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
    return "CoverageClass(" + id + ")";
  }
}
