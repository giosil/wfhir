package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Official</a>
 */
public
class SubstanceSpecificationOfficial extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected CodeableConcept authority;
  protected CodeableConcept status;
  
  public SubstanceSpecificationOfficial()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public CodeableConcept getAuthority() {
    return authority;
  }
  
  public void setAuthority(CodeableConcept authority) {
    this.authority = authority;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceSpecificationOfficial) {
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
    return "SubstanceSpecificationOfficial(" + id + ")";
  }
}
