package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Variable</a>
 */
public
class TestScriptVariable extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String sourceId;
  protected String headerField;
  protected String expression;
  protected String defaultValue;
  protected String description;
  protected String path;
  protected String hint;
  protected String name;
  
  public TestScriptVariable()
  {
  }
  
  public String getSourceId() {
    return sourceId;
  }
  
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }
  
  public String getHeaderField() {
    return headerField;
  }
  
  public void setHeaderField(String headerField) {
    this.headerField = headerField;
  }
  
  public String getExpression() {
    return expression;
  }
  
  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  public String getDefaultValue() {
    return defaultValue;
  }
  
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setPath(String path) {
    this.path = path;
  }
  
  public String getHint() {
    return hint;
  }
  
  public void setHint(String hint) {
    this.hint = hint;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptVariable) {
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
    return "TestScriptVariable(" + id + ")";
  }
}
