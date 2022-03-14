package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An entity used in this activity.
 *
 * @see <a href="https://www.hl7.org/fhir/provenance-definitions.html#Provenance.entity">Provenance.entity</a>
 */
public 
class ProvenanceEntity extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -2986995594018000513L;
  
  protected String role;
  protected Reference<Resource> what;
  protected ProvenanceAgent[] agent;
  
  public ProvenanceEntity()
  {
  }

  public String getRole() {
    return role;
  }

  public Reference<Resource> getWhat() {
    return what;
  }

  public ProvenanceAgent[] getAgent() {
    return agent;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setWhat(Reference<Resource> what) {
    this.what = what;
  }

  public void setAgent(ProvenanceAgent[] agent) {
    this.agent = agent;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ProvenanceEntity) {
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
    return "ProvenanceEntity(" + id + ")";
  }
}
