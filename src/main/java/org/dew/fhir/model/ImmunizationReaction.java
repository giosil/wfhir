package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 *
 * @see <a href="https://www.hl7.org/fhir/immunization-definitions.html#Immunization.reaction">Immunization.reaction</a>
 */
public 
class ImmunizationReaction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -3158341395482269628L;
  
  protected Date date;
  protected Reference<Observation> detail;
  protected Boolean reported;
  
  public ImmunizationReaction()
  {
  }

  public Date getDate() {
    return date;
  }

  public Reference<Observation> getDetail() {
    return detail;
  }

  public Boolean getReported() {
    return reported;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setDetail(Reference<Observation> detail) {
    this.detail = detail;
  }

  public void setReported(Boolean reported) {
    this.reported = reported;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationReaction) {
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
    return "ImmunizationReaction(" + id + ")";
  }
}
