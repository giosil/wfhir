package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_Closure</a>
 */
public
class TerminologyCapabilitiesClosure extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean translation;
  
  public TerminologyCapabilitiesClosure()
  {
  }
  
  public Boolean getTranslation() {
    return translation;
  }
  
  public void setTranslation(Boolean translation) {
    this.translation = translation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesClosure) {
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
    return "TerminologyCapabilitiesClosure(" + id + ")";
  }
}
