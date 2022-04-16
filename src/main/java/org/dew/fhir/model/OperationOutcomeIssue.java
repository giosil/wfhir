package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An error, warning, or information message that results from a system action.
 *
 * @see <a href="https://www.hl7.org/fhir/operationoutcome-definitions.html#OperationOutcome.issue">OperationOutcome.issue</a>
 */
public 
class OperationOutcomeIssue extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 816462480027575916L;
  
  protected String severity;
  protected String code;
  protected CodeableConcept details;
  protected String diagnostics;
  protected String[] location;
  protected String[] expression;
  
  public OperationOutcomeIssue()
  {
  }
  
  public OperationOutcomeIssue(String id)
  {
    this.id = id;
  }
  
  public OperationOutcomeIssue(String id, String severity)
  {
    this.id = id;
    this.severity = severity;
  }
  
  public OperationOutcomeIssue(String id, String severity, String code)
  {
    this.id = id;
    this.severity = severity;
    this.code = code;
  }
  
  public OperationOutcomeIssue(String id, String severity, String code, CodeableConcept details)
  {
    this.id = id;
    this.severity = severity;
    this.code = code;
    this.details = details;
  }
  
  public OperationOutcomeIssue(String id, String severity, String code, String diagnostics)
  {
    this.id = id;
    this.severity = severity;
    this.code = code;
    this.diagnostics = diagnostics;
  }

  public String getSeverity() {
    return severity;
  }

  public String getCode() {
    return code;
  }

  public CodeableConcept getDetails() {
    return details;
  }

  public String getDiagnostics() {
    return diagnostics;
  }

  public String[] getLocation() {
    return location;
  }

  public String[] getExpression() {
    return expression;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDetails(CodeableConcept details) {
    this.details = details;
  }

  public void setDiagnostics(String diagnostics) {
    this.diagnostics = diagnostics;
  }

  public void setLocation(String[] location) {
    this.location = location;
  }

  public void setExpression(String[] expression) {
    this.expression = expression;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationOutcomeIssue) {
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
    return "OperationOutcomeIssue(" + id + "," + severity + "," + code + "," + details + "," + diagnostics + ")";
  }
}
