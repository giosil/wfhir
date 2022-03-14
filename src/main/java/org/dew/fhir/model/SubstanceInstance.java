package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
 *
 * @see <a href="https://www.hl7.org/fhir/substance-definitions.html#Substance.instance">Substance.instance</a>
 */
public 
class SubstanceInstance extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -745738818940460874L;
  
  protected Identifier identifier;
  protected Date expiry;
  protected SimpleQuantity quantity;
  
  public SubstanceInstance()
  {
  }

  public SubstanceInstance(Identifier identifier)
  {
    this.identifier = identifier;
  }

  public SubstanceInstance(Identifier identifier, Date expiry)
  {
    this.identifier = identifier;
    this.expiry = expiry;
  }

  public SubstanceInstance(Identifier identifier, Date expiry, SimpleQuantity quantity)
  {
    this.identifier = identifier;
    this.expiry = expiry;
    this.quantity = quantity;
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public Date getExpiry() {
    return expiry;
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceInstance) {
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
    return "SubstanceInstance(" + id + ")";
  }
}
