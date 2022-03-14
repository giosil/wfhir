package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
 *
 * @see <a href="https://www.hl7.org/fhir/provenance-definitions.html#Provenance.agent">Provenance.agent</a>
 */
public 
class ProvenanceAgent extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 5577604047929577800L;
  
  protected CodeableConcept type;
  protected CodeableConcept[] role;
  protected Reference<Resource> who;
  protected Reference<Resource> onBehalfOf;
  
  public ProvenanceAgent()
  {
  }
  
  public ProvenanceAgent(CodeableConcept type)
  {
    this.type = type;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getRole() {
    return role;
  }

  public Reference<Resource> getWho() {
    return who;
  }

  public Reference<Resource> getOnBehalfOf() {
    return onBehalfOf;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setRole(CodeableConcept[] role) {
    this.role = role;
  }

  public void setWho(Reference<Resource> who) {
    this.who = who;
  }

  public void setOnBehalfOf(Reference<Resource> onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ProvenanceAgent) {
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
    return "ProvenanceAgent(" + id + ")";
  }
}
