package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProduct_SpecialDesignation</a>
 */
public
class MedicinalProductSpecialDesignation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date date;
  protected Identifier[] identifier;
  protected CodeableConcept species;
  protected CodeableConcept intendedUse;
  protected Reference<Resource> indicationReference;
  protected CodeableConcept type;
  protected CodeableConcept indicationCodeableConcept;
  protected CodeableConcept status;
  
  public MedicinalProductSpecialDesignation()
  {
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept getSpecies() {
    return species;
  }
  
  public void setSpecies(CodeableConcept species) {
    this.species = species;
  }
  
  public CodeableConcept getIntendedUse() {
    return intendedUse;
  }
  
  public void setIntendedUse(CodeableConcept intendedUse) {
    this.intendedUse = intendedUse;
  }
  
  public Reference<Resource> getIndicationReference() {
    return indicationReference;
  }
  
  public void setIndicationReference(Reference<Resource> indicationReference) {
    this.indicationReference = indicationReference;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public CodeableConcept getIndicationCodeableConcept() {
    return indicationCodeableConcept;
  }
  
  public void setIndicationCodeableConcept(CodeableConcept indicationCodeableConcept) {
    this.indicationCodeableConcept = indicationCodeableConcept;
  }
  
  public CodeableConcept getStatus() {
    return status;
  }
  
  public void setStatus(CodeableConcept status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductSpecialDesignation) {
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
    return "MedicinalProductSpecialDesignation(" + id + ")";
  }
}
