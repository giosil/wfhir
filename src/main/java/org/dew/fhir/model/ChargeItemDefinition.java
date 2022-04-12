package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
 *
 * @see <a href="https://www.hl7.org/fhir">ChargeItemDefinition</a>
 */
public
class ChargeItemDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected ChargeItemDefinitionPropertyGroup[] propertyGroup;
  protected String[] partOf;
  protected String copyright;
  protected Date approvalDate;
  protected CodeableConcept code;
  protected Reference<Resource>[] instance;
  protected CodeableConcept[] jurisdiction;
  protected String description;
  protected Boolean experimental;
  protected String title;
  protected ContactDetail[] contact;
  protected String[] derivedFromUri;
  protected Identifier[] identifier;
  protected Period effectivePeriod;
  protected String[] replaces;
  protected String version;
  protected String url;
  protected Date lastReviewDate;
  protected String publisher;
  protected ChargeItemDefinitionApplicability[] applicability;
  protected UsageContext[] useContext;
  protected String status;
  
  public ChargeItemDefinition()
  {
    this.resourceType = "ChargeItemDefinition";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public ChargeItemDefinitionPropertyGroup[] getPropertyGroup() {
    return propertyGroup;
  }
  
  public void setPropertyGroup(ChargeItemDefinitionPropertyGroup[] propertyGroup) {
    this.propertyGroup = propertyGroup;
  }
  
  public String[] getPartOf() {
    return partOf;
  }
  
  public void setPartOf(String[] partOf) {
    this.partOf = partOf;
  }
  
  public String getCopyright() {
    return copyright;
  }
  
  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }
  
  public Date getApprovalDate() {
    return approvalDate;
  }
  
  public void setApprovalDate(Date approvalDate) {
    this.approvalDate = approvalDate;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Reference<Resource>[] getInstance() {
    return instance;
  }
  
  public void setInstance(Reference<Resource>[] instance) {
    this.instance = instance;
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
  
  public String[] getDerivedFromUri() {
    return derivedFromUri;
  }
  
  public void setDerivedFromUri(String[] derivedFromUri) {
    this.derivedFromUri = derivedFromUri;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Period getEffectivePeriod() {
    return effectivePeriod;
  }
  
  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }
  
  public String[] getReplaces() {
    return replaces;
  }
  
  public void setReplaces(String[] replaces) {
    this.replaces = replaces;
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
  
  public Date getLastReviewDate() {
    return lastReviewDate;
  }
  
  public void setLastReviewDate(Date lastReviewDate) {
    this.lastReviewDate = lastReviewDate;
  }
  
  public String getPublisher() {
    return publisher;
  }
  
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  public ChargeItemDefinitionApplicability[] getApplicability() {
    return applicability;
  }
  
  public void setApplicability(ChargeItemDefinitionApplicability[] applicability) {
    this.applicability = applicability;
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
    if(object instanceof ChargeItemDefinition) {
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
    return "ChargeItemDefinition(" + id + ")";
  }
}
