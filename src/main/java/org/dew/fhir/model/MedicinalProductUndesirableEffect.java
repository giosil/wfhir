package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Describe the undesirable effects of the medicinal product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductUndesirableEffect</a>
 */
public
class MedicinalProductUndesirableEffect extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] subject;
  protected CodeableConcept classification;
  protected CodeableConcept frequencyOfOccurrence;
  protected Population[] population;
  protected CodeableConcept symptomConditionEffect;
  
  public MedicinalProductUndesirableEffect()
  {
    this.resourceType = "MedicinalProductUndesirableEffect";
  }
  
  public Reference<Resource>[] getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }
  
  public CodeableConcept getClassification() {
    return classification;
  }
  
  public void setClassification(CodeableConcept classification) {
    this.classification = classification;
  }
  
  public CodeableConcept getFrequencyOfOccurrence() {
    return frequencyOfOccurrence;
  }
  
  public void setFrequencyOfOccurrence(CodeableConcept frequencyOfOccurrence) {
    this.frequencyOfOccurrence = frequencyOfOccurrence;
  }
  
  public Population[] getPopulation() {
    return population;
  }
  
  public void setPopulation(Population[] population) {
    this.population = population;
  }
  
  public CodeableConcept getSymptomConditionEffect() {
    return symptomConditionEffect;
  }
  
  public void setSymptomConditionEffect(CodeableConcept symptomConditionEffect) {
    this.symptomConditionEffect = symptomConditionEffect;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductUndesirableEffect) {
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
    return "MedicinalProductUndesirableEffect(" + id + ")";
  }
}
