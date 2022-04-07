package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement.html">CapabilityStatement</a>
 */
public 
class CapabilityStatement extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -1008942371761052551L;
  
  protected String url;
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
  protected String kind;
  protected String[] instantiates;
  protected String[] imports;
  protected CapabilityStatementSoftware software;
  protected CapabilityStatementImplementation implementation;
  protected String fhirVersion;
  protected String[] format;
  protected String[] patchFormat;
  protected String[] implementationGuide;
  protected CapabilityStatementRest[] rest;
  protected CapabilityStatementMessaging[] messaging;
  protected CapabilityStatementDocument[] document;
  
  public CapabilityStatement()
  {
    this.resourceType = "CapabilityStatement";
  }

  public String getUrl() {
    return url;
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

  public String getKind() {
    return kind;
  }

  public String[] getInstantiates() {
    return instantiates;
  }

  public String[] getImports() {
    return imports;
  }

  public CapabilityStatementSoftware getSoftware() {
    return software;
  }

  public CapabilityStatementImplementation getImplementation() {
    return implementation;
  }

  public String getFhirVersion() {
    return fhirVersion;
  }

  public String[] getFormat() {
    return format;
  }

  public String[] getPatchFormat() {
    return patchFormat;
  }

  public String[] getImplementationGuide() {
    return implementationGuide;
  }

  public CapabilityStatementRest[] getRest() {
    return rest;
  }

  public CapabilityStatementMessaging[] getMessaging() {
    return messaging;
  }

  public CapabilityStatementDocument[] getDocument() {
    return document;
  }

  public void setUrl(String url) {
    this.url = url;
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

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setInstantiates(String[] instantiates) {
    this.instantiates = instantiates;
  }

  public void setImports(String[] imports) {
    this.imports = imports;
  }

  public void setSoftware(CapabilityStatementSoftware software) {
    this.software = software;
  }

  public void setImplementation(CapabilityStatementImplementation implementation) {
    this.implementation = implementation;
  }

  public void setFhirVersion(String fhirVersion) {
    this.fhirVersion = fhirVersion;
  }

  public void setFormat(String[] format) {
    this.format = format;
  }

  public void setPatchFormat(String[] patchFormat) {
    this.patchFormat = patchFormat;
  }

  public void setImplementationGuide(String[] implementationGuide) {
    this.implementationGuide = implementationGuide;
  }

  public void setRest(CapabilityStatementRest[] rest) {
    this.rest = rest;
  }

  public void setMessaging(CapabilityStatementMessaging[] messaging) {
    this.messaging = messaging;
  }

  public void setDocument(CapabilityStatementDocument[] document) {
    this.document = document;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatement) {
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
    return "CapabilityStatement(" + id + "," + version + "," + name + ")";
  }
}
