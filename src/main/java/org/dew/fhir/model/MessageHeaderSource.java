package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The source application from which this message originated.
 *
 * @see <a href="https://www.hl7.org/fhir/messageheader-definitions.html#MessageHeader.source">MessageHeader.source</a>
 */
public 
class MessageHeaderSource extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3973242761815887302L;
  
  protected String name;
  protected String software;
  protected String version;
  protected ContactPoint contact;
  protected String endpoint;
  
  public MessageHeaderSource()
  {
  }

  public String getName() {
    return name;
  }

  public String getSoftware() {
    return software;
  }

  public String getVersion() {
    return version;
  }

  public ContactPoint getContact() {
    return contact;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSoftware(String software) {
    this.software = software;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setContact(ContactPoint contact) {
    this.contact = contact;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageHeaderSource) {
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
    return "MessageHeaderSource(" + id + "," + name + ")";
  }
}
