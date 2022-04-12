package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
 *
 * @see <a href="https://www.hl7.org/fhir">EvidenceVariable_Characteristic</a>
 */
public
class EvidenceVariableCharacteristic extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Timing participantEffectiveTiming;
  protected CodeableConcept definitionCodeableConcept;
  protected UsageContext[] usageContext;
  protected Period participantEffectivePeriod;
  protected String definitionCanonical;
  protected DataRequirement definitionDataRequirement;
  protected Date participantEffectiveDateTime;
  protected Duration timeFromStart;
  protected String groupMeasure;
  protected Reference<Resource> definitionReference;
  protected String description;
  protected Expression definitionExpression;
  protected TriggerDefinition definitionTriggerDefinition;
  protected Boolean exclude;
  protected Duration participantEffectiveDuration;
  
  public EvidenceVariableCharacteristic()
  {
  }
  
  public Timing getParticipantEffectiveTiming() {
    return participantEffectiveTiming;
  }
  
  public void setParticipantEffectiveTiming(Timing participantEffectiveTiming) {
    this.participantEffectiveTiming = participantEffectiveTiming;
  }
  
  public CodeableConcept getDefinitionCodeableConcept() {
    return definitionCodeableConcept;
  }
  
  public void setDefinitionCodeableConcept(CodeableConcept definitionCodeableConcept) {
    this.definitionCodeableConcept = definitionCodeableConcept;
  }
  
  public UsageContext[] getUsageContext() {
    return usageContext;
  }
  
  public void setUsageContext(UsageContext[] usageContext) {
    this.usageContext = usageContext;
  }
  
  public Period getParticipantEffectivePeriod() {
    return participantEffectivePeriod;
  }
  
  public void setParticipantEffectivePeriod(Period participantEffectivePeriod) {
    this.participantEffectivePeriod = participantEffectivePeriod;
  }
  
  public String getDefinitionCanonical() {
    return definitionCanonical;
  }
  
  public void setDefinitionCanonical(String definitionCanonical) {
    this.definitionCanonical = definitionCanonical;
  }
  
  public DataRequirement getDefinitionDataRequirement() {
    return definitionDataRequirement;
  }
  
  public void setDefinitionDataRequirement(DataRequirement definitionDataRequirement) {
    this.definitionDataRequirement = definitionDataRequirement;
  }
  
  public Date getParticipantEffectiveDateTime() {
    return participantEffectiveDateTime;
  }
  
  public void setParticipantEffectiveDateTime(Date participantEffectiveDateTime) {
    this.participantEffectiveDateTime = participantEffectiveDateTime;
  }
  
  public Duration getTimeFromStart() {
    return timeFromStart;
  }
  
  public void setTimeFromStart(Duration timeFromStart) {
    this.timeFromStart = timeFromStart;
  }
  
  public String getGroupMeasure() {
    return groupMeasure;
  }
  
  public void setGroupMeasure(String groupMeasure) {
    this.groupMeasure = groupMeasure;
  }
  
  public Reference<Resource> getDefinitionReference() {
    return definitionReference;
  }
  
  public void setDefinitionReference(Reference<Resource> definitionReference) {
    this.definitionReference = definitionReference;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Expression getDefinitionExpression() {
    return definitionExpression;
  }
  
  public void setDefinitionExpression(Expression definitionExpression) {
    this.definitionExpression = definitionExpression;
  }
  
  public TriggerDefinition getDefinitionTriggerDefinition() {
    return definitionTriggerDefinition;
  }
  
  public void setDefinitionTriggerDefinition(TriggerDefinition definitionTriggerDefinition) {
    this.definitionTriggerDefinition = definitionTriggerDefinition;
  }
  
  public Boolean getExclude() {
    return exclude;
  }
  
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }
  
  public Duration getParticipantEffectiveDuration() {
    return participantEffectiveDuration;
  }
  
  public void setParticipantEffectiveDuration(Duration participantEffectiveDuration) {
    this.participantEffectiveDuration = participantEffectiveDuration;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EvidenceVariableCharacteristic) {
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
    return "EvidenceVariableCharacteristic(" + id + ")";
  }
}
