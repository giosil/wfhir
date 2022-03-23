package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * @see <a href="https://www.hl7.org/fhir/careplan.html">CarePlan</a>
 */
public 
class CarePlan extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 3216866358082008048L;
  
  protected Identifier[] identifier;
  protected String[] instantiatesCanonical;
  protected String[] instantiatesUri;
  protected Reference<CarePlan>[] basedOn;
  protected Reference<CarePlan>[] replaces;
  protected Reference<CarePlan>[] partOf;
  protected String status;
  protected String intent;
  protected CodeableConcept[] category;
  protected String title;
  protected String description;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Period period;
  protected Date created;
  protected Reference<Resource> author;
  protected Reference<Resource>[] contributor;
  protected Reference<CareTeam>[] careTeam;
  protected Reference<Condition>[] addresses;
  protected Reference<Resource>[] supportingInfo;
  protected Reference<Goal>[] goal;
  protected CarePlanActivity[] activity;
  protected Annotation[] note;
  
  public CarePlan()
  {
    this.resourceType = "CarePlan";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String[] getInstantiatesCanonical() {
    return instantiatesCanonical;
  }

  public String[] getInstantiatesUri() {
    return instantiatesUri;
  }

  public Reference<CarePlan>[] getBasedOn() {
    return basedOn;
  }

  public Reference<CarePlan>[] getReplaces() {
    return replaces;
  }

  public Reference<CarePlan>[] getPartOf() {
    return partOf;
  }

  public String getStatus() {
    return status;
  }

  public String getIntent() {
    return intent;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Period getPeriod() {
    return period;
  }

  public Date getCreated() {
    return created;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public Reference<Resource>[] getContributor() {
    return contributor;
  }

  public Reference<CareTeam>[] getCareTeam() {
    return careTeam;
  }

  public Reference<Condition>[] getAddresses() {
    return addresses;
  }

  public Reference<Resource>[] getSupportingInfo() {
    return supportingInfo;
  }

  public Reference<Goal>[] getGoal() {
    return goal;
  }

  public CarePlanActivity[] getActivity() {
    return activity;
  }

  public Annotation[] getNote() {
    return note;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setInstantiatesCanonical(String[] instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }

  public void setInstantiatesUri(String[] instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }

  public void setBasedOn(Reference<CarePlan>[] basedOn) {
    this.basedOn = basedOn;
  }

  public void setReplaces(Reference<CarePlan>[] replaces) {
    this.replaces = replaces;
  }

  public void setPartOf(Reference<CarePlan>[] partOf) {
    this.partOf = partOf;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }

  public void setContributor(Reference<Resource>[] contributor) {
    this.contributor = contributor;
  }

  public void setCareTeam(Reference<CareTeam>[] careTeam) {
    this.careTeam = careTeam;
  }

  public void setAddresses(Reference<Condition>[] addresses) {
    this.addresses = addresses;
  }

  public void setSupportingInfo(Reference<Resource>[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }

  public void setGoal(Reference<Goal>[] goal) {
    this.goal = goal;
  }

  public void setActivity(CarePlanActivity[] activity) {
    this.activity = activity;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CarePlan) {
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
    return "CarePlan(" + id + ")";
  }
}
