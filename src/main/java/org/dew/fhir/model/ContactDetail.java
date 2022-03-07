package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The ContactDetail structure defines general contact details.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#ContactDetail">ContactDetail</a>
 */
public 
class ContactDetail extends Element implements Serializable
{
  private static final long serialVersionUID = -7860987903572076004L;
  
  protected String name;
  protected ContactPoint[] telecom;
  
  public ContactDetail()
  {
  }

  public String getName() {
    return name;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ContactDetail) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(name == null) return 0;
    return name.hashCode();
  }
  
  @Override
  public String toString() {
    return "ContactDetail(" + name + ")";
  }
}