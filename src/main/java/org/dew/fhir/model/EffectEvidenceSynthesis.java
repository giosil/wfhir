package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">EffectEvidenceSynthesis</a>
 */
public
class EffectEvidenceSynthesis extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected Reference<Resource> exposureAlternative;
  protected ContactDetail[] contact;
  protected ContactDetail[] endorser;
  protected Identifier[] identifier;
  protected RelatedArtifact[] relatedArtifact;
  protected Period effectivePeriod;
  protected ContactDetail[] author;
  protected String version;
  protected Reference<Resource> population;
  protected Reference<Resource> exposure;
  protected Date lastReviewDate;
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
  protected EffectEvidenceSynthesisSampleSize sampleSize;
  protected CodeableConcept studyType;
  protected Reference<Resource> outcome;
  protected ContactDetail[] editor;
  protected EffectEvidenceSynthesisResultsByExposure[] resultsByExposure;
  protected EffectEvidenceSynthesisCertainty[] certainty;
  protected ContactDetail[] reviewer;
  protected String url;
  protected EffectEvidenceSynthesisEffectEstimate[] effectEstimate;
  protected CodeableConcept synthesisType;
  
  public EffectEvidenceSynthesis()
  {
    this.resourceType = "EffectEvidenceSynthesis";
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
  
  public Reference<Resource> getExposureAlternative() {
    return exposureAlternative;
  }
  
  public void setExposureAlternative(Reference<Resource> exposureAlternative) {
    this.exposureAlternative = exposureAlternative;
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
  
  public Reference<Resource> getPopulation() {
    return population;
  }
  
  public void setPopulation(Reference<Resource> population) {
    this.population = population;
  }
  
  public Reference<Resource> getExposure() {
    return exposure;
  }
  
  public void setExposure(Reference<Resource> exposure) {
    this.exposure = exposure;
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
  
  public EffectEvidenceSynthesisSampleSize getSampleSize() {
    return sampleSize;
  }
  
  public void setSampleSize(EffectEvidenceSynthesisSampleSize sampleSize) {
    this.sampleSize = sampleSize;
  }
  
  public CodeableConcept getStudyType() {
    return studyType;
  }
  
  public void setStudyType(CodeableConcept studyType) {
    this.studyType = studyType;
  }
  
  public Reference<Resource> getOutcome() {
    return outcome;
  }
  
  public void setOutcome(Reference<Resource> outcome) {
    this.outcome = outcome;
  }
  
  public ContactDetail[] getEditor() {
    return editor;
  }
  
  public void setEditor(ContactDetail[] editor) {
    this.editor = editor;
  }
  
  public EffectEvidenceSynthesisResultsByExposure[] getResultsByExposure() {
    return resultsByExposure;
  }
  
  public void setResultsByExposure(EffectEvidenceSynthesisResultsByExposure[] resultsByExposure) {
    this.resultsByExposure = resultsByExposure;
  }
  
  public EffectEvidenceSynthesisCertainty[] getCertainty() {
    return certainty;
  }
  
  public void setCertainty(EffectEvidenceSynthesisCertainty[] certainty) {
    this.certainty = certainty;
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
  
  public EffectEvidenceSynthesisEffectEstimate[] getEffectEstimate() {
    return effectEstimate;
  }
  
  public void setEffectEstimate(EffectEvidenceSynthesisEffectEstimate[] effectEstimate) {
    this.effectEstimate = effectEstimate;
  }
  
  public CodeableConcept getSynthesisType() {
    return synthesisType;
  }
  
  public void setSynthesisType(CodeableConcept synthesisType) {
    this.synthesisType = synthesisType;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EffectEvidenceSynthesis) {
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
    return "EffectEvidenceSynthesis(" + id + ")";
  }
}
