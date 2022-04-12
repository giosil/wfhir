package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceProtein_Subunit</a>
 */
public
class SubstanceProteinSubunit extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer length;
  protected Integer subunit;
  protected Identifier cTerminalModificationId;
  protected String sequence;
  protected String cTerminalModification;
  protected String nTerminalModification;
  protected Identifier nTerminalModificationId;
  protected Attachment sequenceAttachment;
  
  public SubstanceProteinSubunit()
  {
  }
  
  public Integer getLength() {
    return length;
  }
  
  public void setLength(Integer length) {
    this.length = length;
  }
  
  public Integer getSubunit() {
    return subunit;
  }
  
  public void setSubunit(Integer subunit) {
    this.subunit = subunit;
  }
  
  public Identifier getCTerminalModificationId() {
    return cTerminalModificationId;
  }
  
  public void setCTerminalModificationId(Identifier cTerminalModificationId) {
    this.cTerminalModificationId = cTerminalModificationId;
  }
  
  public String getSequence() {
    return sequence;
  }
  
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }
  
  public String getCTerminalModification() {
    return cTerminalModification;
  }
  
  public void setCTerminalModification(String cTerminalModification) {
    this.cTerminalModification = cTerminalModification;
  }
  
  public String getNTerminalModification() {
    return nTerminalModification;
  }
  
  public void setNTerminalModification(String nTerminalModification) {
    this.nTerminalModification = nTerminalModification;
  }
  
  public Identifier getNTerminalModificationId() {
    return nTerminalModificationId;
  }
  
  public void setNTerminalModificationId(Identifier nTerminalModificationId) {
    this.nTerminalModificationId = nTerminalModificationId;
  }
  
  public Attachment getSequenceAttachment() {
    return sequenceAttachment;
  }
  
  public void setSequenceAttachment(Attachment sequenceAttachment) {
    this.sequenceAttachment = sequenceAttachment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceProteinSubunit) {
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
    return "SubstanceProteinSubunit(" + id + ")";
  }
}
