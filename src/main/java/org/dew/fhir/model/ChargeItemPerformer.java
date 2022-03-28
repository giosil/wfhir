package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who or what performed or participated in the charged service.
 *
 * @see <a href="https://www.hl7.org/fhir/chargeitem-definitions.html#ChargeItem.performer">ChargeItem.performer</a>
 */
public 
class ChargeItemPerformer extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3022560590143156775L;
  
  protected CodeableConcept function;
  protected Reference<Resource> actor;
  
  public ChargeItemPerformer()
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
    if(object instanceof ChargeItemPerformer) {
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
    return "ChargeItemPerformer(" + id + "," + function + "," + actor + ")";
  }
}
