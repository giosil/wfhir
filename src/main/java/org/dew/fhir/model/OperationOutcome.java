package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A collection of error, warning, or information messages that result from a system action.
 *
 * @see <a href="https://www.hl7.org/fhir/operationoutcome.html">OperationOutcome</a>
 */
public 
class OperationOutcome extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 5066734579965810467L;
  
  protected OperationOutcomeIssue[] issue;
  
  public OperationOutcome()
  {
    this.resourceType = "OperationOutcome";
  }
  
  public OperationOutcome(String id)
  {
    this.resourceType = "OperationOutcome";
    this.id = id;
  }

  public OperationOutcome(String id, OperationOutcomeIssue singleIssue)
  {
    this.resourceType = "OperationOutcome";
    this.id = id;
    if(singleIssue != null) {
      this.issue = new OperationOutcomeIssue[] { singleIssue };
    }
  }
  
  public OperationOutcome(String issueSeverity, String issueCode, String issueDiagnostics)
  {
    this.resourceType = "OperationOutcome";
    if(issueSeverity != null || issueCode != null || issueDiagnostics != null) {
      this.issue = new OperationOutcomeIssue[] { new OperationOutcomeIssue(null, issueSeverity, issueCode, issueDiagnostics) };
    }
  }
  
  public OperationOutcome(String id, String issueSeverity, String issueCode, String issueDiagnostics)
  {
    this.resourceType = "OperationOutcome";
    this.id = id;
    if(issueSeverity != null || issueCode != null || issueDiagnostics != null) {
      String idIssue = id;
      if(idIssue != null) idIssue += "-issue";
      this.issue = new OperationOutcomeIssue[] { new OperationOutcomeIssue(idIssue, issueSeverity, issueCode, issueDiagnostics) };
    }
  }
  
  public OperationOutcome(String id, OperationOutcomeIssue[] issue)
  {
    this.resourceType = "OperationOutcome";
    this.id = id;
    this.issue = issue;
  }

  public OperationOutcomeIssue[] getIssue() {
    return issue;
  }

  public void setIssue(OperationOutcomeIssue[] issue) {
    this.issue = issue;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationOutcome) {
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
    if(issue != null && issue.length == 1) {
      OperationOutcomeIssue issue0 = issue[0];
      if(issue0 != null) {
        return "OperationOutcome(" + id + ",[" + issue0 + "])";
      }
    }
    return "OperationOutcome(" + id + ")";
  }
}
