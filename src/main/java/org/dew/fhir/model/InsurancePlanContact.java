package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan_Contact</a>
 */
public
class InsurancePlanContact extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Address address;
  protected CodeableConcept purpose;
  protected HumanName name;
  protected ContactPoint[] telecom;
  
  public InsurancePlanContact()
  {
  }
  
  public Address getAddress() {
    return address;
  }
  
  public void setAddress(Address address) {
    this.address = address;
  }
  
  public CodeableConcept getPurpose() {
    return purpose;
  }
  
  public void setPurpose(CodeableConcept purpose) {
    this.purpose = purpose;
  }
  
  public HumanName getName() {
    return name;
  }
  
  public void setName(HumanName name) {
    this.name = name;
  }
  
  public ContactPoint[] getTelecom() {
    return telecom;
  }
  
  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlanContact) {
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
    return "InsurancePlanContact(" + id + ")";
  }
}
