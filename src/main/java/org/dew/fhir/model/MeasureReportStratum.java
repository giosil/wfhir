package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 *
 * @see <a href="https://www.hl7.org/fhir">MeasureReport_Stratum</a>
 */
public
class MeasureReportStratum extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected MeasureReportComponent[] component;
  protected CodeableConcept value;
  protected Quantity measureScore;
  protected MeasureReportPopulation1[] population;
  
  public MeasureReportStratum()
  {
  }
  
  public MeasureReportComponent[] getComponent() {
    return component;
  }
  
  public void setComponent(MeasureReportComponent[] component) {
    this.component = component;
  }
  
  public CodeableConcept getValue() {
    return value;
  }
  
  public void setValue(CodeableConcept value) {
    this.value = value;
  }
  
  public Quantity getMeasureScore() {
    return measureScore;
  }
  
  public void setMeasureScore(Quantity measureScore) {
    this.measureScore = measureScore;
  }
  
  public MeasureReportPopulation1[] getPopulation() {
    return population;
  }
  
  public void setPopulation(MeasureReportPopulation1[] population) {
    this.population = population;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureReportStratum) {
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
    return "MeasureReportStratum(" + id + ")";
  }
}
