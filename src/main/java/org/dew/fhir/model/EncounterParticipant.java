package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The list of people responsible for providing the service.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter-definitions.html#Encounter.participant">Encounter.participant</a>
 */
public 
class EncounterParticipant extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3663406590997140778L;
  
  protected CodeableConcept[] type;
  protected Period period;
  protected Reference<Resource> individual;
  
  public EncounterParticipant()
  {
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Resource> getIndividual() {
    return individual;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setIndividual(Reference<Resource> individual) {
    this.individual = individual;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EncounterParticipant) {
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
    return "EncounterParticipant(" + id + ")";
  }
}
