package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 *
 * @see <a href="https://www.hl7.org/fhir/devicedefinition.html">DeviceDefinition</a>
 */
public 
class DeviceDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -3235708675718246320L;
  
  protected Identifier[] identifier;
  protected DeviceDefinitionUdiDeviceIdentifier[] udiDeviceIdentifier;
  protected String manufacturerString;
  protected Reference<Organization> manufacturerReference;
  protected DeviceDefinitionDeviceName[] deviceName;
  protected String modelNumber;
  protected CodeableConcept type;
  protected DeviceDefinitionSpecialization[] specialization;
  protected String[] version;
  protected CodeableConcept[] safety;
  protected ProductShelfLife[] shelfLifeStorage;
  protected ProdCharacteristic physicalCharacteristics;
  protected CodeableConcept[] languageCode;
  protected DeviceDefinitionCapability[] capability;
  protected DeviceDefinitionProperty[] property;
  protected Reference<Organization> owner;
  protected ContactPoint[] contact;
  protected String url;
  protected String onlineInformation;
  protected Annotation[] note;
  protected Quantity quantity;
  protected Reference<DeviceDefinition> parentDevice;
  protected DeviceDefinitionMaterial[] material;
  
  public DeviceDefinition()
  {
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public DeviceDefinitionUdiDeviceIdentifier[] getUdiDeviceIdentifier() {
    return udiDeviceIdentifier;
  }

  public String getManufacturerString() {
    return manufacturerString;
  }

  public Reference<Organization> getManufacturerReference() {
    return manufacturerReference;
  }

  public DeviceDefinitionDeviceName[] getDeviceName() {
    return deviceName;
  }

  public String getModelNumber() {
    return modelNumber;
  }

  public CodeableConcept getType() {
    return type;
  }

  public DeviceDefinitionSpecialization[] getSpecialization() {
    return specialization;
  }

  public String[] getVersion() {
    return version;
  }

  public CodeableConcept[] getSafety() {
    return safety;
  }

  public ProductShelfLife[] getShelfLifeStorage() {
    return shelfLifeStorage;
  }

  public ProdCharacteristic getPhysicalCharacteristics() {
    return physicalCharacteristics;
  }

  public CodeableConcept[] getLanguageCode() {
    return languageCode;
  }

  public DeviceDefinitionCapability[] getCapability() {
    return capability;
  }

  public DeviceDefinitionProperty[] getProperty() {
    return property;
  }

  public Reference<Organization> getOwner() {
    return owner;
  }

  public ContactPoint[] getContact() {
    return contact;
  }

  public String getUrl() {
    return url;
  }

  public String getOnlineInformation() {
    return onlineInformation;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public Reference<DeviceDefinition> getParentDevice() {
    return parentDevice;
  }

  public DeviceDefinitionMaterial[] getMaterial() {
    return material;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setUdiDeviceIdentifier(DeviceDefinitionUdiDeviceIdentifier[] udiDeviceIdentifier) {
    this.udiDeviceIdentifier = udiDeviceIdentifier;
  }

  public void setManufacturerString(String manufacturerString) {
    this.manufacturerString = manufacturerString;
  }

  public void setManufacturerReference(Reference<Organization> manufacturerReference) {
    this.manufacturerReference = manufacturerReference;
  }

  public void setDeviceName(DeviceDefinitionDeviceName[] deviceName) {
    this.deviceName = deviceName;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSpecialization(DeviceDefinitionSpecialization[] specialization) {
    this.specialization = specialization;
  }

  public void setVersion(String[] version) {
    this.version = version;
  }

  public void setSafety(CodeableConcept[] safety) {
    this.safety = safety;
  }

  public void setShelfLifeStorage(ProductShelfLife[] shelfLifeStorage) {
    this.shelfLifeStorage = shelfLifeStorage;
  }

  public void setPhysicalCharacteristics(ProdCharacteristic physicalCharacteristics) {
    this.physicalCharacteristics = physicalCharacteristics;
  }

  public void setLanguageCode(CodeableConcept[] languageCode) {
    this.languageCode = languageCode;
  }

  public void setCapability(DeviceDefinitionCapability[] capability) {
    this.capability = capability;
  }

  public void setProperty(DeviceDefinitionProperty[] property) {
    this.property = property;
  }

  public void setOwner(Reference<Organization> owner) {
    this.owner = owner;
  }

  public void setContact(ContactPoint[] contact) {
    this.contact = contact;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setOnlineInformation(String onlineInformation) {
    this.onlineInformation = onlineInformation;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public void setParentDevice(Reference<DeviceDefinition> parentDevice) {
    this.parentDevice = parentDevice;
  }

  public void setMaterial(DeviceDefinitionMaterial[] material) {
    this.material = material;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceDefinition) {
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
    return "DeviceDefinition(" + id + ")";
  }
}
