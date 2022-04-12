package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Moiety</a>
 */
public
class SubstanceSpecificationMoiety extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier identifier;
  protected CodeableConcept role;
  protected Quantity amountQuantity;
  protected String amountString;
  protected CodeableConcept opticalActivity;
  protected String molecularFormula;
  protected String name;
  protected CodeableConcept stereochemistry;
  
  public SubstanceSpecificationMoiety()
  {
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept getRole() {
    return role;
  }
  
  public void setRole(CodeableConcept role) {
    this.role = role;
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
  
  public CodeableConcept getOpticalActivity() {
    return opticalActivity;
  }
  
  public void setOpticalActivity(CodeableConcept opticalActivity) {
    this.opticalActivity = opticalActivity;
  }
  
  public String getMolecularFormula() {
    return molecularFormula;
  }
  
  public void setMolecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public CodeableConcept getStereochemistry() {
    return stereochemistry;
  }
  
  public void setStereochemistry(CodeableConcept stereochemistry) {
    this.stereochemistry = stereochemistry;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationMoiety) {
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
    return "SubstanceSpecificationMoiety(" + id + ")";
  }
}
