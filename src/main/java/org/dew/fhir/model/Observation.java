package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 * @see <a href="https://www.hl7.org/fhir/observation.html">Observation</a>
 */
public 
class Observation extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 6867305569169639646L;
  
  protected Identifier[] identifier;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource>[] partOf;
  protected String status;
  protected CodeableConcept[] category;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Reference<Resource>[] focus;
  protected Reference<Encounter> encounter;
  protected Date effectiveDateTime;
  protected Period effectivePeriod;
  protected Timing effectiveTiming;
  protected Date effectiveInstant;
  protected Date issued;
  protected Reference<Resource>[] performer;
  protected Quantity valueQuantity;
  protected CodeableConcept valueCodeableConcept;
  protected String valueString;
  protected Boolean valueBoolean;
  protected Integer valueInteger;
  protected Range valueRange;
  protected Ratio valueRatio;
  protected SampledData valueSampledData;
  protected Date valueTime;
  protected Date valueDateTime;
  protected Period valuePeriod;
  protected CodeableConcept dataAbsentReason;
  protected CodeableConcept[] interpretation;
  protected Annotation[] note;
  protected CodeableConcept bodySite;
  protected CodeableConcept method;
  protected Reference<Resource> specimen;
  protected Reference<Resource> device;
  protected ObservationReferenceRange[] referenceRange;
  protected Reference<Resource>[] hasMember;
  protected Reference<Resource>[] derivedFrom;
  protected ObservationComponent[] component;
  
  public Observation()
  {
    this.resourceType = "Observation";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }

  public Reference<Resource>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Resource>[] getFocus() {
    return focus;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getEffectiveDateTime() {
    return effectiveDateTime;
  }

  public Period getEffectivePeriod() {
    return effectivePeriod;
  }

  public Timing getEffectiveTiming() {
    return effectiveTiming;
  }

  public Date getEffectiveInstant() {
    return effectiveInstant;
  }

  public Date getIssued() {
    return issued;
  }

  public Reference<Resource>[] getPerformer() {
    return performer;
  }

  public Quantity getValueQuantity() {
    return valueQuantity;
  }

  public CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept;
  }

  public String getValueString() {
    return valueString;
  }

  public Boolean getValueBoolean() {
    return valueBoolean;
  }

  public Integer getValueInteger() {
    return valueInteger;
  }

  public Range getValueRange() {
    return valueRange;
  }

  public Ratio getValueRatio() {
    return valueRatio;
  }

  public SampledData getValueSampledData() {
    return valueSampledData;
  }

  public Date getValueTime() {
    return valueTime;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public Period getValuePeriod() {
    return valuePeriod;
  }

  public CodeableConcept getDataAbsentReason() {
    return dataAbsentReason;
  }

  public CodeableConcept[] getInterpretation() {
    return interpretation;
  }

  public Annotation[] getNote() {
    return note;
  }

  public CodeableConcept getBodySite() {
    return bodySite;
  }

  public CodeableConcept getMethod() {
    return method;
  }

  public Reference<Resource> getSpecimen() {
    return specimen;
  }

  public Reference<Resource> getDevice() {
    return device;
  }

  public ObservationReferenceRange[] getReferenceRange() {
    return referenceRange;
  }

  public Reference<Resource>[] getHasMember() {
    return hasMember;
  }

  public Reference<Resource>[] getDerivedFrom() {
    return derivedFrom;
  }

  public ObservationComponent[] getComponent() {
    return component;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setPartOf(Reference<Resource>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setFocus(Reference<Resource>[] focus) {
    this.focus = focus;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setEffectiveDateTime(Date effectiveDateTime) {
    this.effectiveDateTime = effectiveDateTime;
  }

  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }

  public void setEffectiveTiming(Timing effectiveTiming) {
    this.effectiveTiming = effectiveTiming;
  }

  public void setEffectiveInstant(Date effectiveInstant) {
    this.effectiveInstant = effectiveInstant;
  }

  public void setIssued(Date issued) {
    this.issued = issued;
  }

  public void setPerformer(Reference<Resource>[] performer) {
    this.performer = performer;
  }

  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
    this.valueCodeableConcept = valueCodeableConcept;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }

  public void setValueRange(Range valueRange) {
    this.valueRange = valueRange;
  }

  public void setValueRatio(Ratio valueRatio) {
    this.valueRatio = valueRatio;
  }

  public void setValueSampledData(SampledData valueSampledData) {
    this.valueSampledData = valueSampledData;
  }

  public void setValueTime(Date valueTime) {
    this.valueTime = valueTime;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public void setValuePeriod(Period valuePeriod) {
    this.valuePeriod = valuePeriod;
  }

  public void setDataAbsentReason(CodeableConcept dataAbsentReason) {
    this.dataAbsentReason = dataAbsentReason;
  }

  public void setInterpretation(CodeableConcept[] interpretation) {
    this.interpretation = interpretation;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setBodySite(CodeableConcept bodySite) {
    this.bodySite = bodySite;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
  }

  public void setSpecimen(Reference<Resource> specimen) {
    this.specimen = specimen;
  }

  public void setDevice(Reference<Resource> device) {
    this.device = device;
  }

  public void setReferenceRange(ObservationReferenceRange[] referenceRange) {
    this.referenceRange = referenceRange;
  }

  public void setHasMember(Reference<Resource>[] hasMember) {
    this.hasMember = hasMember;
  }

  public void setDerivedFrom(Reference<Resource>[] derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  public void setComponent(ObservationComponent[] component) {
    this.component = component;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Observation) {
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
    return "Observation(" + id + "," + code + "," + text + ")";
  }
}
