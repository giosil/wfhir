package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities</a>
 */
public
class TerminologyCapabilities extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected TerminologyCapabilitiesSoftware software;
  protected Boolean experimental;
  protected ContactDetail[] contact;
  protected TerminologyCapabilitiesClosure closure;
  protected TerminologyCapabilitiesCodeSystem[] codeSystem;
  protected String kind;
  protected Boolean lockedDate;
  protected String version;
  protected TerminologyCapabilitiesExpansion expansion;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected String codeSearch;
  protected String description;
  protected TerminologyCapabilitiesValidateCode validateCode;
  protected String title;
  protected TerminologyCapabilitiesImplementation implementation;
  protected String url;
  protected TerminologyCapabilitiesTranslation translation;
  
  public TerminologyCapabilities()
  {
    this.resourceType = "TerminologyCapabilities";
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
  
  public TerminologyCapabilitiesSoftware getSoftware() {
    return software;
  }
  
  public void setSoftware(TerminologyCapabilitiesSoftware software) {
    this.software = software;
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
  
  public TerminologyCapabilitiesClosure getClosure() {
    return closure;
  }
  
  public void setClosure(TerminologyCapabilitiesClosure closure) {
    this.closure = closure;
  }
  
  public TerminologyCapabilitiesCodeSystem[] getCodeSystem() {
    return codeSystem;
  }
  
  public void setCodeSystem(TerminologyCapabilitiesCodeSystem[] codeSystem) {
    this.codeSystem = codeSystem;
  }
  
  public String getKind() {
    return kind;
  }
  
  public void setKind(String kind) {
    this.kind = kind;
  }
  
  public Boolean getLockedDate() {
    return lockedDate;
  }
  
  public void setLockedDate(Boolean lockedDate) {
    this.lockedDate = lockedDate;
  }
  
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }
  
  public TerminologyCapabilitiesExpansion getExpansion() {
    return expansion;
  }
  
  public void setExpansion(TerminologyCapabilitiesExpansion expansion) {
    this.expansion = expansion;
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
  
  public String getCodeSearch() {
    return codeSearch;
  }
  
  public void setCodeSearch(String codeSearch) {
    this.codeSearch = codeSearch;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public TerminologyCapabilitiesValidateCode getValidateCode() {
    return validateCode;
  }
  
  public void setValidateCode(TerminologyCapabilitiesValidateCode validateCode) {
    this.validateCode = validateCode;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public TerminologyCapabilitiesImplementation getImplementation() {
    return implementation;
  }
  
  public void setImplementation(TerminologyCapabilitiesImplementation implementation) {
    this.implementation = implementation;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public TerminologyCapabilitiesTranslation getTranslation() {
    return translation;
  }
  
  public void setTranslation(TerminologyCapabilitiesTranslation translation) {
    this.translation = translation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilities) {
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
    return "TerminologyCapabilities(" + id + ")";
  }
}
