package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 * @see <a href="https://www.hl7.org/fhir">QuestionnaireResponse_Answer</a>
 */
public
class QuestionnaireResponseAnswer extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean valueBoolean;
  protected Coding valueCoding;
  protected Date valueTime;
  protected QuestionnaireResponseItem[] item;
  protected Reference<Resource> valueReference;
  protected Double valueDecimal;
  protected String valueUri;
  protected Date valueDate;
  protected Attachment valueAttachment;
  protected String valueString;
  protected Date valueDateTime;
  protected Integer valueInteger;
  protected Quantity valueQuantity;
  
  public QuestionnaireResponseAnswer()
  {
  }
  
  public Boolean getValueBoolean() {
    return valueBoolean;
  }
  
  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
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
  
  public QuestionnaireResponseItem[] getItem() {
    return item;
  }
  
  public void setItem(QuestionnaireResponseItem[] item) {
    this.item = item;
  }
  
  public Reference<Resource> getValueReference() {
    return valueReference;
  }
  
  public void setValueReference(Reference<Resource> valueReference) {
    this.valueReference = valueReference;
  }
  
  public Double getValueDecimal() {
    return valueDecimal;
  }
  
  public void setValueDecimal(Double valueDecimal) {
    this.valueDecimal = valueDecimal;
  }
  
  public String getValueUri() {
    return valueUri;
  }
  
  public void setValueUri(String valueUri) {
    this.valueUri = valueUri;
  }
  
  public Date getValueDate() {
    return valueDate;
  }
  
  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }
  
  public Attachment getValueAttachment() {
    return valueAttachment;
  }
  
  public void setValueAttachment(Attachment valueAttachment) {
    this.valueAttachment = valueAttachment;
  }
  
  public String getValueString() {
    return valueString;
  }
  
  public void setValueString(String valueString) {
    this.valueString = valueString;
  }
  
  public Date getValueDateTime() {
    return valueDateTime;
  }
  
  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }
  
  public Integer getValueInteger() {
    return valueInteger;
  }
  
  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }
  
  public Quantity getValueQuantity() {
    return valueQuantity;
  }
  
  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof QuestionnaireResponseAnswer) {
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
    return "QuestionnaireResponseAnswer(" + id + ")";
  }
}
