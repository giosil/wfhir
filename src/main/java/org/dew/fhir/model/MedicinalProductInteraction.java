package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductInteraction</a>
 */
public
class MedicinalProductInteraction extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] subject;
  protected String description;
  protected CodeableConcept type;
  protected CodeableConcept management;
  protected CodeableConcept effect;
  protected MedicinalProductInteractionInteractant[] interactant;
  protected CodeableConcept incidence;
  
  public MedicinalProductInteraction()
  {
    this.resourceType = "MedicinalProductInteraction";
  }
  
  public Reference<Resource>[] getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public CodeableConcept getManagement() {
    return management;
  }
  
  public void setManagement(CodeableConcept management) {
    this.management = management;
  }
  
  public CodeableConcept getEffect() {
    return effect;
  }
  
  public void setEffect(CodeableConcept effect) {
    this.effect = effect;
  }
  
  public MedicinalProductInteractionInteractant[] getInteractant() {
    return interactant;
  }
  
  public void setInteractant(MedicinalProductInteractionInteractant[] interactant) {
    this.interactant = interactant;
  }
  
  public CodeableConcept getIncidence() {
    return incidence;
  }
  
  public void setIncidence(CodeableConcept incidence) {
    this.incidence = incidence;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductInteraction) {
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
    return "MedicinalProductInteraction(" + id + ")";
  }
}
