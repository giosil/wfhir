package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. 
 * The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 *
 * @see <a href="https://www.hl7.org/fhir/plandefinition.html">PlanDefinition</a>
 */
public 
class PlanDefinition extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 7499622858191825423L;

  protected String url;
  protected Identifier[] identifier;
  protected String version;
  protected String name;
  protected String title;
  protected String subtitle;
  protected CodeableConcept type;
  protected String status;
  protected Boolean experimental;
  protected CodeableConcept subjectCodeableConcept;
  protected Reference<Group> subjectReference;
  protected Date date;
  protected String publisher;
  protected ContactDetail[] contact;
  protected String description;
  protected UsageContext[] useContext;
  protected CodeableConcept[] jurisdiction;
  protected String purpose;
  protected String usage;
  protected String copyright;
  protected Date approvalDate;
  protected Date lastReviewDate;
  protected Period effectivePeriod;
  protected CodeableConcept[] topic;
  protected ContactDetail[] author;
  protected ContactDetail[] editor;
  protected ContactDetail[] reviewer;
  protected ContactDetail[] endorser;
  protected RelatedArtifact[] relatedArtifact;
  protected String[] library;
  protected PlanDefinitionGoal[] goal;
  protected PlanDefinitionAction[] action;
  
  public PlanDefinition()
  {
    this.resourceType = "PlanDefinition";
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

  public String getSubtitle() {
    return subtitle;
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getStatus() {
    return status;
  }

  public Boolean getExperimental() {
    return experimental;
  }

  public CodeableConcept getSubjectCodeableConcept() {
    return subjectCodeableConcept;
  }

  public Reference<Group> getSubjectReference() {
    return subjectReference;
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

  public String getUsage() {
    return usage;
  }

  public String getCopyright() {
    return copyright;
  }

  public Date getApprovalDate() {
    return approvalDate;
  }

  public Date getLastReviewDate() {
    return lastReviewDate;
  }

  public Period getEffectivePeriod() {
    return effectivePeriod;
  }

  public CodeableConcept[] getTopic() {
    return topic;
  }

  public ContactDetail[] getAuthor() {
    return author;
  }

  public ContactDetail[] getEditor() {
    return editor;
  }

  public ContactDetail[] getReviewer() {
    return reviewer;
  }

  public ContactDetail[] getEndorser() {
    return endorser;
  }

  public RelatedArtifact[] getRelatedArtifact() {
    return relatedArtifact;
  }

  public String[] getLibrary() {
    return library;
  }

  public PlanDefinitionGoal[] getGoal() {
    return goal;
  }

  public PlanDefinitionAction[] getAction() {
    return action;
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

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }

  public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
    this.subjectCodeableConcept = subjectCodeableConcept;
  }

  public void setSubjectReference(Reference<Group> subjectReference) {
    this.subjectReference = subjectReference;
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

  public void setUsage(String usage) {
    this.usage = usage;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public void setApprovalDate(Date approvalDate) {
    this.approvalDate = approvalDate;
  }

  public void setLastReviewDate(Date lastReviewDate) {
    this.lastReviewDate = lastReviewDate;
  }

  public void setEffectivePeriod(Period effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }

  public void setTopic(CodeableConcept[] topic) {
    this.topic = topic;
  }

  public void setAuthor(ContactDetail[] author) {
    this.author = author;
  }

  public void setEditor(ContactDetail[] editor) {
    this.editor = editor;
  }

  public void setReviewer(ContactDetail[] reviewer) {
    this.reviewer = reviewer;
  }

  public void setEndorser(ContactDetail[] endorser) {
    this.endorser = endorser;
  }

  public void setRelatedArtifact(RelatedArtifact[] relatedArtifact) {
    this.relatedArtifact = relatedArtifact;
  }

  public void setLibrary(String[] library) {
    this.library = library;
  }

  public void setGoal(PlanDefinitionGoal[] goal) {
    this.goal = goal;
  }

  public void setAction(PlanDefinitionAction[] action) {
    this.action = action;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinition) {
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
    return "PlanDefinition(" + id + "," + url + ")";
  }
}
