package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Contract Term Asset.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.asset">Contract.term.asset</a>
 */
public 
class ContractTermAsset extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3931426200277430822L;
  
  protected CodeableConcept scope;
  protected CodeableConcept[] type;
  protected Reference<Resource>[] typeReference;
  protected CodeableConcept[] subtype;
  protected Coding relationship;
  protected ContractTermAssetContext[] context;
  protected String condition;
  protected CodeableConcept[] periodType;
  protected Period[] period;
  protected Period[] usePeriod;
  protected String text;
  protected String[] linkId;
  protected ContractTermOfferAnswer[] answer;
  protected Integer[] securityLabelNumber;
  protected ContractTermAssetValuedItem[] valuedItem;
  
  public ContractTermAsset()
  {
  }

  public CodeableConcept getScope() {
    return scope;
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public Reference<Resource>[] getTypeReference() {
    return typeReference;
  }

  public CodeableConcept[] getSubtype() {
    return subtype;
  }

  public Coding getRelationship() {
    return relationship;
  }

  public ContractTermAssetContext[] getContext() {
    return context;
  }

  public String getCondition() {
    return condition;
  }

  public CodeableConcept[] getPeriodType() {
    return periodType;
  }

  public Period[] getPeriod() {
    return period;
  }

  public Period[] getUsePeriod() {
    return usePeriod;
  }

  public String getText() {
    return text;
  }

  public String[] getLinkId() {
    return linkId;
  }

  public ContractTermOfferAnswer[] getAnswer() {
    return answer;
  }

  public Integer[] getSecurityLabelNumber() {
    return securityLabelNumber;
  }

  public ContractTermAssetValuedItem[] getValuedItem() {
    return valuedItem;
  }

  public void setScope(CodeableConcept scope) {
    this.scope = scope;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setTypeReference(Reference<Resource>[] typeReference) {
    this.typeReference = typeReference;
  }

  public void setSubtype(CodeableConcept[] subtype) {
    this.subtype = subtype;
  }

  public void setRelationship(Coding relationship) {
    this.relationship = relationship;
  }

  public void setContext(ContractTermAssetContext[] context) {
    this.context = context;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public void setPeriodType(CodeableConcept[] periodType) {
    this.periodType = periodType;
  }

  public void setPeriod(Period[] period) {
    this.period = period;
  }

  public void setUsePeriod(Period[] usePeriod) {
    this.usePeriod = usePeriod;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setLinkId(String[] linkId) {
    this.linkId = linkId;
  }

  public void setAnswer(ContractTermOfferAnswer[] answer) {
    this.answer = answer;
  }

  public void setSecurityLabelNumber(Integer[] securityLabelNumber) {
    this.securityLabelNumber = securityLabelNumber;
  }

  public void setValuedItem(ContractTermAssetValuedItem[] valuedItem) {
    this.valuedItem = valuedItem;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermAsset) {
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
    return "ContractTermAsset(" + id + "," + scope + ")";
  }
}
