package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Entity of the action.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.action.subject">Contract.term.action.subject</a>
 */
public 
class ContractTermActionSubject extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -2984010490746407749L;
  
  protected Reference<Resource>[] reference;
  protected CodeableConcept role;
  
  public ContractTermActionSubject()
  {
  }

  public Reference<Resource>[] getReference() {
    return reference;
  }

  public CodeableConcept getRole() {
    return role;
  }

  public void setReference(Reference<Resource>[] reference) {
    this.reference = reference;
  }

  public void setRole(CodeableConcept role) {
    this.role = role;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractTermActionSubject) {
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
    return "ContractTermActionSubject(" + id + "," + reference + "," + role + ")";
  }
}
