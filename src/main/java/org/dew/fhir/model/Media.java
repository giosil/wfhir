package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 *
 * @see <a href="https://www.hl7.org/fhir/media.html">Media</a>
 */
public 
class Media extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -8183059548831463711L;
  
  protected Identifier[] identifier;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource>[] partOf;
  protected String status;
  protected CodeableConcept type;
  protected CodeableConcept modality;
  protected CodeableConcept view;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date createdDateTime;
  protected Period createdPeriod;
  protected Date issued;
  protected Reference<Resource> operator;
  protected CodeableConcept[] reasonCode;
  protected CodeableConcept bodySite;
  protected String deviceName;
  protected Reference<Resource> device;
  protected Integer height;
  protected Integer width;
  protected Integer frames;
  protected Double duration;
  protected Attachment content;
  protected Annotation[] note;
  
  public Media()
  {
    this.resourceType = "Media";
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

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept getModality() {
    return modality;
  }

  public CodeableConcept getView() {
    return view;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getCreatedDateTime() {
    return createdDateTime;
  }

  public Period getCreatedPeriod() {
    return createdPeriod;
  }

  public Date getIssued() {
    return issued;
  }

  public Reference<Resource> getOperator() {
    return operator;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public CodeableConcept getBodySite() {
    return bodySite;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public Reference<Resource> getDevice() {
    return device;
  }

  public Integer getHeight() {
    return height;
  }

  public Integer getWidth() {
    return width;
  }

  public Integer getFrames() {
    return frames;
  }

  public Double getDuration() {
    return duration;
  }

  public Attachment getContent() {
    return content;
  }

  public Annotation[] getNote() {
    return note;
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

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setModality(CodeableConcept modality) {
    this.modality = modality;
  }

  public void setView(CodeableConcept view) {
    this.view = view;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setCreatedDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public void setCreatedPeriod(Period createdPeriod) {
    this.createdPeriod = createdPeriod;
  }

  public void setIssued(Date issued) {
    this.issued = issued;
  }

  public void setOperator(Reference<Resource> operator) {
    this.operator = operator;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setBodySite(CodeableConcept bodySite) {
    this.bodySite = bodySite;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public void setDevice(Reference<Resource> device) {
    this.device = device;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public void setFrames(Integer frames) {
    this.frames = frames;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public void setContent(Attachment content) {
    this.content = content;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Media) {
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
    return "Media(" + id + ")";
  }
}
