package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 * @see <a href="https://www.hl7.org/fhir">QuestionnaireResponse</a>
 */
public
class QuestionnaireResponse extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date authored;
  protected Identifier identifier;
  protected Reference<Resource>[] partOf;
  protected String questionnaire;
  protected QuestionnaireResponseItem[] item;
  protected Reference<Resource> subject;
  protected Reference<Resource> author;
  protected Reference<Resource> encounter;
  protected Reference<Resource> source;
  protected Reference<Resource>[] basedOn;
  protected String status;
  
  public QuestionnaireResponse()
  {
    this.resourceType = "QuestionnaireResponse";
  }
  
  public Date getAuthored() {
    return authored;
  }
  
  public void setAuthored(Date authored) {
    this.authored = authored;
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource>[] getPartOf() {
    return partOf;
  }
  
  public void setPartOf(Reference<Resource>[] partOf) {
    this.partOf = partOf;
  }
  
  public String getQuestionnaire() {
    return questionnaire;
  }
  
  public void setQuestionnaire(String questionnaire) {
    this.questionnaire = questionnaire;
  }
  
  public QuestionnaireResponseItem[] getItem() {
    return item;
  }
  
  public void setItem(QuestionnaireResponseItem[] item) {
    this.item = item;
  }
  
  public Reference<Resource> getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }
  
  public Reference<Resource> getAuthor() {
    return author;
  }
  
  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }
  
  public Reference<Resource> getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource> encounter) {
    this.encounter = encounter;
  }
  
  public Reference<Resource> getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource> source) {
    this.source = source;
  }
  
  public Reference<Resource>[] getBasedOn() {
    return basedOn;
  }
  
  public void setBasedOn(Reference<Resource>[] basedOn) {
    this.basedOn = basedOn;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof QuestionnaireResponse) {
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
    return "QuestionnaireResponse(" + id + ")";
  }
}
