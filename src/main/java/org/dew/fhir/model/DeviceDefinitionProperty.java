package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
 *
 * @see <a href="https://www.hl7.org/fhir/devicedefinition-definitions.html#DeviceDefinition.property">DeviceDefinition.property</a>
 */
public 
class DeviceDefinitionProperty extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 4216152999696918096L;

  protected CodeableConcept type;
  protected Quantity[] valueQuantity;
  protected CodeableConcept[] valueCode;
  
  public DeviceDefinitionProperty()
  {
  }

  public DeviceDefinitionProperty(CodeableConcept type)
  {
    this.type = type;
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
    if(object instanceof DeviceDefinitionProperty) {
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
    return "DeviceDefinitionProperty(" + id + ")";
  }
}
