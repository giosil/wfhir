package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 *
 * @see <a href="https://www.hl7.org/fhir">GraphDefinition</a>
 */
public
class GraphDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected GraphDefinitionLink[] link;
  protected String description;
  protected Boolean experimental;
  protected ContactDetail[] contact;
  protected String profile;
  protected String start;
  protected String version;
  protected String url;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  
  public GraphDefinition()
  {
    this.resourceType = "GraphDefinition";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public String getPurpose() {
    return purpose;
  }
  
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }
  
  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  public GraphDefinitionLink[] getLink() {
    return link;
  }
  
  public void setLink(GraphDefinitionLink[] link) {
    this.link = link;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Boolean getExperimental() {
    return experimental;
  }
  
  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public String getProfile() {
    return profile;
  }
  
  public void setProfile(String profile) {
    this.profile = profile;
  }
  
  public String getStart() {
    return start;
  }
  
  public void setStart(String start) {
    this.start = start;
  }
  
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
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
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof GraphDefinition) {
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
    return "GraphDefinition(" + id + ")";
  }
}
