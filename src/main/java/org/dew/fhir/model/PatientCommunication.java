package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A language which may be used to communicate with the patient about his or her health.
 *
 * @see <a href="https://www.hl7.org/fhir/patient-definitions.html#Patient.communication">Patient.communication</a>
 */
public 
class PatientCommunication extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -8975011077633126077L;
  
  protected CodeableConcept language;
  protected Boolean preferred;
  
  public PatientCommunication()
  {
  }

  public CodeableConcept getLanguage() {
    return language;
  }

  public Boolean getPreferred() {
    return preferred;
  }

  public void setLanguage(CodeableConcept language) {
    this.language = language;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PatientCommunication) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(language == null) return 0;
    return language.hashCode();
  }
  
  @Override
  public String toString() {
    return "PatientCommunication(" + id + "," + language + "," + preferred + ")";
  }
}
