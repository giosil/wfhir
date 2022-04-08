package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Demographics and administrative information about a person independent of a specific health-related context.
 *
 * @see <a href="https://build.fhir.org/person.html">Person</a>
 */
public 
class Person extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -7513322106890764716L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected HumanName[] name;
  protected ContactPoint[] telecom;
  protected String gender;
  protected Date birthDate;
  protected Boolean deceasedBoolean;
  protected Date deceasedDateTime;
  protected Address[] address;
  protected CodeableConcept maritalStatus;
  protected Attachment[] photo;
  protected Reference<Organization> managingOrganization;
  protected PersonCommunication[] communication;
  protected PersonLink[] link;
  
  public Person()
  {
    this.resourceType = "Person";
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

  public String getGender() {
    return gender;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public Boolean getDeceasedBoolean() {
    return deceasedBoolean;
  }

  public Date getDeceasedDateTime() {
    return deceasedDateTime;
  }

  public Address[] getAddress() {
    return address;
  }

  public CodeableConcept getMaritalStatus() {
    return maritalStatus;
  }

  public Attachment[] getPhoto() {
    return photo;
  }

  public Reference<Organization> getManagingOrganization() {
    return managingOrganization;
  }

  public PersonCommunication[] getCommunication() {
    return communication;
  }

  public PersonLink[] getLink() {
    return link;
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

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public void setDeceasedBoolean(Boolean deceasedBoolean) {
    this.deceasedBoolean = deceasedBoolean;
  }

  public void setDeceasedDateTime(Date deceasedDateTime) {
    this.deceasedDateTime = deceasedDateTime;
  }

  public void setAddress(Address[] address) {
    this.address = address;
  }

  public void setMaritalStatus(CodeableConcept maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public void setPhoto(Attachment[] photo) {
    this.photo = photo;
  }

  public void setManagingOrganization(Reference<Organization> managingOrganization) {
    this.managingOrganization = managingOrganization;
  }

  public void setCommunication(PersonCommunication[] communication) {
    this.communication = communication;
  }

  public void setLink(PersonLink[] link) {
    this.link = link;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Person) {
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
    return "Person(" + id + ")";
  }
}
