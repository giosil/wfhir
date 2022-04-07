package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used to track charges for a patient, cost centers, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/account.html">Account</a>
 */
public 
class Account extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 3198659198485853936L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept type;
  protected String name;
  protected AccountCoverage[] coverage;
  protected Reference<Resource>[] subject;
  protected Period servicePeriod;
  protected Reference<Organization> owner;
  protected String description;
  protected AccountGuarantor[] guarantor;
  protected Reference<Account> partOf;
  
  public Account()
  {
    this.resourceType = "Account";
  }
  
  public Account(CodeableConcept type)
  {
    this.resourceType = "Account";
    this.type = type;
  }
  
  public Account(CodeableConcept type, String name)
  {
    this.resourceType = "Account";
    this.type = type;
    this.name = name;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public AccountCoverage[] getCoverage() {
    return coverage;
  }

  public Reference<Resource>[] getSubject() {
    return subject;
  }

  public Period getServicePeriod() {
    return servicePeriod;
  }

  public Reference<Organization> getOwner() {
    return owner;
  }

  public String getDescription() {
    return description;
  }

  public AccountGuarantor[] getGuarantor() {
    return guarantor;
  }

  public Reference<Account> getPartOf() {
    return partOf;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCoverage(AccountCoverage[] coverage) {
    this.coverage = coverage;
  }

  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }

  public void setServicePeriod(Period servicePeriod) {
    this.servicePeriod = servicePeriod;
  }

  public void setOwner(Reference<Organization> owner) {
    this.owner = owner;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setGuarantor(AccountGuarantor[] guarantor) {
    this.guarantor = guarantor;
  }

  public void setPartOf(Reference<Account> partOf) {
    this.partOf = partOf;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Account) {
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
    return "Account(" + id + "," + type + "," + name + ")";
  }
}
