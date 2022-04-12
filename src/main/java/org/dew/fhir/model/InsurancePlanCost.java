package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Cost</a>
 */
public
class InsurancePlanCost extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] qualifiers;
  protected CodeableConcept applicability;
  protected CodeableConcept type;
  protected Quantity value;
  
  public InsurancePlanCost()
  {
  }
  
  public CodeableConcept[] getQualifiers() {
    return qualifiers;
  }
  
  public void setQualifiers(CodeableConcept[] qualifiers) {
    this.qualifiers = qualifiers;
  }
  
  public CodeableConcept getApplicability() {
    return applicability;
  }
  
  public void setApplicability(CodeableConcept applicability) {
    this.applicability = applicability;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Quantity getValue() {
    return value;
  }
  
  public void setValue(Quantity value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanCost) {
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
    return "InsurancePlanCost(" + id + ")";
  }
}
