package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProduct</a>
 */
public
class MedicinalProduct extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] attachedDocument;
  protected Reference<Resource>[] pharmaceuticalProduct;
  protected Identifier[] crossReference;
  protected CodeableConcept type;
  protected MarketingStatus[] marketingStatus;
  protected Reference<Resource>[] masterFile;
  protected CodeableConcept[] productClassification;
  protected Reference<Resource>[] contact;
  protected CodeableConcept paediatricUseIndicator;
  protected Identifier[] identifier;
  protected MedicinalProductManufacturingBusinessOperation[] manufacturingBusinessOperation;
  protected CodeableConcept additionalMonitoringIndicator;
  protected Reference<Resource>[] packagedMedicinalProduct;
  protected String[] specialMeasures;
  protected CodeableConcept legalStatusOfSupply;
  protected Coding domain;
  protected MedicinalProductName[] name;
  protected MedicinalProductSpecialDesignation[] specialDesignation;
  protected CodeableConcept combinedPharmaceuticalDoseForm;
  protected Reference<Resource>[] clinicalTrial;
  
  public MedicinalProduct()
  {
    this.resourceType = "MedicinalProduct";
  }
  
  public Reference<Resource>[] getAttachedDocument() {
    return attachedDocument;
  }
  
  public void setAttachedDocument(Reference<Resource>[] attachedDocument) {
    this.attachedDocument = attachedDocument;
  }
  
  public Reference<Resource>[] getPharmaceuticalProduct() {
    return pharmaceuticalProduct;
  }
  
  public void setPharmaceuticalProduct(Reference<Resource>[] pharmaceuticalProduct) {
    this.pharmaceuticalProduct = pharmaceuticalProduct;
  }
  
  public Identifier[] getCrossReference() {
    return crossReference;
  }
  
  public void setCrossReference(Identifier[] crossReference) {
    this.crossReference = crossReference;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public MarketingStatus[] getMarketingStatus() {
    return marketingStatus;
  }
  
  public void setMarketingStatus(MarketingStatus[] marketingStatus) {
    this.marketingStatus = marketingStatus;
  }
  
  public Reference<Resource>[] getMasterFile() {
    return masterFile;
  }
  
  public void setMasterFile(Reference<Resource>[] masterFile) {
    this.masterFile = masterFile;
  }
  
  public CodeableConcept[] getProductClassification() {
    return productClassification;
  }
  
  public void setProductClassification(CodeableConcept[] productClassification) {
    this.productClassification = productClassification;
  }
  
  public Reference<Resource>[] getContact() {
    return contact;
  }
  
  public void setContact(Reference<Resource>[] contact) {
    this.contact = contact;
  }
  
  public CodeableConcept getPaediatricUseIndicator() {
    return paediatricUseIndicator;
  }
  
  public void setPaediatricUseIndicator(CodeableConcept paediatricUseIndicator) {
    this.paediatricUseIndicator = paediatricUseIndicator;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public MedicinalProductManufacturingBusinessOperation[] getManufacturingBusinessOperation() {
    return manufacturingBusinessOperation;
  }
  
  public void setManufacturingBusinessOperation(MedicinalProductManufacturingBusinessOperation[] manufacturingBusinessOperation) {
    this.manufacturingBusinessOperation = manufacturingBusinessOperation;
  }
  
  public CodeableConcept getAdditionalMonitoringIndicator() {
    return additionalMonitoringIndicator;
  }
  
  public void setAdditionalMonitoringIndicator(CodeableConcept additionalMonitoringIndicator) {
    this.additionalMonitoringIndicator = additionalMonitoringIndicator;
  }
  
  public Reference<Resource>[] getPackagedMedicinalProduct() {
    return packagedMedicinalProduct;
  }
  
  public void setPackagedMedicinalProduct(Reference<Resource>[] packagedMedicinalProduct) {
    this.packagedMedicinalProduct = packagedMedicinalProduct;
  }
  
  public String[] getSpecialMeasures() {
    return specialMeasures;
  }
  
  public void setSpecialMeasures(String[] specialMeasures) {
    this.specialMeasures = specialMeasures;
  }
  
  public CodeableConcept getLegalStatusOfSupply() {
    return legalStatusOfSupply;
  }
  
  public void setLegalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
    this.legalStatusOfSupply = legalStatusOfSupply;
  }
  
  public Coding getDomain() {
    return domain;
  }
  
  public void setDomain(Coding domain) {
    this.domain = domain;
  }
  
  public MedicinalProductName[] getName() {
    return name;
  }
  
  public void setName(MedicinalProductName[] name) {
    this.name = name;
  }
  
  public MedicinalProductSpecialDesignation[] getSpecialDesignation() {
    return specialDesignation;
  }
  
  public void setSpecialDesignation(MedicinalProductSpecialDesignation[] specialDesignation) {
    this.specialDesignation = specialDesignation;
  }
  
  public CodeableConcept getCombinedPharmaceuticalDoseForm() {
    return combinedPharmaceuticalDoseForm;
  }
  
  public void setCombinedPharmaceuticalDoseForm(CodeableConcept combinedPharmaceuticalDoseForm) {
    this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
  }
  
  public Reference<Resource>[] getClinicalTrial() {
    return clinicalTrial;
  }
  
  public void setClinicalTrial(Reference<Resource>[] clinicalTrial) {
    this.clinicalTrial = clinicalTrial;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProduct) {
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
    return "MedicinalProduct(" + id + ")";
  }
}
