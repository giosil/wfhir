package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 *
 * @see <a href="https://www.hl7.org/fhir">MeasureReport_Population</a>
 */
public
class MeasureReportPopulation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected Integer count;
  protected Reference<Resource> subjectResults;
  
  public MeasureReportPopulation()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Integer getCount() {
    return count;
  }
  
  public void setCount(Integer count) {
    this.count = count;
  }
  
  public Reference<Resource> getSubjectResults() {
    return subjectResults;
  }
  
  public void setSubjectResults(Reference<Resource> subjectResults) {
    this.subjectResults = subjectResults;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureReportPopulation) {
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
    return "MeasureReportPopulation(" + id + ")";
  }
}
