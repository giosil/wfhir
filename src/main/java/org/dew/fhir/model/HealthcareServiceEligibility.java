package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Does this service have specific eligibility requirements that need to be met in order to use the service?
 *
 * @see <a href="https://build.fhir.org/healthcareservice-definitions.html#HealthcareService.eligibility">HealthcareService.eligibility</a>
 */
public 
class HealthcareServiceEligibility extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4480415580950492875L;
  
  protected CodeableConcept code;
  protected String comment;
  
  public HealthcareServiceEligibility()
  {
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getComment() {
    return comment;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof HealthcareServiceEligibility) {
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
    return "HealthcareServiceEligibility(" + id + "," + code + "," + comment + ")";
  }
}
