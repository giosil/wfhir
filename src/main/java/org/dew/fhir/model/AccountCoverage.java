package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
 *
 * @see <a href="https://www.hl7.org/fhir/account-definitions.html#Account.coverage">Account.coverage</a>
 */
public 
class AccountCoverage extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 9117689537889697445L;
  
  protected Reference<Resource> coverage;
  protected Integer priority;
  
  public AccountCoverage()
  {
  }

  public Reference<Resource> getCoverage() {
    return coverage;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setCoverage(Reference<Resource> coverage) {
    this.coverage = coverage;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentReference) {
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
    return "AccountCoverage(" + id + "," + coverage + "," + priority + ")";
  }
}
