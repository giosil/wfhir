package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A definition of the restful capabilities of the solution, if any.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest">CapabilityStatement.rest</a>
 */
public 
class CapabilityStatementRest extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1719746889530420498L;
  
  protected String mode;
  protected String documentation;
  protected CapabilityStatementRestSecurity security;
  protected CapabilityStatementRestResource[] resource;
  protected CapabilityStatementRestInteraction[] interaction;
  protected CapabilityStatementRestResourceSearchParam[] searchParam;
  protected CapabilityStatementRestResourceOperation[] operation;
  protected String[] compartment;
  
  public CapabilityStatementRest()
  {
  }
  
  public String getMode() {
    return mode;
  }

  public String getDocumentation() {
    return documentation;
  }

  public CapabilityStatementRestSecurity getSecurity() {
    return security;
  }

  public CapabilityStatementRestResource[] getResource() {
    return resource;
  }

  public CapabilityStatementRestInteraction[] getInteraction() {
    return interaction;
  }

  public CapabilityStatementRestResourceSearchParam[] getSearchParam() {
    return searchParam;
  }

  public CapabilityStatementRestResourceOperation[] getOperation() {
    return operation;
  }

  public String[] getCompartment() {
    return compartment;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public void setSecurity(CapabilityStatementRestSecurity security) {
    this.security = security;
  }

  public void setResource(CapabilityStatementRestResource[] resource) {
    this.resource = resource;
  }

  public void setInteraction(CapabilityStatementRestInteraction[] interaction) {
    this.interaction = interaction;
  }

  public void setSearchParam(CapabilityStatementRestResourceSearchParam[] searchParam) {
    this.searchParam = searchParam;
  }

  public void setOperation(CapabilityStatementRestResourceOperation[] operation) {
    this.operation = operation;
  }

  public void setCompartment(String[] compartment) {
    this.compartment = compartment;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementRest) {
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
    return "CapabilityStatementRest(" + id + "," + mode + ")";
  }
}
