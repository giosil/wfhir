package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 *
 * @see <a href="https://www.hl7.org/fhir">MeasureReport_Group</a>
 */
public
class MeasureReportGroup extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected MeasureReportStratifier[] stratifier;
  protected Quantity measureScore;
  protected MeasureReportPopulation[] population;
  
  public MeasureReportGroup()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public MeasureReportStratifier[] getStratifier() {
    return stratifier;
  }
  
  public void setStratifier(MeasureReportStratifier[] stratifier) {
    this.stratifier = stratifier;
  }
  
  public Quantity getMeasureScore() {
    return measureScore;
  }
  
  public void setMeasureScore(Quantity measureScore) {
    this.measureScore = measureScore;
  }
  
  public MeasureReportPopulation[] getPopulation() {
    return population;
  }
  
  public void setPopulation(MeasureReportPopulation[] population) {
    this.population = population;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureReportGroup) {
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
    return "MeasureReportGroup(" + id + ")";
  }
}
