package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 *
 * @see <a href="https://www.hl7.org/fhir">RequestGroup_Action</a>
 */
public
class RequestGroupAction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String cardinalityBehavior;
  protected CodeableConcept[] code;
  protected String prefix;
  protected String description;
  protected String title;
  protected CodeableConcept type;
  protected String groupingBehavior;
  protected Reference<Resource>[] participant;
  protected RequestGroupAction[] action;
  protected Age timingAge;
  protected RequestGroupRelatedAction[] relatedAction;
  protected Duration timingDuration;
  protected String textEquivalent;
  protected Timing timingTiming;
  protected Period timingPeriod;
  protected Reference<Resource> resource;
  protected RelatedArtifact[] documentation;
  protected String priority;
  protected String requiredBehavior;
  protected RequestGroupCondition[] condition;
  protected Range timingRange;
  protected String selectionBehavior;
  protected String precheckBehavior;
  protected Date timingDateTime;
  
  public RequestGroupAction()
  {
  }
  
  public String getCardinalityBehavior() {
    return cardinalityBehavior;
  }
  
  public void setCardinalityBehavior(String cardinalityBehavior) {
    this.cardinalityBehavior = cardinalityBehavior;
  }
  
  public CodeableConcept[] getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }
  
  public String getPrefix() {
    return prefix;
  }
  
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public String getGroupingBehavior() {
    return groupingBehavior;
  }
  
  public void setGroupingBehavior(String groupingBehavior) {
    this.groupingBehavior = groupingBehavior;
  }
  
  public Reference<Resource>[] getParticipant() {
    return participant;
  }
  
  public void setParticipant(Reference<Resource>[] participant) {
    this.participant = participant;
  }
  
  public RequestGroupAction[] getAction() {
    return action;
  }
  
  public void setAction(RequestGroupAction[] action) {
    this.action = action;
  }
  
  public Age getTimingAge() {
    return timingAge;
  }
  
  public void setTimingAge(Age timingAge) {
    this.timingAge = timingAge;
  }
  
  public RequestGroupRelatedAction[] getRelatedAction() {
    return relatedAction;
  }
  
  public void setRelatedAction(RequestGroupRelatedAction[] relatedAction) {
    this.relatedAction = relatedAction;
  }
  
  public Duration getTimingDuration() {
    return timingDuration;
  }
  
  public void setTimingDuration(Duration timingDuration) {
    this.timingDuration = timingDuration;
  }
  
  public String getTextEquivalent() {
    return textEquivalent;
  }
  
  public void setTextEquivalent(String textEquivalent) {
    this.textEquivalent = textEquivalent;
  }
  
  public Timing getTimingTiming() {
    return timingTiming;
  }
  
  public void setTimingTiming(Timing timingTiming) {
    this.timingTiming = timingTiming;
  }
  
  public Period getTimingPeriod() {
    return timingPeriod;
  }
  
  public void setTimingPeriod(Period timingPeriod) {
    this.timingPeriod = timingPeriod;
  }
  
  public Reference<Resource> getResource() {
    return resource;
  }
  
  public void setResource(Reference<Resource> resource) {
    this.resource = resource;
  }
  
  public RelatedArtifact[] getDocumentation() {
    return documentation;
  }
  
  public void setDocumentation(RelatedArtifact[] documentation) {
    this.documentation = documentation;
  }
  
  public String getPriority() {
    return priority;
  }
  
  public void setPriority(String priority) {
    this.priority = priority;
  }
  
  public String getRequiredBehavior() {
    return requiredBehavior;
  }
  
  public void setRequiredBehavior(String requiredBehavior) {
    this.requiredBehavior = requiredBehavior;
  }
  
  public RequestGroupCondition[] getCondition() {
    return condition;
  }
  
  public void setCondition(RequestGroupCondition[] condition) {
    this.condition = condition;
  }
  
  public Range getTimingRange() {
    return timingRange;
  }
  
  public void setTimingRange(Range timingRange) {
    this.timingRange = timingRange;
  }
  
  public String getSelectionBehavior() {
    return selectionBehavior;
  }
  
  public void setSelectionBehavior(String selectionBehavior) {
    this.selectionBehavior = selectionBehavior;
  }
  
  public String getPrecheckBehavior() {
    return precheckBehavior;
  }
  
  public void setPrecheckBehavior(String precheckBehavior) {
    this.precheckBehavior = precheckBehavior;
  }
  
  public Date getTimingDateTime() {
    return timingDateTime;
  }
  
  public void setTimingDateTime(Date timingDateTime) {
    this.timingDateTime = timingDateTime;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RequestGroupAction) {
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
    return "RequestGroupAction(" + id + ")";
  }
}
