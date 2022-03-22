package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who or what performed the event.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationdispense-definitions.html#MedicationDispense.performer">MedicationDispense.performer</a>
 */
public 
class MedicationDispensePerformer extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5109906424514175072L;
  
  protected CodeableConcept function;
  protected Reference<Resource> actor;
  
  public MedicationDispensePerformer()
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
    if(object instanceof MedicationDispensePerformer) {
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
    return "MedicationDispensePerformer(" + id + ")";
  }
}
