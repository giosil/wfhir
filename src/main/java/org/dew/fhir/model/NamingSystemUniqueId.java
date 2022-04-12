package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 *
 * @see <a href="https://www.hl7.org/fhir">NamingSystem_UniqueId</a>
 */
public
class NamingSystemUniqueId extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Period period;
  protected String comment;
  protected String type;
  protected String value;
  protected Boolean preferred;
  
  public NamingSystemUniqueId()
  {
  }
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public Boolean getPreferred() {
    return preferred;
  }
  
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NamingSystemUniqueId) {
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
    return "NamingSystemUniqueId(" + id + ")";
  }
}
