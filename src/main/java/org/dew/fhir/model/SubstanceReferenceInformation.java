package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceReferenceInformation</a>
 */
public
class SubstanceReferenceInformation extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstanceReferenceInformationGene[] gene;
  protected SubstanceReferenceInformationClassification[] classification;
  protected SubstanceReferenceInformationTarget[] target;
  protected SubstanceReferenceInformationGeneElement[] geneElement;
  protected String comment;
  
  public SubstanceReferenceInformation()
  {
    this.resourceType = "SubstanceReferenceInformation";
  }
  
  public SubstanceReferenceInformationGene[] getGene() {
    return gene;
  }
  
  public void setGene(SubstanceReferenceInformationGene[] gene) {
    this.gene = gene;
  }
  
  public SubstanceReferenceInformationClassification[] getClassification() {
    return classification;
  }
  
  public void setClassification(SubstanceReferenceInformationClassification[] classification) {
    this.classification = classification;
  }
  
  public SubstanceReferenceInformationTarget[] getTarget() {
    return target;
  }
  
  public void setTarget(SubstanceReferenceInformationTarget[] target) {
    this.target = target;
  }
  
  public SubstanceReferenceInformationGeneElement[] getGeneElement() {
    return geneElement;
  }
  
  public void setGeneElement(SubstanceReferenceInformationGeneElement[] geneElement) {
    this.geneElement = geneElement;
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceReferenceInformation) {
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
    return "SubstanceReferenceInformation(" + id + ")";
  }
}
