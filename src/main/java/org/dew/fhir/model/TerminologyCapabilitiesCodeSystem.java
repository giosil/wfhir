package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_CodeSystem</a>
 */
public
class TerminologyCapabilitiesCodeSystem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean subsumption;
  protected String uri;
  protected TerminologyCapabilitiesVersion[] version;
  
  public TerminologyCapabilitiesCodeSystem()
  {
  }
  
  public Boolean getSubsumption() {
    return subsumption;
  }
  
  public void setSubsumption(Boolean subsumption) {
    this.subsumption = subsumption;
  }
  
  public String getUri() {
    return uri;
  }
  
  public void setUri(String uri) {
    this.uri = uri;
  }
  
  public TerminologyCapabilitiesVersion[] getVersion() {
    return version;
  }
  
  public void setVersion(TerminologyCapabilitiesVersion[] version) {
    this.version = version;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesCodeSystem) {
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
    return "TerminologyCapabilitiesCodeSystem(" + id + ")";
  }
}
