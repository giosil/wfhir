package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Name</a>
 */
public
class SubstanceSpecificationName extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] jurisdiction;
  protected SubstanceSpecificationOfficial[] official;
  protected Reference<Resource>[] source;
  protected CodeableConcept type;
  protected SubstanceSpecificationName[] synonym;
  protected CodeableConcept[] domain;
  protected String name;
  protected SubstanceSpecificationName[] translation;
  protected Boolean preferred;
  protected CodeableConcept status;
  
  public SubstanceSpecificationName()
  {
  }
  
  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  public SubstanceSpecificationOfficial[] getOfficial() {
    return official;
  }
  
  public void setOfficial(SubstanceSpecificationOfficial[] official) {
    this.official = official;
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public SubstanceSpecificationName[] getSynonym() {
    return synonym;
  }
  
  public void setSynonym(SubstanceSpecificationName[] synonym) {
    this.synonym = synonym;
  }
  
  public CodeableConcept[] getDomain() {
    return domain;
  }
  
  public void setDomain(CodeableConcept[] domain) {
    this.domain = domain;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public SubstanceSpecificationName[] getTranslation() {
    return translation;
  }
  
  public void setTranslation(SubstanceSpecificationName[] translation) {
    this.translation = translation;
  }
  
  public Boolean getPreferred() {
    return preferred;
  }
  
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationName) {
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
    return "SubstanceSpecificationName(" + id + ")";
  }
}
