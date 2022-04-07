package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term">Contract.term</a>
 */
public 
class ContractTerm extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -5016050361536147040L;
  
  protected Identifier identifier;
  protected Date issued;
  protected Period applies;
  protected CodeableConcept topicCodeableConcept;
  protected Reference<Resource> topicReference;
  protected CodeableConcept type;
  protected CodeableConcept subType;
  protected String text;
  protected ContractTermSecurityLabel[] securityLabel;
  protected ContractTermOffer offer;
  protected ContractTermAsset[] asset;
  protected ContractTermAction[] action;
  protected ContractTerm[] group;
  
  public ContractTerm()
  {
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public Date getIssued() {
    return issued;
  }

  public Period getApplies() {
    return applies;
  }

  public CodeableConcept getTopicCodeableConcept() {
    return topicCodeableConcept;
  }

  public Reference<Resource> getTopicReference() {
    return topicReference;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept getSubType() {
    return subType;
  }

  public String getText() {
    return text;
  }

  public ContractTermSecurityLabel[] getSecurityLabel() {
    return securityLabel;
  }

  public ContractTermOffer getOffer() {
    return offer;
  }

  public ContractTermAsset[] getAsset() {
    return asset;
  }

  public ContractTermAction[] getAction() {
    return action;
  }

  public ContractTerm[] getGroup() {
    return group;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setIssued(Date issued) {
    this.issued = issued;
  }

  public void setApplies(Period applies) {
    this.applies = applies;
  }

  public void setTopicCodeableConcept(CodeableConcept topicCodeableConcept) {
    this.topicCodeableConcept = topicCodeableConcept;
  }

  public void setTopicReference(Reference<Resource> topicReference) {
    this.topicReference = topicReference;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubType(CodeableConcept subType) {
    this.subType = subType;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setSecurityLabel(ContractTermSecurityLabel[] securityLabel) {
    this.securityLabel = securityLabel;
  }

  public void setOffer(ContractTermOffer offer) {
    this.offer = offer;
  }

  public void setAsset(ContractTermAsset[] asset) {
    this.asset = asset;
  }

  public void setAction(ContractTermAction[] action) {
    this.action = action;
  }

  public void setGroup(ContractTerm[] group) {
    this.group = group;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTerm) {
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
    return "ContractTerm(" + id + "," + identifier + ")";
  }
}
