package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Details about each adverse reaction event linked to exposure to the identified substance.
 *
 * @see <a href="https://www.hl7.org/fhir/allergyintolerance-definitions.html#AllergyIntolerance.reaction">AllergyIntolerance.reaction</a>
 */
public 
class AllergyIntoleranceReaction extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4143808528758969230L;

  protected CodeableConcept substance;
  protected CodeableConcept[] manifestation;
  protected String description;
  protected Date onset;
  protected String severity;
  protected CodeableConcept exposureRoute;
  protected Annotation[] note;
  
  public AllergyIntoleranceReaction()
  {
  }

  public CodeableConcept getSubstance() {
    return substance;
  }

  public CodeableConcept[] getManifestation() {
    return manifestation;
  }

  public String getDescription() {
    return description;
  }

  public Date getOnset() {
    return onset;
  }

  public String getSeverity() {
    return severity;
  }

  public CodeableConcept getExposureRoute() {
    return exposureRoute;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setSubstance(CodeableConcept substance) {
    this.substance = substance;
  }

  public void setManifestation(CodeableConcept[] manifestation) {
    this.manifestation = manifestation;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setOnset(Date onset) {
    this.onset = onset;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public void setExposureRoute(CodeableConcept exposureRoute) {
    this.exposureRoute = exposureRoute;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AllergyIntoleranceReaction) {
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
    return "AllergyIntoleranceReaction(" + id + "," + description + ")";
  }
}
