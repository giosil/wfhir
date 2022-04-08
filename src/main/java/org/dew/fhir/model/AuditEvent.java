package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A record of an event made for purposes of maintaining a security log. 
 * Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 *
 * @see <a href="https://www.hl7.org/fhir/auditevent.html">AuditEvent</a>
 */
public 
class AuditEvent extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 3486465834100669434L;
  
  protected Coding type;
  protected Coding[] subtype;
  protected String action;
  protected Period period;
  protected Date recorded;
  protected String outcome;
  protected String outcomeDesc;
  protected CodeableConcept[] purposeOfEvent;
  protected AuditEventAgent[] agent;
  protected AuditEventSource source;
  protected AuditEventEntity[] entity;
  
  public AuditEvent()
  {
    this.resourceType = "AuditEvent";
  }

  public Coding getType() {
    return type;
  }

  public Coding[] getSubtype() {
    return subtype;
  }

  public String getAction() {
    return action;
  }

  public Period getPeriod() {
    return period;
  }

  public Date getRecorded() {
    return recorded;
  }

  public String getOutcome() {
    return outcome;
  }

  public String getOutcomeDesc() {
    return outcomeDesc;
  }

  public CodeableConcept[] getPurposeOfEvent() {
    return purposeOfEvent;
  }

  public AuditEventAgent[] getAgent() {
    return agent;
  }

  public AuditEventSource getSource() {
    return source;
  }

  public AuditEventEntity[] getEntity() {
    return entity;
  }

  public void setType(Coding type) {
    this.type = type;
  }

  public void setSubtype(Coding[] subtype) {
    this.subtype = subtype;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setRecorded(Date recorded) {
    this.recorded = recorded;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  public void setOutcomeDesc(String outcomeDesc) {
    this.outcomeDesc = outcomeDesc;
  }

  public void setPurposeOfEvent(CodeableConcept[] purposeOfEvent) {
    this.purposeOfEvent = purposeOfEvent;
  }

  public void setAgent(AuditEventAgent[] agent) {
    this.agent = agent;
  }

  public void setSource(AuditEventSource source) {
    this.source = source;
  }

  public void setEntity(AuditEventEntity[] entity) {
    this.entity = entity;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof AuditEvent) {
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
    return "AuditEvent(" + id + "," + type + "," + action + ")";
  }
}
