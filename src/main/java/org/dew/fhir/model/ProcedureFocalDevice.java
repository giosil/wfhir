package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 *
 * @see <a href="https://www.hl7.org/fhir/procedure-definitions.html#Procedure.focalDevice">Procedure.focalDevice</a>
 */
public 
class ProcedureFocalDevice extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 485619157656371992L;
  
  protected CodeableConcept action;
  protected Reference<Resource> manipulated;
  
  public ProcedureFocalDevice()
  {
  }

  public CodeableConcept getAction() {
    return action;
  }

  public Reference<Resource> getManipulated() {
    return manipulated;
  }

  public void setAction(CodeableConcept action) {
    this.action = action;
  }

  public void setManipulated(Reference<Resource> manipulated) {
    this.manipulated = manipulated;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ProcedureFocalDevice) {
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
    return "ProcedureFocalDevice(" + id + ")";
  }
}
