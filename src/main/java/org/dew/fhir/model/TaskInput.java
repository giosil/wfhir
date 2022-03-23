package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Additional information that may be needed in the execution of the task.
 *
 * @see <a href="https://www.hl7.org/fhir/task-definitions.html#Task.input">Task.input</a>
 */
public 
class TaskInput extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7079531159405345174L;
  
  protected CodeableConcept type;
  protected String valueString;
  protected Boolean valueBoolean;
  protected Integer valueInteger;
  protected Double valueDecimal;
  protected String valueUri;
  protected String valueCode;
  protected Date valueDateTime;
  
  public TaskInput()
  {
  }

  public TaskInput(CodeableConcept type)
  {
    this.type = type;
  }

  public CodeableConcept getType() {
    return type;
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

  public void setType(CodeableConcept type) {
    this.type = type;
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
    if(object instanceof TaskInput) {
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
    return "TaskInput(" + id + "," + type + ")";
  }
}
