package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The definition of variant here originates from Sequence ontology. 
 * This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.).
 * It can represent some complex mutation or segment variation with the assist of CIGAR string.
 * 
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.variant">MolecularSequence.variant</a>
 */
public 
class MolecularSequenceVariant extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 4234104954404100937L;
  
  protected Integer start;
  protected Integer end;
  protected String observedAllele;
  protected String referenceAllele;
  protected String cigar;
  protected Reference<Observation> variantPointer;
  
  public MolecularSequenceVariant()
  {
  }

  public Integer getStart() {
    return start;
  }

  public Integer getEnd() {
    return end;
  }

  public String getObservedAllele() {
    return observedAllele;
  }

  public String getReferenceAllele() {
    return referenceAllele;
  }

  public String getCigar() {
    return cigar;
  }

  public Reference<Observation> getVariantPointer() {
    return variantPointer;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public void setObservedAllele(String observedAllele) {
    this.observedAllele = observedAllele;
  }

  public void setReferenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
  }

  public void setCigar(String cigar) {
    this.cigar = cigar;
  }

  public void setVariantPointer(Reference<Observation> variantPointer) {
    this.variantPointer = variantPointer;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceVariant) {
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
    return "MolecularSequenceVariant(" + id + "," + start + "," + end + ")";
  }
}
