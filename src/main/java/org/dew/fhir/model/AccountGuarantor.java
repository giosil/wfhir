package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The parties responsible for balancing the account if other payment options fall short.
 *
 * @see <a href="https://www.hl7.org/fhir/account-definitions.html#Account.guarantor">Account.guarantor</a>
 */
public 
class AccountGuarantor extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1026682793831945315L;
  
  protected Reference<Resource> party;
  protected Boolean onHold;
  protected Period period;
  
  public AccountGuarantor()
  {
  }

  public Reference<Resource> getParty() {
    return party;
  }

  public Boolean getOnHold() {
    return onHold;
  }

  public Period getPeriod() {
    return period;
  }

  public void setParty(Reference<Resource> party) {
    this.party = party;
  }

  public void setOnHold(Boolean onHold) {
    this.onHold = onHold;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AccountGuarantor) {
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
    return "AccountGuarantor(" + id + "," + party + "," + onHold + "," + period + ")";
  }
}
