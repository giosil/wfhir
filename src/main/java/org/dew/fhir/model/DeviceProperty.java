package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
 *
 * @see <a href="https://www.hl7.org/fhir/device-definitions.html#Device.property">Device.property</a>
 */
public 
class DeviceProperty extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -5653448252264071847L;
  
  protected CodeableConcept type;
  protected Quantity[] valueQuantity;
  protected CodeableConcept[] valueCode;
  
  public DeviceProperty()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public Quantity[] getValueQuantity() {
    return valueQuantity;
  }

  public CodeableConcept[] getValueCode() {
    return valueCode;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setValueQuantity(Quantity[] valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueCode(CodeableConcept[] valueCode) {
    this.valueCode = valueCode;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceProperty) {
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
    return "DeviceProperty(" + id + ")";
  }
}
