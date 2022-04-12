package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A medicinal product in a container or package.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPackaged</a>
 */
public
class MedicinalProductPackaged extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected Reference<Resource>[] subject;
  protected Reference<Resource> marketingAuthorization;
  protected String description;
  protected MarketingStatus[] marketingStatus;
  protected Reference<Resource>[] manufacturer;
  protected MedicinalProductPackagedPackageItem[] packageItem;
  protected CodeableConcept legalStatusOfSupply;
  protected MedicinalProductPackagedBatchIdentifier[] batchIdentifier;
  
  public MedicinalProductPackaged()
  {
    this.resourceType = "MedicinalProductPackaged";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource>[] getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }
  
  public Reference<Resource> getMarketingAuthorization() {
    return marketingAuthorization;
  }
  
  public void setMarketingAuthorization(Reference<Resource> marketingAuthorization) {
    this.marketingAuthorization = marketingAuthorization;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public MarketingStatus[] getMarketingStatus() {
    return marketingStatus;
  }
  
  public void setMarketingStatus(MarketingStatus[] marketingStatus) {
    this.marketingStatus = marketingStatus;
  }
  
  public Reference<Resource>[] getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(Reference<Resource>[] manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  public MedicinalProductPackagedPackageItem[] getPackageItem() {
    return packageItem;
  }
  
  public void setPackageItem(MedicinalProductPackagedPackageItem[] packageItem) {
    this.packageItem = packageItem;
  }
  
  public CodeableConcept getLegalStatusOfSupply() {
    return legalStatusOfSupply;
  }
  
  public void setLegalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
    this.legalStatusOfSupply = legalStatusOfSupply;
  }
  
  public MedicinalProductPackagedBatchIdentifier[] getBatchIdentifier() {
    return batchIdentifier;
  }
  
  public void setBatchIdentifier(MedicinalProductPackagedBatchIdentifier[] batchIdentifier) {
    this.batchIdentifier = batchIdentifier;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPackaged) {
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
    return "MedicinalProductPackaged(" + id + ")";
  }
}
