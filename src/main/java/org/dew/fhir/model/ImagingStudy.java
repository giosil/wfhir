package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context. 
 * A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 *
 * @see <a href="https://www.hl7.org/fhir/imagingstudy.html">ImagingStudy</a>
 */
public 
class ImagingStudy extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 7785647194713418809L;
  
  protected Identifier[] identifier;
  protected String status;
  protected Coding[] modality;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date started;
  protected Reference<Resource>[] basedOn;
  protected Reference<Resource> referrer;
  protected Reference<Resource>[] interpreter;
  protected Reference<Endpoint>[] endpoint;
  protected Integer numberOfSeries;
  protected Integer numberOfInstances;
  protected Reference<Procedure> procedureReference;
  protected CodeableConcept[] procedureCode;
  protected Reference<Location> location;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Annotation[] note;
  protected String description;
  protected ImagingStudySeries[] series;
  
  public ImagingStudy()
  {
    this.resourceType = "ImagingStudy";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public Coding[] getModality() {
    return modality;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getStarted() {
    return started;
  }

  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }

  public Reference<Resource> getReferrer() {
    return referrer;
  }

  public Reference<Resource>[] getInterpreter() {
    return interpreter;
  }

  public Reference<Endpoint>[] getEndpoint() {
    return endpoint;
  }

  public Integer getNumberOfSeries() {
    return numberOfSeries;
  }

  public Integer getNumberOfInstances() {
    return numberOfInstances;
  }

  public Reference<Procedure> getProcedureReference() {
    return procedureReference;
  }

  public CodeableConcept[] getProcedureCode() {
    return procedureCode;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Annotation[] getNote() {
    return note;
  }

  public String getDescription() {
    return description;
  }

  public ImagingStudySeries[] getSeries() {
    return series;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setModality(Coding[] modality) {
    this.modality = modality;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setStarted(Date started) {
    this.started = started;
  }

  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setReferrer(Reference<Resource> referrer) {
    this.referrer = referrer;
  }

  public void setInterpreter(Reference<Resource>[] interpreter) {
    this.interpreter = interpreter;
  }

  public void setEndpoint(Reference<Endpoint>[] endpoint) {
    this.endpoint = endpoint;
  }

  public void setNumberOfSeries(Integer numberOfSeries) {
    this.numberOfSeries = numberOfSeries;
  }

  public void setNumberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }

  public void setProcedureReference(Reference<Procedure> procedureReference) {
    this.procedureReference = procedureReference;
  }

  public void setProcedureCode(CodeableConcept[] procedureCode) {
    this.procedureCode = procedureCode;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSeries(ImagingStudySeries[] series) {
    this.series = series;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ImagingStudy) {
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
    return "ImagingStudy(" + id + ")";
  }
}
