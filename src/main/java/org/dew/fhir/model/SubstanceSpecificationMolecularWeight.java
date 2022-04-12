package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_MolecularWeight</a>
 */
public
class SubstanceSpecificationMolecularWeight extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Quantity amount;
  protected CodeableConcept method;
  protected CodeableConcept type;
  
  public SubstanceSpecificationMolecularWeight()
  {
  }
  
  public Quantity getAmount() {
    return amount;
  }
  
  public void setAmount(Quantity amount) {
    this.amount = amount;
  }
  
  public CodeableConcept getMethod() {
    return method;
  }
  
  public void setMethod(CodeableConcept method) {
    this.method = method;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationMolecularWeight) {
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
    return "SubstanceSpecificationMolecularWeight(" + id + ")";
  }
}
