package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A single SOP instance within the series, e.g. an image, or presentation state.
 *
 * @see <a href="https://www.hl7.org/fhir/imagingstudy-definitions.html#ImagingStudy.series.instance">ImagingStudy.series.instance</a>
 */
public 
class ImagingStudySeriesInstance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 533971860077960663L;
  
  protected String uid;
  protected Coding sopClass;
  protected Integer number;
  protected String title;
  
  public ImagingStudySeriesInstance()
  {
  }
  
  public String getUid() {
    return uid;
  }

  public Coding getSopClass() {
    return sopClass;
  }

  public Integer getNumber() {
    return number;
  }

  public String getTitle() {
    return title;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public void setSopClass(Coding sopClass) {
    this.sopClass = sopClass;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ImagingStudySeriesInstance) {
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
    return "ImagingStudySeriesInstance(" + id + ")";
  }
}
