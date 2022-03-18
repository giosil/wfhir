package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * What to do when there is no mapping for the source concept. 
 * "Unmapped" does not include codes that are unmatched, and the unmapped element is ignored in a code is specified to have equivalence = unmatched.
 *
 * @see <a href="https://www.hl7.org/fhir/conceptmap-definitions.html#ConceptMap.group.unmapped">ConceptMap.group.unmapped</a>
 */
public 
class ConceptMapGroupUnmapped extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -381983625025763040L;
  
  protected String mode;
  protected String code;
  protected String display;
  protected String url;
  
  public ConceptMapGroupUnmapped()
  {
  }

  public String getMode() {
    return mode;
  }

  public String getCode() {
    return code;
  }

  public String getDisplay() {
    return display;
  }

  public String getUrl() {
    return url;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConceptMapGroupUnmapped) {
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
    return "ConceptMapGroupUnmapped(" + id + "," + mode + "," + code + ")";
  }
}
