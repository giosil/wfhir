package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Educational material presented to the patient (or guardian) at the time of vaccine administration.
 *
 * @see <a href="https://www.hl7.org/fhir/immunization-definitions.html#Immunization.education">Immunization.education</a>
 */
public 
class ImmunizationEducation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5456484664277613128L;
  
  protected String documentType;
  protected String reference;
  protected Date publicationDate;
  protected Date presentationDate;
  
  public ImmunizationEducation()
  {
  }

  public String getDocumentType() {
    return documentType;
  }

  public String getReference() {
    return reference;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public Date getPresentationDate() {
    return presentationDate;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  public void setPresentationDate(Date presentationDate) {
    this.presentationDate = presentationDate;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationEducation) {
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
    return "ImmunizationEducation(" + id + ")";
  }
}
