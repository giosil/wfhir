package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 *
 * @see <a href="https://www.hl7.org/fhir">Coverage</a>
 */
public
class Coverage extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean subrogation;
  protected CodeableConcept type;
  protected String network;
  protected Reference<Resource>[] payor;
  protected CodeableConcept relationship;
  protected String dependent;
  protected CoverageClass[] class_;
  protected Integer order;
  protected Identifier[] identifier;
  protected Period period;
  protected CoverageCostToBeneficiary[] costToBeneficiary;
  protected Reference<Resource> subscriber;
  protected Reference<Resource>[] contract;
  protected String subscriberId;
  protected Reference<Resource> beneficiary;
  protected String status;
  protected Reference<Resource> policyHolder;
  
  public Coverage()
  {
    this.resourceType = "Coverage";
  }
  
  public Boolean getSubrogation() {
    return subrogation;
  }
  
  public void setSubrogation(Boolean subrogation) {
    this.subrogation = subrogation;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public String getNetwork() {
    return network;
  }
  
  public void setNetwork(String network) {
    this.network = network;
  }
  
  public Reference<Resource>[] getPayor() {
    return payor;
  }
  
  public void setPayor(Reference<Resource>[] payor) {
    this.payor = payor;
  }
  
  public CodeableConcept getRelationship() {
    return relationship;
  }
  
  public void setRelationship(CodeableConcept relationship) {
    this.relationship = relationship;
  }
  
  public String getDependent() {
    return dependent;
  }
  
  public void setDependent(String dependent) {
    this.dependent = dependent;
  }
  
  public CoverageClass[] getClass_() {
    return class_;
  }
  
  public void setClass_(CoverageClass[] class_) {
    this.class_ = class_;
  }
  
  public Integer getOrder() {
    return order;
  }
  
  public void setOrder(Integer order) {
    this.order = order;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
  }
  
  public CoverageCostToBeneficiary[] getCostToBeneficiary() {
    return costToBeneficiary;
  }
  
  public void setCostToBeneficiary(CoverageCostToBeneficiary[] costToBeneficiary) {
    this.costToBeneficiary = costToBeneficiary;
  }
  
  public Reference<Resource> getSubscriber() {
    return subscriber;
  }
  
  public void setSubscriber(Reference<Resource> subscriber) {
    this.subscriber = subscriber;
  }
  
  public Reference<Resource>[] getContract() {
    return contract;
  }
  
  public void setContract(Reference<Resource>[] contract) {
    this.contract = contract;
  }
  
  public String getSubscriberId() {
    return subscriberId;
  }
  
  public void setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
  }
  
  public Reference<Resource> getBeneficiary() {
    return beneficiary;
  }
  
  public void setBeneficiary(Reference<Resource> beneficiary) {
    this.beneficiary = beneficiary;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public Reference<Resource> getPolicyHolder() {
    return policyHolder;
  }
  
  public void setPolicyHolder(Reference<Resource> policyHolder) {
    this.policyHolder = policyHolder;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Coverage) {
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
    return "Coverage(" + id + ")";
  }
}
