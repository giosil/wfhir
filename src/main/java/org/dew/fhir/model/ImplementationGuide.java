package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide</a>
 */
public
class ImplementationGuide extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected CodeableConcept[] jurisdiction;
  protected String description;
  protected Boolean experimental;
  protected ImplementationGuideGlobal[] global;
  protected String title;
  protected ContactDetail[] contact;
  protected String[] fhirVersion;
  protected ImplementationGuideDefinition definition;
  protected ImplementationGuideDependsOn[] dependsOn;
  protected ImplementationGuideManifest manifest;
  protected String packageId;
  protected String version;
  protected String url;
  protected String license;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  
  public ImplementationGuide()
  {
    this.resourceType = "ImplementationGuide";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public String getCopyright() {
    return copyright;
  }
  
  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }
  
  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
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
  
  public ImplementationGuideGlobal[] getGlobal() {
    return global;
  }
  
  public void setGlobal(ImplementationGuideGlobal[] global) {
    this.global = global;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public String[] getFhirVersion() {
    return fhirVersion;
  }
  
  public void setFhirVersion(String[] fhirVersion) {
    this.fhirVersion = fhirVersion;
  }
  
  public ImplementationGuideDefinition getDefinition() {
    return definition;
  }
  
  public void setDefinition(ImplementationGuideDefinition definition) {
    this.definition = definition;
  }
  
  public ImplementationGuideDependsOn[] getDependsOn() {
    return dependsOn;
  }
  
  public void setDependsOn(ImplementationGuideDependsOn[] dependsOn) {
    this.dependsOn = dependsOn;
  }
  
  public ImplementationGuideManifest getManifest() {
    return manifest;
  }
  
  public void setManifest(ImplementationGuideManifest manifest) {
    this.manifest = manifest;
  }
  
  public String getPackageId() {
    return packageId;
  }
  
  public void setPackageId(String packageId) {
    this.packageId = packageId;
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
  
  public String getLicense() {
    return license;
  }
  
  public void setLicense(String license) {
    this.license = license;
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
    if(object instanceof ImplementationGuide) {
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
    return "ImplementationGuide(" + id + ")";
  }
}
