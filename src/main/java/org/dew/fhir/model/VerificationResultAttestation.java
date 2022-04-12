package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Describes validation requirements, source(s), status and dates for one or more elements.
 *
 * @see <a href="https://www.hl7.org/fhir">VerificationResult_Attestation</a>
 */
public
class VerificationResultAttestation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected String sourceIdentityCertificate;
  protected CodeableConcept communicationMethod;
  protected Reference<Resource> onBehalfOf;
  protected Signature proxySignature;
  protected Signature sourceSignature;
  protected String proxyIdentityCertificate;
  protected Reference<Resource> who;
  
  public VerificationResultAttestation()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public String getSourceIdentityCertificate() {
    return sourceIdentityCertificate;
  }
  
  public void setSourceIdentityCertificate(String sourceIdentityCertificate) {
    this.sourceIdentityCertificate = sourceIdentityCertificate;
  }
  
  public CodeableConcept getCommunicationMethod() {
    return communicationMethod;
  }
  
  public void setCommunicationMethod(CodeableConcept communicationMethod) {
    this.communicationMethod = communicationMethod;
  }
  
  public Reference<Resource> getOnBehalfOf() {
    return onBehalfOf;
  }
  
  public void setOnBehalfOf(Reference<Resource> onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
  }
  
  public Signature getProxySignature() {
    return proxySignature;
  }
  
  public void setProxySignature(Signature proxySignature) {
    this.proxySignature = proxySignature;
  }
  
  public Signature getSourceSignature() {
    return sourceSignature;
  }
  
  public void setSourceSignature(Signature sourceSignature) {
    this.sourceSignature = sourceSignature;
  }
  
  public String getProxyIdentityCertificate() {
    return proxyIdentityCertificate;
  }
  
  public void setProxyIdentityCertificate(String proxyIdentityCertificate) {
    this.proxyIdentityCertificate = proxyIdentityCertificate;
  }
  
  public Reference<Resource> getWho() {
    return who;
  }
  
  public void setWho(Reference<Resource> who) {
    this.who = who;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VerificationResultAttestation) {
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
    return "VerificationResultAttestation(" + id + ")";
  }
}
