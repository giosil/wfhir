package org.dew.fhir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset.html">ValueSet</a>
 */
public 
class ValueSet extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -2382884422543430381L;
  
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
  protected Boolean immutable;
  protected String purpose;
  protected String copyright;
  protected ValueSetCompose compose;
  protected ValueSetExpansion expansion;
  
  public ValueSet()
  {
    this.resourceType = "ValueSet";
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

  public Boolean getImmutable() {
    return immutable;
  }

  public String getPurpose() {
    return purpose;
  }

  public String getCopyright() {
    return copyright;
  }

  public ValueSetCompose getCompose() {
    return compose;
  }

  public ValueSetExpansion getExpansion() {
    return expansion;
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

  public void setImmutable(Boolean immutable) {
    this.immutable = immutable;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public void setCompose(ValueSetCompose compose) {
    this.compose = compose;
  }

  public void setExpansion(ValueSetExpansion expansion) {
    this.expansion = expansion;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSet) {
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
    return "ValueSet(" + id + "," + url + ")";
  }
}
