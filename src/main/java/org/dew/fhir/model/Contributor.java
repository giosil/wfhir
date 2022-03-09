package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Contributor data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#Contributor">Contributor</a>
 */
public 
class Contributor extends Element implements Serializable
{
  private static final long serialVersionUID = 3327511249122545904L;
  
  protected String name;
  protected String type;
  protected ContactDetail[] contact;
  
  public Contributor()
  {
  }

  public Contributor(String name)
  {
    this.name = name;
  }
  
  public Contributor(String name, String type)
  {
    this.name = name;
    this.type = type;
  }
  
  public Contributor(String name, String type, ContactDetail[] contact)
  {
    this.name = name;
    this.type = type;
    this.contact = contact;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public ContactDetail[] getContact() {
    return contact;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Contributor) {
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
    return "Contributor(" + name + ")";
  }
}
