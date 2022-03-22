package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Prospective warnings of potential issues when providing care to the patient.
 *
 * @see <a href="https://www.hl7.org/fhir/flag.html">Flag</a>
 */
public 
class Flag extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 3420351418002957421L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept[] category;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Period period;
  protected Reference<Encounter> encounter;
  protected Reference<Resource> author;
  
  public Flag()
  {
    this.resourceType = "Flag";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Flag) {
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
    return "Flag(" + id + ")";
  }
}
