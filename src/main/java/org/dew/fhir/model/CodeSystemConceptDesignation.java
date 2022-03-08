package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/codesystem-definitions.html#CodeSystem.concept.designation">CodeSystem.concept.designation</a>
 */
public 
class CodeSystemConceptDesignation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 9039884041351536137L;
  
  protected String language;
  protected Coding use;
  protected String value;
  
  public CodeSystemConceptDesignation()
  {
  }

  public String getLanguage() {
    return language;
  }

  public Coding getUse() {
    return use;
  }

  public String getValue() {
    return value;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setUse(Coding use) {
    this.use = use;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeSystemConceptDesignation) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (language + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "CodeSystemConceptDesignation(" + id + "," + language + "," + use + "," + value + ")";
  }
}
