package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A language which may be used to communicate with about the patient's health.
 *
 * @see <a href="https://www.hl7.org/fhir/relatedperson-definitions.html#RelatedPerson.communication">elatedPerson.communication</a>
 */
public 
class RelatedPersonCommunication extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 2931968668792248752L;
  
  protected CodeableConcept language;
  protected Boolean preferred;
  
  public RelatedPersonCommunication()
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
    if(object instanceof RelatedPersonCommunication) {
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
    return "RelatedPersonCommunication(" + id + ")";
  }
}
