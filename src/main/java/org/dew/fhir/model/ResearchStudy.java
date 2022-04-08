package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge. 
 * This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques. 
 * A ResearchStudy involves the gathering of information about human or animal subjects.
 *
 * @see <a href="https://www.hl7.org/fhir/researchstudy.html">ResearchStudy</a>
 */
public 
class ResearchStudy extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 4813599351374319455L;
  
  protected Identifier[] identifier;
  protected String title;
  protected Reference<PlanDefinition>[] protocol;
  protected Reference<ResearchStudy>[] partOf;
  protected String status;
  protected CodeableConcept primaryPurposeType;
  protected CodeableConcept phase;
  protected CodeableConcept[] category;
  protected CodeableConcept[] focus;
  protected CodeableConcept[] condition;
  protected ContactDetail[] contact;
  protected RelatedArtifact[] relatedArtifact;
  protected CodeableConcept[] keyword;
  protected CodeableConcept[] location;
  protected String description;
  protected Reference<Group>[] enrollment;
  protected Period period;
  protected Reference<Organization> sponsor;
  protected Reference<Resource> principalInvestigator;
  protected Reference<Location>[] site;
  protected CodeableConcept reasonStopped;
  protected Annotation[] note;
  protected ResearchStudyArm[] arm;
  protected ResearchStudyObjective[] objective;
  
  public ResearchStudy()
  {
    this.resourceType = "ResearchStudy";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getTitle() {
    return title;
  }

  public Reference<PlanDefinition>[] getProtocol() {
    return protocol;
  }

  public Reference<ResearchStudy>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getPrimaryPurposeType() {
    return primaryPurposeType;
  }

  public CodeableConcept getPhase() {
    return phase;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept[] getFocus() {
    return focus;
  }

  public CodeableConcept[] getCondition() {
    return condition;
  }

  public ContactDetail[] getContact() {
    return contact;
  }

  public RelatedArtifact[] getRelatedArtifact() {
    return relatedArtifact;
  }

  public CodeableConcept[] getKeyword() {
    return keyword;
  }

  public CodeableConcept[] getLocation() {
    return location;
  }

  public String getDescription() {
    return description;
  }

  public Reference<Group>[] getEnrollment() {
    return enrollment;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Organization> getSponsor() {
    return sponsor;
  }

  public Reference<Resource> getPrincipalInvestigator() {
    return principalInvestigator;
  }

  public Reference<Location>[] getSite() {
    return site;
  }

  public CodeableConcept getReasonStopped() {
    return reasonStopped;
  }

  public Annotation[] getNote() {
    return note;
  }

  public ResearchStudyArm[] getArm() {
    return arm;
  }

  public ResearchStudyObjective[] getObjective() {
    return objective;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setProtocol(Reference<PlanDefinition>[] protocol) {
    this.protocol = protocol;
  }

  public void setPartOf(Reference<ResearchStudy>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPrimaryPurposeType(CodeableConcept primaryPurposeType) {
    this.primaryPurposeType = primaryPurposeType;
  }

  public void setPhase(CodeableConcept phase) {
    this.phase = phase;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setFocus(CodeableConcept[] focus) {
    this.focus = focus;
  }

  public void setCondition(CodeableConcept[] condition) {
    this.condition = condition;
  }

  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }

  public void setRelatedArtifact(RelatedArtifact[] relatedArtifact) {
    this.relatedArtifact = relatedArtifact;
  }

  public void setKeyword(CodeableConcept[] keyword) {
    this.keyword = keyword;
  }

  public void setLocation(CodeableConcept[] location) {
    this.location = location;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setEnrollment(Reference<Group>[] enrollment) {
    this.enrollment = enrollment;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setSponsor(Reference<Organization> sponsor) {
    this.sponsor = sponsor;
  }

  public void setPrincipalInvestigator(Reference<Resource> principalInvestigator) {
    this.principalInvestigator = principalInvestigator;
  }

  public void setSite(Reference<Location>[] site) {
    this.site = site;
  }

  public void setReasonStopped(CodeableConcept reasonStopped) {
    this.reasonStopped = reasonStopped;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setArm(ResearchStudyArm[] arm) {
    this.arm = arm;
  }

  public void setObjective(ResearchStudyObjective[] objective) {
    this.objective = objective;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ResearchStudy) {
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
    return "ResearchStudy(" + id + "," + title + ")";
  }
}
