package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
 *
 * @see <a href="https://www.hl7.org/fhir/condition-definitions.html#Condition.evidence">Condition.evidence</a>
 */
public 
class ConditionEvidence extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1386077381021550784L;
  
  protected CodeableConcept[] code;
  protected Reference<Resource>[] detail;
  
  public ConditionEvidence()
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
    if(object instanceof ConditionEvidence) {
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
    return "ConditionEvidence(" + id + ")";
  }
}
