package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An actor taking an active role in the event or activity that is logged.
 *
 * @see <a href="https://www.hl7.org/fhir/auditevent-definitions.html#AuditEvent.agent">AuditEvent.agent</a>
 */
public 
class AuditEventAgent extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8474530384459276352L;
  
  protected CodeableConcept type;
  protected CodeableConcept[] role;
  protected Reference<Resource> who;
  protected String altId;
  protected String name;
  protected Boolean requestor;
  protected Reference<Location> location;
  protected String[] policy;
  protected Coding media;
  protected AuditEventAgentNetwork network;
  protected CodeableConcept[] purposeOfUse;
  
  public AuditEventAgent()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getRole() {
    return role;
  }

  public Reference<Resource> getWho() {
    return who;
  }

  public String getAltId() {
    return altId;
  }

  public String getName() {
    return name;
  }

  public Boolean getRequestor() {
    return requestor;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public String[] getPolicy() {
    return policy;
  }

  public Coding getMedia() {
    return media;
  }

  public AuditEventAgentNetwork getNetwork() {
    return network;
  }

  public CodeableConcept[] getPurposeOfUse() {
    return purposeOfUse;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setRole(CodeableConcept[] role) {
    this.role = role;
  }

  public void setWho(Reference<Resource> who) {
    this.who = who;
  }

  public void setAltId(String altId) {
    this.altId = altId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRequestor(Boolean requestor) {
    this.requestor = requestor;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setPolicy(String[] policy) {
    this.policy = policy;
  }

  public void setMedia(Coding media) {
    this.media = media;
  }

  public void setNetwork(AuditEventAgentNetwork network) {
    this.network = network;
  }

  public void setPurposeOfUse(CodeableConcept[] purposeOfUse) {
    this.purposeOfUse = purposeOfUse;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AuditEventAgent) {
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
    return "AuditEventAgent(" + id + ")";
  }
}
