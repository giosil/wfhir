package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A medicinal product in a container or package.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPackaged_PackageItem</a>
 */
public
class MedicinalProductPackagedPackageItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected CodeableConcept[] otherCharacteristics;
  protected Quantity quantity;
  protected Reference<Resource>[] manufacturedItem;
  protected ProdCharacteristic physicalCharacteristics;
  protected CodeableConcept type;
  protected Reference<Resource>[] manufacturer;
  protected MedicinalProductPackagedPackageItem[] packageItem;
  protected CodeableConcept[] material;
  protected ProductShelfLife[] shelfLifeStorage;
  protected CodeableConcept[] alternateMaterial;
  protected Reference<Resource>[] device;
  
  public MedicinalProductPackagedPackageItem()
  {
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept[] getOtherCharacteristics() {
    return otherCharacteristics;
  }
  
  public void setOtherCharacteristics(CodeableConcept[] otherCharacteristics) {
    this.otherCharacteristics = otherCharacteristics;
  }
  
  public Quantity getQuantity() {
    return quantity;
  }
  
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }
  
  public Reference<Resource>[] getManufacturedItem() {
    return manufacturedItem;
  }
  
  public void setManufacturedItem(Reference<Resource>[] manufacturedItem) {
    this.manufacturedItem = manufacturedItem;
  }
  
  public ProdCharacteristic getPhysicalCharacteristics() {
    return physicalCharacteristics;
  }
  
  public void setPhysicalCharacteristics(ProdCharacteristic physicalCharacteristics) {
    this.physicalCharacteristics = physicalCharacteristics;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Reference<Resource>[] getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(Reference<Resource>[] manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  public MedicinalProductPackagedPackageItem[] getPackageItem() {
    return packageItem;
  }
  
  public void setPackageItem(MedicinalProductPackagedPackageItem[] packageItem) {
    this.packageItem = packageItem;
  }
  
  public CodeableConcept[] getMaterial() {
    return material;
  }
  
  public void setMaterial(CodeableConcept[] material) {
    this.material = material;
  }
  
  public ProductShelfLife[] getShelfLifeStorage() {
    return shelfLifeStorage;
  }
  
  public void setShelfLifeStorage(ProductShelfLife[] shelfLifeStorage) {
    this.shelfLifeStorage = shelfLifeStorage;
  }
  
  public CodeableConcept[] getAlternateMaterial() {
    return alternateMaterial;
  }
  
  public void setAlternateMaterial(CodeableConcept[] alternateMaterial) {
    this.alternateMaterial = alternateMaterial;
  }
  
  public Reference<Resource>[] getDevice() {
    return device;
  }
  
  public void setDevice(Reference<Resource>[] device) {
    this.device = device;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPackagedPackageItem) {
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
    return "MedicinalProductPackagedPackageItem(" + id + ")";
  }
}
