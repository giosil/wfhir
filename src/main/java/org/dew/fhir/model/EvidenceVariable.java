package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
 *
 * @see <a href="https://www.hl7.org/fhir">EvidenceVariable</a>
 */
public
class EvidenceVariable extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected String shortTitle;
  protected String type;
  protected ContactDetail[] contact;
  protected ContactDetail[] endorser;
  protected Identifier[] identifier;
  protected RelatedArtifact[] relatedArtifact;
  protected Period effectivePeriod;
  protected ContactDetail[] author;
  protected String version;
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
  protected EvidenceVariableCharacteristic[] characteristic;
  protected ContactDetail[] editor;
  protected ContactDetail[] reviewer;
  protected String url;
  
  public EvidenceVariable()
  {
    this.resourceType = "EvidenceVariable";
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
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
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
  
  public EvidenceVariableCharacteristic[] getCharacteristic() {
    return characteristic;
  }
  
  public void setCharacteristic(EvidenceVariableCharacteristic[] characteristic) {
    this.characteristic = characteristic;
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
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EvidenceVariable) {
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
    return "EvidenceVariable(" + id + ")";
  }
}
