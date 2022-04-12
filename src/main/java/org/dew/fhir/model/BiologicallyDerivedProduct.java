package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A material substance originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.
 *
 * @see <a href="https://www.hl7.org/fhir">BiologicallyDerivedProduct</a>
 */
public
class BiologicallyDerivedProduct extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] request;
  protected Reference<Resource>[] parent;
  protected BiologicallyDerivedProductStorage[] storage;
  protected String productCategory;
  protected BiologicallyDerivedProductManipulation manipulation;
  protected Identifier[] identifier;
  protected Integer quantity;
  protected BiologicallyDerivedProductCollection collection;
  protected CodeableConcept productCode;
  protected BiologicallyDerivedProductProcessing[] processing;
  protected String status;
  
  public BiologicallyDerivedProduct()
  {
    this.resourceType = "BiologicallyDerivedProduct";
  }
  
  public Reference<Resource>[] getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource>[] request) {
    this.request = request;
  }
  
  public Reference<Resource>[] getParent() {
    return parent;
  }
  
  public void setParent(Reference<Resource>[] parent) {
    this.parent = parent;
  }
  
  public BiologicallyDerivedProductStorage[] getStorage() {
    return storage;
  }
  
  public void setStorage(BiologicallyDerivedProductStorage[] storage) {
    this.storage = storage;
  }
  
  public String getProductCategory() {
    return productCategory;
  }
  
  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }
  
  public BiologicallyDerivedProductManipulation getManipulation() {
    return manipulation;
  }
  
  public void setManipulation(BiologicallyDerivedProductManipulation manipulation) {
    this.manipulation = manipulation;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Integer getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  
  public BiologicallyDerivedProductCollection getCollection() {
    return collection;
  }
  
  public void setCollection(BiologicallyDerivedProductCollection collection) {
    this.collection = collection;
  }
  
  public CodeableConcept getProductCode() {
    return productCode;
  }
  
  public void setProductCode(CodeableConcept productCode) {
    this.productCode = productCode;
  }
  
  public BiologicallyDerivedProductProcessing[] getProcessing() {
    return processing;
  }
  
  public void setProcessing(BiologicallyDerivedProductProcessing[] processing) {
    this.processing = processing;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BiologicallyDerivedProduct) {
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
    return "BiologicallyDerivedProduct(" + id + ")";
  }
}
