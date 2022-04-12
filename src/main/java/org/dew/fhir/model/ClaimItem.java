package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Item</a>
 */
public
class ClaimItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] modifier;
  protected CodeableConcept productOrService;
  protected Address locationAddress;
  protected Period servicedPeriod;
  protected Integer[] informationSequence;
  protected CodeableConcept revenue;
  protected CodeableConcept locationCodeableConcept;
  protected Integer[] diagnosisSequence;
  protected Reference<Resource> locationReference;
  protected Double factor;
  protected Money net;
  protected Money unitPrice;
  protected Quantity quantity;
  protected CodeableConcept[] programCode;
  protected Integer[] careTeamSequence;
  protected Reference<Resource>[] encounter;
  protected Integer sequence;
  protected CodeableConcept bodySite;
  protected CodeableConcept[] subSite;
  protected Date servicedDate;
  protected Reference<Resource>[] udi;
  protected ClaimDetail[] detail;
  protected Integer[] procedureSequence;
  protected CodeableConcept category;
  
  public ClaimItem()
  {
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
  
  public Integer[] getInformationSequence() {
    return informationSequence;
  }
  
  public void setInformationSequence(Integer[] informationSequence) {
    this.informationSequence = informationSequence;
  }
  
  public CodeableConcept getRevenue() {
    return revenue;
  }
  
  public void setRevenue(CodeableConcept revenue) {
    this.revenue = revenue;
  }
  
  public CodeableConcept getLocationCodeableConcept() {
    return locationCodeableConcept;
  }
  
  public void setLocationCodeableConcept(CodeableConcept locationCodeableConcept) {
    this.locationCodeableConcept = locationCodeableConcept;
  }
  
  public Integer[] getDiagnosisSequence() {
    return diagnosisSequence;
  }
  
  public void setDiagnosisSequence(Integer[] diagnosisSequence) {
    this.diagnosisSequence = diagnosisSequence;
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
  
  public Integer[] getCareTeamSequence() {
    return careTeamSequence;
  }
  
  public void setCareTeamSequence(Integer[] careTeamSequence) {
    this.careTeamSequence = careTeamSequence;
  }
  
  public Reference<Resource>[] getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource>[] encounter) {
    this.encounter = encounter;
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public CodeableConcept getBodySite() {
    return bodySite;
  }
  
  public void setBodySite(CodeableConcept bodySite) {
    this.bodySite = bodySite;
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
  
  public Reference<Resource>[] getUdi() {
    return udi;
  }
  
  public void setUdi(Reference<Resource>[] udi) {
    this.udi = udi;
  }
  
  public ClaimDetail[] getDetail() {
    return detail;
  }
  
  public void setDetail(ClaimDetail[] detail) {
    this.detail = detail;
  }
  
  public Integer[] getProcedureSequence() {
    return procedureSequence;
  }
  
  public void setProcedureSequence(Integer[] procedureSequence) {
    this.procedureSequence = procedureSequence;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimItem) {
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
    return "ClaimItem(" + id + ")";
  }
}
