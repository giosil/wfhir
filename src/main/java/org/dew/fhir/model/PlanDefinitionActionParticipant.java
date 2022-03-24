package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.action.participant">PlanDefinition.action.participant</a>
 */
public 
class PlanDefinitionActionParticipant extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 673119111172992208L;
  
  protected String type;
  protected CodeableConcept role;
  
  public PlanDefinitionActionParticipant()
  {
  }

  public String getType() {
    return type;
  }

  public CodeableConcept getRole() {
    return role;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setRole(CodeableConcept role) {
    this.role = role;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionActionParticipant) {
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
    return "PlanDefinitionActionParticipant(" + id + "," + type + "," + role + ")";
  }
}
