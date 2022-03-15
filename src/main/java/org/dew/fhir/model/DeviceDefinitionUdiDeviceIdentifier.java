package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Unique device identifier (UDI) assigned to device label or package. 
 * Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
 *
 * @see <a href="https://www.hl7.org/fhir/devicedefinition-definitions.html#DeviceDefinition.udiDeviceIdentifier">DeviceDefinition.udiDeviceIdentifier</a>
 */
public 
class DeviceDefinitionUdiDeviceIdentifier extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 3092608658454299124L;

  protected String deviceIdentifier;
  protected String issuer;
  protected String jurisdiction;
  
  public DeviceDefinitionUdiDeviceIdentifier()
  {
  }

  public String getDeviceIdentifier() {
    return deviceIdentifier;
  }

  public String getIssuer() {
    return issuer;
  }

  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setDeviceIdentifier(String deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceDefinitionUdiDeviceIdentifier) {
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
    return "DeviceDefinitionUdiDeviceIdentifier(" + id + ")";
  }
}
