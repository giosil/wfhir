package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.messaging.endpoint">CapabilityStatement.messaging.endpoint</a>
 */
public 
class CapabilityStatementMessagingEndpoint extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1859681771621545450L;
  
  protected Coding protocol;
  protected String address;
  
  public CapabilityStatementMessagingEndpoint()
  {
  }

  public Coding getProtocol() {
    return protocol;
  }

  public String getAddress() {
    return address;
  }

  public void setProtocol(Coding protocol) {
    this.protocol = protocol;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementMessagingEndpoint) {
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
    return "CapabilityStatementMessagingEndpoint(" + id + "," + protocol + "," + address + ")";
  }
}
