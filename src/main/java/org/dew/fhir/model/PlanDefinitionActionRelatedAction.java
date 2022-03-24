package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.action.relatedAction">PlanDefinition.action.relatedAction</a>
 */
public 
class PlanDefinitionActionRelatedAction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 4733063773250519318L;

  protected String actionId;
  protected String relationship;
  protected Duration offsetDuration;
  protected Range offsetRange;
  
  public PlanDefinitionActionRelatedAction()
  {
  }

  public String getActionId() {
    return actionId;
  }

  public String getRelationship() {
    return relationship;
  }

  public Duration getOffsetDuration() {
    return offsetDuration;
  }

  public Range getOffsetRange() {
    return offsetRange;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public void setOffsetDuration(Duration offsetDuration) {
    this.offsetDuration = offsetDuration;
  }

  public void setOffsetRange(Range offsetRange) {
    this.offsetRange = offsetRange;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionActionRelatedAction) {
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
    return "PlanDefinitionActionRelatedAction(" + id + "," + actionId + "," + relationship + ")";
  }
}
