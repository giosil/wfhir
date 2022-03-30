package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A parameter passed to or received from the operation.
 *
 * @see <a href="https://www.hl7.org/fhir/parameters-definitions.html#Parameters.parameter">Parameters.parameter</a>
 */
public 
class ParametersParameter extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -8910354999650614005L;

  protected String name;
  protected String valueString;
  protected Boolean valueBoolean;
  protected Integer valueInteger;
  protected Double valueDecimal;
  protected String valueUri;
  protected String valueCode;
  protected Date valueDateTime;
  protected Resource resource;
  protected ParametersParameter[] part;
  
  public ParametersParameter()
  {
  }

  public String getName() {
    return name;
  }

  public String getValueString() {
    return valueString;
  }

  public Boolean getValueBoolean() {
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

  public Resource getResource() {
    return resource;
  }

  public ParametersParameter[] getPart() {
    return part;
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

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public void setPart(ParametersParameter[] part) {
    this.part = part;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ParametersParameter) {
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
    return "ParametersParameter(" + id + ")";
  }
}
