package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The capabilities supported on a device, the standards to which the device conforms for a particular purpose, and used for the communication.
 *
 * @see <a href="https://www.hl7.org/fhir/device-definitions.html#Device.specialization">Device.specialization</a>
 */
public 
class DeviceDefinitionSpecialization extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -3932055666085595168L;
  
  protected String systemType;
  protected String version;
  
  public DeviceDefinitionSpecialization()
  {
  }

  public String getSystemType() {
    return systemType;
  }

  public String getVersion() {
    return version;
  }

  public void setSystemType(String systemType) {
    this.systemType = systemType;
  }

  public void setVersion(String version) {
    this.version = version;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceDefinitionSpecialization) {
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
    return "DeviceDefinitionSpecialization(" + id + ")";
  }
}
