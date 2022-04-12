package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Accident</a>
 */
public
class ClaimAccident extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Address locationAddress;
  protected Reference<Resource> locationReference;
  protected CodeableConcept type;
  
  public ClaimAccident()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Address getLocationAddress() {
    return locationAddress;
  }
  
  public void setLocationAddress(Address locationAddress) {
    this.locationAddress = locationAddress;
  }
  
  public Reference<Resource> getLocationReference() {
    return locationReference;
  }
  
  public void setLocationReference(Reference<Resource> locationReference) {
    this.locationReference = locationReference;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimAccident) {
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
    return "ClaimAccident(" + id + ")";
  }
}
