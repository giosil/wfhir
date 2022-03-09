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
  private static final long serialVersionUID = -3951927793503334855L;
  
  protected String name;
  protected ContactPoint[] telecom;
  
  public ContactDetail()
  {
  }
  
  public ContactDetail(String name)
  {
    this.name = name;
  }
  
  public ContactDetail(String name, ContactPoint contactPoint)
  {
    this.name = name;
    if(contactPoint != null) {
      this.telecom = new ContactPoint[]{ contactPoint };
    }
  }
  
  public ContactDetail(String name, ContactPoint[] telecom)
  {
    this.name = name;
    this.telecom = telecom;
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