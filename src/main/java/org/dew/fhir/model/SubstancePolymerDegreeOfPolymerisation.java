package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer_DegreeOfPolymerisation</a>
 */
public
class SubstancePolymerDegreeOfPolymerisation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept degree;
  protected SubstanceAmount amount;
  
  public SubstancePolymerDegreeOfPolymerisation()
  {
  }
  
  public CodeableConcept getDegree() {
    return degree;
  }
  
  public void setDegree(CodeableConcept degree) {
    this.degree = degree;
  }
  
  public SubstanceAmount getAmount() {
    return amount;
  }
  
  public void setAmount(SubstanceAmount amount) {
    this.amount = amount;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymerDegreeOfPolymerisation) {
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
    return "SubstancePolymerDegreeOfPolymerisation(" + id + ")";
  }
}
