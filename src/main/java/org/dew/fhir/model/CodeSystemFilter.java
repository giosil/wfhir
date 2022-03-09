package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
 *
 * @see <a href="https://www.hl7.org/fhir/codesystem-definitions.html#CodeSystem.filter">CodeSystem.filter</a>
 */
public 
class CodeSystemFilter extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3872870626094532066L;
  
  protected String code;
  protected String description;
  protected String operator[];
  protected String value;
  
  public CodeSystemFilter()
  {
  }
  
  public String getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }

  public String[] getOperator() {
    return operator;
  }

  public String getValue() {
    return value;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setOperator(String[] operator) {
    this.operator = operator;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeSystemFilter) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (code + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "CodeSystemFilter(" + id + "," + code + "," + description + "," + value + ")";
  }
}
