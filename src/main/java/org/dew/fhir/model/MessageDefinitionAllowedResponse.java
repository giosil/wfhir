package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates what types of messages may be sent as an application-level response to this message.
 *
 * @see <a href="https://www.hl7.org/fhir/messagedefinition-definitions.html#MessageDefinition.allowedResponse">MessageDefinition.allowedResponse</a>
 */
public 
class MessageDefinitionAllowedResponse extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 6566759476574795864L;
  
  protected String message;
  protected String situation;
  
  public MessageDefinitionAllowedResponse()
  {
  }

  public String getMessage() {
    return message;
  }

  public String getSituation() {
    return situation;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setSituation(String situation) {
    this.situation = situation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageDefinitionAllowedResponse) {
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
    return "MessageDefinitionAllowedResponse(" + id + "," + message + "," + situation + ")";
  }
}
