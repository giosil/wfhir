package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The regulatory authorization of a medicinal product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductAuthorization_Procedure</a>
 */
public
class MedicinalProductAuthorizationProcedure extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier identifier;
  protected Date dateDateTime;
  protected MedicinalProductAuthorizationProcedure[] application;
  protected Period datePeriod;
  protected CodeableConcept type;
  
  public MedicinalProductAuthorizationProcedure()
  {
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public Date getDateDateTime() {
    return dateDateTime;
  }
  
  public void setDateDateTime(Date dateDateTime) {
    this.dateDateTime = dateDateTime;
  }
  
  public MedicinalProductAuthorizationProcedure[] getApplication() {
    return application;
  }
  
  public void setApplication(MedicinalProductAuthorizationProcedure[] application) {
    this.application = application;
  }
  
  public Period getDatePeriod() {
    return datePeriod;
  }
  
  public void setDatePeriod(Period datePeriod) {
    this.datePeriod = datePeriod;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductAuthorizationProcedure) {
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
    return "MedicinalProductAuthorizationProcedure(" + id + ")";
  }
}
