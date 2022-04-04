package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A specification of restful operations supported by the system.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.interaction">CapabilityStatement.rest.interaction</a>
 */
public 
class CapabilityStatementRestInteraction extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 7799900313686448301L;
  
  protected String code;
  protected String documentation;
  
  public CapabilityStatementRestInteraction()
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
    if(object instanceof CapabilityStatementRestInteraction) {
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
    return "CapabilityStatementRestInteraction(" + id + "," + code + ")";
  }
}
