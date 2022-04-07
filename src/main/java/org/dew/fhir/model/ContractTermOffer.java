package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The matter of concern in the context of this provision of the agrement.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.offer">Contract.term.offer</a>
 */
public 
class ContractTermOffer extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 5516107924738229105L;
  
  protected Identifier[] identifier;
  protected ContractTermOfferParty[] party;
  protected Reference<Resource> topic;
  protected CodeableConcept type;
  protected CodeableConcept decision;
  protected CodeableConcept[] decisionMode;
  protected ContractTermOfferAnswer[] answer;
  protected String text;
  protected String[] linkId;
  protected Integer[] securityLabelNumber;
  
  public ContractTermOffer()
  {
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public ContractTermOfferParty[] getParty() {
    return party;
  }

  public Reference<Resource> getTopic() {
    return topic;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept getDecision() {
    return decision;
  }

  public CodeableConcept[] getDecisionMode() {
    return decisionMode;
  }

  public ContractTermOfferAnswer[] getAnswer() {
    return answer;
  }

  public String getText() {
    return text;
  }

  public String[] getLinkId() {
    return linkId;
  }

  public Integer[] getSecurityLabelNumber() {
    return securityLabelNumber;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setParty(ContractTermOfferParty[] party) {
    this.party = party;
  }

  public void setTopic(Reference<Resource> topic) {
    this.topic = topic;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setDecision(CodeableConcept decision) {
    this.decision = decision;
  }

  public void setDecisionMode(CodeableConcept[] decisionMode) {
    this.decisionMode = decisionMode;
  }

  public void setAnswer(ContractTermOfferAnswer[] answer) {
    this.answer = answer;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setLinkId(String[] linkId) {
    this.linkId = linkId;
  }

  public void setSecurityLabelNumber(Integer[] securityLabelNumber) {
    this.securityLabelNumber = securityLabelNumber;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermOffer) {
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
    return "ContractTermOffer(" + id + "," + topic + "," + type + "," + decision + ")";
  }
}
