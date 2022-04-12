package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
 *
 * @see <a href="https://www.hl7.org/fhir">Evidence</a>
 */
public
class Evidence extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected String shortTitle;
  protected ContactDetail[] contact;
  protected ContactDetail[] endorser;
  protected Identifier[] identifier;
  protected RelatedArtifact[] relatedArtifact;
  protected Period effectivePeriod;
  protected ContactDetail[] author;
  protected String version;
  protected Reference<Resource>[] exposureVariant;
  protected Date lastReviewDate;
  protected String subtitle;
  protected String name;
  protected String publisher;
  protected CodeableConcept[] topic;
  protected UsageContext[] useContext;
  protected String status;
  protected Annotation[] note;
  protected Date approvalDate;
  protected CodeableConcept[] jurisdiction;
  protected String description;
  protected String title;
  protected Reference<Resource>[] outcome;
  protected ContactDetail[] editor;
  protected ContactDetail[] reviewer;
  protected String url;
  protected Reference<Resource> exposureBackground;
  
  public Evidence()
  {
    this.resourceType = "Evidence";
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
  
  public String getShortTitle() {
    return shortTitle;
  }
  
  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public ContactDetail[] getEndorser() {
    return endorser;
  }
  
  public void setEndorser(ContactDetail[] endorser) {
    this.endorser = endorser;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public RelatedArtifact[] getRelatedArtifact() {
    return relatedArtifact;
  }
  
  public void setRelatedArtifact(RelatedArtifact[] relatedArtifact) {
    this.relatedArtifact = relatedArtifact;
  }
  
  public Period getEffectivePeriod() {
    return effectivePeriod;
  }
  
  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }
  
  public ContactDetail[] getAuthor() {
    return author;
  }
  
  public void setAuthor(ContactDetail[] author) {
    this.author = author;
  }
  
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }
  
  public Reference<Resource>[] getExposureVariant() {
    return exposureVariant;
  }
  
  public void setExposureVariant(Reference<Resource>[] exposureVariant) {
    this.exposureVariant = exposureVariant;
  }
  
  public Date getLastReviewDate() {
    return lastReviewDate;
  }
  
  public void setLastReviewDate(Date lastReviewDate) {
    this.lastReviewDate = lastReviewDate;
  }
  
  public String getSubtitle() {
    return subtitle;
  }
  
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
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
  
  public CodeableConcept[] getTopic() {
    return topic;
  }
  
  public void setTopic(CodeableConcept[] topic) {
    this.topic = topic;
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
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public Date getApprovalDate() {
    return approvalDate;
  }
  
  public void setApprovalDate(Date approvalDate) {
    this.approvalDate = approvalDate;
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
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public Reference<Resource>[] getOutcome() {
    return outcome;
  }
  
  public void setOutcome(Reference<Resource>[] outcome) {
    this.outcome = outcome;
  }
  
  public ContactDetail[] getEditor() {
    return editor;
  }
  
  public void setEditor(ContactDetail[] editor) {
    this.editor = editor;
  }
  
  public ContactDetail[] getReviewer() {
    return reviewer;
  }
  
  public void setReviewer(ContactDetail[] reviewer) {
    this.reviewer = reviewer;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public Reference<Resource> getExposureBackground() {
    return exposureBackground;
  }
  
  public void setExposureBackground(Reference<Resource> exposureBackground) {
    this.exposureBackground = exposureBackground;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Evidence) {
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
    return "Evidence(" + id + ")";
  }
}
