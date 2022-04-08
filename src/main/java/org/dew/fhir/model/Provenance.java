package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. 
 * Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. 
 * Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. 
 * Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 *
 * @see <a href="https://www.hl7.org/fhir/provenance.html">Provenance</a>
 */
public 
class Provenance extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 8709187220595697958L;
  
  protected Reference<Resource>[] target;
  protected Period occurredPeriod;
  protected Date occurredDateTime;
  protected Date recorded;
  protected String[] policy;
  protected Reference<Location> location;
  protected CodeableConcept[] reason;
  protected CodeableConcept activity;
  protected ProvenanceAgent[] agent;
  protected ProvenanceEntity[] entity;
  protected Signature[] signature;
  
  public Provenance()
  {
    this.resourceType = "Provenance";
  }
  
  public Reference<Resource>[] getTarget() {
    return target;
  }

  public Period getOccurredPeriod() {
    return occurredPeriod;
  }

  public Date getOccurredDateTime() {
    return occurredDateTime;
  }

  public Date getRecorded() {
    return recorded;
  }

  public String[] getPolicy() {
    return policy;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public CodeableConcept[] getReason() {
    return reason;
  }

  public CodeableConcept getActivity() {
    return activity;
  }

  public ProvenanceAgent[] getAgent() {
    return agent;
  }

  public ProvenanceEntity[] getEntity() {
    return entity;
  }

  public Signature[] getSignature() {
    return signature;
  }

  public void setTarget(Reference<Resource>[] target) {
    this.target = target;
  }

  public void setOccurredPeriod(Period occurredPeriod) {
    this.occurredPeriod = occurredPeriod;
  }

  public void setOccurredDateTime(Date occurredDateTime) {
    this.occurredDateTime = occurredDateTime;
  }

  public void setRecorded(Date recorded) {
    this.recorded = recorded;
  }

  public void setPolicy(String[] policy) {
    this.policy = policy;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setReason(CodeableConcept[] reason) {
    this.reason = reason;
  }

  public void setActivity(CodeableConcept activity) {
    this.activity = activity;
  }

  public void setAgent(ProvenanceAgent[] agent) {
    this.agent = agent;
  }

  public void setEntity(ProvenanceEntity[] entity) {
    this.entity = entity;
  }

  public void setSignature(Signature[] signature) {
    this.signature = signature;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Provenance) {
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
    return "Provenance(" + id + ")";
  }
}
