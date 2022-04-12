package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProduct_ManufacturingBusinessOperation</a>
 */
public
class MedicinalProductManufacturingBusinessOperation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept confidentialityIndicator;
  protected Identifier authorisationReferenceNumber;
  protected Reference<Resource> regulator;
  protected CodeableConcept operationType;
  protected Date effectiveDate;
  protected Reference<Resource>[] manufacturer;
  
  public MedicinalProductManufacturingBusinessOperation()
  {
  }
  
  public CodeableConcept getConfidentialityIndicator() {
    return confidentialityIndicator;
  }
  
  public void setConfidentialityIndicator(CodeableConcept confidentialityIndicator) {
    this.confidentialityIndicator = confidentialityIndicator;
  }
  
  public Identifier getAuthorisationReferenceNumber() {
    return authorisationReferenceNumber;
  }
  
  public void setAuthorisationReferenceNumber(Identifier authorisationReferenceNumber) {
    this.authorisationReferenceNumber = authorisationReferenceNumber;
  }
  
  public Reference<Resource> getRegulator() {
    return regulator;
  }
  
  public void setRegulator(Reference<Resource> regulator) {
    this.regulator = regulator;
  }
  
  public CodeableConcept getOperationType() {
    return operationType;
  }
  
  public void setOperationType(CodeableConcept operationType) {
    this.operationType = operationType;
  }
  
  public Date getEffectiveDate() {
    return effectiveDate;
  }
  
  public void setEffectiveDate(Date effectiveDate) {
    this.effectiveDate = effectiveDate;
  }
  
  public Reference<Resource>[] getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(Reference<Resource>[] manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductManufacturingBusinessOperation) {
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
    return "MedicinalProductManufacturingBusinessOperation(" + id + ")";
  }
}
