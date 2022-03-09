package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The class history permits the tracking of the encounters transitions without needing to go through the resource history. 
 * This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. 
 * Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter-definitions.html#Encounter.classHistory">Encounter.classHistory</a>
 */
public 
class EncounterClassHistory extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7380757397493769242L;
  
  protected Coding class_;
  protected Period period;
  
  public EncounterClassHistory()
  {
  }

  public Coding getClass_() {
    return class_;
  }

  public Period getPeriod() {
    return period;
  }

  public void setClass_(Coding class_) {
    this.class_ = class_;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EncounterClassHistory) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (class_ + ":" + period).hashCode();
  }
  
  @Override
  public String toString() {
    return "EncounterClassHistory(" + class_ + "," + period + ")";
  }
}
