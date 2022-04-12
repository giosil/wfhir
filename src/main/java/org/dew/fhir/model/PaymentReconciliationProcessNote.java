package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 *
 * @see <a href="https://www.hl7.org/fhir">PaymentReconciliation_ProcessNote</a>
 */
public
class PaymentReconciliationProcessNote extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String type;
  
  public PaymentReconciliationProcessNote()
  {
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PaymentReconciliationProcessNote) {
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
    return "PaymentReconciliationProcessNote(" + id + ")";
  }
}
