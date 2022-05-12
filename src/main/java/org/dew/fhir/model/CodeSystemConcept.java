package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Concepts that are in the code system. 
 * The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
 *
 * @see <a href="https://www.hl7.org/fhir/codesystem-definitions.html#CodeSystem.concept">CodeSystem.concept</a>
 */
public 
class CodeSystemConcept extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -1175450026982552807L;
  
  protected String code;
  protected String display;
  protected String definition;
  protected CodeSystemConceptDesignation[] designation;
  protected CodeSystemConceptProperty[] property;
  protected CodeSystemConcept[] concept;
  
  public CodeSystemConcept()
  {
  }

  public CodeSystemConcept(String code)
  {
    this.code = code;
  }

  public CodeSystemConcept(String code, String display)
  {
    this.code = code;
    this.display = display;
  }

  public CodeSystemConcept(String code, String display, String definition)
  {
    this.code = code;
    this.display = display;
    this.definition = definition;
  }

  public String getCode() {
    return code;
  }

  public String getDisplay() {
    return display;
  }

  public String getDefinition() {
    return definition;
  }

  public CodeSystemConceptDesignation[] getDesignation() {
    return designation;
  }

  public CodeSystemConceptProperty[] getProperty() {
    return property;
  }

  public CodeSystemConcept[] getConcept() {
    return concept;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public void setDesignation(CodeSystemConceptDesignation[] designation) {
    this.designation = designation;
  }

  public void setProperty(CodeSystemConceptProperty[] property) {
    this.property = property;
  }

  public void setConcept(CodeSystemConcept[] concept) {
    this.concept = concept;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeSystemConcept) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(code == null) return 0;
    return code.hashCode();
  }
  
  @Override
  public String toString() {
    return "CodeSystemConcept(" + id + "," + code + "," + display + "," + definition + ")";
  }
}
