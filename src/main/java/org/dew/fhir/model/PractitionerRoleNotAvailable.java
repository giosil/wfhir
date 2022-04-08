package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * he practitioner is not available or performing this role during this period of time due to the provided reason.
 *
 * @see <a href="https://build.fhir.org/practitionerrole-definitions.html#PractitionerRole.notAvailable">PractitionerRole.notAvailable</a>
 */
public 
class PractitionerRoleNotAvailable extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7203286605169483850L;
  
  protected String description;
  protected Period during;
  
  public PractitionerRoleNotAvailable()
  {
  }

  public String getDescription() {
    return description;
  }

  public Period getDuring() {
    return during;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDuring(Period during) {
    this.during = during;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PractitionerRoleNotAvailable) {
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
    return "PractitionerRoleNotAvailable(" + id + "," + description + "," + during + ")";
  }
}
