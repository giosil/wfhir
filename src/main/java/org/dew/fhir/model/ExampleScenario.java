package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario</a>
 */
public
class ExampleScenario extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected ExampleScenarioInstance[] instance;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected Boolean experimental;
  protected ContactDetail[] contact;
  protected Identifier[] identifier;
  protected ExampleScenarioProcess[] process;
  protected String[] workflow;
  protected String version;
  protected String url;
  protected ExampleScenarioActor[] actor;
  protected String name;
  protected String publisher;
  protected UsageContext[] useContext;
  protected String status;
  
  public ExampleScenario()
  {
    this.resourceType = "ExampleScenario";
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
  
  public ExampleScenarioInstance[] getInstance() {
    return instance;
  }
  
  public void setInstance(ExampleScenarioInstance[] instance) {
    this.instance = instance;
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
  
  public Boolean getExperimental() {
    return experimental;
  }
  
  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public ExampleScenarioProcess[] getProcess() {
    return process;
  }
  
  public void setProcess(ExampleScenarioProcess[] process) {
    this.process = process;
  }
  
  public String[] getWorkflow() {
    return workflow;
  }
  
  public void setWorkflow(String[] workflow) {
    this.workflow = workflow;
  }
  
  public String getVersion() {
    return version;
  }
  
  public void setVersion(String version) {
    this.version = version;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public ExampleScenarioActor[] getActor() {
    return actor;
  }
  
  public void setActor(ExampleScenarioActor[] actor) {
    this.actor = actor;
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
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenario) {
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
    return "ExampleScenario(" + id + ")";
  }
}
