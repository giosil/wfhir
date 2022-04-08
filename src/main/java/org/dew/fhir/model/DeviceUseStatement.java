package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
 *
 * @see <a href="https://www.hl7.org/fhir/deviceusestatement.html">DeviceUseStatement</a>
 */
public 
class DeviceUseStatement extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -7353643628738492087L;
  
  protected Identifier[] identifier;
  protected Reference<ServiceRequest>[] basedOn;
  protected String status;
  protected Reference<Resource> subject;
  protected Reference<Resource>[] derivedFrom;
  protected Timing timingTiming;
  protected Period timingPeriod;
  protected Date timingDateTime;
  protected Date recordedOn;
  protected Reference<Resource> source;
  protected Reference<Device> device;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected CodeableConcept bodySite;
  protected Annotation[] note;
  
  public DeviceUseStatement()
  {
    this.resourceType = "DeviceUseStatement";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<ServiceRequest>[] getBasedOn() {
    return basedOn;
  }

  public String getStatus() {
    return status;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Resource>[] getDerivedFrom() {
    return derivedFrom;
  }

  public Timing getTimingTiming() {
    return timingTiming;
  }

  public Period getTimingPeriod() {
    return timingPeriod;
  }

  public Date getTimingDateTime() {
    return timingDateTime;
  }

  public Date getRecordedOn() {
    return recordedOn;
  }

  public Reference<Resource> getSource() {
    return source;
  }

  public Reference<Device> getDevice() {
    return device;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public CodeableConcept getBodySite() {
    return bodySite;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setBasedOn(Reference<ServiceRequest>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setDerivedFrom(Reference<Resource>[] derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  public void setTimingTiming(Timing timingTiming) {
    this.timingTiming = timingTiming;
  }

  public void setTimingPeriod(Period timingPeriod) {
    this.timingPeriod = timingPeriod;
  }

  public void setTimingDateTime(Date timingDateTime) {
    this.timingDateTime = timingDateTime;
  }

  public void setRecordedOn(Date recordedOn) {
    this.recordedOn = recordedOn;
  }

  public void setSource(Reference<Resource> source) {
    this.source = source;
  }

  public void setDevice(Reference<Device> device) {
    this.device = device;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setBodySite(CodeableConcept bodySite) {
    this.bodySite = bodySite;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceUseStatement) {
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
    return "DeviceUseStatement(" + id + "," + basedOn + "," + subject + ")";
  }
}
