package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 *
 * @see <a href="https://www.hl7.org/fhir">NamingSystem</a>
 */
public
class NamingSystem extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected CodeableConcept[] jurisdiction;
  protected String usage;
  protected String description;
  protected CodeableConcept type;
  protected ContactDetail[] contact;
  protected String responsible;
  protected String kind;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected NamingSystemUniqueId[] uniqueId;
  protected String status;
  
  public NamingSystem()
  {
    this.resourceType = "NamingSystem";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  public String getUsage() {
    return usage;
  }
  
  public void setUsage(String usage) {
    this.usage = usage;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public String getResponsible() {
    return responsible;
  }
  
  public void setResponsible(String responsible) {
    this.responsible = responsible;
  }
  
  public String getKind() {
    return kind;
  }
  
  public void setKind(String kind) {
    this.kind = kind;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPublisher() {
    return publisher;
  }
  
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  public UsageContext[] getUseContext() {
    return useContext;
  }
  
  public void setUseContext(UsageContext[] useContext) {
    this.useContext = useContext;
  }
  
  public NamingSystemUniqueId[] getUniqueId() {
    return uniqueId;
  }
  
  public void setUniqueId(NamingSystemUniqueId[] uniqueId) {
    this.uniqueId = uniqueId;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NamingSystem) {
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
    return "NamingSystem(" + id + ")";
  }
}
