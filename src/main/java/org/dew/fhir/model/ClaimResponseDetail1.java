package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_Detail1</a>
 */
public
class ClaimResponseDetail1 extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] modifier;
  protected ClaimResponseSubDetail1[] subDetail;
  protected CodeableConcept productOrService;
  protected Integer[] noteNumber;
  protected ClaimResponseAdjudication[] adjudication;
  protected Double factor;
  protected Money net;
  
  public ClaimResponseDetail1()
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
  
  public ClaimResponseSubDetail1[] getSubDetail() {
    return subDetail;
  }
  
  public void setSubDetail(ClaimResponseSubDetail1[] subDetail) {
    this.subDetail = subDetail;
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
  
  public ClaimResponseAdjudication[] getAdjudication() {
    return adjudication;
  }
  
  public void setAdjudication(ClaimResponseAdjudication[] adjudication) {
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
    if(object instanceof ClaimResponseDetail1) {
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
    return "ClaimResponseDetail1(" + id + ")";
  }
}
