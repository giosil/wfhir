package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_Translation</a>
 */
public
class TerminologyCapabilitiesTranslation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean needsMap;
  
  public TerminologyCapabilitiesTranslation()
  {
  }
  
  public Boolean getNeedsMap() {
    return needsMap;
  }
  
  public void setNeedsMap(Boolean needsMap) {
    this.needsMap = needsMap;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesTranslation) {
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
    return "TerminologyCapabilitiesTranslation(" + id + ")";
  }
}
