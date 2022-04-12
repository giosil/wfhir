package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 *
 * @see <a href="https://www.hl7.org/fhir">Questionnaire_AnswerOption</a>
 */
public
class QuestionnaireAnswerOption extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Coding valueCoding;
  protected Date valueTime;
  protected Reference<Resource> valueReference;
  protected Date valueDate;
  protected String valueString;
  protected Boolean initialSelected;
  protected Integer valueInteger;
  
  public QuestionnaireAnswerOption()
  {
  }
  
  public Coding getValueCoding() {
    return valueCoding;
  }
  
  public void setValueCoding(Coding valueCoding) {
    this.valueCoding = valueCoding;
  }
  
  public Date getValueTime() {
    return valueTime;
  }
  
  public void setValueTime(Date valueTime) {
    this.valueTime = valueTime;
  }
  
  public Reference<Resource> getValueReference() {
    return valueReference;
  }
  
  public void setValueReference(Reference<Resource> valueReference) {
    this.valueReference = valueReference;
  }
  
  public Date getValueDate() {
    return valueDate;
  }
  
  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }
  
  public String getValueString() {
    return valueString;
  }
  
  public void setValueString(String valueString) {
    this.valueString = valueString;
  }
  
  public Boolean getInitialSelected() {
    return initialSelected;
  }
  
  public void setInitialSelected(Boolean initialSelected) {
    this.initialSelected = initialSelected;
  }
  
  public Integer getValueInteger() {
    return valueInteger;
  }
  
  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof QuestionnaireAnswerOption) {
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
    return "QuestionnaireAnswerOption(" + id + ")";
  }
}
