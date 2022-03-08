package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.expansion.parameter">ValueSet.expansion.parameter</a>
 */
public 
class ValueSetExpansionParameter extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7924145939676524545L;
  
  protected String name;
  protected String valueString;
  protected Boolean valueBoolean;
  protected Integer valueInteger;
  protected Double valueDecimal;
  protected String valueUri;
  protected String valueCode;
  protected Date valueDateTime;
  
  public ValueSetExpansionParameter()
  {
  }

  public String getName() {
    return name;
  }

  public String getValueString() {
    return valueString;
  }

  public Boolean isValueBoolean() {
    return valueBoolean;
  }

  public Integer getValueInteger() {
    return valueInteger;
  }

  public Double getValueDecimal() {
    return valueDecimal;
  }

  public String getValueUri() {
    return valueUri;
  }

  public String getValueCode() {
    return valueCode;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }

  public void setValueDecimal(Double valueDecimal) {
    this.valueDecimal = valueDecimal;
  }

  public void setValueUri(String valueUri) {
    this.valueUri = valueUri;
  }

  public void setValueCode(String valueCode) {
    this.valueCode = valueCode;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetExpansionParameter) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(name == null) return 0;
    return name.hashCode();
  }
  
  @Override
  public String toString() {
    return "ValueSetExpansionParameter(" + id + "," + name + ")";
  }
}
