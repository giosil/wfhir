package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Catalog entries are wrappers that contextualize items included in a catalog.
 *
 * @see <a href="https://www.hl7.org/fhir">CatalogEntry</a>
 */
public
class CatalogEntry extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CatalogEntryRelatedEntry[] relatedEntry;
  protected Boolean orderable;
  protected CodeableConcept type;
  protected Identifier[] additionalIdentifier;
  protected Period validityPeriod;
  protected Date lastUpdated;
  protected Reference<Resource> referencedItem;
  protected Date validTo;
  protected CodeableConcept[] additionalClassification;
  protected Identifier[] identifier;
  protected CodeableConcept[] classification;
  protected CodeableConcept[] additionalCharacteristic;
  protected String status;
  
  public CatalogEntry()
  {
    this.resourceType = "CatalogEntry";
  }
  
  public CatalogEntryRelatedEntry[] getRelatedEntry() {
    return relatedEntry;
  }
  
  public void setRelatedEntry(CatalogEntryRelatedEntry[] relatedEntry) {
    this.relatedEntry = relatedEntry;
  }
  
  public Boolean getOrderable() {
    return orderable;
  }
  
  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Identifier[] getAdditionalIdentifier() {
    return additionalIdentifier;
  }
  
  public void setAdditionalIdentifier(Identifier[] additionalIdentifier) {
    this.additionalIdentifier = additionalIdentifier;
  }
  
  public Period getValidityPeriod() {
    return validityPeriod;
  }
  
  public void setValidityPeriod(Period validityPeriod) {
    this.validityPeriod = validityPeriod;
  }
  
  public Date getLastUpdated() {
    return lastUpdated;
  }
  
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }
  
  public Reference<Resource> getReferencedItem() {
    return referencedItem;
  }
  
  public void setReferencedItem(Reference<Resource> referencedItem) {
    this.referencedItem = referencedItem;
  }
  
  public Date getValidTo() {
    return validTo;
  }
  
  public void setValidTo(Date validTo) {
    this.validTo = validTo;
  }
  
  public CodeableConcept[] getAdditionalClassification() {
    return additionalClassification;
  }
  
  public void setAdditionalClassification(CodeableConcept[] additionalClassification) {
    this.additionalClassification = additionalClassification;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept[] getClassification() {
    return classification;
  }
  
  public void setClassification(CodeableConcept[] classification) {
    this.classification = classification;
  }
  
  public CodeableConcept[] getAdditionalCharacteristic() {
    return additionalCharacteristic;
  }
  
  public void setAdditionalCharacteristic(CodeableConcept[] additionalCharacteristic) {
    this.additionalCharacteristic = additionalCharacteristic;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CatalogEntry) {
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
    return "CatalogEntry(" + id + ")";
  }
}
