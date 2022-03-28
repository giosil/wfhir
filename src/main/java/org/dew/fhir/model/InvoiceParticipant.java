package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates who or what performed or participated in the charged service.
 *
 * @see <a href="https://www.hl7.org/fhir/invoice-definitions.html#Invoice.participant">Invoice.participant</a>
 */
public 
class InvoiceParticipant extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7224035941757044497L;
  
  protected CodeableConcept role;
  protected Reference<Resource> actor;
  
  public InvoiceParticipant()
  {
  }
  
  public InvoiceParticipant(CodeableConcept role)
  {
    this.role = role;
  }
  
  public InvoiceParticipant(CodeableConcept role, Reference<Resource> actor)
  {
    this.role = role;
    this.actor = actor;
  }

  public CodeableConcept getRole() {
    return role;
  }

  public Reference<Resource> getActor() {
    return actor;
  }

  public void setRole(CodeableConcept role) {
    this.role = role;
  }

  public void setActor(Reference<Resource> actor) {
    this.actor = actor;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InvoiceParticipant) {
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
    return "InvoiceParticipant(" + id + "," + role + "," + actor + ")";
  }
}
