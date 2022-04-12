package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_Version</a>
 */
public
class TerminologyCapabilitiesVersion extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String code;
  protected TerminologyCapabilitiesFilter[] filter;
  protected Boolean isDefault;
  protected Boolean compositional;
  protected String[] property;
  
  public TerminologyCapabilitiesVersion()
  {
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public TerminologyCapabilitiesFilter[] getFilter() {
    return filter;
  }
  
  public void setFilter(TerminologyCapabilitiesFilter[] filter) {
    this.filter = filter;
  }
  
  public Boolean getIsDefault() {
    return isDefault;
  }
  
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }
  
  public Boolean getCompositional() {
    return compositional;
  }
  
  public void setCompositional(Boolean compositional) {
    this.compositional = compositional;
  }
  
  public String[] getProperty() {
    return property;
  }
  
  public void setProperty(String[] property) {
    this.property = property;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesVersion) {
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
    return "TerminologyCapabilitiesVersion(" + id + ")";
  }
}
