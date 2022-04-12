package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Parameter</a>
 */
public
class StructureMapParameter extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean valueBoolean;
  protected String valueId;
  protected Double valueDecimal;
  protected String valueString;
  protected Integer valueInteger;
  
  public StructureMapParameter()
  {
  }
  
  public Boolean getValueBoolean() {
    return valueBoolean;
  }
  
  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }
  
  public String getValueId() {
    return valueId;
  }
  
  public void setValueId(String valueId) {
    this.valueId = valueId;
  }
  
  public Double getValueDecimal() {
    return valueDecimal;
  }
  
  public void setValueDecimal(Double valueDecimal) {
    this.valueDecimal = valueDecimal;
  }
  
  public String getValueString() {
    return valueString;
  }
  
  public void setValueString(String valueString) {
    this.valueString = valueString;
  }
  
  public Integer getValueInteger() {
    return valueInteger;
  }
  
  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapParameter) {
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
    return "StructureMapParameter(" + id + ")";
  }
}
