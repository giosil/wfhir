package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.compose.include.concept.designation">ValueSet.compose.include.concept.designation</a>
 */
public 
class ValueSetComposeIncludeConceptDesignation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 5832178498556612542L;
  
  protected String language;
  protected Coding use;
  protected String value;
  
  public ValueSetComposeIncludeConceptDesignation()
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
    if(object instanceof ValueSetComposeIncludeConceptDesignation) {
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
    return "ValueSetComposeIncludeConceptDesignation(" + id + "," + language + "," + use + "," + value + ")";
  }
}
