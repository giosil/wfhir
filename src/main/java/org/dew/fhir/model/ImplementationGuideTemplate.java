package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Template</a>
 */
public
class ImplementationGuideTemplate extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String code;
  protected String scope;
  protected String source;
  
  public ImplementationGuideTemplate()
  {
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getScope() {
    return scope;
  }
  
  public void setScope(String scope) {
    this.scope = scope;
  }
  
  public String getSource() {
    return source;
  }
  
  public void setSource(String source) {
    this.source = source;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideTemplate) {
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
    return "ImplementationGuideTemplate(" + id + ")";
  }
}
