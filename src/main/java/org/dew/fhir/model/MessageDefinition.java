package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 *
 * @see <a href="https://www.hl7.org/fhir/messagedefinition.html">MessageDefinition</a>
 */
public 
class MessageDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 6861077782516415021L;
  
  protected String url;
  protected Identifier[] identifier;
  protected String version;
  protected String name;
  protected String title;
  protected String[] replaces;
  protected String status;
  protected Boolean experimental;
  protected Date date;
  protected String publisher;
  protected ContactDetail[] contact;
  protected String description;
  protected UsageContext[] useContext;
  protected CodeableConcept[] jurisdiction;
  protected String purpose;
  protected String copyright;
  protected String base;
  protected String[] parent;
  protected Coding eventCoding;
  protected String eventUri;
  protected String category;
  protected MessageDefinitionFocus[] focus;
  protected String responseRequired;
  protected MessageDefinitionAllowedResponse[] allowedResponse;
  protected String[] graph;
  
  public MessageDefinition()
  {
    this.resourceType = "MessageDefinition";
  }

  public String getUrl() {
    return url;
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getVersion() {
    return version;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public String[] getReplaces() {
    return replaces;
  }

  public String getStatus() {
    return status;
  }

  public Boolean getExperimental() {
    return experimental;
  }

  public Date getDate() {
    return date;
  }

  public String getPublisher() {
    return publisher;
  }

  public ContactDetail[] getContact() {
    return contact;
  }

  public String getDescription() {
    return description;
  }

  public UsageContext[] getUseContext() {
    return useContext;
  }

  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }

  public String getPurpose() {
    return purpose;
  }

  public String getCopyright() {
    return copyright;
  }

  public String getBase() {
    return base;
  }

  public String[] getParent() {
    return parent;
  }

  public Coding getEventCoding() {
    return eventCoding;
  }

  public String getEventUri() {
    return eventUri;
  }

  public String getCategory() {
    return category;
  }

  public MessageDefinitionFocus[] getFocus() {
    return focus;
  }

  public String getResponseRequired() {
    return responseRequired;
  }

  public MessageDefinitionAllowedResponse[] getAllowedResponse() {
    return allowedResponse;
  }

  public String[] getGraph() {
    return graph;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setReplaces(String[] replaces) {
    this.replaces = replaces;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setUseContext(UsageContext[] useContext) {
    this.useContext = useContext;
  }

  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public void setParent(String[] parent) {
    this.parent = parent;
  }

  public void setEventCoding(Coding eventCoding) {
    this.eventCoding = eventCoding;
  }

  public void setEventUri(String eventUri) {
    this.eventUri = eventUri;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setFocus(MessageDefinitionFocus[] focus) {
    this.focus = focus;
  }

  public void setResponseRequired(String responseRequired) {
    this.responseRequired = responseRequired;
  }

  public void setAllowedResponse(MessageDefinitionAllowedResponse[] allowedResponse) {
    this.allowedResponse = allowedResponse;
  }

  public void setGraph(String[] graph) {
    this.graph = graph;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageDefinition) {
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
    return "MessageDefinition(" + id + "," + url + "," + version + "," + name + ")";
  }
}
