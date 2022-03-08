package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A property defines an additional slot through which additional information can be provided about a concept.
 *
 * @see <a href="https://www.hl7.org/fhir/codesystem-definitions.html#CodeSystem.property">CodeSystem.property</a>
 */
public 
class CodeSystemProperty extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 6953538160380203508L;
  
  protected String code;
  protected String uri;
  protected String description;
  protected String type;
  
  public CodeSystemProperty()
  {
  }
  
  public String getCode() {
    return code;
  }

  public String getUri() {
    return uri;
  }

  public String getDescription() {
    return description;
  }

  public String getType() {
    return type;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeSystemProperty) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (code + ":" + uri).hashCode();
  }
  
  @Override
  public String toString() {
    return "CodeSystemProperty(" + id + "," + code + "," + uri + "," + description + "," + type + ")";
  }
}