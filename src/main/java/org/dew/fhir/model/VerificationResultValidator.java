package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Describes validation requirements, source(s), status and dates for one or more elements.
 *
 * @see <a href="https://www.hl7.org/fhir">VerificationResult_Validator</a>
 */
public
class VerificationResultValidator extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> organization;
  protected String identityCertificate;
  protected Signature attestationSignature;
  
  public VerificationResultValidator()
  {
  }
  
  public Reference<Resource> getOrganization() {
    return organization;
  }
  
  public void setOrganization(Reference<Resource> organization) {
    this.organization = organization;
  }
  
  public String getIdentityCertificate() {
    return identityCertificate;
  }
  
  public void setIdentityCertificate(String identityCertificate) {
    this.identityCertificate = identityCertificate;
  }
  
  public Signature getAttestationSignature() {
    return attestationSignature;
  }
  
  public void setAttestationSignature(Signature attestationSignature) {
    this.attestationSignature = attestationSignature;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VerificationResultValidator) {
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
    return "VerificationResultValidator(" + id + ")";
  }
}
