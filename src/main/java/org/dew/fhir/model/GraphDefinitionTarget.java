package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 *
 * @see <a href="https://www.hl7.org/fhir">GraphDefinition_Target</a>
 */
public
class GraphDefinitionTarget extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String profile;
  protected GraphDefinitionCompartment[] compartment;
  protected GraphDefinitionLink[] link;
  protected String type;
  protected String params;
  
  public GraphDefinitionTarget()
  {
  }
  
  public String getProfile() {
    return profile;
  }
  
  public void setProfile(String profile) {
    this.profile = profile;
  }
  
  public GraphDefinitionCompartment[] getCompartment() {
    return compartment;
  }
  
  public void setCompartment(GraphDefinitionCompartment[] compartment) {
    this.compartment = compartment;
  }
  
  public GraphDefinitionLink[] getLink() {
    return link;
  }
  
  public void setLink(GraphDefinitionLink[] link) {
    this.link = link;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getParams() {
    return params;
  }
  
  public void setParams(String params) {
    this.params = params;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof GraphDefinitionTarget) {
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
    return "GraphDefinitionTarget(" + id + ")";
  }
}
