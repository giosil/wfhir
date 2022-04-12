package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProduct_CountryLanguage</a>
 */
public
class MedicinalProductCountryLanguage extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept country;
  protected CodeableConcept jurisdiction;
  
  public MedicinalProductCountryLanguage()
  {
  }
  
  public CodeableConcept getCountry() {
    return country;
  }
  
  public void setCountry(CodeableConcept country) {
    this.country = country;
  }
  
  public CodeableConcept getJurisdiction() {
    return jurisdiction;
  }
  
  public void setJurisdiction(CodeableConcept jurisdiction) {
    this.jurisdiction = jurisdiction;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductCountryLanguage) {
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
    return "MedicinalProductCountryLanguage(" + id + ")";
  }
}
