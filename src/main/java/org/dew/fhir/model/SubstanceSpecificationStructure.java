package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Structure</a>
 */
public
class SubstanceSpecificationStructure extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstanceSpecificationMolecularWeight molecularWeight;
  protected SubstanceSpecificationIsotope[] isotope;
  protected Reference<Resource>[] source;
  protected SubstanceSpecificationRepresentation[] representation;
  protected CodeableConcept opticalActivity;
  protected String molecularFormula;
  protected CodeableConcept stereochemistry;
  protected String molecularFormulaByMoiety;
  
  public SubstanceSpecificationStructure()
  {
  }
  
  public SubstanceSpecificationMolecularWeight getMolecularWeight() {
    return molecularWeight;
  }
  
  public void setMolecularWeight(SubstanceSpecificationMolecularWeight molecularWeight) {
    this.molecularWeight = molecularWeight;
  }
  
  public SubstanceSpecificationIsotope[] getIsotope() {
    return isotope;
  }
  
  public void setIsotope(SubstanceSpecificationIsotope[] isotope) {
    this.isotope = isotope;
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public SubstanceSpecificationRepresentation[] getRepresentation() {
    return representation;
  }
  
  public void setRepresentation(SubstanceSpecificationRepresentation[] representation) {
    this.representation = representation;
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
  
  public CodeableConcept getStereochemistry() {
    return stereochemistry;
  }
  
  public void setStereochemistry(CodeableConcept stereochemistry) {
    this.stereochemistry = stereochemistry;
  }
  
  public String getMolecularFormulaByMoiety() {
    return molecularFormulaByMoiety;
  }
  
  public void setMolecularFormulaByMoiety(String molecularFormulaByMoiety) {
    this.molecularFormulaByMoiety = molecularFormulaByMoiety;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationStructure) {
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
    return "SubstanceSpecificationStructure(" + id + ")";
  }
}
