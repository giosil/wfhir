package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 *
 * @see <a href="https://www.hl7.org/fhir/relatedperson.html">RelatedPerson</a>
 */
public 
class RelatedPerson extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 8696893625777526503L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected Reference<Patient> patient;
  protected CodeableConcept[] relationship;
  protected HumanName[] name;
  protected ContactPoint[] telecom;
  protected String gender;
  protected Date birthDate;
  protected Address[] address;
  protected Attachment[] photo;
  protected Period period;
  protected RelatedPersonCommunication[] communication;
  
  public RelatedPerson()
  {
    this.resourceType = "RelatedPerson";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Boolean getActive() {
    return active;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public CodeableConcept[] getRelationship() {
    return relationship;
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

  public Address[] getAddress() {
    return address;
  }

  public Attachment[] getPhoto() {
    return photo;
  }

  public Period getPeriod() {
    return period;
  }

  public RelatedPersonCommunication[] getCommunication() {
    return communication;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setRelationship(CodeableConcept[] relationship) {
    this.relationship = relationship;
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

  public void setAddress(Address[] address) {
    this.address = address;
  }

  public void setPhoto(Attachment[] photo) {
    this.photo = photo;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setCommunication(RelatedPersonCommunication[] communication) {
    this.communication = communication;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RelatedPerson) {
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
    return "RelatedPerson(" + id + ")";
  }
}
