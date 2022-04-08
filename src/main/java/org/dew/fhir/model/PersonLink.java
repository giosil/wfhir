package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Link to a resource that concerns the same actual person.
 *
 * @see <a href="https://build.fhir.org/person-definitions.html#Person.link">Person.link</a>
 */
public 
class PersonLink extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7112267698097667682L;
  
  protected Reference<Resource> target;
  protected String assurance;
  
  public PersonLink()
  {
  }

  public Reference<Resource> getTarget() {
    return target;
  }

  public String getAssurance() {
    return assurance;
  }

  public void setTarget(Reference<Resource> target) {
    this.target = target;
  }

  public void setAssurance(String assurance) {
    this.assurance = assurance;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PersonLink) {
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
    return "PersonLink(" + id + ")";
  }
}
