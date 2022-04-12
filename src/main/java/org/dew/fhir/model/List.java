package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A list is a curated collection of resources.
 *
 * @see <a href="https://www.hl7.org/fhir">List</a>
 */
public
class List extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Annotation[] note;
  protected CodeableConcept code;
  protected CodeableConcept emptyReason;
  protected Reference<Resource> subject;
  protected Reference<Resource> source;
  protected String title;
  protected String mode;
  protected CodeableConcept orderedBy;
  protected Identifier[] identifier;
  protected Reference<Resource> encounter;
  protected ListEntry[] entry;
  protected String status;
  
  public List()
  {
    this.resourceType = "List";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public CodeableConcept getEmptyReason() {
    return emptyReason;
  }
  
  public void setEmptyReason(CodeableConcept emptyReason) {
    this.emptyReason = emptyReason;
  }
  
  public Reference<Resource> getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }
  
  public Reference<Resource> getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource> source) {
    this.source = source;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getMode() {
    return mode;
  }
  
  public void setMode(String mode) {
    this.mode = mode;
  }
  
  public CodeableConcept getOrderedBy() {
    return orderedBy;
  }
  
  public void setOrderedBy(CodeableConcept orderedBy) {
    this.orderedBy = orderedBy;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource> getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource> encounter) {
    this.encounter = encounter;
  }
  
  public ListEntry[] getEntry() {
    return entry;
  }
  
  public void setEntry(ListEntry[] entry) {
    this.entry = entry;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof List) {
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
    return "List(" + id + ")";
  }
}
