package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Limit</a>
 */
public
class InsurancePlanLimit extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected Quantity value;
  
  public InsurancePlanLimit()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Quantity getValue() {
    return value;
  }
  
  public void setValue(Quantity value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanLimit) {
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
    return "InsurancePlanLimit(" + id + ")";
  }
}
