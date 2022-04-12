package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript</a>
 */
public
class TestScript extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String copyright;
  protected TestScriptMetadata metadata;
  protected String purpose;
  protected CodeableConcept[] jurisdiction;
  protected TestScriptOrigin[] origin;
  protected TestScriptDestination[] destination;
  protected String description;
  protected Boolean experimental;
  protected String title;
  protected ContactDetail[] contact;
  protected TestScriptTeardown teardown;
  protected Identifier identifier;
  protected TestScriptTest[] test;
  protected Reference<Resource>[] profile;
  protected String version;
  protected String url;
  protected TestScriptFixture[] fixture;
  protected String name;
  protected TestScriptVariable[] variable;
  protected String publisher;
  protected TestScriptSetup setup;
  protected UsageContext[] useContext;
  protected String status;
  
  public TestScript()
  {
    this.resourceType = "TestScript";
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
  
  public TestScriptMetadata getMetadata() {
    return metadata;
  }
  
  public void setMetadata(TestScriptMetadata metadata) {
    this.metadata = metadata;
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
  
  public TestScriptOrigin[] getOrigin() {
    return origin;
  }
  
  public void setOrigin(TestScriptOrigin[] origin) {
    this.origin = origin;
  }
  
  public TestScriptDestination[] getDestination() {
    return destination;
  }
  
  public void setDestination(TestScriptDestination[] destination) {
    this.destination = destination;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Boolean getExperimental() {
    return experimental;
  }
  
  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public ContactDetail[] getContact() {
    return contact;
  }
  
  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }
  
  public TestScriptTeardown getTeardown() {
    return teardown;
  }
  
  public void setTeardown(TestScriptTeardown teardown) {
    this.teardown = teardown;
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public TestScriptTest[] getTest() {
    return test;
  }
  
  public void setTest(TestScriptTest[] test) {
    this.test = test;
  }
  
  public Reference<Resource>[] getProfile() {
    return profile;
  }
  
  public void setProfile(Reference<Resource>[] profile) {
    this.profile = profile;
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
  
  public TestScriptFixture[] getFixture() {
    return fixture;
  }
  
  public void setFixture(TestScriptFixture[] fixture) {
    this.fixture = fixture;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public TestScriptVariable[] getVariable() {
    return variable;
  }
  
  public void setVariable(TestScriptVariable[] variable) {
    this.variable = variable;
  }
  
  public String getPublisher() {
    return publisher;
  }
  
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  public TestScriptSetup getSetup() {
    return setup;
  }
  
  public void setSetup(TestScriptSetup setup) {
    this.setup = setup;
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
    if(object instanceof TestScript) {
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
    return "TestScript(" + id + ")";
  }
}
