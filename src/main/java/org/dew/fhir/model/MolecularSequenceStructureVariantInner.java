package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Structural variant inner.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.structureVariant.inner">MolecularSequence.structureVariant.inner</a>
 */
public 
class MolecularSequenceStructureVariantInner extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8088818679249968395L;
  
  protected Integer start;
  protected Integer end;
  
  public MolecularSequenceStructureVariantInner()
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
    if(object instanceof MolecularSequenceStructureVariantInner) {
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
    return "MolecularSequenceStructureVariantInner(" + id + "," + start + "," + end + ")";
  }
}
