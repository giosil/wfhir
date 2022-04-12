package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 *
 * @see <a href="https://www.hl7.org/fhir">Questionnaire</a>
 */
public
class Questionnaire extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected Date approvalDate;
  protected Coding[] code;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected String description;
  protected Boolean experimental;
  protected String title;
  protected String[] subjectType;
  protected ContactDetail[] contact;
  protected String[] derivedFrom;
  protected Identifier[] identifier;
  protected QuestionnaireItem[] item;
  protected Period effectivePeriod;
  protected String version;
  protected String url;
  protected Date lastReviewDate;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  
  public Questionnaire()
  {
    this.resourceType = "Questionnaire";
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
  
  public Date getApprovalDate() {
    return approvalDate;
  }
  
  public void setApprovalDate(Date approvalDate) {
    this.approvalDate = approvalDate;
  }
  
  public Coding[] getCode() {
    return code;
  }
  
  public void setCode(Coding[] code) {
    this.code = code;
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
  
  public String[] getSubjectType() {
    return subjectType;
  }
  
  public void setSubjectType(String[] subjectType) {
    this.subjectType = subjectType;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public String[] getDerivedFrom() {
    return derivedFrom;
  }
  
  public void setDerivedFrom(String[] derivedFrom) {
    this.derivedFrom = derivedFrom;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public QuestionnaireItem[] getItem() {
    return item;
  }
  
  public void setItem(QuestionnaireItem[] item) {
    this.item = item;
  }
  
  public Period getEffectivePeriod() {
    return effectivePeriod;
  }
  
  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
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
    if(object instanceof Questionnaire) {
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
    return "Questionnaire(" + id + ")";
  }
}
