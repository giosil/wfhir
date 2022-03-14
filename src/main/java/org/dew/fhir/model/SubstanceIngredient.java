package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A substance can be composed of other substances.
 *
 * @see <a href="https://www.hl7.org/fhir/substance-definitions.html#Substance.ingredient">Substance.ingredient</a>
 */
public 
class SubstanceIngredient extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3398532557148003266L;
  
  protected Ratio quantity;
  protected CodeableConcept substanceCodeableConcept;
  protected Reference<Substance> substanceReference;
  
  public SubstanceIngredient()
  {
  }
  
  public SubstanceIngredient(Ratio quantity, CodeableConcept substanceCodeableConcept)
  {
    this.quantity = quantity;
    this.substanceCodeableConcept = substanceCodeableConcept;
  }
  
  public SubstanceIngredient(Ratio quantity, Reference<Substance> substanceReference)
  {
    this.quantity = quantity;
    this.substanceReference = substanceReference;
  }

  public Ratio getQuantity() {
    return quantity;
  }

  public CodeableConcept getSubstanceCodeableConcept() {
    return substanceCodeableConcept;
  }

  public Reference<Substance> getSubstanceReference() {
    return substanceReference;
  }

  public void setQuantity(Ratio quantity) {
    this.quantity = quantity;
  }

  public void setSubstanceCodeableConcept(CodeableConcept substanceCodeableConcept) {
    this.substanceCodeableConcept = substanceCodeableConcept;
  }

  public void setSubstanceReference(Reference<Substance> substanceReference) {
    this.substanceReference = substanceReference;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceIngredient) {
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
    return "SubstanceIngredient(" + id + ")";
  }
}
