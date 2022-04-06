package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specific parameters for the ordered item. For example, the size of the indicated item.
 *
 * @see <a href="https://www.hl7.org/fhir/appointment.html">Appointment</a>
 */
public 
class SupplyRequestParameter extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -8398813824686080724L;
  
  protected String code;
  protected CodeableConcept valueCodeableConcept;
  protected Quantity valueQuantity;
  protected Range valueRange;
  protected Boolean valueBoolean;
  
  public SupplyRequestParameter()
  {
  }

  public String getCode() {
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

  public Boolean getValueBoolean() {
    return valueBoolean;
  }

  public void setCode(String code) {
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

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SupplyRequestParameter) {
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
    return "SupplyRequestParameter(" + id + ")";
  }
}
