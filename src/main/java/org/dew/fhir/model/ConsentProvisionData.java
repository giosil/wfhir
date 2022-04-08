package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The resources controlled by this rule if specific resources are referenced.
 *
 * @see <a href="https://www.hl7.org/fhir/consent-definitions.html#Consent.provision.data">Consent.provision.data</a>
 */
public 
class ConsentProvisionData extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 2995760021191514460L;
  
  protected String meaning;
  protected Reference<Resource> reference;
  
  public ConsentProvisionData()
  {
  }

  public String getMeaning() {
    return meaning;
  }

  public Reference<Resource> getReference() {
    return reference;
  }

  public void setMeaning(String meaning) {
    this.meaning = meaning;
  }

  public void setReference(Reference<Resource> reference) {
    this.reference = reference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ConsentProvisionData) {
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
    return "ConsentProvisionData(" + id + ")";
  }
}
