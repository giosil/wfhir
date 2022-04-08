package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 *
 * @see <a href="https://www.hl7.org/fhir/codesystem.html">CodeSystem</a>
 */
public 
class CodeSystem extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -533420918346771367L;
  
  protected String url;
  protected Identifier[] identifier;
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
  protected Boolean caseSensitive;
  protected String valueSet;
  protected String hierarchyMeaning;
  protected Boolean compositional;
  protected Boolean versionNeeded;
  protected String content;
  protected String supplements;
  protected Integer count;
  protected CodeSystemFilter[] filter;
  protected CodeSystemProperty[] property;
  protected CodeSystemConcept[] concept;
  
  public CodeSystem()
  {
    this.resourceType = "CodeSystem";
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

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public String getValueSet() {
    return valueSet;
  }

  public String getHierarchyMeaning() {
    return hierarchyMeaning;
  }

  public Boolean getCompositional() {
    return compositional;
  }

  public Boolean getVersionNeeded() {
    return versionNeeded;
  }

  public String getContent() {
    return content;
  }

  public String getSupplements() {
    return supplements;
  }

  public Integer getCount() {
    return count;
  }

  public CodeSystemFilter[] getFilter() {
    return filter;
  }

  public CodeSystemProperty[] getProperty() {
    return property;
  }

  public CodeSystemConcept[] getConcept() {
    return concept;
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

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public void setValueSet(String valueSet) {
    this.valueSet = valueSet;
  }

  public void setHierarchyMeaning(String hierarchyMeaning) {
    this.hierarchyMeaning = hierarchyMeaning;
  }

  public void setCompositional(Boolean compositional) {
    this.compositional = compositional;
  }

  public void setVersionNeeded(Boolean versionNeeded) {
    this.versionNeeded = versionNeeded;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setSupplements(String supplements) {
    this.supplements = supplements;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public void setFilter(CodeSystemFilter[] filter) {
    this.filter = filter;
  }

  public void setProperty(CodeSystemProperty[] property) {
    this.property = property;
  }

  public void setConcept(CodeSystemConcept[] concept) {
    this.concept = concept;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeSystem) {
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
    return "CodeSystem(" + id + "," + url + "," + description + ")";
  }
}
