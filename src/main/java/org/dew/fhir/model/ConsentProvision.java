package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
 *
 * @see <a href="https://www.hl7.org/fhir/consent-definitions.html#Consent.provision">Consent.provision</a>
 */
public 
class ConsentProvision extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7556717859655121127L;
  
  protected String type;
  protected Period period;
  protected ConsentProvisionActor[] actor;
  protected CodeableConcept[] action;
  protected Coding[] securityLabel;
  protected Coding[] purpose;
  protected Coding[] class_;
  protected CodeableConcept[] code;
  protected Period dataPeriod;
  protected ConsentProvisionData[] data;
  protected ConsentProvision[] provision;
  
  public ConsentProvision()
  {
  }
  
  public String getType() {
    return type;
  }

  public Period getPeriod() {
    return period;
  }

  public ConsentProvisionActor[] getActor() {
    return actor;
  }

  public CodeableConcept[] getAction() {
    return action;
  }

  public Coding[] getSecurityLabel() {
    return securityLabel;
  }

  public Coding[] getPurpose() {
    return purpose;
  }

  public Coding[] getClass_() {
    return class_;
  }

  public CodeableConcept[] getCode() {
    return code;
  }

  public Period getDataPeriod() {
    return dataPeriod;
  }

  public ConsentProvisionData[] getData() {
    return data;
  }

  public ConsentProvision[] getProvision() {
    return provision;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setActor(ConsentProvisionActor[] actor) {
    this.actor = actor;
  }

  public void setAction(CodeableConcept[] action) {
    this.action = action;
  }

  public void setSecurityLabel(Coding[] securityLabel) {
    this.securityLabel = securityLabel;
  }

  public void setPurpose(Coding[] purpose) {
    this.purpose = purpose;
  }

  public void setClass_(Coding[] class_) {
    this.class_ = class_;
  }

  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }

  public void setDataPeriod(Period dataPeriod) {
    this.dataPeriod = dataPeriod;
  }

  public void setData(ConsentProvisionData[] data) {
    this.data = data;
  }

  public void setProvision(ConsentProvision[] provision) {
    this.provision = provision;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ConsentProvision) {
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
    return "ConsentProvision(" + id + ")";
  }
}
