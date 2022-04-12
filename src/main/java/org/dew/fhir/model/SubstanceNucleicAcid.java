package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceNucleicAcid</a>
 */
public
class SubstanceNucleicAcid extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstanceNucleicAcidSubunit[] subunit;
  protected Integer numberOfSubunits;
  protected CodeableConcept oligoNucleotideType;
  protected String areaOfHybridisation;
  protected CodeableConcept sequenceType;
  
  public SubstanceNucleicAcid()
  {
    this.resourceType = "SubstanceNucleicAcid";
  }
  
  public SubstanceNucleicAcidSubunit[] getSubunit() {
    return subunit;
  }
  
  public void setSubunit(SubstanceNucleicAcidSubunit[] subunit) {
    this.subunit = subunit;
  }
  
  public Integer getNumberOfSubunits() {
    return numberOfSubunits;
  }
  
  public void setNumberOfSubunits(Integer numberOfSubunits) {
    this.numberOfSubunits = numberOfSubunits;
  }
  
  public CodeableConcept getOligoNucleotideType() {
    return oligoNucleotideType;
  }
  
  public void setOligoNucleotideType(CodeableConcept oligoNucleotideType) {
    this.oligoNucleotideType = oligoNucleotideType;
  }
  
  public String getAreaOfHybridisation() {
    return areaOfHybridisation;
  }
  
  public void setAreaOfHybridisation(String areaOfHybridisation) {
    this.areaOfHybridisation = areaOfHybridisation;
  }
  
  public CodeableConcept getSequenceType() {
    return sequenceType;
  }
  
  public void setSequenceType(CodeableConcept sequenceType) {
    this.sequenceType = sequenceType;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceNucleicAcid) {
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
    return "SubstanceNucleicAcid(" + id + ")";
  }
}
