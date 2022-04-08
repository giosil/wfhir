package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A language which may be used to communicate with the person about his or her health.
 *
 * @see <a href="https://build.fhir.org/person-definitions.html#Person.communication">PersonCommunication</a>
 */
public 
class PersonCommunication extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -7659059228953717779L;

  protected CodeableConcept language;
  protected Boolean preferred;
  
  public PersonCommunication()
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
    if(object instanceof PersonCommunication) {
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
    return "PersonCommunication(" + id + ")";
  }
}
