package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * MarketingStatus bean.
 *
 * @see <a href="https://www.hl7.org/fhir/marketingstatus.html">MarketingStatus</a>
 */
public 
class MarketingStatus extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 3085924736783927014L;
  
  protected CodeableConcept country;
  protected CodeableConcept jurisdiction;
  protected CodeableConcept status;
  protected Period dateRange;
  protected Date restoreDate;
  
  public MarketingStatus()
  {
  }

  public CodeableConcept getCountry() {
    return country;
  }

  public CodeableConcept getJurisdiction() {
    return jurisdiction;
  }

  public CodeableConcept getStatus() {
    return status;
  }

  public Period getDateRange() {
    return dateRange;
  }

  public Date getRestoreDate() {
    return restoreDate;
  }

  public void setCountry(CodeableConcept country) {
    this.country = country;
  }

  public void setJurisdiction(CodeableConcept jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public void setStatus(CodeableConcept status) {
    this.status = status;
  }

  public void setDateRange(Period dateRange) {
    this.dateRange = dateRange;
  }

  public void setRestoreDate(Date restoreDate) {
    this.restoreDate = restoreDate;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MarketingStatus) {
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
    return "MarketingStatus(" + id + "," + country + ")";
  }
}
