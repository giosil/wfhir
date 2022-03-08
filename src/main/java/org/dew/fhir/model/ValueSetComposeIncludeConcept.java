package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specifies a concept to be included or excluded.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.compose.include.concept">ValueSet.compose.include.concept</a>
 */
public 
class ValueSetComposeIncludeConcept extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7969463848280694336L;
  
  protected String code;
  protected String display;
  protected ValueSetComposeIncludeConceptDesignation[] designation;
  
  public ValueSetComposeIncludeConcept()
  {
  }

  public String getCode() {
    return code;
  }

  public String getDisplay() {
    return display;
  }

  public ValueSetComposeIncludeConceptDesignation[] getDesignation() {
    return designation;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setDesignation(ValueSetComposeIncludeConceptDesignation[] designation) {
    this.designation = designation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetComposeIncludeConcept) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (code + ":" + display).hashCode();
  }
  
  @Override
  public String toString() {
    return "ValueSetComposeIncludeConcept(" + id + "," + code + "," + display + ")";
  }
}
