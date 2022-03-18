package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
 *
 * @see <a href="https://www.hl7.org/fhir/conceptmap.html">ConceptMap</a>
 */
public 
class ConceptMap extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 2729608042617546561L;
  
  protected String url;
  protected Identifier identifier;
  protected String version;
  protected String name;
  protected String title;
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
  protected String sourceUri;
  protected String sourceCanonical;
  protected String targetUri;
  protected String targetCanonical;
  protected ConceptMapGroup[] group;
  
  public ConceptMap()
  {
    this.resourceType = "ConceptMap";
  }

  public ConceptMap(String url)
  {
    this.resourceType = "ConceptMap";
    this.url = url;
  }

  public ConceptMap(String url, Identifier identifier)
  {
    this.resourceType = "ConceptMap";
    this.url = url;
    this.identifier = identifier;
  }
  
  public String getUrl() {
    return url;
  }

  public Identifier getIdentifier() {
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

  public String getSourceUri() {
    return sourceUri;
  }

  public String getSourceCanonical() {
    return sourceCanonical;
  }

  public String getTargetUri() {
    return targetUri;
  }

  public String getTargetCanonical() {
    return targetCanonical;
  }

  public ConceptMapGroup[] getGroup() {
    return group;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setIdentifier(Identifier identifier) {
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

  public void setSourceUri(String sourceUri) {
    this.sourceUri = sourceUri;
  }

  public void setSourceCanonical(String sourceCanonical) {
    this.sourceCanonical = sourceCanonical;
  }

  public void setTargetUri(String targetUri) {
    this.targetUri = targetUri;
  }

  public void setTargetCanonical(String targetCanonical) {
    this.targetCanonical = targetCanonical;
  }

  public void setGroup(ConceptMapGroup[] group) {
    this.group = group;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ConceptMap) {
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
    return "ConceptMap(" + id + "," + url + "," + identifier + ")";
  }
}
