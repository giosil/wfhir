package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_SubDetail1</a>
 */
public
class ExplanationOfBenefitSubDetail1 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] modifier;
  protected CodeableConcept productOrService;
  protected Integer[] noteNumber;
  protected ExplanationOfBenefitAdjudication[] adjudication;
  protected Double factor;
  protected Money net;
  
  public ExplanationOfBenefitSubDetail1()
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
    if(object instanceof ExplanationOfBenefitSubDetail1) {
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
    return "ExplanationOfBenefitSubDetail1(" + id + ")";
  }
}
