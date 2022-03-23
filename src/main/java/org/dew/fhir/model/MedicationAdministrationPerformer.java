package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who or what performed the medication administration and how they were involved.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationadministration-definitions.html#MedicationAdministration.performer">MedicationAdministration.performer</a>
 */
public 
class MedicationAdministrationPerformer extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 5467023693593327776L;
  
  protected CodeableConcept function;
  protected Reference<Resource> actor;
  
  public MedicationAdministrationPerformer()
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
    if(object instanceof MedicationAdministrationPerformer) {
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
    return "MedicationAdministrationPerformer(" + id + ")";
  }
}
