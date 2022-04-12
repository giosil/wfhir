package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * @see <a href="https://www.hl7.org/fhir">VisionPrescription</a>
 */
public
class VisionPrescription extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> prescriber;
  protected Identifier[] identifier;
  protected Date created;
  protected Reference<Resource> encounter;
  protected VisionPrescriptionLensSpecification[] lensSpecification;
  protected Date dateWritten;
  protected Reference<Resource> patient;
  protected String status;
  
  public VisionPrescription()
  {
    this.resourceType = "VisionPrescription";
  }
  
  public Reference<Resource> getPrescriber() {
    return prescriber;
  }
  
  public void setPrescriber(Reference<Resource> prescriber) {
    this.prescriber = prescriber;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public Reference<Resource> getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource> encounter) {
    this.encounter = encounter;
  }
  
  public VisionPrescriptionLensSpecification[] getLensSpecification() {
    return lensSpecification;
  }
  
  public void setLensSpecification(VisionPrescriptionLensSpecification[] lensSpecification) {
    this.lensSpecification = lensSpecification;
  }
  
  public Date getDateWritten() {
    return dateWritten;
  }
  
  public void setDateWritten(Date dateWritten) {
    this.dateWritten = dateWritten;
  }
  
  public Reference<Resource> getPatient() {
    return patient;
  }
  
  public void setPatient(Reference<Resource> patient) {
    this.patient = patient;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VisionPrescription) {
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
    return "VisionPrescription(" + id + ")";
  }
}
