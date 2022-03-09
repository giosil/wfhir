package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies all people and organizations who are expected to be involved in the care team.
 *
 * @see <a href="https://www.hl7.org/fhir/careteam-definitions.html#CareTeam.participant">CareTeam.participant</a>
 */
public 
class CareTeamParticipant extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 3039251300320739272L;
  
  protected CodeableConcept[] role;
  protected Reference<Resource> member;
  protected Reference<Resource> onBehalfOf;
  protected Period period;
  
  public CareTeamParticipant()
  {
  }

  public CodeableConcept[] getRole() {
    return role;
  }

  public Reference<Resource> getMember() {
    return member;
  }

  public Reference<Resource> getOnBehalfOf() {
    return onBehalfOf;
  }

  public Period getPeriod() {
    return period;
  }

  public void setRole(CodeableConcept[] role) {
    this.role = role;
  }

  public void setMember(Reference<Resource> member) {
    this.member = member;
  }

  public void setOnBehalfOf(Reference<Resource> onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CareTeamParticipant) {
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
    return "CareTeamParticipant(" + id + ")";
  }
}
