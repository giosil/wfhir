package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Definition of an operation or a named query together with its parameters and their meaning and type. 
 * Consult the definition of the operation for details about how to invoke the operation, and the parameters.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.operation">CapabilityStatement.rest.resource.operation</a>
 */
public 
class CapabilityStatementRestResourceOperation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1421659781340652151L;
  
  protected String name;
  protected String definition;
  protected String documentation;
  
  public CapabilityStatementRestResourceOperation()
  {
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
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

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementRestResourceOperation) {
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
    return "CapabilityStatementRestResourceOperation(" + id + "," + name + "," + definition + ")";
  }
}
