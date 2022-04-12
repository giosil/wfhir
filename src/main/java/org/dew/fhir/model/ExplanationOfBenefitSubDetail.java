package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_SubDetail</a>
 */
public
class ExplanationOfBenefitSubDetail extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] programCode;
  protected CodeableConcept[] modifier;
  protected CodeableConcept productOrService;
  protected Integer[] noteNumber;
  protected ExplanationOfBenefitAdjudication[] adjudication;
  protected Integer sequence;
  protected CodeableConcept revenue;
  protected Reference<Resource>[] udi;
  protected CodeableConcept category;
  protected Double factor;
  protected Money net;
  
  public ExplanationOfBenefitSubDetail()
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
  
  public CodeableConcept getProductOrService() {
    return productOrService;
  }
  
  public void setProductOrService(CodeableConcept productOrService) {
    this.productOrService = productOrService;
  }
  
  public Integer[] getNoteNumber() {
    return noteNumber;
  }
  
  public void setNoteNumber(Integer[] noteNumber) {
    this.noteNumber = noteNumber;
  }
  
  public ExplanationOfBenefitAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ExplanationOfBenefitAdjudication[] adjudication) {
    this.adjudication = adjudication;
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
    if(object instanceof ExplanationOfBenefitSubDetail) {
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
    return "ExplanationOfBenefitSubDetail(" + id + ")";
  }
}
