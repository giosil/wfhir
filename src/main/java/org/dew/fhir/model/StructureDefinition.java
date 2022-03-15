package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A definition of a FHIR structure. 
 * This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
 *
 * @see <a href="https://www.hl7.org/fhir/structuredefinition.html">StructureDefinition</a>
 */
public 
class StructureDefinition extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -9082068869401634068L;
  
  protected String url;
  protected Identifier[] identifier;
  protected String version;
  protected String name;
  protected String title;
  protected String status;
  protected Boolean experimental;
  protected Date date;
  protected String publisher;
  protected ContactDetail[] contact;
  protected String description;
  protected UsageContext[] useContext;
  protected CodeableConcept[] jurisdiction;
  protected String purpose;
  protected String copyright;
  protected Coding[] keyword;
  protected String fhirVersion;
  protected StructureDefinitionMapping[] mapping;
  protected String kind;
  protected Boolean abstract_;
  protected StructureDefinitionContext[] context;
  protected String[] contextInvariant;
  protected String type;
  protected String baseDefinition;
  protected String derivation;
  protected StructureDefinitionSnapshot snapshot;
  protected StructureDefinitionDifferential differential;
  
  public StructureDefinition()
  {
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

  public String getStatus() {
    return status;
  }

  public Boolean getExperimental() {
    return experimental;
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

  public String getCopyright() {
    return copyright;
  }

  public Coding[] getKeyword() {
    return keyword;
  }

  public String getFhirVersion() {
    return fhirVersion;
  }

  public StructureDefinitionMapping[] getMapping() {
    return mapping;
  }

  public String getKind() {
    return kind;
  }

  public Boolean getAbstract_() {
    return abstract_;
  }

  public StructureDefinitionContext[] getContext() {
    return context;
  }

  public String[] getContextInvariant() {
    return contextInvariant;
  }

  public String getType() {
    return type;
  }

  public String getBaseDefinition() {
    return baseDefinition;
  }

  public String getDerivation() {
    return derivation;
  }

  public StructureDefinitionSnapshot getSnapshot() {
    return snapshot;
  }

  public StructureDefinitionDifferential getDifferential() {
    return differential;
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

  public void setStatus(String status) {
    this.status = status;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
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

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public void setKeyword(Coding[] keyword) {
    this.keyword = keyword;
  }

  public void setFhirVersion(String fhirVersion) {
    this.fhirVersion = fhirVersion;
  }

  public void setMapping(StructureDefinitionMapping[] mapping) {
    this.mapping = mapping;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setAbstract_(Boolean abstract_) {
    this.abstract_ = abstract_;
  }

  public void setContext(StructureDefinitionContext[] context) {
    this.context = context;
  }

  public void setContextInvariant(String[] contextInvariant) {
    this.contextInvariant = contextInvariant;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setBaseDefinition(String baseDefinition) {
    this.baseDefinition = baseDefinition;
  }

  public void setDerivation(String derivation) {
    this.derivation = derivation;
  }

  public void setSnapshot(StructureDefinitionSnapshot snapshot) {
    this.snapshot = snapshot;
  }

  public void setDifferential(StructureDefinitionDifferential differential) {
    this.differential = differential;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureDefinition) {
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
    return "StructureDefinition(" + id + ")";
  }
}
