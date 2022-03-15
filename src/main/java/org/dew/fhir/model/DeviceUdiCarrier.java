package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Unique device identifier (UDI) assigned to device label or package. 
 * Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
 *
 * @see <a href="https://www.hl7.org/fhir/device-definitions.html#Device.udiCarrier">Device.udiCarrier</a>
 */
public 
class DeviceUdiCarrier extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 4219970322960227434L;
  
  protected String deviceIdentifier;
  protected String issuer;
  protected String jurisdiction;
  protected String carrierAIDC;
  protected String carrierHRF;
  protected String entryType;
  
  public DeviceUdiCarrier()
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

  public String getCarrierAIDC() {
    return carrierAIDC;
  }

  public String getCarrierHRF() {
    return carrierHRF;
  }

  public String getEntryType() {
    return entryType;
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

  public void setCarrierAIDC(String carrierAIDC) {
    this.carrierAIDC = carrierAIDC;
  }

  public void setCarrierHRF(String carrierHRF) {
    this.carrierHRF = carrierHRF;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceUdiCarrier) {
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
    return "DeviceUdiCarrier(" + id + ")";
  }
}
