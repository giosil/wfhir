package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification</a>
 */
public
class SubstanceSpecification extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> polymer;
  protected SubstanceSpecificationCode[] code;
  protected String description;
  protected Reference<Resource>[] source;
  protected CodeableConcept type;
  protected SubstanceSpecificationMoiety[] moiety;
  protected Reference<Resource> protein;
  protected SubstanceSpecificationProperty[] property;
  protected SubstanceSpecificationRelationship[] relationship;
  protected Identifier identifier;
  protected Reference<Resource> referenceInformation;
  protected SubstanceSpecificationMolecularWeight[] molecularWeight;
  protected SubstanceSpecificationStructure structure;
  protected Reference<Resource> sourceMaterial;
  protected Reference<Resource> nucleicAcid;
  protected CodeableConcept domain;
  protected SubstanceSpecificationName[] name;
  protected String comment;
  protected CodeableConcept status;
  
  public SubstanceSpecification()
  {
    this.resourceType = "SubstanceSpecification";
  }
  
  public Reference<Resource> getPolymer() {
    return polymer;
  }
  
  public void setPolymer(Reference<Resource> polymer) {
    this.polymer = polymer;
  }
  
  public SubstanceSpecificationCode[] getCode() {
    return code;
  }
  
  public void setCode(SubstanceSpecificationCode[] code) {
    this.code = code;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
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
  
  public SubstanceSpecificationMoiety[] getMoiety() {
    return moiety;
  }
  
  public void setMoiety(SubstanceSpecificationMoiety[] moiety) {
    this.moiety = moiety;
  }
  
  public Reference<Resource> getProtein() {
    return protein;
  }
  
  public void setProtein(Reference<Resource> protein) {
    this.protein = protein;
  }
  
  public SubstanceSpecificationProperty[] getProperty() {
    return property;
  }
  
  public void setProperty(SubstanceSpecificationProperty[] property) {
    this.property = property;
  }
  
  public SubstanceSpecificationRelationship[] getRelationship() {
    return relationship;
  }
  
  public void setRelationship(SubstanceSpecificationRelationship[] relationship) {
    this.relationship = relationship;
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource> getReferenceInformation() {
    return referenceInformation;
  }
  
  public void setReferenceInformation(Reference<Resource> referenceInformation) {
    this.referenceInformation = referenceInformation;
  }
  
  public SubstanceSpecificationMolecularWeight[] getMolecularWeight() {
    return molecularWeight;
  }
  
  public void setMolecularWeight(SubstanceSpecificationMolecularWeight[] molecularWeight) {
    this.molecularWeight = molecularWeight;
  }
  
  public SubstanceSpecificationStructure getStructure() {
    return structure;
  }
  
  public void setStructure(SubstanceSpecificationStructure structure) {
    this.structure = structure;
  }
  
  public Reference<Resource> getSourceMaterial() {
    return sourceMaterial;
  }
  
  public void setSourceMaterial(Reference<Resource> sourceMaterial) {
    this.sourceMaterial = sourceMaterial;
  }
  
  public Reference<Resource> getNucleicAcid() {
    return nucleicAcid;
  }
  
  public void setNucleicAcid(Reference<Resource> nucleicAcid) {
    this.nucleicAcid = nucleicAcid;
  }
  
  public CodeableConcept getDomain() {
    return domain;
  }
  
  public void setDomain(CodeableConcept domain) {
    this.domain = domain;
  }
  
  public SubstanceSpecificationName[] getName() {
    return name;
  }
  
  public void setName(SubstanceSpecificationName[] name) {
    this.name = name;
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecification) {
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
    return "SubstanceSpecification(" + id + ")";
  }
}
