package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.
 *
 * @see <a href="https://www.hl7.org/fhir/detectedissue-definitions.html#DetectedIssue.evidence">DetectedIssue.evidence</a>
 */
public 
class DetectedIssueEvidence extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -2591444829943151098L;
  
  protected CodeableConcept[] code;
  protected Reference<Resource>[] detail;
  
  public DetectedIssueEvidence()
  {
  }

  public CodeableConcept[] getCode() {
    return code;
  }

  public Reference<Resource>[] getDetail() {
    return detail;
  }

  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }

  public void setDetail(Reference<Resource>[] detail) {
    this.detail = detail;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DetectedIssueEvidence) {
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
    return "DetectedIssueEvidence(" + id + ")";
  }
}
