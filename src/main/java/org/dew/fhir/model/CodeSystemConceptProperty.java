package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A property value for CodeSystem concept.
 *
 * @see <a href="https://www.hl7.org/fhir/codesystem-definitions.html#CodeSystem.concept.property">CodeSystem.concept.property</a>
 */
public 
class CodeSystemConceptProperty extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3770686198224016042L;
  
  protected String code;
  protected String valueCode;
  protected Coding valueCoding;
  protected String valueString;
  protected Integer valueInteger;
  protected Boolean valueBoolean;
  protected Date valueDateTime;
  protected Double valueDecimal;
  
  public CodeSystemConceptProperty()
  {
  }

  public String getCode() {
    return code;
  }

  public String getValueCode() {
    return valueCode;
  }

  public Coding getValueCoding() {
    return valueCoding;
  }

  public String getValueString() {
    return valueString;
  }

  public Integer getValueInteger() {
    return valueInteger;
  }

  public Boolean isValueBoolean() {
    return valueBoolean;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public Double getValueDecimal() {
    return valueDecimal;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setValueCode(String valueCode) {
    this.valueCode = valueCode;
  }

  public void setValueCoding(Coding valueCoding) {
    this.valueCoding = valueCoding;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public void setValueDecimal(Double valueDecimal) {
    this.valueDecimal = valueDecimal;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeSystemConceptProperty) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(code == null) return 0;
    return code.hashCode();
  }
  
  @Override
  public String toString() {
    return "CodeSystemConceptProperty(" + id + "," + code + "," + valueCode + "," + valueString + ")";
  }
}