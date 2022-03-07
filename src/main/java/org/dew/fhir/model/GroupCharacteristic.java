package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies traits whose presence r absence is shared by members of the group.
 *
 * @see <a href="https://www.hl7.org/fhir/group-definitions.html#Group.characteristic">Group.characteristic</a>
 */
public 
class GroupCharacteristic extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -1326774458511117994L;
  
  protected CodeableConcept code;
  protected CodeableConcept valueCodeableConcept;
  protected boolean valueBoolean;
  protected Quantity valueQuantity;
  protected Range valueRange;
  protected Reference<Resource> valueReference;
  protected boolean exclude;
  protected Period period;
  
  public GroupCharacteristic()
  {
  }

  public CodeableConcept getCode() {
    return code;
  }

  public CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept;
  }

  public boolean isValueBoolean() {
    return valueBoolean;
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

  public boolean isExclude() {
    return exclude;
  }

  public Period getPeriod() {
    return period;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
    this.valueCodeableConcept = valueCodeableConcept;
  }

  public void setValueBoolean(boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
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

  public void setExclude(boolean exclude) {
    this.exclude = exclude;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof GroupCharacteristic) {
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
    return "GroupCharacteristic(" + id + "," + code + ")";
  }
}
