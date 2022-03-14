package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Limited to "real" people rather than equipment.
 *
 * @see <a href="https://www.hl7.org/fhir/procedure-definitions.html#Procedure.performer">Procedure.performer</a>
 */
public 
class ProcedurePerformer extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 7762353712687514812L;
  
  protected CodeableConcept function;
  protected Reference<Resource> actor;
  protected Reference<Organization> onBehalfOf;
  
  public ProcedurePerformer()
  {
  }

  public CodeableConcept getFunction() {
    return function;
  }

  public Reference<Resource> getActor() {
    return actor;
  }

  public Reference<Organization> getOnBehalfOf() {
    return onBehalfOf;
  }

  public void setFunction(CodeableConcept function) {
    this.function = function;
  }

  public void setActor(Reference<Resource> actor) {
    this.actor = actor;
  }

  public void setOnBehalfOf(Reference<Organization> onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ProcedurePerformer) {
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
    return "ProcedurePerformer(" + id + ")";
  }
}
