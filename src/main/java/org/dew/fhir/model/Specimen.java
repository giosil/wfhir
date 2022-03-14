package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A sample to be used for analysis.
 *
 * @see <a href="https://www.hl7.org/fhir/specimen.html">Specimen</a>
 */
public 
class Specimen extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 2572546685215451873L;
  
  protected Identifier[] identifier;
  protected Identifier accessionIdentifier;
  protected String status;
  protected CodeableConcept type;
  protected Reference<Resource> subject;
  protected Date receivedTime;
  protected Reference<Specimen>[] parent;
  protected Reference<ServiceRequest>[] request;
  protected SpecimenCollection collection;
  protected SpecimenProcessing[] processing;
  protected SpecimenContainer[] container;
  protected CodeableConcept[] condition;
  protected Annotation[] note;

  public Specimen()
  {
    this.resourceType = "Specimen";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Identifier getAccessionIdentifier() {
    return accessionIdentifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getType() {
    return type;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Date getReceivedTime() {
    return receivedTime;
  }

  public Reference<Specimen>[] getParent() {
    return parent;
  }

  public Reference<ServiceRequest>[] getRequest() {
    return request;
  }

  public SpecimenCollection getCollection() {
    return collection;
  }

  public SpecimenProcessing[] getProcessing() {
    return processing;
  }

  public SpecimenContainer[] getContainer() {
    return container;
  }

  public CodeableConcept[] getCondition() {
    return condition;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setAccessionIdentifier(Identifier accessionIdentifier) {
    this.accessionIdentifier = accessionIdentifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setReceivedTime(Date receivedTime) {
    this.receivedTime = receivedTime;
  }

  public void setParent(Reference<Specimen>[] parent) {
    this.parent = parent;
  }

  public void setRequest(Reference<ServiceRequest>[] request) {
    this.request = request;
  }

  public void setCollection(SpecimenCollection collection) {
    this.collection = collection;
  }

  public void setProcessing(SpecimenProcessing[] processing) {
    this.processing = processing;
  }

  public void setContainer(SpecimenContainer[] container) {
    this.container = container;
  }

  public void setCondition(CodeableConcept[] condition) {
    this.condition = condition;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Specimen) {
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
    return "Specimen(" + id + ")";
  }
}
