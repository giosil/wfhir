package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information about chromosome structure variation.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.structureVariant">MolecularSequence.structureVariant</a>
 */
public 
class MolecularSequenceStructureVariant extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -4214619065132789843L;
  
  protected CodeableConcept variantType;
  protected Boolean exact;
  protected Integer length;
  protected MolecularSequenceStructureVariantOuter outer;
  protected MolecularSequenceStructureVariantInner inner;
  
  public MolecularSequenceStructureVariant()
  {
  }

  public CodeableConcept getVariantType() {
    return variantType;
  }

  public Boolean getExact() {
    return exact;
  }

  public Integer getLength() {
    return length;
  }

  public MolecularSequenceStructureVariantOuter getOuter() {
    return outer;
  }

  public MolecularSequenceStructureVariantInner getInner() {
    return inner;
  }

  public void setVariantType(CodeableConcept variantType) {
    this.variantType = variantType;
  }

  public void setExact(Boolean exact) {
    this.exact = exact;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public void setOuter(MolecularSequenceStructureVariantOuter outer) {
    this.outer = outer;
  }

  public void setInner(MolecularSequenceStructureVariantInner inner) {
    this.inner = inner;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceRepository) {
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
    return "MolecularSequenceStructureVariant(" + id + "," + variantType + "," + exact + "," + length + ")";
  }
}
