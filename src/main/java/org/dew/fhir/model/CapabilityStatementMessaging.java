package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A description of the messaging capabilities of the solution.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.messaging">CapabilityStatement.messaging</a>
 */
public 
class CapabilityStatementMessaging extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5894308830917964570L;
  
  protected CapabilityStatementMessagingEndpoint[] endpoint;
  protected Integer reliableCache;
  protected String documentation;
  protected CapabilityStatementMessagingSupportedMessage[] supportedMessage;
  
  public CapabilityStatementMessaging()
  {
  }

  public CapabilityStatementMessagingEndpoint[] getEndpoint() {
    return endpoint;
  }

  public Integer getReliableCache() {
    return reliableCache;
  }

  public String getDocumentation() {
    return documentation;
  }

  public CapabilityStatementMessagingSupportedMessage[] getSupportedMessage() {
    return supportedMessage;
  }

  public void setEndpoint(CapabilityStatementMessagingEndpoint[] endpoint) {
    this.endpoint = endpoint;
  }

  public void setReliableCache(Integer reliableCache) {
    this.reliableCache = reliableCache;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public void setSupportedMessage(CapabilityStatementMessagingSupportedMessage[] supportedMessage) {
    this.supportedMessage = supportedMessage;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementMessaging) {
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
    return "CapabilityStatementMessaging(" + id + ")";
  }
}
