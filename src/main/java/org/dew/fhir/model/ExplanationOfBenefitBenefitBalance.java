package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="https://www.hl7.org/fhir">ExplanationOfBenefit_BenefitBalance</a>
 */
public
class ExplanationOfBenefitBenefitBalance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ExplanationOfBenefitFinancial[] financial;
  protected String description;
  protected CodeableConcept network;
  protected Boolean excluded;
  protected CodeableConcept unit;
  protected String name;
  protected CodeableConcept term;
  protected CodeableConcept category;
  
  public ExplanationOfBenefitBenefitBalance()
  {
  }
  
  public ExplanationOfBenefitFinancial[] getFinancial() {
    return financial;
  }
  
  public void setFinancial(ExplanationOfBenefitFinancial[] financial) {
    this.financial = financial;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept getNetwork() {
    return network;
  }
  
  public void setNetwork(CodeableConcept network) {
    this.network = network;
  }
  
  public Boolean getExcluded() {
    return excluded;
  }
  
  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }
  
  public CodeableConcept getUnit() {
    return unit;
  }
  
  public void setUnit(CodeableConcept unit) {
    this.unit = unit;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public CodeableConcept getTerm() {
    return term;
  }
  
  public void setTerm(CodeableConcept term) {
    this.term = term;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExplanationOfBenefitBenefitBalance) {
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
    return "ExplanationOfBenefitBenefitBalance(" + id + ")";
  }
}
