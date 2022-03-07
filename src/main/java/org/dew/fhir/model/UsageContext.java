package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The UsageContext structure defines the context of use for a module.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#UsageContext">UsageContext</a>
 */
public 
class UsageContext extends Element implements Serializable
{
  private static final long serialVersionUID = -171803550408425713L;
  
  protected Coding code;
  protected CodeableConcept valueCodeableConcept;
  protected Quantity valueQuantity;
  protected Range valueRange;
  protected Reference<Resource> valueReference;
  
  public UsageContext()
  {
  }

  public Coding getCode() {
    return code;
  }

  public CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept;
  }

  public Quantity getValueQuantity() {
    return valueQuantity;
  }

  public Range getValueRange() {
    return valueRange;
  }

  public Reference<Resource> getValueReference() {
    return valueReference;
  }

  public void setCode(Coding code) {
    this.code = code;
  }

  public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
    this.valueCodeableConcept = valueCodeableConcept;
  }

  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueRange(Range valueRange) {
    this.valueRange = valueRange;
  }

  public void setValueReference(Reference<Resource> valueReference) {
    this.valueReference = valueReference;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof UsageContext) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(code == null) return 0;
    return code.hashCode();
  }
  
  @Override
  public String toString() {
    return "UsageContext(" + code + ")";
  }
}
