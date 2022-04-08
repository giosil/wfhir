package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
 *
 * @see <a href="https://www.hl7.org/fhir/consent-definitions.html#Consent.verification">Consent.verification</a>
 */
public 
class ConsentVerification extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3895619497530024178L;
  
  protected Boolean verified;
  protected Reference<Resource> verifiedWith;
  protected Date verificationDate;
  
  public ConsentVerification()
  {
  }

  public Boolean getVerified() {
    return verified;
  }

  public Reference<Resource> getVerifiedWith() {
    return verifiedWith;
  }

  public Date getVerificationDate() {
    return verificationDate;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public void setVerifiedWith(Reference<Resource> verifiedWith) {
    this.verifiedWith = verifiedWith;
  }

  public void setVerificationDate(Date verificationDate) {
    this.verificationDate = verificationDate;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConsentVerification) {
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
    return "ConsentVerification(" + id + ")";
  }
}
