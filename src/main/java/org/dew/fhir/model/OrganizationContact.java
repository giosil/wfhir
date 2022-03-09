package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Contact for the organization for a certain purpose.
 *
 * @see <a href="https://www.hl7.org/fhir/organization-definitions.html#Organization.contact">Organization.contact</a>
 */
public 
class OrganizationContact extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -1614091879967359745L;
  
  protected CodeableConcept purpose;
  protected HumanName name;
  protected ContactPoint[] telecom;
  protected Address address;
  
  public OrganizationContact()
  {
  }
  
  public CodeableConcept getPurpose() {
    return purpose;
  }

  public HumanName getName() {
    return name;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public Address getAddress() {
    return address;
  }

  public void setPurpose(CodeableConcept purpose) {
    this.purpose = purpose;
  }

  public void setName(HumanName name) {
    this.name = name;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof OrganizationContact) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(address == null) return 0;
    return address.hashCode();
  }
  
  @Override
  public String toString() {
    return "OrganizationContact(" + id + "," + purpose + "," + name + "," + address + ")";
  }
}
