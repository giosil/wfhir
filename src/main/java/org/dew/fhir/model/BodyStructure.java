package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Record details about an anatomical structure. 
 * This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
 *
 * @see <a href="https://www.hl7.org/fhir/bodystructure.html">BodyStructure</a>
 */
public 
class BodyStructure extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 231224956059441942L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected CodeableConcept morphology;
  protected CodeableConcept location;
  protected CodeableConcept[] locationQualifier;
  protected String description;
  protected Attachment[] image;
  protected Reference<Patient> patient;
  
  public BodyStructure()
  {
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Boolean getActive() {
    return active;
  }

  public CodeableConcept getMorphology() {
    return morphology;
  }

  public CodeableConcept getLocation() {
    return location;
  }

  public CodeableConcept[] getLocationQualifier() {
    return locationQualifier;
  }

  public String getDescription() {
    return description;
  }

  public Attachment[] getImage() {
    return image;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void setMorphology(CodeableConcept morphology) {
    this.morphology = morphology;
  }

  public void setLocation(CodeableConcept location) {
    this.location = location;
  }

  public void setLocationQualifier(CodeableConcept[] locationQualifier) {
    this.locationQualifier = locationQualifier;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setImage(Attachment[] image) {
    this.image = image;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BodyStructure) {
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
    return "BodyStructure(" + id + ")";
  }
}
