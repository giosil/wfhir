package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The list of diagnosis relevant to the encounter.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter-definitions.html#Encounter.diagnosis">Encounter.diagnosis</a>
 */
public 
class EncounterDiagnosis extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 8166578022407457453L;
  
  protected Reference<Resource> condition;
  protected CodeableConcept use;
  protected Integer rank;
  
  public EncounterDiagnosis()
  {
  }

  public Reference<Resource> getCondition() {
    return condition;
  }

  public CodeableConcept getUse() {
    return use;
  }

  public Integer getRank() {
    return rank;
  }

  public void setCondition(Reference<Resource> condition) {
    this.condition = condition;
  }

  public void setUse(CodeableConcept use) {
    this.use = use;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EncounterDiagnosis) {
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
    return "EncounterDiagnosis(" + id + ")";
  }
}
