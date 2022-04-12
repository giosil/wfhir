package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A physical entity which is the primary unit of operational and/or administrative interest in a study.
 *
 * @see <a href="https://www.hl7.org/fhir">ResearchSubject</a>
 */
public
class ResearchSubject extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected Period period;
  protected Reference<Resource> study;
  protected Reference<Resource> individual;
  protected String actualArm;
  protected Reference<Resource> consent;
  protected String assignedArm;
  protected String status;
  
  public ResearchSubject()
  {
    this.resourceType = "ResearchSubject";
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
  
  public Reference<Resource> getStudy() {
    return study;
  }
  
  public void setStudy(Reference<Resource> study) {
    this.study = study;
  }
  
  public Reference<Resource> getIndividual() {
    return individual;
  }
  
  public void setIndividual(Reference<Resource> individual) {
    this.individual = individual;
  }
  
  public String getActualArm() {
    return actualArm;
  }
  
  public void setActualArm(String actualArm) {
    this.actualArm = actualArm;
  }
  
  public Reference<Resource> getConsent() {
    return consent;
  }
  
  public void setConsent(Reference<Resource> consent) {
    this.consent = consent;
  }
  
  public String getAssignedArm() {
    return assignedArm;
  }
  
  public void setAssignedArm(String assignedArm) {
    this.assignedArm = assignedArm;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ResearchSubject) {
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
    return "ResearchSubject(" + id + ")";
  }
}
