package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceNucleicAcid_Subunit</a>
 */
public
class SubstanceNucleicAcidSubunit extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept threePrime;
  protected Integer length;
  protected Integer subunit;
  protected SubstanceNucleicAcidLinkage[] linkage;
  protected String sequence;
  protected CodeableConcept fivePrime;
  protected SubstanceNucleicAcidSugar[] sugar;
  protected Attachment sequenceAttachment;
  
  public SubstanceNucleicAcidSubunit()
  {
  }
  
  public CodeableConcept getThreePrime() {
    return threePrime;
  }
  
  public void setThreePrime(CodeableConcept threePrime) {
    this.threePrime = threePrime;
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
  
  public SubstanceNucleicAcidLinkage[] getLinkage() {
    return linkage;
  }
  
  public void setLinkage(SubstanceNucleicAcidLinkage[] linkage) {
    this.linkage = linkage;
  }
  
  public String getSequence() {
    return sequence;
  }
  
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }
  
  public CodeableConcept getFivePrime() {
    return fivePrime;
  }
  
  public void setFivePrime(CodeableConcept fivePrime) {
    this.fivePrime = fivePrime;
  }
  
  public SubstanceNucleicAcidSugar[] getSugar() {
    return sugar;
  }
  
  public void setSugar(SubstanceNucleicAcidSugar[] sugar) {
    this.sugar = sugar;
  }
  
  public Attachment getSequenceAttachment() {
    return sequenceAttachment;
  }
  
  public void setSequenceAttachment(Attachment sequenceAttachment) {
    this.sequenceAttachment = sequenceAttachment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceNucleicAcidSubunit) {
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
    return "SubstanceNucleicAcidSubunit(" + id + ")";
  }
}
