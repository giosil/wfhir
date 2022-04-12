package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_Procedure</a>
 */
public
class ClaimProcedure extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Integer sequence;
  protected CodeableConcept procedureCodeableConcept;
  protected Reference<Resource> procedureReference;
  protected Reference<Resource>[] udi;
  protected CodeableConcept[] type;
  
  public ClaimProcedure()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public CodeableConcept getProcedureCodeableConcept() {
    return procedureCodeableConcept;
  }
  
  public void setProcedureCodeableConcept(CodeableConcept procedureCodeableConcept) {
    this.procedureCodeableConcept = procedureCodeableConcept;
  }
  
  public Reference<Resource> getProcedureReference() {
    return procedureReference;
  }
  
  public void setProcedureReference(Reference<Resource> procedureReference) {
    this.procedureReference = procedureReference;
  }
  
  public Reference<Resource>[] getUdi() {
    return udi;
  }
  
  public void setUdi(Reference<Resource>[] udi) {
    this.udi = udi;
  }
  
  public CodeableConcept[] getType() {
    return type;
  }
  
  public void setType(CodeableConcept[] type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimProcedure) {
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
    return "ClaimProcedure(" + id + ")";
  }
}
