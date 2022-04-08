package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The ExtendedContactDetail structure defines extended contact details.
 *
 * @see <a href="https://build.fhir.org/metadatatypes.html#ExtendedContactDetail">ExtendedContactDetail</a>
 */
public 
class ExtendedContactDetail extends Element implements Serializable
{
  private static final long serialVersionUID = -3971606514817925955L;
  
  protected CodeableConcept purpose;
  protected HumanName name;
  protected ContactPoint[] telecom;
  protected Address address;
  protected Reference<Organization> organization;
  protected Period period;
  
  public ExtendedContactDetail()
  {
  }
  
  public ExtendedContactDetail(HumanName name)
  {
    this.name = name;
  }
  
  public ExtendedContactDetail(HumanName name, ContactPoint contactPoint)
  {
    this.name = name;
    if(contactPoint != null) {
      this.telecom = new ContactPoint[]{ contactPoint };
    }
  }
  
  public ExtendedContactDetail(HumanName name, ContactPoint[] telecom)
  {
    this.name = name;
    this.telecom = telecom;
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

  public Reference<Organization> getOrganization() {
    return organization;
  }

  public Period getPeriod() {
    return period;
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

  public void setOrganization(Reference<Organization> organization) {
    this.organization = organization;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExtendedContactDetail) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(name == null) return 0;
    return name.hashCode();
  }
  
  @Override
  public String toString() {
    return "ExtendedContactDetail(" + name + ")";
  }
}
