package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Details for all kinds of technology-mediated contact points for a person or organization, including telephone, email, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#ContactPoint">ContactPoint</a>
*/
public 
class ContactPoint extends Element implements Serializable
{
  private static final long serialVersionUID = -8691034354536264687L;
  
  protected String system;
  protected String value;
  protected String use;
  protected int rank;
  protected Period period;
  
  public ContactPoint()
  {
  }

  public String getSystem() {
    return system;
  }

  public String getValue() {
    return value;
  }

  public String getUse() {
    return use;
  }

  public int getRank() {
    return rank;
  }

  public Period getPeriod() {
    return period;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContactPoint) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (system + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "ContactPoint(" + id + "," + system + "," + value + "," + use + ")";
  }
}
