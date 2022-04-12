package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Relationship</a>
 */
public
class SubstanceSpecificationRelationship extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Ratio amountRatio;
  protected CodeableConcept amountType;
  protected CodeableConcept substanceCodeableConcept;
  protected Reference<Resource>[] source;
  protected Ratio amountRatioLowLimit;
  protected Boolean isDefining;
  protected Quantity amountQuantity;
  protected String amountString;
  protected Range amountRange;
  protected CodeableConcept relationship;
  protected Reference<Resource> substanceReference;
  
  public SubstanceSpecificationRelationship()
  {
  }
  
  public Ratio getAmountRatio() {
    return amountRatio;
  }
  
  public void setAmountRatio(Ratio amountRatio) {
    this.amountRatio = amountRatio;
  }
  
  public CodeableConcept getAmountType() {
    return amountType;
  }
  
  public void setAmountType(CodeableConcept amountType) {
    this.amountType = amountType;
  }
  
  public CodeableConcept getSubstanceCodeableConcept() {
    return substanceCodeableConcept;
  }
  
  public void setSubstanceCodeableConcept(CodeableConcept substanceCodeableConcept) {
    this.substanceCodeableConcept = substanceCodeableConcept;
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public Ratio getAmountRatioLowLimit() {
    return amountRatioLowLimit;
  }
  
  public void setAmountRatioLowLimit(Ratio amountRatioLowLimit) {
    this.amountRatioLowLimit = amountRatioLowLimit;
  }
  
  public Boolean getIsDefining() {
    return isDefining;
  }
  
  public void setIsDefining(Boolean isDefining) {
    this.isDefining = isDefining;
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
  
  public CodeableConcept getRelationship() {
    return relationship;
  }
  
  public void setRelationship(CodeableConcept relationship) {
    this.relationship = relationship;
  }
  
  public Reference<Resource> getSubstanceReference() {
    return substanceReference;
  }
  
  public void setSubstanceReference(Reference<Resource> substanceReference) {
    this.substanceReference = substanceReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationRelationship) {
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
    return "SubstanceSpecificationRelationship(" + id + ")";
  }
}
