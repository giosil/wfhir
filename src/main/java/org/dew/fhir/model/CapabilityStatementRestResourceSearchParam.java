package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.searchParam">CapabilityStatement.rest.resource.searchParam</a>
 */
public 
class CapabilityStatementRestResourceSearchParam extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6521388782095776410L;
  
  protected String name;
  protected String definition;
  protected String type;
  protected String documentation;
  
  public CapabilityStatementRestResourceSearchParam()
  {
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
  }

  public String getType() {
    return type;
  }

  public String getDocumentation() {
    return documentation;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementRestResourceSearchParam) {
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
    return "CapabilityStatementRestResourceSearchParam(" + id + "," + name + "," + definition + "," + type + ")";
  }
}
