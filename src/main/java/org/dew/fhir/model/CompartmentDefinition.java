package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A compartment definition that defines how resources are accessed on a server.
 *
 * @see <a href="https://www.hl7.org/fhir">CompartmentDefinition</a>
 */
public
class CompartmentDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String code;
  protected String purpose;
  protected String description;
  protected Boolean experimental;
  protected Boolean search;
  protected ContactDetail[] contact;
  protected CompartmentDefinitionResource[] resource;
  protected String version;
  protected String url;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  
  public CompartmentDefinition()
  {
    this.resourceType = "CompartmentDefinition";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getPurpose() {
    return purpose;
  }
  
  public void setPurpose(String purpose) {
    this.purpose = purpose;
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
  
  public Boolean getSearch() {
    return search;
  }
  
  public void setSearch(Boolean search) {
    this.search = search;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public CompartmentDefinitionResource[] getResource() {
    return resource;
  }
  
  public void setResource(CompartmentDefinitionResource[] resource) {
    this.resource = resource;
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
    if(object instanceof CompartmentDefinition) {
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
    return "CompartmentDefinition(" + id + ")";
  }
}
