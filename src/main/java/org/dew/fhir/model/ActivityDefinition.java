package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
 *
 * @see <a href="https://www.hl7.org/fhir/activitydefinition.html">ActivityDefinition</a>
 */
public
class ActivityDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 6800195567974523466L;
  
  protected String url;
  protected Identifier[] identifier;
  protected String version;
  protected String name;
  protected String title;
  protected String subtitle;
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
  protected String kind;
  protected String profile;
  protected CodeableConcept code;
  protected String intent;
  protected String priority;
  protected Boolean doNotPerform;
  protected Timing timingTiming;
  protected Date timingDateTime;
  protected Age timingAge;
  protected Period timingPeriod;
  protected Range timingRange;
  protected Duration timingDuration;
  protected Reference<Location> location;
  protected ActivityDefinitionParticipant[] participant;
  protected Reference<Resource> productReference;
  protected CodeableConcept productCodeableConcept;
  protected Quantity quantity;
  protected Dosage[] dosage;
  protected CodeableConcept[] bodySite;
  protected Reference<Resource>[] specimenRequirement;
  protected Reference<ObservationDefinition>[] observationRequirement;
  protected Reference<ObservationDefinition>[] observationResultRequirement;
  protected String transform;
  protected ActivityDefinitionDynamicValue[] dynamicValue;
  
  public ActivityDefinition()
  {
    this.resourceType = "ActivityDefinition";
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

  public String getKind() {
    return kind;
  }

  public String getProfile() {
    return profile;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getIntent() {
    return intent;
  }

  public String getPriority() {
    return priority;
  }

  public Boolean getDoNotPerform() {
    return doNotPerform;
  }

  public Timing getTimingTiming() {
    return timingTiming;
  }

  public Date getTimingDateTime() {
    return timingDateTime;
  }

  public Age getTimingAge() {
    return timingAge;
  }

  public Period getTimingPeriod() {
    return timingPeriod;
  }

  public Range getTimingRange() {
    return timingRange;
  }

  public Duration getTimingDuration() {
    return timingDuration;
  }

  public Reference<Location> getLocation() {
    return location;
  }

  public ActivityDefinitionParticipant[] getParticipant() {
    return participant;
  }

  public Reference<Resource> getProductReference() {
    return productReference;
  }

  public CodeableConcept getProductCodeableConcept() {
    return productCodeableConcept;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public Dosage[] getDosage() {
    return dosage;
  }

  public CodeableConcept[] getBodySite() {
    return bodySite;
  }

  public Reference<Resource>[] getSpecimenRequirement() {
    return specimenRequirement;
  }

  public Reference<ObservationDefinition>[] getObservationRequirement() {
    return observationRequirement;
  }

  public Reference<ObservationDefinition>[] getObservationResultRequirement() {
    return observationResultRequirement;
  }

  public String getTransform() {
    return transform;
  }

  public ActivityDefinitionDynamicValue[] getDynamicValue() {
    return dynamicValue;
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

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setDoNotPerform(Boolean doNotPerform) {
    this.doNotPerform = doNotPerform;
  }

  public void setTimingTiming(Timing timingTiming) {
    this.timingTiming = timingTiming;
  }

  public void setTimingDateTime(Date timingDateTime) {
    this.timingDateTime = timingDateTime;
  }

  public void setTimingAge(Age timingAge) {
    this.timingAge = timingAge;
  }

  public void setTimingPeriod(Period timingPeriod) {
    this.timingPeriod = timingPeriod;
  }

  public void setTimingRange(Range timingRange) {
    this.timingRange = timingRange;
  }

  public void setTimingDuration(Duration timingDuration) {
    this.timingDuration = timingDuration;
  }

  public void setLocation(Reference<Location> location) {
    this.location = location;
  }

  public void setParticipant(ActivityDefinitionParticipant[] participant) {
    this.participant = participant;
  }

  public void setProductReference(Reference<Resource> productReference) {
    this.productReference = productReference;
  }

  public void setProductCodeableConcept(CodeableConcept productCodeableConcept) {
    this.productCodeableConcept = productCodeableConcept;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public void setDosage(Dosage[] dosage) {
    this.dosage = dosage;
  }

  public void setBodySite(CodeableConcept[] bodySite) {
    this.bodySite = bodySite;
  }

  public void setSpecimenRequirement(Reference<Resource>[] specimenRequirement) {
    this.specimenRequirement = specimenRequirement;
  }

  public void setObservationRequirement(Reference<ObservationDefinition>[] observationRequirement) {
    this.observationRequirement = observationRequirement;
  }

  public void setObservationResultRequirement(Reference<ObservationDefinition>[] observationResultRequirement) {
    this.observationResultRequirement = observationResultRequirement;
  }

  public void setTransform(String transform) {
    this.transform = transform;
  }

  public void setDynamicValue(ActivityDefinitionDynamicValue[] dynamicValue) {
    this.dynamicValue = dynamicValue;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ActivityDefinition) {
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
    return "ActivityDefinition(" + id + "," + url + ")";
  }
}
