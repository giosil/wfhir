package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A text note which also contains information about who made the statement and when.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Annotation">Annotation</a>
 */
public 
class Annotation extends Element implements Serializable
{
  private static final long serialVersionUID = -171803550408425713L;
  
  protected Coding code;
  protected CodeableConcept valueCodeableConcept;
  protected Quantity valueQuantity;
  protected Range valueRange;
  protected Reference<Resource> valueReference;
  
  public Annotation()
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
    if(object instanceof Annotation) {
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
    return "Annotation(" + code + ")";
  }
}

