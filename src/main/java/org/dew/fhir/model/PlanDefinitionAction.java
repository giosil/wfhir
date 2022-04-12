package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * An action or group of actions to be taken as part of the plan.
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.action">PlanDefinition.action</a>
 */
public 
class PlanDefinitionAction extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -2412387348567322242L;
  
  protected String prefix;
  protected String title;
  protected String description;
  protected String textEquivalent;
  protected String priority;
  protected CodeableConcept[] code;
  protected CodeableConcept[] reason;
  protected RelatedArtifact[] documentation;
  protected String[] goalId;
  protected CodeableConcept subjectCodeableConcept;
  protected Reference<Group> subjectReference;
  protected TriggerDefinition[] trigger;
  protected PlanDefinitionActionCondition[] condition;
  protected DataRequirement[] input;
  protected DataRequirement[] output;
  protected PlanDefinitionActionRelatedAction[] relatedAction;
  protected Date timingDateTime;
  protected Age timingAge;
  protected Period timingPeriod;
  protected Duration timingDuration;
  protected Range timingRange;
  protected Timing timingTiming;
  protected PlanDefinitionActionParticipant[] participant;
  protected CodeableConcept type;
  protected String groupingBehavior;
  protected String selectionBehavior;
  protected String requiredBehavior;
  protected String precheckBehavior;
  protected String cardinalityBehavior;
  protected String definitionCanonical;
  protected String definitionUri;
  protected String transform;
  protected PlanDefinitionActionDynamicValue[] dynamicValue;
  protected PlanDefinitionAction[] action;
  
  public PlanDefinitionAction()
  {
  }
  
  public String getPrefix() {
    return prefix;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getTextEquivalent() {
    return textEquivalent;
  }

  public String getPriority() {
    return priority;
  }

  public CodeableConcept[] getCode() {
    return code;
  }

  public CodeableConcept[] getReason() {
    return reason;
  }

  public RelatedArtifact[] getDocumentation() {
    return documentation;
  }

  public String[] getGoalId() {
    return goalId;
  }

  public CodeableConcept getSubjectCodeableConcept() {
    return subjectCodeableConcept;
  }

  public Reference<Group> getSubjectReference() {
    return subjectReference;
  }

  public TriggerDefinition[] getTrigger() {
    return trigger;
  }

  public PlanDefinitionActionCondition[] getCondition() {
    return condition;
  }

  public DataRequirement[] getInput() {
    return input;
  }

  public DataRequirement[] getOutput() {
    return output;
  }

  public PlanDefinitionActionRelatedAction[] getRelatedAction() {
    return relatedAction;
  }

  public Date getTimingDateTime() {
    return timingDateTime;
  }

  public Age getTimingAge() {
    return timingAge;
  }

  public Period getTimingPeriod() {
    return timingPeriod;
  }

  public Duration getTimingDuration() {
    return timingDuration;
  }

  public Range getTimingRange() {
    return timingRange;
  }

  public Timing getTimingTiming() {
    return timingTiming;
  }

  public PlanDefinitionActionParticipant[] getParticipant() {
    return participant;
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getGroupingBehavior() {
    return groupingBehavior;
  }

  public String getSelectionBehavior() {
    return selectionBehavior;
  }

  public String getRequiredBehavior() {
    return requiredBehavior;
  }

  public String getPrecheckBehavior() {
    return precheckBehavior;
  }

  public String getCardinalityBehavior() {
    return cardinalityBehavior;
  }

  public String getDefinitionCanonical() {
    return definitionCanonical;
  }

  public String getDefinitionUri() {
    return definitionUri;
  }

  public String getTransform() {
    return transform;
  }

  public PlanDefinitionActionDynamicValue[] getDynamicValue() {
    return dynamicValue;
  }

  public PlanDefinitionAction[] getAction() {
    return action;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setTextEquivalent(String textEquivalent) {
    this.textEquivalent = textEquivalent;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }

  public void setReason(CodeableConcept[] reason) {
    this.reason = reason;
  }

  public void setDocumentation(RelatedArtifact[] documentation) {
    this.documentation = documentation;
  }

  public void setGoalId(String[] goalId) {
    this.goalId = goalId;
  }

  public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
    this.subjectCodeableConcept = subjectCodeableConcept;
  }

  public void setSubjectReference(Reference<Group> subjectReference) {
    this.subjectReference = subjectReference;
  }

  public void setTrigger(TriggerDefinition[] trigger) {
    this.trigger = trigger;
  }

  public void setCondition(PlanDefinitionActionCondition[] condition) {
    this.condition = condition;
  }

  public void setInput(DataRequirement[] input) {
    this.input = input;
  }

  public void setOutput(DataRequirement[] output) {
    this.output = output;
  }

  public void setRelatedAction(PlanDefinitionActionRelatedAction[] relatedAction) {
    this.relatedAction = relatedAction;
  }

  public void setTimingDateTime(Date timingDateTime) {
    this.timingDateTime = timingDateTime;
  }

  public void setTimingAge(Age timingAge) {
    this.timingAge = timingAge;
  }

  public void setTimingPeriod(Period timingPeriod) {
    this.timingPeriod = timingPeriod;
  }

  public void setTimingDuration(Duration timingDuration) {
    this.timingDuration = timingDuration;
  }

  public void setTimingRange(Range timingRange) {
    this.timingRange = timingRange;
  }

  public void setTimingTiming(Timing timingTiming) {
    this.timingTiming = timingTiming;
  }

  public void setParticipant(PlanDefinitionActionParticipant[] participant) {
    this.participant = participant;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setGroupingBehavior(String groupingBehavior) {
    this.groupingBehavior = groupingBehavior;
  }

  public void setSelectionBehavior(String selectionBehavior) {
    this.selectionBehavior = selectionBehavior;
  }

  public void setRequiredBehavior(String requiredBehavior) {
    this.requiredBehavior = requiredBehavior;
  }

  public void setPrecheckBehavior(String precheckBehavior) {
    this.precheckBehavior = precheckBehavior;
  }

  public void setCardinalityBehavior(String cardinalityBehavior) {
    this.cardinalityBehavior = cardinalityBehavior;
  }

  public void setDefinitionCanonical(String definitionCanonical) {
    this.definitionCanonical = definitionCanonical;
  }

  public void setDefinitionUri(String definitionUri) {
    this.definitionUri = definitionUri;
  }

  public void setTransform(String transform) {
    this.transform = transform;
  }

  public void setDynamicValue(PlanDefinitionActionDynamicValue[] dynamicValue) {
    this.dynamicValue = dynamicValue;
  }

  public void setAction(PlanDefinitionAction[] action) {
    this.action = action;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionAction) {
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
    return "PlanDefinitionAction(" + id + "," + title + ")";
  }
}
