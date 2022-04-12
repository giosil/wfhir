package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="https://www.hl7.org/fhir">TestReport</a>
 */
public
class TestReport extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String tester;
  protected TestReportParticipant[] participant;
  protected String result;
  protected Double score;
  protected Date issued;
  protected TestReportTeardown teardown;
  protected Identifier identifier;
  protected TestReportTest[] test;
  protected Reference<Resource> testScript;
  protected String name;
  protected TestReportSetup setup;
  protected String status;
  
  public TestReport()
  {
    this.resourceType = "TestReport";
  }
  
  public String getTester() {
    return tester;
  }
  
  public void setTester(String tester) {
    this.tester = tester;
  }
  
  public TestReportParticipant[] getParticipant() {
    return participant;
  }
  
  public void setParticipant(TestReportParticipant[] participant) {
    this.participant = participant;
  }
  
  public String getResult() {
    return result;
  }
  
  public void setResult(String result) {
    this.result = result;
  }
  
  public Double getScore() {
    return score;
  }
  
  public void setScore(Double score) {
    this.score = score;
  }
  
  public Date getIssued() {
    return issued;
  }
  
  public void setIssued(Date issued) {
    this.issued = issued;
  }
  
  public TestReportTeardown getTeardown() {
    return teardown;
  }
  
  public void setTeardown(TestReportTeardown teardown) {
    this.teardown = teardown;
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public TestReportTest[] getTest() {
    return test;
  }
  
  public void setTest(TestReportTest[] test) {
    this.test = test;
  }
  
  public Reference<Resource> getTestScript() {
    return testScript;
  }
  
  public void setTestScript(Reference<Resource> testScript) {
    this.testScript = testScript;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public TestReportSetup getSetup() {
    return setup;
  }
  
  public void setSetup(TestReportSetup setup) {
    this.setup = setup;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestReport) {
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
    return "TestReport(" + id + ")";
  }
}
