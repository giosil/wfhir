package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * @see <a href="https://www.hl7.org/fhir/practitioner.html">Practitioner</a>
 */
public 
class Practitioner extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 607114238760110468L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected HumanName[] name;
  protected ContactPoint[] telecom;
  protected Address[] address;
  protected String gender;
  protected Date birthDate;
  protected Attachment[] photo;
  protected PractitionerQualification[] qualification;
  protected CodeableConcept[] communication;
  
  public Practitioner()
  {
    this.resourceType = "Practitioner";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Boolean getActive() {
    return active;
  }

  public HumanName[] getName() {
    return name;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public Address[] getAddress() {
    return address;
  }

  public String getGender() {
    return gender;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public Attachment[] getPhoto() {
    return photo;
  }

  public PractitionerQualification[] getQualification() {
    return qualification;
  }

  public CodeableConcept[] getCommunication() {
    return communication;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void setName(HumanName[] name) {
    this.name = name;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setAddress(Address[] address) {
    this.address = address;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public void setPhoto(Attachment[] photo) {
    this.photo = photo;
  }

  public void setQualification(PractitionerQualification[] qualification) {
    this.qualification = qualification;
  }

  public void setCommunication(CodeableConcept[] communication) {
    this.communication = communication;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Practitioner) {
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
    return "Practitioner(" + id + "," + qualification + ")";
  }
}
