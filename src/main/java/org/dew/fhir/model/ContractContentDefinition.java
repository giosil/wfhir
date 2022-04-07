package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Precusory content developed with a focus and intent of supporting the formation a Contract instance, which may be associated with and transformable into a Contract.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.contentDefinition">Contract.contentDefinition</a>
 */
public 
class ContractContentDefinition extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -748523697315409556L;
  
  protected CodeableConcept type;
  protected CodeableConcept subType;
  protected Reference<Resource> publisher;
  protected Date publicationDate;
  protected String publicationStatus;
  protected String copyright;
  
  public ContractContentDefinition()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept getSubType() {
    return subType;
  }

  public Reference<Resource> getPublisher() {
    return publisher;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public String getPublicationStatus() {
    return publicationStatus;
  }

  public String getCopyright() {
    return copyright;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubType(CodeableConcept subType) {
    this.subType = subType;
  }

  public void setPublisher(Reference<Resource> publisher) {
    this.publisher = publisher;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  public void setPublicationStatus(String publicationStatus) {
    this.publicationStatus = publicationStatus;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractContentDefinition) {
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
    return "ContractContentDefinition(" + id + "," + type + "," + subType + ")";
  }
}
