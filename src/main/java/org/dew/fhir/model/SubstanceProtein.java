package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceProtein</a>
 */
public
class SubstanceProtein extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstanceProteinSubunit[] subunit;
  protected Integer numberOfSubunits;
  protected String[] disulfideLinkage;
  protected CodeableConcept sequenceType;
  
  public SubstanceProtein()
  {
    this.resourceType = "SubstanceProtein";
  }
  
  public SubstanceProteinSubunit[] getSubunit() {
    return subunit;
  }
  
  public void setSubunit(SubstanceProteinSubunit[] subunit) {
    this.subunit = subunit;
  }
  
  public Integer getNumberOfSubunits() {
    return numberOfSubunits;
  }
  
  public void setNumberOfSubunits(Integer numberOfSubunits) {
    this.numberOfSubunits = numberOfSubunits;
  }
  
  public String[] getDisulfideLinkage() {
    return disulfideLinkage;
  }
  
  public void setDisulfideLinkage(String[] disulfideLinkage) {
    this.disulfideLinkage = disulfideLinkage;
  }
  
  public CodeableConcept getSequenceType() {
    return sequenceType;
  }
  
  public void setSequenceType(CodeableConcept sequenceType) {
    this.sequenceType = sequenceType;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceProtein) {
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
    return "SubstanceProtein(" + id + ")";
  }
}
