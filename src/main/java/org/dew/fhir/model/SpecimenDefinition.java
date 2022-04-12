package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="https://www.hl7.org/fhir">SpecimenDefinition</a>
 */
public
class SpecimenDefinition extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier identifier;
  protected CodeableConcept[] patientPreparation;
  protected String timeAspect;
  protected CodeableConcept[] collection;
  protected CodeableConcept typeCollected;
  protected SpecimenDefinitionTypeTested[] typeTested;
  
  public SpecimenDefinition()
  {
    this.resourceType = "SpecimenDefinition";
  }
  
  public Identifier getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }
  
  public CodeableConcept[] getPatientPreparation() {
    return patientPreparation;
  }
  
  public void setPatientPreparation(CodeableConcept[] patientPreparation) {
    this.patientPreparation = patientPreparation;
  }
  
  public String getTimeAspect() {
    return timeAspect;
  }
  
  public void setTimeAspect(String timeAspect) {
    this.timeAspect = timeAspect;
  }
  
  public CodeableConcept[] getCollection() {
    return collection;
  }
  
  public void setCollection(CodeableConcept[] collection) {
    this.collection = collection;
  }
  
  public CodeableConcept getTypeCollected() {
    return typeCollected;
  }
  
  public void setTypeCollected(CodeableConcept typeCollected) {
    this.typeCollected = typeCollected;
  }
  
  public SpecimenDefinitionTypeTested[] getTypeTested() {
    return typeTested;
  }
  
  public void setTypeTested(SpecimenDefinitionTypeTested[] typeTested) {
    this.typeTested = typeTested;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenDefinition) {
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
    return "SpecimenDefinition(" + id + ")";
  }
}
