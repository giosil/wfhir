package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Property</a>
 */
public
class SubstanceSpecificationProperty extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Quantity amountQuantity;
  protected CodeableConcept code;
  protected String amountString;
  protected CodeableConcept category;
  protected String parameters;
  protected Reference<Resource> definingSubstanceReference;
  protected CodeableConcept definingSubstanceCodeableConcept;
  
  public SubstanceSpecificationProperty()
  {
  }
  
  public Quantity getAmountQuantity() {
    return amountQuantity;
  }
  
  public void setAmountQuantity(Quantity amountQuantity) {
    this.amountQuantity = amountQuantity;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public String getAmountString() {
    return amountString;
  }
  
  public void setAmountString(String amountString) {
    this.amountString = amountString;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  public String getParameters() {
    return parameters;
  }
  
  public void setParameters(String parameters) {
    this.parameters = parameters;
  }
  
  public Reference<Resource> getDefiningSubstanceReference() {
    return definingSubstanceReference;
  }
  
  public void setDefiningSubstanceReference(Reference<Resource> definingSubstanceReference) {
    this.definingSubstanceReference = definingSubstanceReference;
  }
  
  public CodeableConcept getDefiningSubstanceCodeableConcept() {
    return definingSubstanceCodeableConcept;
  }
  
  public void setDefiningSubstanceCodeableConcept(CodeableConcept definingSubstanceCodeableConcept) {
    this.definingSubstanceCodeableConcept = definingSubstanceCodeableConcept;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationProperty) {
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
    return "SubstanceSpecificationProperty(" + id + ")";
  }
}
