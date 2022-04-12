package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Detail</a>
 */
public
class ClaimDetail extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] programCode;
  protected CodeableConcept[] modifier;
  protected ClaimSubDetail[] subDetail;
  protected CodeableConcept productOrService;
  protected Integer sequence;
  protected CodeableConcept revenue;
  protected Reference<Resource>[] udi;
  protected CodeableConcept category;
  protected Double factor;
  protected Money net;
  
  public ClaimDetail()
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
  
  public CodeableConcept[] getProgramCode() {
    return programCode;
  }
  
  public void setProgramCode(CodeableConcept[] programCode) {
    this.programCode = programCode;
  }
  
  public CodeableConcept[] getModifier() {
    return modifier;
  }
  
  public void setModifier(CodeableConcept[] modifier) {
    this.modifier = modifier;
  }
  
  public ClaimSubDetail[] getSubDetail() {
    return subDetail;
  }
  
  public void setSubDetail(ClaimSubDetail[] subDetail) {
    this.subDetail = subDetail;
  }
  
  public CodeableConcept getProductOrService() {
    return productOrService;
  }
  
  public void setProductOrService(CodeableConcept productOrService) {
    this.productOrService = productOrService;
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public CodeableConcept getRevenue() {
    return revenue;
  }
  
  public void setRevenue(CodeableConcept revenue) {
    this.revenue = revenue;
  }
  
  public Reference<Resource>[] getUdi() {
    return udi;
  }
  
  public void setUdi(Reference<Resource>[] udi) {
    this.udi = udi;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  public Double getFactor() {
    return factor;
  }
  
  public void setFactor(Double factor) {
    this.factor = factor;
  }
  
  public Money getNet() {
    return net;
  }
  
  public void setNet(Money net) {
    this.net = net;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimDetail) {
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
    return "ClaimDetail(" + id + ")";
  }
}
