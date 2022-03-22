package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates whether or not substitution was made as part of the dispense. 
 * In some cases, substitution will be expected but does not happen, in other cases substitution is not expected but does happen. 
 * This block explains what substitution did or did not happen and why. 
 * If nothing is specified, substitution was not done.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationdispense-definitions.html#MedicationDispense.substitution">MedicationDispense.substitution</a>
 */
public 
class MedicationDispenseSubstitution extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8606185792977961076L;
  
  protected Boolean wasSubstituted;
  protected CodeableConcept type;
  protected CodeableConcept[] reason;
  protected Reference<Resource>[] responsibleParty;
  
  public MedicationDispenseSubstitution()
  {
  }

  public Boolean getWasSubstituted() {
    return wasSubstituted;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getReason() {
    return reason;
  }

  public Reference<Resource>[] getResponsibleParty() {
    return responsibleParty;
  }

  public void setWasSubstituted(Boolean wasSubstituted) {
    this.wasSubstituted = wasSubstituted;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setReason(CodeableConcept[] reason) {
    this.reason = reason;
  }

  public void setResponsibleParty(Reference<Resource>[] responsibleParty) {
    this.responsibleParty = responsibleParty;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationDispenseSubstitution) {
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
    return "MedicationDispenseSubstitution(" + id + ")";
  }
}
