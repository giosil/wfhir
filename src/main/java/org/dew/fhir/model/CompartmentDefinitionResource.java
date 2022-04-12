package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A compartment definition that defines how resources are accessed on a server.
 *
 * @see <a href="https://www.hl7.org/fhir">CompartmentDefinition_Resource</a>
 */
public
class CompartmentDefinitionResource extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String code;
  protected String[] param;
  protected String documentation;
  
  public CompartmentDefinitionResource()
  {
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String[] getParam() {
    return param;
  }
  
  public void setParam(String[] param) {
    this.param = param;
  }
  
  public String getDocumentation() {
    return documentation;
  }
  
  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CompartmentDefinitionResource) {
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
    return "CompartmentDefinitionResource(" + id + ")";
  }
}
