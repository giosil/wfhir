package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information about the message that this message is a response to. Only present if this message is a response.
 *
 * @see <a href="https://www.hl7.org/fhir/messageheader-definitions.html#MessageHeader.response">MessageHeader.response</a>
 */
public 
class MessageHeaderResponse extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1239712993320467952L;
  
  protected String identifier;
  protected String code;
  protected Reference<OperationOutcome> details;
  
  public MessageHeaderResponse()
  {
  }
  
  public String getIdentifier() {
    return identifier;
  }

  public String getCode() {
    return code;
  }

  public Reference<OperationOutcome> getDetails() {
    return details;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDetails(Reference<OperationOutcome> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageHeaderResponse) {
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
    return "MessageHeaderResponse(" + id + "," + identifier + "," + code + ")";
  }
}
