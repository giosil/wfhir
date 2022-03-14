package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Each study has one or more series of images or other content.
 *
 * @see <a href="https://www.hl7.org/fhir/imagingstudy-definitions.html#ImagingStudy.series">ImagingStudy.series</a>
 */
public 
class ImagingStudySeries extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -7787765549841277030L;
  
  protected String uid;
  protected int number;
  protected Coding modality;
  protected String description;
  protected int numberOfInstances;
  protected Reference<Endpoint>[] endpoint;
  protected Coding bodySite;
  protected Coding laterality;
  protected Reference<Specimen>[] specimen;
  protected Date started;
  protected ImagingStudySeriesPerformer[] performer;
  protected ImagingStudySeriesInstance[] instance;
  
  public ImagingStudySeries()
  {
  }

  public String getUid() {
    return uid;
  }

  public int getNumber() {
    return number;
  }

  public Coding getModality() {
    return modality;
  }

  public String getDescription() {
    return description;
  }

  public int getNumberOfInstances() {
    return numberOfInstances;
  }

  public Reference<Endpoint>[] getEndpoint() {
    return endpoint;
  }

  public Coding getBodySite() {
    return bodySite;
  }

  public Coding getLaterality() {
    return laterality;
  }

  public Reference<Specimen>[] getSpecimen() {
    return specimen;
  }

  public Date getStarted() {
    return started;
  }

  public ImagingStudySeriesPerformer[] getPerformer() {
    return performer;
  }

  public ImagingStudySeriesInstance[] getInstance() {
    return instance;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setModality(Coding modality) {
    this.modality = modality;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setNumberOfInstances(int numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }

  public void setEndpoint(Reference<Endpoint>[] endpoint) {
    this.endpoint = endpoint;
  }

  public void setBodySite(Coding bodySite) {
    this.bodySite = bodySite;
  }

  public void setLaterality(Coding laterality) {
    this.laterality = laterality;
  }

  public void setSpecimen(Reference<Specimen>[] specimen) {
    this.specimen = specimen;
  }

  public void setStarted(Date started) {
    this.started = started;
  }

  public void setPerformer(ImagingStudySeriesPerformer[] performer) {
    this.performer = performer;
  }

  public void setInstance(ImagingStudySeriesInstance[] instance) {
    this.instance = instance;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImagingStudySeries) {
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
    return "ImagingStudySeries(" + id + ")";
  }
}
