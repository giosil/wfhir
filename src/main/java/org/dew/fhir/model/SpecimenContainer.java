package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The container holding the specimen. The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
 *
 * @see <a href="https://www.hl7.org/fhir/specimen-definitions.html#Specimen.container">Specimen.container</a>
 */
public 
class SpecimenContainer extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -387865249771232612L;
  
  protected Identifier[] identifier;
  protected String description;
  protected CodeableConcept type;
  protected SimpleQuantity capacity;
  protected SimpleQuantity specimenQuantity;
  protected CodeableConcept additiveCodeableConcept;
  protected Reference<Substance> additiveReference;
  
  public SpecimenContainer()
  {
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getDescription() {
    return description;
  }

  public CodeableConcept getType() {
    return type;
  }

  public SimpleQuantity getCapacity() {
    return capacity;
  }

  public SimpleQuantity getSpecimenQuantity() {
    return specimenQuantity;
  }

  public CodeableConcept getAdditiveCodeableConcept() {
    return additiveCodeableConcept;
  }

  public Reference<Substance> getAdditiveReference() {
    return additiveReference;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setCapacity(SimpleQuantity capacity) {
    this.capacity = capacity;
  }

  public void setSpecimenQuantity(SimpleQuantity specimenQuantity) {
    this.specimenQuantity = specimenQuantity;
  }

  public void setAdditiveCodeableConcept(CodeableConcept additiveCodeableConcept) {
    this.additiveCodeableConcept = additiveCodeableConcept;
  }

  public void setAdditiveReference(Reference<Substance> additiveReference) {
    this.additiveReference = additiveReference;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenContainer) {
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
    return "SpecimenContainer(" + id + ")";
  }
}
