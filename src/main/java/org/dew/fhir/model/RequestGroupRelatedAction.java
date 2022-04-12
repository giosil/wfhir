package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 *
 * @see <a href="https://www.hl7.org/fhir">RequestGroup_RelatedAction</a>
 */
public
class RequestGroupRelatedAction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String actionId;
  protected Duration offsetDuration;
  protected Range offsetRange;
  protected String relationship;
  
  public RequestGroupRelatedAction()
  {
  }
  
  public String getActionId() {
    return actionId;
  }
  
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }
  
  public Duration getOffsetDuration() {
    return offsetDuration;
  }
  
  public void setOffsetDuration(Duration offsetDuration) {
    this.offsetDuration = offsetDuration;
  }
  
  public Range getOffsetRange() {
    return offsetRange;
  }
  
  public void setOffsetRange(Range offsetRange) {
    this.offsetRange = offsetRange;
  }
  
  public String getRelationship() {
    return relationship;
  }
  
  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RequestGroupRelatedAction) {
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
    return "RequestGroupRelatedAction(" + id + ")";
  }
}
