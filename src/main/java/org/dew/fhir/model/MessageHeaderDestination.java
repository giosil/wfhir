package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The destination application which the message is intended for.
 *
 * @see <a href="https://www.hl7.org/fhir/messageheader-definitions.html#MessageHeader.destination">MessageHeader.destination</a>
 */
public 
class MessageHeaderDestination extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1102316611246532715L;
  
  protected String name;
  protected Reference<Device> target;
  protected String endpoint;
  protected Reference<Resource> receiver;
  
  public MessageHeaderDestination()
  {
  }
  
  public String getName() {
    return name;
  }

  public Reference<Device> getTarget() {
    return target;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public Reference<Resource> getReceiver() {
    return receiver;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTarget(Reference<Device> target) {
    this.target = target;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public void setReceiver(Reference<Resource> receiver) {
    this.receiver = receiver;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageHeaderDestination) {
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
    return "MessageHeaderDestination(" + id + "," + name + "," + target + "," + endpoint + "," + receiver + ")";
  }
}
