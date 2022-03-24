package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
 *
 * @see <a href="https://www.hl7.org/fhir/immunizationrecommendation.html">ImmunizationRecommendation</a>
 */
public 
class ImmunizationRecommendation extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -3652271574781214679L;
  
  protected Identifier[] identifier;
  protected Reference<Patient> patient;
  protected Date date;
  protected Reference<Organization> authority;
  protected ImmunizationRecommendationRecommendation[] recommendation;
  
  public ImmunizationRecommendation()
  {
    this.resourceType = "ImmunizationRecommendation";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Date getDate() {
    return date;
  }

  public Reference<Organization> getAuthority() {
    return authority;
  }

  public ImmunizationRecommendationRecommendation[] getRecommendation() {
    return recommendation;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setAuthority(Reference<Organization> authority) {
    this.authority = authority;
  }

  public void setRecommendation(ImmunizationRecommendationRecommendation[] recommendation) {
    this.recommendation = recommendation;
  }
  
  public boolean equals(Object object) {
    if(object instanceof ImmunizationRecommendation) {
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
    return "ImmunizationRecommendation(" + id + ")";
  }
}
