package org.dew.fhir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Basic is used for handling concepts not yet defined in FHIR, 
 * narrative-only resources that don't map to an existing resource,
 * and custom resources not appropriate for inclusion in the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir/basic.html">Basic</a>
 */
public 
class Basic extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -6691009293801906173L;
  
  protected Identifier[] identifier;
  protected CodeableConcept code;
  protected Reference<Resource> subject;
  protected Date created;
  protected Reference<Resource> author;
  
  public Basic()
  {
    this.resourceType = "Basic";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Date getCreated() {
    return created;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Basic) {
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
    return "Basic(" + id + "," + code + ")";
  }
}
