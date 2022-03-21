package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Information that only applies to packages (not products).
 *
 * @see <a href="https://www.hl7.org/fhir/medication-definitions.html#Medication.batch">Medication.batch</a>
 */
public 
class MedicationBatch extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3470778657756597709L;
  
  protected String lotNumber;
  protected Date expirationDate;
  
  public MedicationBatch()
  {
  }

  public String getLotNumber() {
    return lotNumber;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationBatch) {
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
    return "MedicationBatch(" + id + ")";
  }
}
