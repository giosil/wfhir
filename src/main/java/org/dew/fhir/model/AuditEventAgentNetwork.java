package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Logical network location for application activity, if the activity has a network location.
 *
 * @see <a href="https://www.hl7.org/fhir/auditevent-definitions.html#AuditEvent.agent.network">AuditEvent.agent.network</a>
 */
public 
class AuditEventAgentNetwork extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3784205214550924526L;
  
  protected String address;
  protected String type;
  
  public AuditEventAgentNetwork()
  {
  }

  public String getAddress() {
    return address;
  }

  public String getType() {
    return type;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AuditEventAgentNetwork) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (address + ":" + type).hashCode();
  }
  
  @Override
  public String toString() {
    return "AuditEventAgentNetwork(" + id + "," + address + "," + type + ")";
  }
}
