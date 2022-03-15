package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A name given to the device to identify it.
 *
 * @see <a href="https://www.hl7.org/fhir/devicedefinition-definitions.html#DeviceDefinition.deviceName">DeviceDefinition.deviceName</a>
 */
public 
class DeviceDefinitionDeviceName extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 5864288947902193743L;
  
  protected String name;
  protected String type;
  
  public DeviceDefinitionDeviceName()
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
    if(object instanceof DeviceDefinitionDeviceName) {
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
    return "DeviceDefinitionDeviceName(" + id + ")";
  }
}
