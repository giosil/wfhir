package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @see <a href="https://www.hl7.org/fhir">InsurancePlan</a>
 */
public
class InsurancePlan extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] type;
  protected Reference<Resource> administeredBy;
  protected Reference<Resource>[] network;
  protected Reference<Resource>[] endpoint;
  protected InsurancePlanContact[] contact;
  protected String[] alias;
  protected InsurancePlanPlan[] plan;
  protected InsurancePlanCoverage[] coverage;
  protected Identifier[] identifier;
  protected Period period;
  protected String name;
  protected Reference<Resource> ownedBy;
  protected String status;
  protected Reference<Resource>[] coverageArea;
  
  public InsurancePlan()
  {
    this.resourceType = "InsurancePlan";
  }
  
  public CodeableConcept[] getType() {
    return type;
  }
  
  public void setType(CodeableConcept[] type) {
    this.type = type;
  }
  
  public Reference<Resource> getAdministeredBy() {
    return administeredBy;
  }
  
  public void setAdministeredBy(Reference<Resource> administeredBy) {
    this.administeredBy = administeredBy;
  }
  
  public Reference<Resource>[] getNetwork() {
    return network;
  }
  
  public void setNetwork(Reference<Resource>[] network) {
    this.network = network;
  }
  
  public Reference<Resource>[] getEndpoint() {
    return endpoint;
  }
  
  public void setEndpoint(Reference<Resource>[] endpoint) {
    this.endpoint = endpoint;
  }
  
  public InsurancePlanContact[] getContact() {
    return contact;
  }
  
  public void setContact(InsurancePlanContact[] contact) {
    this.contact = contact;
  }
  
  public String[] getAlias() {
    return alias;
  }
  
  public void setAlias(String[] alias) {
    this.alias = alias;
  }
  
  public InsurancePlanPlan[] getPlan() {
    return plan;
  }
  
  public void setPlan(InsurancePlanPlan[] plan) {
    this.plan = plan;
  }
  
  public InsurancePlanCoverage[] getCoverage() {
    return coverage;
  }
  
  public void setCoverage(InsurancePlanCoverage[] coverage) {
    this.coverage = coverage;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public Period getPeriod() {
    return period;
  }
  
  public void setPeriod(Period period) {
    this.period = period;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Reference<Resource> getOwnedBy() {
    return ownedBy;
  }
  
  public void setOwnedBy(Reference<Resource> ownedBy) {
    this.ownedBy = ownedBy;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public Reference<Resource>[] getCoverageArea() {
    return coverageArea;
  }
  
  public void setCoverageArea(Reference<Resource>[] coverageArea) {
    this.coverageArea = coverageArea;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof InsurancePlan) {
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
    return "InsurancePlan(" + id + ")";
  }
}
