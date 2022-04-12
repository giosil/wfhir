package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 *
 * @see <a href="https://www.hl7.org/fhir">OperationDefinition</a>
 */
public
class OperationDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Boolean instance;
  protected Boolean experimental;
  protected Boolean type;
  protected ContactDetail[] contact;
  protected String[] resource;
  protected String kind;
  protected String inputProfile;
  protected String version;
  protected Boolean affectsState;
  protected OperationDefinitionOverload[] overload;
  protected String outputProfile;
  protected Boolean system;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  protected String code;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected String description;
  protected String title;
  protected OperationDefinitionParameter[] parameter;
  protected String url;
  protected String comment;
  protected String base;
  
  public OperationDefinition()
  {
    this.resourceType = "OperationDefinition";
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Boolean getInstance() {
    return instance;
  }
  
  public void setInstance(Boolean instance) {
    this.instance = instance;
  }
  
  public Boolean getExperimental() {
    return experimental;
  }
  
  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }
  
  public Boolean getType() {
    return type;
  }
  
  public void setType(Boolean type) {
    this.type = type;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public String[] getResource() {
    return resource;
  }
  
  public void setResource(String[] resource) {
    this.resource = resource;
  }
  
  public String getKind() {
    return kind;
  }
  
  public void setKind(String kind) {
    this.kind = kind;
  }
  
  public String getInputProfile() {
    return inputProfile;
  }
  
  public void setInputProfile(String inputProfile) {
    this.inputProfile = inputProfile;
  }
  
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }
  
  public Boolean getAffectsState() {
    return affectsState;
  }
  
  public void setAffectsState(Boolean affectsState) {
    this.affectsState = affectsState;
  }
  
  public OperationDefinitionOverload[] getOverload() {
    return overload;
  }
  
  public void setOverload(OperationDefinitionOverload[] overload) {
    this.overload = overload;
  }
  
  public String getOutputProfile() {
    return outputProfile;
  }
  
  public void setOutputProfile(String outputProfile) {
    this.outputProfile = outputProfile;
  }
  
  public Boolean getSystem() {
    return system;
  }
  
  public void setSystem(Boolean system) {
    this.system = system;
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
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
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
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public OperationDefinitionParameter[] getParameter() {
    return parameter;
  }
  
  public void setParameter(OperationDefinitionParameter[] parameter) {
    this.parameter = parameter;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public String getBase() {
    return base;
  }
  
  public void setBase(String base) {
    this.base = base;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationDefinition) {
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
    return "OperationDefinition(" + id + ")";
  }
}
