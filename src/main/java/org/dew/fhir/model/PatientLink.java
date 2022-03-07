package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Link to another patient resource that concerns the same actual patient.
 *
 * @see <a href="https://www.hl7.org/fhir/patient-definitions.html#Patient.link">Patient.link</a>
 */
public 
class PatientLink extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -543087148360618288L;
  
  protected Reference<Resource> other;
  protected String type;
  
  public PatientLink()
  {
  }
  
  public Reference<Resource> getOther() {
    return other;
  }

  public String getType() {
    return type;
  }

  public void setOther(Reference<Resource> other) {
    this.other = other;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PatientLink) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(other == null) return 0;
    return other.hashCode();
  }
  
  @Override
  public String toString() {
    return "PatientLink(" + id + "," + other + "," + type + ")";
  }
}
