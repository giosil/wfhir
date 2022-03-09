package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner. 
 * For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.
 *
 * @see <a href="https://www.hl7.org/fhir/practitioner-definitions.html#Practitioner.qualification">Practitioner.qualification</a>
 */
public 
class PractitionerQualification extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4038194986996891853L;
  
  protected Identifier[] identifier;
  protected CodeableConcept code;
  protected Period period;
  protected Reference<Organization> issuer;
  
  public PractitionerQualification()
  {
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Organization> getIssuer() {
    return issuer;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setIssuer(Reference<Organization> issuer) {
    this.issuer = issuer;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof PractitionerQualification) {
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
    return "PractitionerQualification(" + id + "," + code + ")";
  }
}
