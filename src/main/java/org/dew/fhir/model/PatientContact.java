package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A contact party (e.g. guardian, partner, friend) for the patient.
 *
 * @see <a href="https://www.hl7.org/fhir/patient-definitions.html#Patient.contact">Patient.contact</a>
 */
public 
class PatientContact extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 5291225690011634798L;
  
  protected CodeableConcept[] relationship;
  protected HumanName name;
  protected ContactPoint[] telecom;
  protected Address address;
  protected String gender;
  protected Reference<Organization> organization;
  protected Period period;
  
  public PatientContact()
  {
  }

  public CodeableConcept[] getRelationship() {
    return relationship;
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

  public String getGender() {
    return gender;
  }

  public Reference<Organization> getOrganization() {
    return organization;
  }

  public Period getPeriod() {
    return period;
  }

  public void setRelationship(CodeableConcept[] relationship) {
    this.relationship = relationship;
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

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setOrganization(Reference<Organization> organization) {
    this.organization = organization;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PatientContact) {
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
    return "PatientContact(" + id + "," + relationship + "," + name + "," + address + ")";
  }
}
