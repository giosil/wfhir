package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="https://www.hl7.org/fhir">Measure</a>
 */
public
class Measure extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected String usage;
  protected Boolean experimental;
  protected CodeableConcept[] type;
  protected String riskAdjustment;
  protected ContactDetail[] contact;
  protected ContactDetail[] endorser;
  protected MeasureGroup[] group;
  protected Identifier[] identifier;
  protected RelatedArtifact[] relatedArtifact;
  protected Period effectivePeriod;
  protected String rateAggregation;
  protected ContactDetail[] author;
  protected CodeableConcept compositeScoring;
  protected MeasureSupplementalData[] supplementalData;
  protected String version;
  protected Date lastReviewDate;
  protected String subtitle;
  protected String name;
  protected String publisher;
  protected CodeableConcept[] topic;
  protected UsageContext[] useContext;
  protected String status;
  protected String clinicalRecommendationStatement;
  protected Date approvalDate;
  protected CodeableConcept subjectCodeableConcept;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected String description;
  protected CodeableConcept improvementNotation;
  protected String title;
  protected String[] library;
  protected String[] definition;
  protected String disclaimer;
  protected ContactDetail[] editor;
  protected CodeableConcept scoring;
  protected ContactDetail[] reviewer;
  protected Reference<Resource> subjectReference;
  protected String rationale;
  protected String url;
  protected String guidance;
  
  public Measure()
  {
    this.resourceType = "Measure";
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
  
  public String getUsage() {
    return usage;
  }
  
  public void setUsage(String usage) {
    this.usage = usage;
  }
  
  public Boolean getExperimental() {
    return experimental;
  }
  
  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }
  
  public CodeableConcept[] getType() {
    return type;
  }
  
  public void setType(CodeableConcept[] type) {
    this.type = type;
  }
  
  public String getRiskAdjustment() {
    return riskAdjustment;
  }
  
  public void setRiskAdjustment(String riskAdjustment) {
    this.riskAdjustment = riskAdjustment;
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
  
  public MeasureGroup[] getGroup() {
    return group;
  }
  
  public void setGroup(MeasureGroup[] group) {
    this.group = group;
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
  
  public String getRateAggregation() {
    return rateAggregation;
  }
  
  public void setRateAggregation(String rateAggregation) {
    this.rateAggregation = rateAggregation;
  }
  
  public ContactDetail[] getAuthor() {
    return author;
  }
  
  public void setAuthor(ContactDetail[] author) {
    this.author = author;
  }
  
  public CodeableConcept getCompositeScoring() {
    return compositeScoring;
  }
  
  public void setCompositeScoring(CodeableConcept compositeScoring) {
    this.compositeScoring = compositeScoring;
  }
  
  public MeasureSupplementalData[] getSupplementalData() {
    return supplementalData;
  }
  
  public void setSupplementalData(MeasureSupplementalData[] supplementalData) {
    this.supplementalData = supplementalData;
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
  
  public String getClinicalRecommendationStatement() {
    return clinicalRecommendationStatement;
  }
  
  public void setClinicalRecommendationStatement(String clinicalRecommendationStatement) {
    this.clinicalRecommendationStatement = clinicalRecommendationStatement;
  }
  
  public Date getApprovalDate() {
    return approvalDate;
  }
  
  public void setApprovalDate(Date approvalDate) {
    this.approvalDate = approvalDate;
  }
  
  public CodeableConcept getSubjectCodeableConcept() {
    return subjectCodeableConcept;
  }
  
  public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
    this.subjectCodeableConcept = subjectCodeableConcept;
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
  
  public CodeableConcept getImprovementNotation() {
    return improvementNotation;
  }
  
  public void setImprovementNotation(CodeableConcept improvementNotation) {
    this.improvementNotation = improvementNotation;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String[] getLibrary() {
    return library;
  }
  
  public void setLibrary(String[] library) {
    this.library = library;
  }
  
  public String[] getDefinition() {
    return definition;
  }
  
  public void setDefinition(String[] definition) {
    this.definition = definition;
  }
  
  public String getDisclaimer() {
    return disclaimer;
  }
  
  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }
  
  public ContactDetail[] getEditor() {
    return editor;
  }
  
  public void setEditor(ContactDetail[] editor) {
    this.editor = editor;
  }
  
  public CodeableConcept getScoring() {
    return scoring;
  }
  
  public void setScoring(CodeableConcept scoring) {
    this.scoring = scoring;
  }
  
  public ContactDetail[] getReviewer() {
    return reviewer;
  }
  
  public void setReviewer(ContactDetail[] reviewer) {
    this.reviewer = reviewer;
  }
  
  public Reference<Resource> getSubjectReference() {
    return subjectReference;
  }
  
  public void setSubjectReference(Reference<Resource> subjectReference) {
    this.subjectReference = subjectReference;
  }
  
  public String getRationale() {
    return rationale;
  }
  
  public void setRationale(String rationale) {
    this.rationale = rationale;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getGuidance() {
    return guidance;
  }
  
  public void setGuidance(String guidance) {
    this.guidance = guidance;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Measure) {
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
    return "Measure(" + id + ")";
  }
}
