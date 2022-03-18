package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The diagnosis relevant to this episode of care.
 *
 * @see <a href="https://www.hl7.org/fhir/episodeofcare-definitions.html#EpisodeOfCare.diagnosis">EpisodeOfCare.diagnosis</a>
 */
public 
class EpisodeOfCareDiagnosis extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -4722083686088600572L;
  
  protected Reference<Condition> condition;
  protected CodeableConcept role;
  protected Integer rank;
  
  public EpisodeOfCareDiagnosis()
  {
  }

  public EpisodeOfCareDiagnosis(Reference<Condition> condition)
  {
    this.condition = condition;
  }

  public EpisodeOfCareDiagnosis(Reference<Condition> condition, CodeableConcept role)
  {
    this.condition = condition;
    this.role = role;
  }

  public EpisodeOfCareDiagnosis(Reference<Condition> condition, CodeableConcept role, int rank)
  {
    this.condition = condition;
    this.role = role;
    this.rank = rank;
  }

  public Reference<Condition> getCondition() {
    return condition;
  }

  public CodeableConcept getRole() {
    return role;
  }

  public Integer getRank() {
    return rank;
  }

  public void setCondition(Reference<Condition> condition) {
    this.condition = condition;
  }

  public void setRole(CodeableConcept role) {
    this.role = role;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EpisodeOfCareDiagnosis) {
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
    return "EpisodeOfCareDiagnosis(" + id + "," + condition + "," + role + "," + rank + ")";
  }
}
