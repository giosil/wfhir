package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies a restful operation supported by the solution.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.interaction">CapabilityStatement.rest.resource.interaction</a>
 */
public 
class CapabilityStatementRestResourceInteraction extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8431513197567820561L;
  
  protected String code;
  protected String documentation;
  
  public CapabilityStatementRestResourceInteraction()
  {
  }

  public String getCode() {
    return code;
  }

  public String getDocumentation() {
    return documentation;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementRestResourceInteraction) {
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
    return "CapabilityStatementRestResourceInteraction(" + id + "," + code + "," + documentation + ")";
  }
}
