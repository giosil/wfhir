package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 * @see <a href="https://www.hl7.org/fhir">QuestionnaireResponse_Item</a>
 */
public
class QuestionnaireResponseItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected QuestionnaireResponseItem[] item;
  protected String linkId;
  protected QuestionnaireResponseAnswer[] answer;
  protected String definition;
  
  public QuestionnaireResponseItem()
  {
  }
  
  public QuestionnaireResponseItem[] getItem() {
    return item;
  }
  
  public void setItem(QuestionnaireResponseItem[] item) {
    this.item = item;
  }
  
  public String getLinkId() {
    return linkId;
  }
  
  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }
  
  public QuestionnaireResponseAnswer[] getAnswer() {
    return answer;
  }
  
  public void setAnswer(QuestionnaireResponseAnswer[] answer) {
    this.answer = answer;
  }
  
  public String getDefinition() {
    return definition;
  }
  
  public void setDefinition(String definition) {
    this.definition = definition;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof QuestionnaireResponseItem) {
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
    return "QuestionnaireResponseItem(" + id + ")";
  }
}
