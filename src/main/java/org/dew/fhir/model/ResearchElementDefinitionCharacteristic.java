package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
 *
 * @see <a href="https://www.hl7.org/fhir">ResearchElementDefinition_Characteristic</a>
 */
public
class ResearchElementDefinitionCharacteristic extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Timing participantEffectiveTiming;
  protected CodeableConcept definitionCodeableConcept;
  protected UsageContext[] usageContext;
  protected Period participantEffectivePeriod;
  protected String definitionCanonical;
  protected DataRequirement definitionDataRequirement;
  protected Date participantEffectiveDateTime;
  protected Duration studyEffectiveDuration;
  protected Duration studyEffectiveTimeFromStart;
  protected String studyEffectiveGroupMeasure;
  protected String studyEffectiveDescription;
  protected Boolean exclude;
  protected String participantEffectiveDescription;
  protected Period studyEffectivePeriod;
  protected Timing studyEffectiveTiming;
  protected CodeableConcept unitOfMeasure;
  protected Date studyEffectiveDateTime;
  protected String participantEffectiveGroupMeasure;
  protected Expression definitionExpression;
  protected Duration participantEffectiveDuration;
  protected Duration participantEffectiveTimeFromStart;
  
  public ResearchElementDefinitionCharacteristic()
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
  
  public Duration getStudyEffectiveDuration() {
    return studyEffectiveDuration;
  }
  
  public void setStudyEffectiveDuration(Duration studyEffectiveDuration) {
    this.studyEffectiveDuration = studyEffectiveDuration;
  }
  
  public Duration getStudyEffectiveTimeFromStart() {
    return studyEffectiveTimeFromStart;
  }
  
  public void setStudyEffectiveTimeFromStart(Duration studyEffectiveTimeFromStart) {
    this.studyEffectiveTimeFromStart = studyEffectiveTimeFromStart;
  }
  
  public String getStudyEffectiveGroupMeasure() {
    return studyEffectiveGroupMeasure;
  }
  
  public void setStudyEffectiveGroupMeasure(String studyEffectiveGroupMeasure) {
    this.studyEffectiveGroupMeasure = studyEffectiveGroupMeasure;
  }
  
  public String getStudyEffectiveDescription() {
    return studyEffectiveDescription;
  }
  
  public void setStudyEffectiveDescription(String studyEffectiveDescription) {
    this.studyEffectiveDescription = studyEffectiveDescription;
  }
  
  public Boolean getExclude() {
    return exclude;
  }
  
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }
  
  public String getParticipantEffectiveDescription() {
    return participantEffectiveDescription;
  }
  
  public void setParticipantEffectiveDescription(String participantEffectiveDescription) {
    this.participantEffectiveDescription = participantEffectiveDescription;
  }
  
  public Period getStudyEffectivePeriod() {
    return studyEffectivePeriod;
  }
  
  public void setStudyEffectivePeriod(Period studyEffectivePeriod) {
    this.studyEffectivePeriod = studyEffectivePeriod;
  }
  
  public Timing getStudyEffectiveTiming() {
    return studyEffectiveTiming;
  }
  
  public void setStudyEffectiveTiming(Timing studyEffectiveTiming) {
    this.studyEffectiveTiming = studyEffectiveTiming;
  }
  
  public CodeableConcept getUnitOfMeasure() {
    return unitOfMeasure;
  }
  
  public void setUnitOfMeasure(CodeableConcept unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }
  
  public Date getStudyEffectiveDateTime() {
    return studyEffectiveDateTime;
  }
  
  public void setStudyEffectiveDateTime(Date studyEffectiveDateTime) {
    this.studyEffectiveDateTime = studyEffectiveDateTime;
  }
  
  public String getParticipantEffectiveGroupMeasure() {
    return participantEffectiveGroupMeasure;
  }
  
  public void setParticipantEffectiveGroupMeasure(String participantEffectiveGroupMeasure) {
    this.participantEffectiveGroupMeasure = participantEffectiveGroupMeasure;
  }
  
  public Expression getDefinitionExpression() {
    return definitionExpression;
  }
  
  public void setDefinitionExpression(Expression definitionExpression) {
    this.definitionExpression = definitionExpression;
  }
  
  public Duration getParticipantEffectiveDuration() {
    return participantEffectiveDuration;
  }
  
  public void setParticipantEffectiveDuration(Duration participantEffectiveDuration) {
    this.participantEffectiveDuration = participantEffectiveDuration;
  }
  
  public Duration getParticipantEffectiveTimeFromStart() {
    return participantEffectiveTimeFromStart;
  }
  
  public void setParticipantEffectiveTimeFromStart(Duration participantEffectiveTimeFromStart) {
    this.participantEffectiveTimeFromStart = participantEffectiveTimeFromStart;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ResearchElementDefinitionCharacteristic) {
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
    return "ResearchElementDefinitionCharacteristic(" + id + ")";
  }
}
