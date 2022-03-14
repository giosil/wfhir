package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who or what performed the series and how they were involved.
 *
 * @see <a href="https://www.hl7.org/fhir/imagingstudy-definitions.html#ImagingStudy.series.performer">ImagingStudy.series.performer</a>
 */
public 
class ImagingStudySeriesPerformer extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4658172954500949313L;
  
  protected CodeableConcept function;
  protected Reference<Resource> actor;
  
  public ImagingStudySeriesPerformer()
  {
  }

  public CodeableConcept getFunction() {
    return function;
  }

  public Reference<Resource> getActor() {
    return actor;
  }

  public void setFunction(CodeableConcept function) {
    this.function = function;
  }

  public void setActor(Reference<Resource> actor) {
    this.actor = actor;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImagingStudySeriesPerformer) {
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
    return "ImagingStudySeriesPerformer(" + id + ")";
  }
}
