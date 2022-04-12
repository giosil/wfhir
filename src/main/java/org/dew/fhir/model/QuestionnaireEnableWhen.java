package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 *
 * @see <a href="https://www.hl7.org/fhir">Questionnaire_EnableWhen</a>
 */
public
class QuestionnaireEnableWhen extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Quantity answerQuantity;
  protected Date answerDateTime;
  protected String question;
  protected Date answerDate;
  protected Date answerTime;
  protected String operator;
  protected Integer answerInteger;
  protected Double answerDecimal;
  protected String answerString;
  protected Coding answerCoding;
  protected Reference<Resource> answerReference;
  protected Boolean answerBoolean;
  
  public QuestionnaireEnableWhen()
  {
  }
  
  public Quantity getAnswerQuantity() {
    return answerQuantity;
  }
  
  public void setAnswerQuantity(Quantity answerQuantity) {
    this.answerQuantity = answerQuantity;
  }
  
  public Date getAnswerDateTime() {
    return answerDateTime;
  }
  
  public void setAnswerDateTime(Date answerDateTime) {
    this.answerDateTime = answerDateTime;
  }
  
  public String getQuestion() {
    return question;
  }
  
  public void setQuestion(String question) {
    this.question = question;
  }
  
  public Date getAnswerDate() {
    return answerDate;
  }
  
  public void setAnswerDate(Date answerDate) {
    this.answerDate = answerDate;
  }
  
  public Date getAnswerTime() {
    return answerTime;
  }
  
  public void setAnswerTime(Date answerTime) {
    this.answerTime = answerTime;
  }
  
  public String getOperator() {
    return operator;
  }
  
  public void setOperator(String operator) {
    this.operator = operator;
  }
  
  public Integer getAnswerInteger() {
    return answerInteger;
  }
  
  public void setAnswerInteger(Integer answerInteger) {
    this.answerInteger = answerInteger;
  }
  
  public Double getAnswerDecimal() {
    return answerDecimal;
  }
  
  public void setAnswerDecimal(Double answerDecimal) {
    this.answerDecimal = answerDecimal;
  }
  
  public String getAnswerString() {
    return answerString;
  }
  
  public void setAnswerString(String answerString) {
    this.answerString = answerString;
  }
  
  public Coding getAnswerCoding() {
    return answerCoding;
  }
  
  public void setAnswerCoding(Coding answerCoding) {
    this.answerCoding = answerCoding;
  }
  
  public Reference<Resource> getAnswerReference() {
    return answerReference;
  }
  
  public void setAnswerReference(Reference<Resource> answerReference) {
    this.answerReference = answerReference;
  }
  
  public Boolean getAnswerBoolean() {
    return answerBoolean;
  }
  
  public void setAnswerBoolean(Boolean answerBoolean) {
    this.answerBoolean = answerBoolean;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof QuestionnaireEnableWhen) {
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
    return "QuestionnaireEnableWhen(" + id + ")";
  }
}
