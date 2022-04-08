package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * The subscription resource is used to define a push-based subscription from a server to another system. 
 * Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system can take an appropriate action.
 *
 * @see <a href="https://www.hl7.org/fhir/subscription.html">Subscription</a>
 */
public 
class Subscription extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 1280188390029310416L;
  
  protected String status;
  protected ContactPoint[] contact;
  protected Date end;
  protected String reason;
  protected String criteria;
  protected String error;
  protected SubscriptionChannel channel;
  
  public Subscription()
  {
    this.resourceType = "Subscription";
  }

  public String getStatus() {
    return status;
  }

  public ContactPoint[] getContact() {
    return contact;
  }

  public Date getEnd() {
    return end;
  }

  public String getReason() {
    return reason;
  }

  public String getCriteria() {
    return criteria;
  }

  public String getError() {
    return error;
  }

  public SubscriptionChannel getChannel() {
    return channel;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setContact(ContactPoint[] contact) {
    this.contact = contact;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  public void setError(String error) {
    this.error = error;
  }

  public void setChannel(SubscriptionChannel channel) {
    this.channel = channel;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Subscription) {
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
    return "Subscription(" + id + ")";
  }
}
