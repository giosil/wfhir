package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * References to message definitions for messages this system can send or receive.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.messaging.supportedMessage">CapabilityStatement.messaging.supportedMessage</a>
 */
public 
class CapabilityStatementMessagingSupportedMessage extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -7123056755324106467L;
  
  protected String mode;
  protected String definition;
  
  public CapabilityStatementMessagingSupportedMessage()
  {
  }

  public String getMode() {
    return mode;
  }

  public String getDefinition() {
    return definition;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementMessagingSupportedMessage) {
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
    return "CapabilityStatementMessagingSupportedMessage(" + id + "," + mode + "," + definition + ")";
  }
}
