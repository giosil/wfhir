package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The system that is reporting the event.
 *
 * @see <a href="https://www.hl7.org/fhir/auditevent-definitions.html#AuditEvent.source">AuditEvent.source</a>
 */
public 
class AuditEventSource extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -2208745168771395725L;
  
  protected String site;
  protected Reference<Resource> observer;
  protected Coding[] type;
  
  public AuditEventSource()
  {
  }

  public String getSite() {
    return site;
  }

  public Reference<Resource> getObserver() {
    return observer;
  }

  public Coding[] getType() {
    return type;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public void setObserver(Reference<Resource> observer) {
    this.observer = observer;
  }

  public void setType(Coding[] type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AuditEventSource) {
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
    return "AuditEventSource(" + id + ")";
  }
}
