package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The capabilities supported on a device, the standards to which the device conforms for a particular purpose, and used for the communication.
 *
 * @see <a href="https://www.hl7.org/fhir/device-definitions.html#Device.specialization">Device.specialization</a>
 */
public 
class DeviceSpecialization extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3310018590649694362L;
  
  protected CodeableConcept systemType;
  protected String version;
  
  public DeviceSpecialization()
  {
  }

  public CodeableConcept getSystemType() {
    return systemType;
  }

  public String getVersion() {
    return version;
  }

  public void setSystemType(CodeableConcept systemType) {
    this.systemType = systemType;
  }

  public void setVersion(String version) {
    this.version = version;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceSpecialization) {
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
    return "DeviceSpecialization(" + id + ")";
  }
}
