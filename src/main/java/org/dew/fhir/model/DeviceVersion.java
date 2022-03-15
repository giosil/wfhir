package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The actual design of the device or software version running on the device.
 *
 * @see <a href="https://www.hl7.org/fhir/device-definitions.html#Device.version">Device.version</a>
 */
public 
class DeviceVersion extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3092114886897521948L;
  
  protected CodeableConcept type;
  protected Identifier component;
  protected String value;
  
  public DeviceVersion()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public Identifier getComponent() {
    return component;
  }

  public String getValue() {
    return value;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setComponent(Identifier component) {
    this.component = component;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceVersion) {
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
    return "DeviceVersion(" + id + ")";
  }
}
