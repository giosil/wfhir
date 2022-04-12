package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="https://www.hl7.org/fhir">Claim_CareTeam</a>
 */
public
class ClaimCareTeam extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer sequence;
  protected CodeableConcept qualification;
  protected CodeableConcept role;
  protected Reference<Resource> provider;
  protected Boolean responsible;
  
  public ClaimCareTeam()
  {
  }
  
  public Integer getSequence() {
    return sequence;
  }
  
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  
  public CodeableConcept getQualification() {
    return qualification;
  }
  
  public void setQualification(CodeableConcept qualification) {
    this.qualification = qualification;
  }
  
  public CodeableConcept getRole() {
    return role;
  }
  
  public void setRole(CodeableConcept role) {
    this.role = role;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public Boolean getResponsible() {
    return responsible;
  }
  
  public void setResponsible(Boolean responsible) {
    this.responsible = responsible;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClaimCareTeam) {
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
    return "ClaimCareTeam(" + id + ")";
  }
}
