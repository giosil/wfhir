package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Code</a>
 */
public
class SubstanceSpecificationCode extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date statusDate;
  protected CodeableConcept code;
  protected String comment;
  protected Reference<Resource>[] source;
  protected CodeableConcept status;
  
  public SubstanceSpecificationCode()
  {
  }
  
  public Date getStatusDate() {
    return statusDate;
  }
  
  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public String getComment() {
    return comment;
  }
  
  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationCode) {
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
    return "SubstanceSpecificationCode(" + id + ")";
  }
}
