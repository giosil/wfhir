package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityRequest_Item</a>
 */
public
class CoverageEligibilityRequestItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] modifier;
  protected CoverageEligibilityRequestDiagnosis[] diagnosis;
  protected CodeableConcept productOrService;
  protected Reference<Resource> provider;
  protected Integer[] supportingInfoSequence;
  protected Reference<Resource>[] detail;
  protected CodeableConcept category;
  protected Reference<Resource> facility;
  
  public CoverageEligibilityRequestItem()
  {
  }
  
  public Money getUnitPrice() {
    return unitPrice;
  }
  
  public void setUnitPrice(Money unitPrice) {
    this.unitPrice = unitPrice;
  }
  
  public Quantity getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }
  
  public CodeableConcept[] getModifier() {
    return modifier;
  }
  
  public void setModifier(CodeableConcept[] modifier) {
    this.modifier = modifier;
  }
  
  public CoverageEligibilityRequestDiagnosis[] getDiagnosis() {
    return diagnosis;
  }
  
  public void setDiagnosis(CoverageEligibilityRequestDiagnosis[] diagnosis) {
    this.diagnosis = diagnosis;
  }
  
  public CodeableConcept getProductOrService() {
    return productOrService;
  }
  
  public void setProductOrService(CodeableConcept productOrService) {
    this.productOrService = productOrService;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public Integer[] getSupportingInfoSequence() {
    return supportingInfoSequence;
  }
  
  public void setSupportingInfoSequence(Integer[] supportingInfoSequence) {
    this.supportingInfoSequence = supportingInfoSequence;
  }
  
  public Reference<Resource>[] getDetail() {
    return detail;
  }
  
  public void setDetail(Reference<Resource>[] detail) {
    this.detail = detail;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  public Reference<Resource> getFacility() {
    return facility;
  }
  
  public void setFacility(Reference<Resource> facility) {
    this.facility = facility;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityRequestItem) {
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
    return "CoverageEligibilityRequestItem(" + id + ")";
  }
}
