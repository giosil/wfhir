package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSourceMaterial_FractionDescription</a>
 */
public
class SubstanceSourceMaterialFractionDescription extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept materialType;
  protected String fraction;
  
  public SubstanceSourceMaterialFractionDescription()
  {
  }
  
  public CodeableConcept getMaterialType() {
    return materialType;
  }
  
  public void setMaterialType(CodeableConcept materialType) {
    this.materialType = materialType;
  }
  
  public String getFraction() {
    return fraction;
  }
  
  public void setFraction(String fraction) {
    this.fraction = fraction;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSourceMaterialFractionDescription) {
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
    return "SubstanceSourceMaterialFractionDescription(" + id + ")";
  }
}
