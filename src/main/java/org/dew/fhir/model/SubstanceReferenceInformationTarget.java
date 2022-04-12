package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceReferenceInformation_Target</a>
 */
public
class SubstanceReferenceInformationTarget extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept amountType;
  protected CodeableConcept organismType;
  protected CodeableConcept organism;
  protected Reference<Resource>[] source;
  protected CodeableConcept type;
  protected Identifier target;
  protected Quantity amountQuantity;
  protected String amountString;
  protected Range amountRange;
  protected CodeableConcept interaction;
  
  public SubstanceReferenceInformationTarget()
  {
  }
  
  public CodeableConcept getAmountType() {
    return amountType;
  }
  
  public void setAmountType(CodeableConcept amountType) {
    this.amountType = amountType;
  }
  
  public CodeableConcept getOrganismType() {
    return organismType;
  }
  
  public void setOrganismType(CodeableConcept organismType) {
    this.organismType = organismType;
  }
  
  public CodeableConcept getOrganism() {
    return organism;
  }
  
  public void setOrganism(CodeableConcept organism) {
    this.organism = organism;
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Identifier getTarget() {
    return target;
  }
  
  public void setTarget(Identifier target) {
    this.target = target;
  }
  
  public Quantity getAmountQuantity() {
    return amountQuantity;
  }
  
  public void setAmountQuantity(Quantity amountQuantity) {
    this.amountQuantity = amountQuantity;
  }
  
  public String getAmountString() {
    return amountString;
  }
  
  public void setAmountString(String amountString) {
    this.amountString = amountString;
  }
  
  public Range getAmountRange() {
    return amountRange;
  }
  
  public void setAmountRange(Range amountRange) {
    this.amountRange = amountRange;
  }
  
  public CodeableConcept getInteraction() {
    return interaction;
  }
  
  public void setInteraction(CodeableConcept interaction) {
    this.interaction = interaction;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceReferenceInformationTarget) {
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
    return "SubstanceReferenceInformationTarget(" + id + ")";
  }
}
