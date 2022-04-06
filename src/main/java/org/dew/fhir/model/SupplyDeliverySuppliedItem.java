package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The item that is being delivered or has been supplied.
 *
 * @see <a href="https://www.hl7.org/fhir/supplydelivery-definitions.html#SupplyDelivery.suppliedItem">SupplyDelivery.suppliedItem</a>
 */
public 
class SupplyDeliverySuppliedItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -9024018132995544130L;
  
  protected SimpleQuantity quantity;
  protected CodeableConcept itemCodeableConcept;
  protected Reference<Resource> itemReference;
  
  public SupplyDeliverySuppliedItem()
  {
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public CodeableConcept getItemCodeableConcept() {
    return itemCodeableConcept;
  }

  public Reference<Resource> getItemReference() {
    return itemReference;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
    this.itemCodeableConcept = itemCodeableConcept;
  }

  public void setItemReference(Reference<Resource> itemReference) {
    this.itemReference = itemReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SupplyDeliverySuppliedItem) {
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
    return "SupplyDeliverySuppliedItem(" + id + ")";
  }
}
