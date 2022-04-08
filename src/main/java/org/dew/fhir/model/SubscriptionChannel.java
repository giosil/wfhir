package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Details where to send notifications when resources are received that meet the criteria.
 *
 * @see <a href="https://www.hl7.org/fhir/subscription-definitions.html#Subscription.channel">Subscription.channel</a>
 */
public 
class SubscriptionChannel extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 2071348912073105699L;
  
  protected String type;
  protected String endpoint;
  protected String payload;
  protected String[] header;
  
  public SubscriptionChannel()
  {
  }

  public String getType() {
    return type;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public String getPayload() {
    return payload;
  }

  public String[] getHeader() {
    return header;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public void setHeader(String[] header) {
    this.header = header;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubscriptionChannel) {
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
    return "SubscriptionChannel(" + id + "," + type + "," + endpoint + ")";
  }
}
