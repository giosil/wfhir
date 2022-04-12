package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
 *
 * @see <a href="https://www.hl7.org/fhir">EnrollmentRequest</a>
 */
public
class EnrollmentRequest extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> coverage;
  protected Identifier[] identifier;
  protected Date created;
  protected Reference<Resource> candidate;
  protected Reference<Resource> provider;
  protected Reference<Resource> insurer;
  protected String status;
  
  public EnrollmentRequest()
  {
    this.resourceType = "EnrollmentRequest";
  }
  
  public Reference<Resource> getCoverage() {
    return coverage;
  }
  
  public void setCoverage(Reference<Resource> coverage) {
    this.coverage = coverage;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public Reference<Resource> getCandidate() {
    return candidate;
  }
  
  public void setCandidate(Reference<Resource> candidate) {
    this.candidate = candidate;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public Reference<Resource> getInsurer() {
    return insurer;
  }
  
  public void setInsurer(Reference<Resource> insurer) {
    this.insurer = insurer;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EnrollmentRequest) {
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
    return "EnrollmentRequest(" + id + ")";
  }
}
