package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 *
 * @see <a href="https://www.hl7.org/fhir/patient.html">Patient</a>
 */
public 
class Patient extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -4436253357387343929L;
  
  protected Identifier[] identifier;
  protected boolean active;
  protected HumanName name;
  protected ContactPoint telecom;
  protected String gender;
  protected Date birthDate;
  protected boolean deceasedBoolean;
  protected Date deceasedDateTime;
  protected Address[] address;
  protected CodeableConcept maritalStatus;
  protected boolean multipleBirthBoolean;
  protected int multipleBirthInteger;
  protected Attachment photo;
  protected PatientContact contact;
  protected PatientCommunication communication;
  protected Reference<Resource> generalPractitioner;
  protected Reference<Organization> managingOrganization;
  protected PatientLink link;
  
  public Patient()
  {
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public boolean isActive() {
    return active;
  }

  public HumanName getName() {
    return name;
  }

  public ContactPoint getTelecom() {
    return telecom;
  }

  public String getGender() {
    return gender;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public boolean isDeceasedBoolean() {
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

  public boolean isMultipleBirthBoolean() {
    return multipleBirthBoolean;
  }

  public int getMultipleBirthInteger() {
    return multipleBirthInteger;
  }

  public Attachment getPhoto() {
    return photo;
  }

  public PatientContact getContact() {
    return contact;
  }

  public PatientCommunication getCommunication() {
    return communication;
  }

  public Reference<Resource> getGeneralPractitioner() {
    return generalPractitioner;
  }

  public Reference<Organization> getManagingOrganization() {
    return managingOrganization;
  }

  public PatientLink getLink() {
    return link;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public void setName(HumanName name) {
    this.name = name;
  }

  public void setTelecom(ContactPoint telecom) {
    this.telecom = telecom;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public void setDeceasedBoolean(boolean deceasedBoolean) {
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

  public void setMultipleBirthBoolean(boolean multipleBirthBoolean) {
    this.multipleBirthBoolean = multipleBirthBoolean;
  }

  public void setMultipleBirthInteger(int multipleBirthInteger) {
    this.multipleBirthInteger = multipleBirthInteger;
  }

  public void setPhoto(Attachment photo) {
    this.photo = photo;
  }

  public void setContact(PatientContact contact) {
    this.contact = contact;
  }

  public void setCommunication(PatientCommunication communication) {
    this.communication = communication;
  }

  public void setGeneralPractitioner(Reference<Resource> generalPractitioner) {
    this.generalPractitioner = generalPractitioner;
  }

  public void setManagingOrganization(Reference<Organization> managingOrganization) {
    this.managingOrganization = managingOrganization;
  }

  public void setLink(PatientLink link) {
    this.link = link;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Patient) {
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
    return "Patient(" + id + "," + name + ")";
  }
}
