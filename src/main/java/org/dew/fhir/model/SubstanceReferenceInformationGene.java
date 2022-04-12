package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceReferenceInformation_Gene</a>
 */
public
class SubstanceReferenceInformationGene extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] source;
  protected CodeableConcept geneSequenceOrigin;
  protected CodeableConcept gene;
  
  public SubstanceReferenceInformationGene()
  {
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public CodeableConcept getGeneSequenceOrigin() {
    return geneSequenceOrigin;
  }
  
  public void setGeneSequenceOrigin(CodeableConcept geneSequenceOrigin) {
    this.geneSequenceOrigin = geneSequenceOrigin;
  }
  
  public CodeableConcept getGene() {
    return gene;
  }
  
  public void setGene(CodeableConcept gene) {
    this.gene = gene;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceReferenceInformationGene) {
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
    return "SubstanceReferenceInformationGene(" + id + ")";
  }
}
