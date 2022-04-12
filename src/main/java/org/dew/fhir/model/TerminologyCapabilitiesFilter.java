package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_Filter</a>
 */
public
class TerminologyCapabilitiesFilter extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String[] op;
  protected String code;
  
  public TerminologyCapabilitiesFilter()
  {
  }
  
  public String[] getOp() {
    return op;
  }
  
  public void setOp(String[] op) {
    this.op = op;
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesFilter) {
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
    return "TerminologyCapabilitiesFilter(" + id + ")";
  }
}
