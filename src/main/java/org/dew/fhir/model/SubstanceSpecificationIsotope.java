package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Isotope</a>
 */
public
class SubstanceSpecificationIsotope extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier identifier;
  protected CodeableConcept substitution;
  protected CodeableConcept name;
  protected SubstanceSpecificationMolecularWeight molecularWeight;
  protected Quantity halfLife;
  
  public SubstanceSpecificationIsotope()
  {
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept getSubstitution() {
    return substitution;
  }
  
  public void setSubstitution(CodeableConcept substitution) {
    this.substitution = substitution;
  }
  
  public CodeableConcept getName() {
    return name;
  }
  
  public void setName(CodeableConcept name) {
    this.name = name;
  }
  
  public SubstanceSpecificationMolecularWeight getMolecularWeight() {
    return molecularWeight;
  }
  
  public void setMolecularWeight(SubstanceSpecificationMolecularWeight molecularWeight) {
    this.molecularWeight = molecularWeight;
  }
  
  public Quantity getHalfLife() {
    return halfLife;
  }
  
  public void setHalfLife(Quantity halfLife) {
    this.halfLife = halfLife;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationIsotope) {
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
    return "SubstanceSpecificationIsotope(" + id + ")";
  }
}
