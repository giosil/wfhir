package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The ProductShelfLife structure.
 *
 * @see <a href="https://www.hl7.org/fhir/productshelflife.html#ProductShelfLife">ProductShelfLife</a>
 */
public 
class ProductShelfLife extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7134544416669369316L;
  
  protected Identifier identifier;
  protected CodeableConcept type;
  protected Quantity period;
  protected CodeableConcept[] specialPrecautionsForStorage;
  
  public ProductShelfLife()
  {
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public CodeableConcept getType() {
    return type;
  }

  public Quantity getPeriod() {
    return period;
  }

  public CodeableConcept[] getSpecialPrecautionsForStorage() {
    return specialPrecautionsForStorage;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setPeriod(Quantity period) {
    this.period = period;
  }

  public void setSpecialPrecautionsForStorage(CodeableConcept[] specialPrecautionsForStorage) {
    this.specialPrecautionsForStorage = specialPrecautionsForStorage;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ProductShelfLife) {
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
    return "ProductShelfLife(" + id + ")";
  }
}
