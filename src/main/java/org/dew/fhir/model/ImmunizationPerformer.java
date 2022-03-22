package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who performed the immunization event.
 *
 * @see <a href="https://www.hl7.org/fhir/immunization-definitions.html#Immunization.performer">Immunization.performer</a>
 */
public 
class ImmunizationPerformer extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7513458590434416709L;
  
  protected CodeableConcept function;
  protected Reference<Resource> actor;
  
  public ImmunizationPerformer()
  {
  }

  public CodeableConcept getFunction() {
    return function;
  }

  public Reference<Resource> getActor() {
    return actor;
  }

  public void setFunction(CodeableConcept function) {
    this.function = function;
  }

  public void setActor(Reference<Resource> actor) {
    this.actor = actor;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationPerformer) {
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
    return "ImmunizationPerformer(" + id + ")";
  }
}
