package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Details concerning the specimen collection.
 *
 * @see <a href="https://www.hl7.org/fhir/specimen-definitions.html#Specimen.collection">Specimen.collection</a>
 */
public 
class SpecimenCollection extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7961506975543505362L;
  
  protected Reference<Resource> collector;
  protected Date collectedDateTime;
  protected Period collectedPeriod;
  protected Duration duration;
  protected SimpleQuantity quantity;
  protected CodeableConcept method;
  protected CodeableConcept bodySite;
  protected CodeableConcept fastingStatusCodeableConcept;
  protected Duration fastingStatusDuration;
  
  public SpecimenCollection()
  {
  }

  public Reference<Resource> getCollector() {
    return collector;
  }

  public Date getCollectedDateTime() {
    return collectedDateTime;
  }

  public Period getCollectedPeriod() {
    return collectedPeriod;
  }

  public Duration getDuration() {
    return duration;
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public CodeableConcept getMethod() {
    return method;
  }

  public CodeableConcept getBodySite() {
    return bodySite;
  }

  public CodeableConcept getFastingStatusCodeableConcept() {
    return fastingStatusCodeableConcept;
  }

  public Duration getFastingStatusDuration() {
    return fastingStatusDuration;
  }

  public void setCollector(Reference<Resource> collector) {
    this.collector = collector;
  }

  public void setCollectedDateTime(Date collectedDateTime) {
    this.collectedDateTime = collectedDateTime;
  }

  public void setCollectedPeriod(Period collectedPeriod) {
    this.collectedPeriod = collectedPeriod;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
  }

  public void setBodySite(CodeableConcept bodySite) {
    this.bodySite = bodySite;
  }

  public void setFastingStatusCodeableConcept(CodeableConcept fastingStatusCodeableConcept) {
    this.fastingStatusCodeableConcept = fastingStatusCodeableConcept;
  }

  public void setFastingStatusDuration(Duration fastingStatusDuration) {
    this.fastingStatusDuration = fastingStatusDuration;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenCollection) {
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
    return "SpecimenCollection(" + id + ")";
  }
}
