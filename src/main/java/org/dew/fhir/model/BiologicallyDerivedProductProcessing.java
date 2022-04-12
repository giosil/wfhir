package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A material substance originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.
 *
 * @see <a href="https://www.hl7.org/fhir">BiologicallyDerivedProduct_Processing</a>
 */
public
class BiologicallyDerivedProductProcessing extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Period timePeriod;
  protected String description;
  protected CodeableConcept procedure;
  protected Date timeDateTime;
  protected Reference<Resource> additive;
  
  public BiologicallyDerivedProductProcessing()
  {
  }
  
  public Period getTimePeriod() {
    return timePeriod;
  }
  
  public void setTimePeriod(Period timePeriod) {
    this.timePeriod = timePeriod;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept getProcedure() {
    return procedure;
  }
  
  public void setProcedure(CodeableConcept procedure) {
    this.procedure = procedure;
  }
  
  public Date getTimeDateTime() {
    return timeDateTime;
  }
  
  public void setTimeDateTime(Date timeDateTime) {
    this.timeDateTime = timeDateTime;
  }
  
  public Reference<Resource> getAdditive() {
    return additive;
  }
  
  public void setAdditive(Reference<Resource> additive) {
    this.additive = additive;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BiologicallyDerivedProductProcessing) {
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
    return "BiologicallyDerivedProductProcessing(" + id + ")";
  }
}
