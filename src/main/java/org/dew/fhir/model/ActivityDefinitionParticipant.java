package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="https://www.hl7.org/fhir/activitydefinition-definitions.html#ActivityDefinition.participant">ActivityDefinition.participant</a>
 */
public 
class ActivityDefinitionParticipant extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3548218414063780827L;

  protected String type;
  protected CodeableConcept role;
  
  public ActivityDefinitionParticipant()
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
    if(object instanceof ActivityDefinitionParticipant) {
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
    return "ActivityDefinitionParticipant(" + id + "," + type + "," + role + ")";
  }
}
