package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_ValidateCode</a>
 */
public
class TerminologyCapabilitiesValidateCode extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean translations;
  
  public TerminologyCapabilitiesValidateCode()
  {
  }
  
  public Boolean getTranslations() {
    return translations;
  }
  
  public void setTranslations(Boolean translations) {
    this.translations = translations;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesValidateCode) {
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
    return "TerminologyCapabilitiesValidateCode(" + id + ")";
  }
}
