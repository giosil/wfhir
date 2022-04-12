package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 *
 * @see <a href="https://www.hl7.org/fhir">MeasureReport</a>
 */
public
class MeasureReport extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Reference<Resource> subject;
  protected CodeableConcept improvementNotation;
  protected String type;
  protected Reference<Resource>[] evaluatedResource;
  protected MeasureReportGroup[] group;
  protected Identifier[] identifier;
  protected Period period;
  protected Reference<Resource> reporter;
  protected String measure;
  protected String status;
  
  public MeasureReport()
  {
    this.resourceType = "MeasureReport";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Reference<Resource> getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }
  
  public CodeableConcept getImprovementNotation() {
    return improvementNotation;
  }
  
  public void setImprovementNotation(CodeableConcept improvementNotation) {
    this.improvementNotation = improvementNotation;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public Reference<Resource>[] getEvaluatedResource() {
    return evaluatedResource;
  }
  
  public void setEvaluatedResource(Reference<Resource>[] evaluatedResource) {
    this.evaluatedResource = evaluatedResource;
  }
  
  public MeasureReportGroup[] getGroup() {
    return group;
  }
  
  public void setGroup(MeasureReportGroup[] group) {
    this.group = group;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
  }
  
  public Reference<Resource> getReporter() {
    return reporter;
  }
  
  public void setReporter(Reference<Resource> reporter) {
    this.reporter = reporter;
  }
  
  public String getMeasure() {
    return measure;
  }
  
  public void setMeasure(String measure) {
    this.measure = measure;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureReport) {
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
    return "MeasureReport(" + id + ")";
  }
}
