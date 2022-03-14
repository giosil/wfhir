package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Details concerning processing and processing steps for the specimen.
 *
 * @see <a href="https://www.hl7.org/fhir/specimen-definitions.html#Specimen.processing">Specimen.processing</a>
 */
public 
class SpecimenProcessing extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5233595065600390276L;
  
  protected String description;
  protected CodeableConcept procedure;
  protected Reference<Substance>[] additive;
  protected Date timeDateTime;
  protected Period timePeriod;
  
  public SpecimenProcessing()
  {
  }

  public String getDescription() {
    return description;
  }

  public CodeableConcept getProcedure() {
    return procedure;
  }

  public Reference<Substance>[] getAdditive() {
    return additive;
  }

  public Date getTimeDateTime() {
    return timeDateTime;
  }

  public Period getTimePeriod() {
    return timePeriod;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setProcedure(CodeableConcept procedure) {
    this.procedure = procedure;
  }

  public void setAdditive(Reference<Substance>[] additive) {
    this.additive = additive;
  }

  public void setTimeDateTime(Date timeDateTime) {
    this.timeDateTime = timeDateTime;
  }

  public void setTimePeriod(Period timePeriod) {
    this.timePeriod = timePeriod;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenProcessing) {
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
    return "SpecimenProcessing(" + id + ")";
  }
}
