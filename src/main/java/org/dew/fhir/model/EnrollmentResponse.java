package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
 *
 * @see <a href="https://www.hl7.org/fhir">EnrollmentResponse</a>
 */
public
class EnrollmentResponse extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier[] identifier;
  protected Reference<Resource> request;
  protected Date created;
  protected String disposition;
  protected Reference<Resource> requestProvider;
  protected Reference<Resource> organization;
  protected String outcome;
  protected String status;
  
  public EnrollmentResponse()
  {
    this.resourceType = "EnrollmentResponse";
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Reference<Resource> getRequest() {
    return request;
  }
  
  public void setRequest(Reference<Resource> request) {
    this.request = request;
  }
  
  public Date getCreated() {
    return created;
  }
  
  public void setCreated(Date created) {
    this.created = created;
  }
  
  public String getDisposition() {
    return disposition;
  }
  
  public void setDisposition(String disposition) {
    this.disposition = disposition;
  }
  
  public Reference<Resource> getRequestProvider() {
    return requestProvider;
  }
  
  public void setRequestProvider(Reference<Resource> requestProvider) {
    this.requestProvider = requestProvider;
  }
  
  public Reference<Resource> getOrganization() {
    return organization;
  }
  
  public void setOrganization(Reference<Resource> organization) {
    this.organization = organization;
  }
  
  public String getOutcome() {
    return outcome;
  }
  
  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EnrollmentResponse) {
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
    return "EnrollmentResponse(" + id + ")";
  }
}
