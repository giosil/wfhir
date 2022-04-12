package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="https://www.hl7.org/fhir">ClaimResponse_AddItem</a>
 */
public
class ClaimResponseAddItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] modifier;
  protected Integer[] subdetailSequence;
  protected CodeableConcept productOrService;
  protected Address locationAddress;
  protected Period servicedPeriod;
  protected Integer[] noteNumber;
  protected ClaimResponseAdjudication[] adjudication;
  protected Integer[] itemSequence;
  protected CodeableConcept locationCodeableConcept;
  protected Reference<Resource>[] provider;
  protected Reference<Resource> locationReference;
  protected Double factor;
  protected Money net;
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] programCode;
  protected CodeableConcept bodySite;
  protected Integer[] detailSequence;
  protected CodeableConcept[] subSite;
  protected Date servicedDate;
  protected ClaimResponseDetail1[] detail;
  
  public ClaimResponseAddItem()
  {
  }
  
  public CodeableConcept[] getModifier() {
    return modifier;
  }
  
  public void setModifier(CodeableConcept[] modifier) {
    this.modifier = modifier;
  }
  
  public Integer[] getSubdetailSequence() {
    return subdetailSequence;
  }
  
  public void setSubdetailSequence(Integer[] subdetailSequence) {
    this.subdetailSequence = subdetailSequence;
  }
  
  public CodeableConcept getProductOrService() {
    return productOrService;
  }
  
  public void setProductOrService(CodeableConcept productOrService) {
    this.productOrService = productOrService;
  }
  
  public Address getLocationAddress() {
    return locationAddress;
  }
  
  public void setLocationAddress(Address locationAddress) {
    this.locationAddress = locationAddress;
  }
  
  public Period getServicedPeriod() {
    return servicedPeriod;
  }
  
  public void setServicedPeriod(Period servicedPeriod) {
    this.servicedPeriod = servicedPeriod;
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
  
  public Integer[] getItemSequence() {
    return itemSequence;
  }
  
  public void setItemSequence(Integer[] itemSequence) {
    this.itemSequence = itemSequence;
  }
  
  public CodeableConcept getLocationCodeableConcept() {
    return locationCodeableConcept;
  }
  
  public void setLocationCodeableConcept(CodeableConcept locationCodeableConcept) {
    this.locationCodeableConcept = locationCodeableConcept;
  }
  
  public Reference<Resource>[] getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource>[] provider) {
    this.provider = provider;
  }
  
  public Reference<Resource> getLocationReference() {
    return locationReference;
  }
  
  public void setLocationReference(Reference<Resource> locationReference) {
    this.locationReference = locationReference;
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
  
  public CodeableConcept getBodySite() {
    return bodySite;
  }
  
  public void setBodySite(CodeableConcept bodySite) {
    this.bodySite = bodySite;
  }
  
  public Integer[] getDetailSequence() {
    return detailSequence;
  }
  
  public void setDetailSequence(Integer[] detailSequence) {
    this.detailSequence = detailSequence;
  }
  
  public CodeableConcept[] getSubSite() {
    return subSite;
  }
  
  public void setSubSite(CodeableConcept[] subSite) {
    this.subSite = subSite;
  }
  
  public Date getServicedDate() {
    return servicedDate;
  }
  
  public void setServicedDate(Date servicedDate) {
    this.servicedDate = servicedDate;
  }
  
  public ClaimResponseDetail1[] getDetail() {
    return detail;
  }
  
  public void setDetail(ClaimResponseDetail1[] detail) {
    this.detail = detail;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimResponseAddItem) {
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
    return "ClaimResponseAddItem(" + id + ")";
  }
}
