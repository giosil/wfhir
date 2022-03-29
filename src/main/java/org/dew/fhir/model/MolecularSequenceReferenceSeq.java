package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.referenceSeq">MolecularSequence.referenceSeq</a>
 */
public 
class MolecularSequenceReferenceSeq extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -4371512301515106021L;

  protected CodeableConcept chromosome;
  protected String genomeBuild;
  protected String orientation;
  protected CodeableConcept referenceSeqId;
  protected Reference<MolecularSequence> referenceSeqPointer;
  protected String referenceSeqString;
  protected String strand;
  protected Integer windowStart;
  protected Integer windowEnd;
  
  public MolecularSequenceReferenceSeq()
  {
  }

  public CodeableConcept getChromosome() {
    return chromosome;
  }

  public String getGenomeBuild() {
    return genomeBuild;
  }

  public String getOrientation() {
    return orientation;
  }

  public CodeableConcept getReferenceSeqId() {
    return referenceSeqId;
  }

  public Reference<MolecularSequence> getReferenceSeqPointer() {
    return referenceSeqPointer;
  }

  public String getReferenceSeqString() {
    return referenceSeqString;
  }

  public String getStrand() {
    return strand;
  }

  public Integer getWindowStart() {
    return windowStart;
  }

  public Integer getWindowEnd() {
    return windowEnd;
  }

  public void setChromosome(CodeableConcept chromosome) {
    this.chromosome = chromosome;
  }

  public void setGenomeBuild(String genomeBuild) {
    this.genomeBuild = genomeBuild;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public void setReferenceSeqId(CodeableConcept referenceSeqId) {
    this.referenceSeqId = referenceSeqId;
  }

  public void setReferenceSeqPointer(Reference<MolecularSequence> referenceSeqPointer) {
    this.referenceSeqPointer = referenceSeqPointer;
  }

  public void setReferenceSeqString(String referenceSeqString) {
    this.referenceSeqString = referenceSeqString;
  }

  public void setStrand(String strand) {
    this.strand = strand;
  }

  public void setWindowStart(Integer windowStart) {
    this.windowStart = windowStart;
  }

  public void setWindowEnd(Integer windowEnd) {
    this.windowEnd = windowEnd;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceReferenceSeq) {
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
    return "MolecularSequenceReferenceSeq(" + id + ")";
  }
}
