package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSourceMaterial_Organism</a>
 */
public
class SubstanceSourceMaterialOrganism extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept intraspecificType;
  protected SubstanceSourceMaterialHybrid hybrid;
  protected CodeableConcept genus;
  protected CodeableConcept species;
  protected SubstanceSourceMaterialAuthor[] author;
  protected SubstanceSourceMaterialOrganismGeneral organismGeneral;
  protected CodeableConcept family;
  protected String intraspecificDescription;
  
  public SubstanceSourceMaterialOrganism()
  {
  }
  
  public CodeableConcept getIntraspecificType() {
    return intraspecificType;
  }
  
  public void setIntraspecificType(CodeableConcept intraspecificType) {
    this.intraspecificType = intraspecificType;
  }
  
  public SubstanceSourceMaterialHybrid getHybrid() {
    return hybrid;
  }
  
  public void setHybrid(SubstanceSourceMaterialHybrid hybrid) {
    this.hybrid = hybrid;
  }
  
  public CodeableConcept getGenus() {
    return genus;
  }
  
  public void setGenus(CodeableConcept genus) {
    this.genus = genus;
  }
  
  public CodeableConcept getSpecies() {
    return species;
  }
  
  public void setSpecies(CodeableConcept species) {
    this.species = species;
  }
  
  public SubstanceSourceMaterialAuthor[] getAuthor() {
    return author;
  }
  
  public void setAuthor(SubstanceSourceMaterialAuthor[] author) {
    this.author = author;
  }
  
  public SubstanceSourceMaterialOrganismGeneral getOrganismGeneral() {
    return organismGeneral;
  }
  
  public void setOrganismGeneral(SubstanceSourceMaterialOrganismGeneral organismGeneral) {
    this.organismGeneral = organismGeneral;
  }
  
  public CodeableConcept getFamily() {
    return family;
  }
  
  public void setFamily(CodeableConcept family) {
    this.family = family;
  }
  
  public String getIntraspecificDescription() {
    return intraspecificDescription;
  }
  
  public void setIntraspecificDescription(String intraspecificDescription) {
    this.intraspecificDescription = intraspecificDescription;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSourceMaterialOrganism) {
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
    return "SubstanceSourceMaterialOrganism(" + id + ")";
  }
}
