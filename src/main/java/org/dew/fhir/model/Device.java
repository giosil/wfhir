package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. 
 * The device may be a medical or non-medical device.
 *
 * @see <a href="https://www.hl7.org/fhir/device.html">Device</a>
 */
public 
class Device extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 7884324410661698964L;
  
  protected Identifier[] identifier;
  protected Reference<DeviceDefinition> definition;
  protected DeviceUdiCarrier[] udiCarrier;
  protected String status;
  protected CodeableConcept[] statusReason;
  protected String distinctIdentifier;
  protected String manufacturer;
  protected Date manufactureDate;
  protected Date expirationDate;
  protected String lotNumber;
  protected String serialNumber;
  protected DeviceDeviceName[] deviceName;
  protected String modelNumber;
  protected String partNumber;
  protected CodeableConcept type;
  protected DeviceSpecialization[] specialization;
  protected DeviceVersion[] version;
  protected DeviceProperty[] property;
  protected Reference<Patient> patient;
  protected Reference<Organization> owner;
  protected ContactPoint[] contact;
  protected Reference<Location> location;
  protected String url;
  protected Annotation[] note;
  protected CodeableConcept[] safety;
  protected Reference<Device> parent;
  
  public Device()
  {
    this.resourceType = "Device";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Reference<DeviceDefinition> getDefinition() {
    return definition;
  }

  public DeviceUdiCarrier[] getUdiCarrier() {
    return udiCarrier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getStatusReason() {
    return statusReason;
  }

  public String getDistinctIdentifier() {
    return distinctIdentifier;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public Date getManufactureDate() {
    return manufactureDate;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public String getLotNumber() {
    return lotNumber;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public DeviceDeviceName[] getDeviceName() {
    return deviceName;
  }

  public String getModelNumber() {
    return modelNumber;
  }

  public String getPartNumber() {
    return partNumber;
  }

  public CodeableConcept getType() {
    return type;
  }

  public DeviceSpecialization[] getSpecialization() {
    return specialization;
  }

  public DeviceVersion[] getVersion() {
    return version;
  }

  public DeviceProperty[] getProperty() {
    return property;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Reference<Organization> getOwner() {
    return owner;
  }

  public ContactPoint[] getContact() {
    return contact;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public String getUrl() {
    return url;
  }

  public Annotation[] getNote() {
    return note;
  }

  public CodeableConcept[] getSafety() {
    return safety;
  }

  public Reference<Device> getParent() {
    return parent;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setDefinition(Reference<DeviceDefinition> definition) {
    this.definition = definition;
  }

  public void setUdiCarrier(DeviceUdiCarrier[] udiCarrier) {
    this.udiCarrier = udiCarrier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusReason(CodeableConcept[] statusReason) {
    this.statusReason = statusReason;
  }

  public void setDistinctIdentifier(String distinctIdentifier) {
    this.distinctIdentifier = distinctIdentifier;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public void setDeviceName(DeviceDeviceName[] deviceName) {
    this.deviceName = deviceName;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSpecialization(DeviceSpecialization[] specialization) {
    this.specialization = specialization;
  }

  public void setVersion(DeviceVersion[] version) {
    this.version = version;
  }

  public void setProperty(DeviceProperty[] property) {
    this.property = property;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setOwner(Reference<Organization> owner) {
    this.owner = owner;
  }

  public void setContact(ContactPoint[] contact) {
    this.contact = contact;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setSafety(CodeableConcept[] safety) {
    this.safety = safety;
  }

  public void setParent(Reference<Device> parent) {
    this.parent = parent;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Device) {
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
    return "Device(" + id + ")";
  }
}
