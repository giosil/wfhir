package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProduct_Name</a>
 */
public
class MedicinalProductName extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected MedicinalProductCountryLanguage[] countryLanguage;
  protected MedicinalProductNamePart[] namePart;
  protected String productName;
  
  public MedicinalProductName()
  {
  }
  
  public MedicinalProductCountryLanguage[] getCountryLanguage() {
    return countryLanguage;
  }
  
  public void setCountryLanguage(MedicinalProductCountryLanguage[] countryLanguage) {
    this.countryLanguage = countryLanguage;
  }
  
  public MedicinalProductNamePart[] getNamePart() {
    return namePart;
  }
  
  public void setNamePart(MedicinalProductNamePart[] namePart) {
    this.namePart = namePart;
  }
  
  public String getProductName() {
    return productName;
  }
  
  public void setProductName(String productName) {
    this.productName = productName;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductName) {
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
    return "MedicinalProductName(" + id + ")";
  }
}
