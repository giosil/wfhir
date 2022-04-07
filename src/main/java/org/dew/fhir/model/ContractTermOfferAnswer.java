package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Response to offer text.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.offer.answer">Contract.term.offer.answer</a>
 */
public 
class ContractTermOfferAnswer extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 5762155445501570741L;
  
  protected Boolean valueBoolean;
  protected Double valueDecimal;
  protected Integer valueInteger;
  protected Date valueDate;
  protected Date valueDateTime;
  protected Date valueTime;
  protected String valueString;
  protected String valueUri;
  protected Attachment valueAttachment;
  protected Coding valueCoding;
  protected Quantity valueQuantity;
  protected Reference<Resource> valueReference;
  
  public ContractTermOfferAnswer()
  {
  }

  public Boolean getValueBoolean() {
    return valueBoolean;
  }

  public Double getValueDecimal() {
    return valueDecimal;
  }

  public Integer getValueInteger() {
    return valueInteger;
  }

  public Date getValueDate() {
    return valueDate;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public Date getValueTime() {
    return valueTime;
  }

  public String getValueString() {
    return valueString;
  }

  public String getValueUri() {
    return valueUri;
  }

  public Attachment getValueAttachment() {
    return valueAttachment;
  }

  public Coding getValueCoding() {
    return valueCoding;
  }

  public Quantity getValueQuantity() {
    return valueQuantity;
  }

  public Reference<Resource> getValueReference() {
    return valueReference;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public void setValueDecimal(Double valueDecimal) {
    this.valueDecimal = valueDecimal;
  }

  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }

  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public void setValueTime(Date valueTime) {
    this.valueTime = valueTime;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueUri(String valueUri) {
    this.valueUri = valueUri;
  }

  public void setValueAttachment(Attachment valueAttachment) {
    this.valueAttachment = valueAttachment;
  }

  public void setValueCoding(Coding valueCoding) {
    this.valueCoding = valueCoding;
  }

  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueReference(Reference<Resource> valueReference) {
    this.valueReference = valueReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermOfferAnswer) {
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
    return "ContractTermOfferAnswer(" + id + "," + valueString + ")";
  }
}
