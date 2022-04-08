package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
 *
 * @see <a href="https://www.hl7.org/fhir/consent-definitions.html#Consent.provision.actor">Consent.provision.actor</a>
 */
public 
class ConsentProvisionActor extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -1875684412458344648L;
  
  protected CodeableConcept role;
  protected Reference<Resource> reference;
  
  public ConsentProvisionActor()
  {
  }

  public CodeableConcept getRole() {
    return role;
  }

  public Reference<Resource> getReference() {
    return reference;
  }

  public void setRole(CodeableConcept role) {
    this.role = role;
  }

  public void setReference(Reference<Resource> reference) {
    this.reference = reference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConsentProvisionActor) {
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
    return "ConsentProvisionActor(" + id + ")";
  }
}
