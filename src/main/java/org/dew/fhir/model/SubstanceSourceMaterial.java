package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSourceMaterial</a>
 */
public
class SubstanceSourceMaterial extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String[] geographicalLocation;
  protected CodeableConcept sourceMaterialType;
  protected Identifier organismId;
  protected CodeableConcept developmentStage;
  protected String organismName;
  protected Identifier[] parentSubstanceId;
  protected SubstanceSourceMaterialFractionDescription[] fractionDescription;
  protected SubstanceSourceMaterialOrganism organism;
  protected String[] parentSubstanceName;
  protected SubstanceSourceMaterialPartDescription[] partDescription;
  protected CodeableConcept sourceMaterialClass;
  protected CodeableConcept sourceMaterialState;
  protected CodeableConcept[] countryOfOrigin;
  
  public SubstanceSourceMaterial()
  {
    this.resourceType = "SubstanceSourceMaterial";
  }
  
  public String[] getGeographicalLocation() {
    return geographicalLocation;
  }
  
  public void setGeographicalLocation(String[] geographicalLocation) {
    this.geographicalLocation = geographicalLocation;
  }
  
  public CodeableConcept getSourceMaterialType() {
    return sourceMaterialType;
  }
  
  public void setSourceMaterialType(CodeableConcept sourceMaterialType) {
    this.sourceMaterialType = sourceMaterialType;
  }
  
  public Identifier getOrganismId() {
    return organismId;
  }
  
  public void setOrganismId(Identifier organismId) {
    this.organismId = organismId;
  }
  
  public CodeableConcept getDevelopmentStage() {
    return developmentStage;
  }
  
  public void setDevelopmentStage(CodeableConcept developmentStage) {
    this.developmentStage = developmentStage;
  }
  
  public String getOrganismName() {
    return organismName;
  }
  
  public void setOrganismName(String organismName) {
    this.organismName = organismName;
  }
  
  public Identifier[] getParentSubstanceId() {
    return parentSubstanceId;
  }
  
  public void setParentSubstanceId(Identifier[] parentSubstanceId) {
    this.parentSubstanceId = parentSubstanceId;
  }
  
  public SubstanceSourceMaterialFractionDescription[] getFractionDescription() {
    return fractionDescription;
  }
  
  public void setFractionDescription(SubstanceSourceMaterialFractionDescription[] fractionDescription) {
    this.fractionDescription = fractionDescription;
  }
  
  public SubstanceSourceMaterialOrganism getOrganism() {
    return organism;
  }
  
  public void setOrganism(SubstanceSourceMaterialOrganism organism) {
    this.organism = organism;
  }
  
  public String[] getParentSubstanceName() {
    return parentSubstanceName;
  }
  
  public void setParentSubstanceName(String[] parentSubstanceName) {
    this.parentSubstanceName = parentSubstanceName;
  }
  
  public SubstanceSourceMaterialPartDescription[] getPartDescription() {
    return partDescription;
  }
  
  public void setPartDescription(SubstanceSourceMaterialPartDescription[] partDescription) {
    this.partDescription = partDescription;
  }
  
  public CodeableConcept getSourceMaterialClass() {
    return sourceMaterialClass;
  }
  
  public void setSourceMaterialClass(CodeableConcept sourceMaterialClass) {
    this.sourceMaterialClass = sourceMaterialClass;
  }
  
  public CodeableConcept getSourceMaterialState() {
    return sourceMaterialState;
  }
  
  public void setSourceMaterialState(CodeableConcept sourceMaterialState) {
    this.sourceMaterialState = sourceMaterialState;
  }
  
  public CodeableConcept[] getCountryOfOrigin() {
    return countryOfOrigin;
  }
  
  public void setCountryOfOrigin(CodeableConcept[] countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSourceMaterial) {
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
    return "SubstanceSourceMaterial(" + id + ")";
  }
}
