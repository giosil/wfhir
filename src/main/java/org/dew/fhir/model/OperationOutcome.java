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
    return "OperationOutcome(" + id + ")";
  }
}
