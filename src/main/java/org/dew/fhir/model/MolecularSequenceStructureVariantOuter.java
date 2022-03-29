package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Structural variant outer.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.structureVariant.outer">MolecularSequence.repository</a>
 */
public 
class MolecularSequenceStructureVariantOuter extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1145813403908649893L;
  
  protected Integer start;
  protected Integer end;
  
  public MolecularSequenceStructureVariantOuter()
  {
  }

  public Integer getStart() {
    return start;
  }

  public Integer getEnd() {
    return end;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceStructureVariantOuter) {
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
    return "MolecularSequenceStructureVariantOuter(" + id + "," + start + "," + end + ")";
  }
}
