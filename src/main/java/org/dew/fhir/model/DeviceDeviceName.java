package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * his represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device. 
 * This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
 *
 * @see <a href="https://www.hl7.org/fhir/device-definitions.html#Device.deviceName">Device.deviceName</a>
 */
public 
class DeviceDeviceName extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 6635061663254714135L;
  
  protected String name;
  protected String type;
  
  public DeviceDeviceName()
  {
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceDeviceName) {
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
    return "DeviceDeviceName(" + id + ")";
  }
}
